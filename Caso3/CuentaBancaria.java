package Caso3;

import java.util.Scanner;

public class CuentaBancaria {
     private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo para realizar el retiro.");
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        mostrarSaldo();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Deposit ar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ver saldo");
            System.out.println("4. Ver datos de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDepositar = scanner.nextDouble();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    cuenta.mostrarSaldo();
                    break;
                case 4:
                    cuenta.mostrarDatos();
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
