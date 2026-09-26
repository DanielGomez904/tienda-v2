import java.util.Scanner;

public class InventarioAntro {
    public static void main(String[] args) {
        String[] productos = {"Producto1", "Producto2", "Producto3", "Producto4"};
        int[] precios = {50, 800, 40, 30};
        int[] stock = {100, 20, 50, 70};
        int cajaTotal = 0;
        Scanner sc = new Scanner(System.in);
        int opcionMenu;

        do {
            System.out.println("\n--- MENU ANTRO ---");
            System.out.println("1. Ver inventario");
            System.out.println("2. Vender");
            System.out.println("3. Cerrar caja y salir");
            System.out.println("Elige: ");
            opcionMenu = sc.nextInt();

            if (opcionMenu == 1) {
                for (int i = 0; i < productos.length; i++) {
                    System.out.println(i + ". " + productos[i] + " - $" + precios[i] + " - stock: " + stock[i]);
                    if (stock[i] < 10) System.out.println(" -< ¡STOCK BAJO!");
                }
            } else if (opcionMenu == 2) {
                System.out.print("Que producto? (0,1,2,3): ");
                int p = sc.nextInt();
                System.out.print("Cuantos? ");
                int c = sc.nextInt();

                if (p >= 0 && p < stock.length && stock[p] >= c) {
                    stock[p] -= c;
                    int total = precios[p] * c;
                    cajaTotal += total;
                    System.out.println("Ventas: $" + total + " | Caja va en $" + cajaTotal);
                } else {
                    System.out.println("No se puede vender - revisa stock o numero de producto");
                }
            }
        } while (opcionMenu != 3);

        System.out.println("Cierre final: $" + cajaTotal + " - Gracias por la noche!");
        sc.close();
    }
}