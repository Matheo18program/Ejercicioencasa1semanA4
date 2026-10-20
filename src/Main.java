//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package nd31;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Mouse", 25.50, 10);
        Producto p2 = new Producto("Teclado", 45, 8);
        Producto p3 = new Producto("Monitor", 180, 5);
        Producto p4 = new Producto("Webcam", 60, 12);
        Producto p5 = new Producto("USB 32GB", 12.99, 30);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        p4.mostrar();
        p5.mostrar();

        System.out.println("Total de productos: " + Producto.getContadorProductos());
    }
}