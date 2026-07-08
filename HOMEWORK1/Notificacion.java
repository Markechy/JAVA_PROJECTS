// Interfaz SEALED base para todas las notificaciones del sistema.
public sealed interface Notificacion
        permits NotificacionEmail, NotificacionSMS, NotificacionP {
}