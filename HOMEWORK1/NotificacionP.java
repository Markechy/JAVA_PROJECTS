public record NotificacionP(String token, String message)
        implements Notificacion {

    // El token no puede ser nulo ni estar vacío.
    public NotificacionP {
        if (token == null || token.isBlank()) {
            throw new IllegalArgumentException("Token inválido.");
        }
    }
}