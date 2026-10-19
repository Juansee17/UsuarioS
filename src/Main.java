public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        // Usando setters y validaciones
        usuario.setUsername("jperez");
        usuario.setCorreo("jperez@correo.com");
        usuario.setNivel(5);
        usuario.activar();

        // Probando getters
        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("¿Está activo?: " + usuario.isActivo());

        // Probando desactivar
        usuario.desactivar();
        System.out.println("¿Está activo después de desactivar?: " + usuario.isActivo());
    }
}