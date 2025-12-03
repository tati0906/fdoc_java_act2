package com.example;

public class EjerciciosActividad2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // WHILE
        
        System.out.println("=== WHILE 1: Números del 1 al 10 ===");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n=== WHILE 2: Suma de 1 a n ===");
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma = 0;
        int j = 1;
        while (j <= n) {
            suma += j;
            j++;
        }
        System.out.println("Suma total: " + suma);

        System.out.println("\n=== WHILE 3: Buscar número en arreglo ===");
        int[] numeros = {3, 7, 10, 15, 20};
        System.out.print("Ingrese número a buscar: ");
        int buscado = sc.nextInt();

        int k = 0;
        boolean encontrado = false;

        while (k < numeros.length && !encontrado) {
            if (numeros[k] == buscado) {
                encontrado = true;
            }
            k++;
        }
        if (encontrado) System.out.println("Número encontrado");
        else System.out.println("Número NO encontrado");
       
        // DO - WHILE
        
        System.out.println("\n=== DO-WHILE 1: Menú interactivo ===");
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
        } while (opcion != 3);
        System.out.println("Saliendo del menú...");

        System.out.println("\n=== DO-WHILE 2: Leer números hasta 0 ===");
        int num;
        int suma2 = 0;
        do {
            System.out.print("Ingrese número (0 para terminar): ");
            num = sc.nextInt();
            suma2 += num;
        } while (num != 0);
        System.out.println("Suma acumulada: " + suma2);

        System.out.println("\n=== DO-WHILE 3: Validar contraseña ===");
        String password = "1234";
        String ingreso;
        sc.nextLine(); 
        do {
            System.out.print("Ingrese contraseña: ");
            ingreso = sc.nextLine();
        } while (!ingreso.equals(password));
        System.out.println("Acceso concedido.");

        // FOR

        System.out.println("\n=== FOR 1: Pares del 2 al 20 ===");
        for (int x = 2; x <= 20; x += 2) {
            System.out.println(x);
        }

        System.out.println("\n=== FOR 2: Factorial ===");
        System.out.print("Ingrese número para factorial: ");
        int f = sc.nextInt();
        int fact = 1;
        for (int x = 1; x <= f; x++) {
            fact *= x;
        }
        System.out.println("El factorial es: " + fact);

        System.out.println("\n=== FOR 3: Suma de arreglo ===");
        int[] arreglo = {5, 10, 20, 3};
        int suma3 = 0;
        for (int x = 0; x < arreglo.length; x++) {
            suma3 += arreglo[x];
        }
        System.out.println("La suma es: " + suma3);

        // FOR-EACH

        System.out.println("\n=== FOR-EACH 1: Suma de arreglo ===");
        int[] valores = {2, 4, 6, 8};
        int suma4 = 0;
        for (int v : valores) {
            suma4 += v;
        }
        System.out.println("Suma total: " + suma4);

        System.out.println("\n=== FOR-EACH 2: Listar palabras ===");
        String[] palabras = {"Hola", "Mundo", "Java"};
        for (String p : palabras) {
            System.out.println(p);
        }

        System.out.println("\n=== FOR-EACH 3: Promedio de calificaciones ===");
        double[] notas = {4.5, 3.8, 5.0, 4.2};
        double suma5 = 0;
        for (double n2 : notas) {
            suma5 += n2;
        }
        double promedio = suma5 / notas.length;
        System.out.printf("Promedio: %.2f%n", promedio);

        // BREAK y CONTINUE
  
        System.out.println("\n=== BREAK 1: Detener en 5 ===");
        for (int x = 1; x <= 10; x++) {
            if (x == 5) break;
            System.out.println(x);
        }

        System.out.println("\n=== CONTINUE 2: Omitir impares ===");
        for (int x = 1; x <= 10; x++) {
            if (x % 2 != 0) continue;
            System.out.println(x);
        }

        System.out.println("\n=== BREAK + CONTINUE ===");
        for (int x = 1; x <= 20; x++) {
            if (x % 3 == 0) continue;
            if (x > 15) break;
            System.out.println(x);
        }

        sc.close();
    }
}
