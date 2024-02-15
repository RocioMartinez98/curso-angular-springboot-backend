package com.curso.springboot.backend.apirest.models.services;

import org.springframework.core.io.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class UploadFileServiceImpl implements IUploadFileService{
    private final Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);
    private final static String DIRECTORIO_UPLOAD= "uploads";

    @Override
    public Resource cargar(String nombreFoto) throws MalformedURLException {
        Path rutaArchivos = getath(nombreFoto);
        Resource recurso = null;
        log.info(rutaArchivos.toString());
        recurso =new UrlResource(rutaArchivos.toUri());
        if(!recurso.exists() && !recurso.isReadable()){
            rutaArchivos = Paths.get("src/main/resources/static/images").resolve("imagenDefault.png").toAbsolutePath();

            log.error("Error, no se pudo cargar la imagen " + nombreFoto);
        }
        return recurso;
    }

    @Override
    public String copiar(MultipartFile archivo) throws IOException {
        String nombreArchivo = UUID.randomUUID().toString() + "_" + archivo.getOriginalFilename().replace(" ", ""); //concateno el nombre del archivo con uno random por si ya existe una imagen con ese nombre
        Path rutaArchivos = getath(nombreArchivo);
        log.info(rutaArchivos.toString());
        Files.copy(archivo.getInputStream(), rutaArchivos);
        return nombreArchivo;
    }

    @Override
    public boolean eliminar(String nombreFoto) {
        if(nombreFoto !=null && nombreFoto.length()>0){
            Path rutaFotoAnterior = getath(nombreFoto);
            File archivoFotoAnterior = rutaFotoAnterior.toFile();
            if(archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()){
                archivoFotoAnterior.delete();
                return true;
            }
        }
        return false;
    }

    @Override
    public Path getath(String nombreFoto) {
        return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreFoto).toAbsolutePath();
    }
}
