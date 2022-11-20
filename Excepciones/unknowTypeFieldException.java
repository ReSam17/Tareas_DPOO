public class unknowTypeFieldException extends EmptyFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public unknowTypeFieldException(String string) {
        super("El tipo de dato intoducido es desconocido");
    }
}