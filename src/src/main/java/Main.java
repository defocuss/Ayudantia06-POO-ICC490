import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fechaActual = new Date();

        // Creo territorio
        Territorio chile = new Territorio("Chile");

        // Agrego region
        chile.agregarRegion("La araucania");

        // Agrego ciudad
        chile.agregarCiudadARegion("La araucania", "Temuco",4780000);


        // Creo tienda
        Tienda ripleyPortal = new Tienda("Ripley Portal", "Portal temuco", "10:00am a 22:00pm");

        // Creo empleados
        Empleado empleado1 = new Empleado("Jorge", 1,"Gerente general");
        Empleado empleado2 = new Empleado("Carlos", 2,"Vendedor");

        // Creo clientes
        Cliente cliente1 = new Cliente("Emilio", 1);
        Cliente cliente2 = new Cliente("Michelle", 2);

        // Creo productos
    }
}