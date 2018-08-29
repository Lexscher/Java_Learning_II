package com.alexanderschelchere;

import java.util.Scanner;

public class Printer {

    private String manufacturer;
    private String model;
    private int paperCount;
    private int blackTonerLevel;
    private int coloredTonerLevel;
    private boolean duplexPrinter;
    private boolean wireless;

    private static Scanner scanner = new Scanner(System.in);

    public Printer(String manufacturer, String model, int paperCount, int blackTonerLevel, int coloredTonerLevel, boolean duplexPrinter, boolean wireless) {
        this.manufacturer = manufacturer;
        this.model = model;
        if (paperCount <= 250) {
            this.paperCount = paperCount;
        }
        if (blackTonerLevel >= 0 && blackTonerLevel <= 100) {
            this.blackTonerLevel = blackTonerLevel;
        }
        if (coloredTonerLevel >= 0 && coloredTonerLevel <= 100) {
            this.coloredTonerLevel = coloredTonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
        this.wireless = wireless;
    }

    public void aboutThisPrinter() {
        System.out.println(this.getManufacturer());
        System.out.println(this.getModel());
        if(this.isDuplexPrinter()) {
            System.out.println("Duplex Printer");
        }
        System.out.println("Connection: " + this.isWireless());
    }

    public void printerVitals() {
        System.out.println(this.getPaperCount());
        System.out.println(this.getBlackTonerLevel());
        System.out.println(this.getColoredTonerLevel());
    }

    public void print(int pages) {
        if (duplexPrinter) {
            System.out.print("Would you like to print on both sides of the paper? Please type \"Yes\" or \"No\". ");
            String answer1 = scanner.nextLine();
            if (answer1.toLowerCase().contains("yes")) {
                pages = pages / 2;
            }
        }

        if (this.paperCount < pages) {
            System.out.println("Sorry, you do not have enough paper. Please Re-stock the printing machine.");
            return;
        }
        System.out.print("Would like to print in color? Please answer with \"Yes\" or \"No\". ");
        String answer2 = scanner.nextLine();
        if (answer2.toLowerCase().contains("yes")) {
            printInColor();
            if (printInColor()) {
                System.out.println("Printing... ");
                this.paperCount -= pages;
                return;
            } else {
                System.out.println("Where am I going to find more colored Toner...");
                return;
            }
        }
        printInBlackAndWhite();
        if(printInBlackAndWhite()) {
            System.out.println("Printing... ");
            this.paperCount -= pages;
        } else {
            System.out.println("Where am I going to find more black and white Toner...");
            return;
        }

    }

    public void TonerRefill(){
        System.out.println("Colored Toner: " + this.coloredTonerLevel + "%");
        System.out.println("Black Toner: " + this.blackTonerLevel + "%");
        if (this.coloredTonerLevel < 20 || this.blackTonerLevel < 20) {
            this.coloredTonerLevel = 100;
            this.blackTonerLevel = 100;
            System.out.println("Everything looks good now, we should be able to print!");
            return;
        }
        System.out.println("There's no need to refill the toner.");
    }

    private boolean printInColor() {
        if(this.getColoredTonerLevel() <= 10) {
            System.out.println("Color Toner Levels are Dangerously Low!");
            this.coloredTonerLevel -= 10;
            return true;
        }
        if (this.getColoredTonerLevel() < 1) {
            System.out.println("You need to refill the Colored Toner before Printing!");
            return false;
        }
        this.coloredTonerLevel -= 10;
        return true;
    }

    private boolean printInBlackAndWhite() {
        if(this.getBlackTonerLevel() < 10) {
            System.out.println("Color Toner Levels are Dangerously Low!");
            this.blackTonerLevel -= 10;
            return true;
        }
        if (this.getBlackTonerLevel() < 1) {
            System.out.println("You need to refill the ");
            return false;
        }
        this.blackTonerLevel -= 10;
        return true;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    private String getModel() {
        return model;
    }

    private int getPaperCount() {
        return paperCount;
    }

    private int getBlackTonerLevel() {
        return blackTonerLevel;
    }

    private int getColoredTonerLevel() {
        return coloredTonerLevel;
    }

    private boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    private boolean isWireless() {
        return wireless;
    }
}
