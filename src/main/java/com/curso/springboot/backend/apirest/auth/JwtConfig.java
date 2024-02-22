package com.curso.springboot.backend.apirest.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA="alguna.clave.secreta.12345678";
    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
        "MIIEowIBAAKCAQEAkXVnfMvlHSVZtZMdcdNw3N4vj1EppQ/e8FBpBCZBHGM6Z8cY\n" +
        "8Ay78Bv/wvDS9RcRwQheWtXrxP9Gg2N0ISFA9mM4gafVVdGb/KSeaPySBxsr8R2b\n" +
        "A0EGTtvBwFT4tD8SQ69UQSaZk1rbUWvZU68AfM+0HTAbUjwLpKiToMOhT9rxeg9y\n" +
        "Da823xJMG1ic5hUuqy1vM7t+T7DStKkgh8+nQk4RIFJc5Uj0s0MM6Mw7p8EyOMkd\n" +
        "kS3wueZ0G4RdUfXriHGLDI6bddpPUAs9k4oVn4G/cc6ZfQhE8p2eUAZ0uP8otqwi\n" +
        "ySfPD+PRQF478jdVwLLKRCeV0kf7jUF7jcwKvwIDAQABAoIBAFn+XEeu0pLEwAsB\n" +
        "+Q6qdcKAyMYPvgc8mX7vEPobPN92WPVKDhi+mCxG9mdCnhI68qYOKmpivdsE4Th6\n" +
        "+KdirpGB87zr/KZ659pYcxWbZjF1Uyt7WKObwG5bsjTvnWvPNdqgiC1C13N+nAB1\n" +
        "DGGk/VU7IEGKuOyY788w6R1my8/eRA6HhxpPiJLs7OpRWuFIo2olR0vdQTlSHnXJ\n" +
        "szAnVgkh66oF42ErOCbfFIarH8Drr+1K5AyGFOp1laTRkN9a+Kw0D5dlYmXFW1Vf\n" +
        "cNucq6OZL6UdfeSDrMIVZmFtLnsXXjY/xs0i+wjdH+v9SC5ZcGV28Zt6O2ToVyD+\n" +
        "nbUk4UkCgYEAwWuJKnizuyL06QH4TmJPnAZR9qGIVzKXteGeJ02Rk0k3nPpm28o3\n" +
        "XEV9t63hb3o/pVmbHgyue7F/i34ur/B9xuhJTyGCf++lHM5baS9xbi+kp9076ZRT\n" +
        "iy7eMx2byzVnaHdITBBIOenGD6hoU+9PjupceOUjZ5FKhSR8b13Ke50CgYEAwIVZ\n" +
        "qc36Yq+FrvgGlpzaSJYKhIDFSCsZgWOS/SfQ4DET2PIx58jRH+aDBjw2tDxvYWo9\n" +
        "PLT6yq/UrwGWhUBpdrCBQgod8eW1tHMioSYksU9RXOpC2dGtLDua8rbmIfh8Htdf\n" +
        "XK+bNf2JjpjxuCGA93c2oq0CjxKuWiWur76SNwsCgYAoqEIc+2JMY/y3PgLD90Zk\n" +
        "ta9k+G+AZNIfGV31RQjkvO9DwB7+9HLOoozan2JT3I6kY0GH/4Jt3dHBsLR/pz3J\n" +
        "IerHB3Q3EFjUxUvRwHdHghxKbOa7IsKs7x0mAYNOI9uoyeoYkxObmNhZUj0b56IB\n" +
        "mKH3h7L5gkD328OMZVq6wQKBgQCwrbBLlSxjxJD6scPaFLh+RLQCRerHAEa355nN\n" +
        "meym0mNUhXAnNrQ0gmdcIYZSgeP1knoAbFZ8DEEzGlH4l9QxiGoXIRG6HQVURRVS\n" +
        "rp6d2hzhGFuhajtyjID2ncM1CcVeyGhLtxzJv5Otuc6bHKQudsk9IWlnw80eDdby\n" +
        "kgG9YQKBgEQNC4ErRzfbDNTkKrGm0DttF/cwoXCGs2xFnJ2izEtmoxIb09jzTlZE\n" +
        "28Gi1AMS5owOqruOZ9sI3lW3rnGrmVp5G2Q8+R84zw4Y0ODR8unB0fHK4y3yN6bi\n" +
        "ot3VuF2cI1kRqLkBHwYwkRgqQzoNY8WUVnKhKa3HzVo7y8KQJSd6\n" +
        "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkXVnfMvlHSVZtZMdcdNw\n" +
            "3N4vj1EppQ/e8FBpBCZBHGM6Z8cY8Ay78Bv/wvDS9RcRwQheWtXrxP9Gg2N0ISFA\n" +
            "9mM4gafVVdGb/KSeaPySBxsr8R2bA0EGTtvBwFT4tD8SQ69UQSaZk1rbUWvZU68A\n" +
            "fM+0HTAbUjwLpKiToMOhT9rxeg9yDa823xJMG1ic5hUuqy1vM7t+T7DStKkgh8+n\n" +
            "Qk4RIFJc5Uj0s0MM6Mw7p8EyOMkdkS3wueZ0G4RdUfXriHGLDI6bddpPUAs9k4oV\n" +
            "n4G/cc6ZfQhE8p2eUAZ0uP8otqwiySfPD+PRQF478jdVwLLKRCeV0kf7jUF7jcwK\n" +
            "vwIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
