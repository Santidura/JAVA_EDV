package Servicio;

import java.util.Scanner;
import Entidad.Cuenta;

public class ServiceCuenta {

    private final Scanner reader;
    private final Cuenta account;

    public ServiceCuenta() {
        reader = new Scanner(System.in);
        account = new Cuenta();
    }

    public Cuenta createAccount() {
        System.out.println("CREACION DE CUENTA BANCARIA");
        System.out.print("Ingrese el número de la cuenta: ");
        account.setAccountNumber(reader.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        account.setClientDni(reader.nextInt());
        account.setCurrentBalance(0);

        return account;
    }

    public void enterMoney(double value) {
        account.setCurrentBalance(account.getCurrentBalance() + value);
        System.out.println("Monto ingresado con éxito!");
    }

    public void withdrawMoney(double value) {
        if (value > account.getCurrentBalance()) {
            System.out.println("Saldo insuficiente :(");
        } else {
            account.setCurrentBalance(account.getCurrentBalance() - value);
            System.out.println("Monto retirado con éxito!");
        }
    }

    public void withdrawRapid() {
        System.out.print("Monto a retirar: ");
        double amount = reader.nextDouble();

        if (amount > (account.getCurrentBalance() * 0.2)) {
            System.out.println("No se puede realizar operación rápida, saldo supera el 20% del saldo total.");
        } else {
            this.withdrawMoney(amount);
        }
    }

    public void queryBalance() {
        System.out.println("Saldo actual: $" + account.getCurrentBalance());
    }

    public void queryAccountData() {
        System.out.println("Número de cuenta: " + account.getAccountNumber());
        System.out.println("DNI del Cliente: " + account.getClientDni());
        System.out.println("Balance de cuenta: $" + account.getCurrentBalance());
    }

    public void run() {
        System.out.println("\n\nBienvenido compadre que quereis hacer hoy?");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Hacer una extracción rápida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos de la cuenta");
        System.out.println("6. Salir");
        System.out.print("Ingrese opción: ");
        int option = reader.nextInt();

        switch (option) {
            case 1 -> {
                System.out.print("Monto a ingresar: ");
                this.enterMoney(reader.nextDouble());
            }
            case 2 -> {
                System.out.print("Monto a retirar: ");
                this.withdrawMoney(reader.nextDouble());
            }
            case 3 -> this.withdrawRapid();
            case 4 -> this.queryBalance();
            case 5 -> this.queryAccountData();
            case 6 -> {
                return;
            }
            default -> System.out.println("Opción no válida.");
        }

        this.run();
    }
}
