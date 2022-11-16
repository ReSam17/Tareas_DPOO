/* posibles excepciones que se pueden dar en el llenado de atributos de
una clase que necesita obigatoriamente ese atributo para s poder crear 
un objeto*/ 
public class EmptyFieldException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public EmptyFieldException(String string) {
        super("El campo está vacío");
    }
    
}
class wrongTypeFiledException extends EmptyFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public wrongTypeFiledException(String string) {
        super("Tipo de dato incorrecto para este campo");
    }
}
class unoperableTypeException extends wrongTypeFiledException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public unoperableTypeException() {
        super("No se puede operar con ese valor");
    }
}
class unlegibleTypeException extends wrongTypeFiledException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public unlegibleTypeException() {
        super("No se puede acceder a ese tipo de dato");
    }
}

class unknowTypeFieldException extends EmptyFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public unknowTypeFieldException(String string) {
        super("El tipo de dato intoducido es desconocido");
    }
}
class invalidAccesException extends unknowTypeFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public invalidAccesException() {
        super("No se pude acceder a las funcionalidades para este dato");
    }
}
class heavyTypeException extends unknowTypeFieldException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public heavyTypeException() {
        super("El dato es deamasiado pesado para cargarlo");
    }
}
