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