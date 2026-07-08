public record NotificacionEmail(String email, String subject, String message)
        implements Notificacion {
    
    // Valida que el correo tenga un formato válido antes de crear el objeto.
    public NotificacionEmail {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Correo electrónico inválido.");
        }
    }
}