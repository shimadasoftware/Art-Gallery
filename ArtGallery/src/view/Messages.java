package view;

/**
 *
 * @author Juana
 */
public enum Messages {
    //Custom message for menu
    MAIN_TITLE{
        @Override
        public String toString() {
            return "Sistema de Facturación";
        }
    },
    INVOICE_TITLE{
        @Override
        public String toString() {
            return "Módulo de Facturas";
        }
    },
    CLIENT_TITLE{
        @Override
        public String toString() {
            return "Módulo de Clientes";
        }
    },
    PRODUCT_TITLE{
        @Override
        public String toString() {
            return "Módulo de Productos";
        }
    },
    MAIN_MENU{
        @Override
        public String toString() {
            return "Hola, bienvenido al sistema .... por favor ingresa una de las opt "
                    + "\n1. Administrar clientes"
                    + "\n2. Administrar productos"
                    + "\n3. Administrar facturas"
                    + "\n0. Salir";
        }
    },
    SUB_MENU{
        @Override
        public String toString() {
            return "Por favor ingresa una de las opt "
                    + "\n1. Registrar nuevo"
                    + "\n2. Listar existentes"
                    + "\n3. Buscar"
                    + "\n0. Volver al menu anterior";
        }
    },
}
