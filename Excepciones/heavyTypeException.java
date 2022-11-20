public class heavyTypeException extends unknowTypeFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public heavyTypeException() {
        super("El dato es deamasiado pesado para cargarlo");
    }
}