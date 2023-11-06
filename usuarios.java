import java.io.IOException;
import java.util.Scanner;

// Clase Usuario para almacenar información del usuario
class Usuario {
    private String username;
    private String password;
    private String tipo;

    public Usuario(String username, String password, String tipo) {
        this.username = username;
        this.password = password;
        this.tipo = tipo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() {
        return tipo;
    }
}

// Clase SistemaDeLogin para administrar el inicio de sesión
class SistemaDeLogin {
    private static Usuario[] usuarios = {
        new Usuario("admin", "admin123", "admin"),
        new Usuario("usuario", "user123", "usuario")
    };

    public static Usuario iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de usuario: ");
        String username = scanner.next();
        System.out.print("Contraseña: ");
        String password = scanner.next();

        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }
}

public class usuarios {
    public static void main(String[] args) throws IOException {
        Usuario usuario = SistemaDeLogin.iniciarSesion();

        if (usuario != null) {
            InventarioMedicamentos inventarioMedicamentos = new InventarioMedicamentos();
            InventarioObjetos inventarioObjetos = new InventarioObjetos();

            if (usuario.getTipo().equals("admin")) {
                // Usuario admin
                Menu.usuarios(inventarioMedicamentos, inventarioObjetos);
            } else {
                // Usuario regular
                Menu.usuarios(inventarioMedicamentos, inventarioObjetos);
            }
        } else {
            System.out.println("Inicio de sesión fallido. Usuario y/o contraseña incorrectos.");
        }
    }
}

