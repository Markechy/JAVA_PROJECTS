public class Main {

    public static void main(String[] args) {

        System.out.println("===== PRUEBAS DE VALIDACION =====");

        // Correo invalido
        try {
            new NotificacionEmail("usuarioempresa.com", "Prueba", "Correo invalido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Email: " + e.getMessage());
        }

        // SMS invalido
        try {
            new NotificacionSMS("55123", "SMS invalido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear SMS: " + e.getMessage());
        }

        // Push invalido
        try {
            new NotificacionP("", "Push invalido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Push: " + e.getMessage());
        }

        System.out.println("\n===== NOTIFICACIONES VALIDAS =====");

        // Arreglo que almacena los tres tipos de notificaciones validos.
        Notificacion[] notifications = {
                new NotificacionEmail("usuario1@empresa.com", "Asunto 1", "Mensaje 1"),
                new NotificacionEmail("usuario2@empresa.com", "Asunto 2", "Mensaje 2"),
                new NotificacionEmail("usuario3@empresa.com", "Asunto 3", "Mensaje 3"),
                new NotificacionEmail("usuario4@empresa.com", "Asunto 4", "Mensaje 4"),

                new NotificacionSMS("5512345678", "SMS 1"),
                new NotificacionSMS("5523456789", "SMS 2"),
                new NotificacionSMS("5534567890", "SMS 3"),

                new NotificacionP("abc123", "Push 1"),
                new NotificacionP("def456", "Push 2"),
                new NotificacionP("ghi789", "Push 3"),
                new NotificacionP("jkl012", "Push 4"),
                new NotificacionP("mno345", "Push 5")
        };

        int emailCount = 0;
        int smsCount = 0;
        int pushCount = 0;

        for (Notificacion notification : notifications) {
            switch (notification) {
                case NotificacionEmail e -> emailCount++;
                case NotificacionSMS s -> smsCount++;
                case NotificacionP p -> pushCount++;
            }
        }

        System.out.println("\n========= RESUMEN =========");
        System.out.println("Correos enviados: " + emailCount);
        System.out.println("SMS enviados: " + smsCount);
        System.out.println("Push enviados: " + pushCount);
        System.out.println("Total: " + notifications.length);
    }
}