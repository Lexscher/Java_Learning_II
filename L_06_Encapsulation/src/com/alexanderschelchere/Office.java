package com.alexanderschelchere;

import java.util.Scanner;

public class Office {

    private PC computer;
    private Printer printer;
    private Person owner;
    private Desk desk;
    private boolean passwordFound;
    private boolean computerOn;

    private static Scanner scanner = new Scanner(System.in);

    public Office(PC computer, Printer printer, Person owner, Desk desk) {
        this.computer = computer;
        this.printer = printer;
        this.owner = owner;
        this.desk = desk;
        this.passwordFound = false;
        this.computerOn = false;
    }

    public void aboutPrinter() {
        getPrinter().aboutThisPrinter();
    }

    public void checkPrinter() {
        getPrinter().printerVitals();
    }

    public void refillPrinter() {
       getPrinter().TonerRefill();
    }

    public void usePrinter() {
        System.out.print("How many copies would you like to print? Please type enter a number: ");
        String answer = scanner.nextLine();
       if (isInteger(answer)) {
            int x;
            x = Integer.parseInt(answer);
            getPrinter().print(x);
            return;
        }
        System.out.println("Invalid Number. Try Again.");
    }

    private static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);

            // s is a valid integer

            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            // s is not an integer
        }

        return isValidInteger;
    }

    public void snoopThroughComputer() {
        if (!isPasswordFound()) {
            System.out.println("Why would I turn the computer on when I know I don't know the password? Trying to conserve energy, here");
        }
        this.getComputer().powerUp();
        getOwner().getInformation();
    }

    public void snoopThroughDesk() {
        getDesk().searchFirstDrawer();
        getDesk().searchSecondDrawer();
        getDesk().unlock();
        lookForKey();
        getDesk().unlock();
        getDesk().searchSecondDrawer();
        this.passwordFound = true;
    }

    private void lookForKey() {
        getDesk().searchForTheKey();
    }

    private PC getComputer() {
        return computer;
    }

    public Printer getPrinter() {
        if (!isComputerOn()) {
            System.out.println("We can't use the printer if the computer's not on.");
            return null;
        }
        return printer;
    }

    private Person getOwner() {
        return owner;
    }

    private Desk getDesk() {
        return desk;
    }

    private boolean isPasswordFound() {
        return passwordFound;
    }

    private boolean isComputerOn() {
        return computerOn;
    }
}
