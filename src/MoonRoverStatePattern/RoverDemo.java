/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRoverStatePattern;

/**
 * Demo class for testing the lunar rover state pattern.
 * @author anikettiwari
 * @version 1.0
 */
public class RoverDemo {
    /**
     * Main method to run the lunar rover state pattern demo.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Context context = Context.getInstance();

        // Initial state
        printState(context);

        context.pressRightPedal(1);
        printState(context);

        context.pressRightPedalForTime(5);
        printState(context);

        context.pressLeftPedal(1);
        printState(context);

        context.pressLeftPedalForTime(3);
        printState(context);

        context.pressRightPedal(2);
        printState(context);

        context.pressRightPedal(3);
        printState(context);
    }

    private static void printState(Context context) {
        System.out.println("Current State: " + context.getState().getName());
        System.out.println("Current SubState: " + context.getState().getSubState());
        System.out.println("---------------");
    }
}

