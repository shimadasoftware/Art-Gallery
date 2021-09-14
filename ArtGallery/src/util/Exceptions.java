package util;

/**
 *
 * @author Juana
 */
public enum Exceptions {
    //Custom message for number format exception
    NUMBER_FORMAT{
        @Override
        public String toString() {
            return "Error, el texto ingresado no se puede convertir a Numérico"
                    + "\n Códgio del error: ";
        }
    },
    
    //Custom message for array index out of bounds exception
    ARRAY_INDEX_OUT_OF_BOUNDS{
        @Override
        public String toString() {
            return "Error, la posición especificada no corresponde al tamaño del vector"
                    + "\n Código del error: ";
        }
    },
    
    //Custom message for null pointer exception
    NULL_POINTER{
        @Override
        public String toString() {
            return "Error, el valor asociado no puede ser nulo"
                    + "\n Código del error: ";
        }
    },
}
