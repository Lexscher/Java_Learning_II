package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        /*
        CHALLENGE
        create a class and demonstrate proper encapsulation techniques
        The class will be called Printer
        It will simulate a real Computer Printer
        It should have fields for the toner Level, number of pages printed, and
        also whether its a duplex printer (capable of printing on both sides of the paper).
        Add methods to fill up the toner (up to a maximum of 100%), another method to
        simulate printing a page (which should increase the number of pages printed).
        Decide on the scope, whether to use constructors, and anything else you think is
        needed.
         */

        // The Computer.
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        // The Printer.
        Printer bestPrinter = new Printer("HP", "OfficeJet 3830 Wireless All-In-One Instant Ink Ready Printer - Black", 200, 80, 80, true, true);

        // The Owner of the office.
        Person spider = new Person();

        // The Desk.
        DrawerOne firstDrawer = new DrawerOne();
        DrawerTwo secondDrawer = new DrawerTwo();

        Desk theDesk = new Desk(firstDrawer, secondDrawer);

        // The Office
        Office dangerous = new Office(thePC, bestPrinter, spider, theDesk);

        dangerous.snoopThroughComputer();
        dangerous.snoopThroughDesk();
        dangerous.snoopThroughComputer();
        dangerous.usePrinter();
        // Console
        /*
            Why would I turn the computer on when I know I don't know the password? Trying to conserve energy, here
            Nothin' here but a gross sandwich!
            I'll need to find the key in order to open this drawer...
            We need to find the key!
            *Clicks*
            Ok, Great! That's unlocked now
            Sweet! I think these files may have the password to the computer!
            power button pressed
            Drawing pixel at 1200, 50 in color blue
            Chrollo
            26
            Founder: Phantom Troupe
            Sweet! We've infiltrated the right office...
            How many copies would you like to print? Please type enter a number: 8
            Would you like to print on both sides of the paper? Please type "Yes" or "No". NO
            Would like to print in color? Please answer with "Yes" or "No". No.
            Printing...
            *Printed pages come out*
         */

    }

}
