public record NotificacionSMS(String phone, String message)
        implements Notificacion {

    // El número telefónico debe contener exactamente 10 dígitos.
    public NotificacionSMS {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Número telefónico inválido.");
        }
    }
}