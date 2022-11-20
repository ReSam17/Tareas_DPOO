public class wrongTypeFiledExceptions extends EmptyFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public wrongTypeFiledExceptions(String string) {
        super("Tipo de dato incorrecto para este campo");
    }
}