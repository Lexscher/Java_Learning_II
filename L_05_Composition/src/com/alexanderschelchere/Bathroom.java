package com.alexanderschelchere;

public class Bathroom {
    private Shower shower;
    private Toilet toilet;
    private Sink sink;

    public Bathroom(Shower shower, Toilet toilet, Sink sink) {
        this.shower = shower;
        this.toilet = toilet;
        this.sink = sink;
    }

    public void useToilet() {
        System.out.println("Gonna use the toilet!");
        toilet.royalFlush();
    }

    public void washHands() {
        sink.washHands();
    }

    public void leaveTheBathroom() {
        if (toilet.isUsedThisVisit() && !sink.isHandsWashed()) {
            System.out.println("All employees(or anyone, really) \033[2m must\033[0m wash their hands before leaving the bathroom.");
            System.out.println("That's right! I can't leave, my hands are dirty.");
            return;
        }
        System.out.println("I'm leaving the bathroom!!");
    }

}
