import java.util.Scanner;

public class LoginIvalidoException extends Exception {
    public static void main(String[] args) {
        try {
            LoginIvalidoException.logar();
        } catch (LoginIvalidoException e) {
            e.printStackTrace();
        }
    }

    public LoginIvalidoException() {
    }

    public LoginIvalidoException(String message) {
        super(message);
    }

    public LoginIvalidoException(Throwable cause) {
        super(cause);
    }

    public LoginIvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginIvalidoException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void logar () throws LoginIvalidoException {
        Scanner teclado = new Scanner (System.in);
        String userNameBd = "Goku";
        String senhaBd = "SSJ";

        System.out.println("Usuario: ");
        String username = teclado.nextLine();
        System.out.println("senha:");
        String senha = teclado.nextLine();

        if (!userNameBd.equals(username) || !senha.equals(senhaBd))
            throw new LoginIvalidoException("Usuarios e senhas invalidas");
    }
}