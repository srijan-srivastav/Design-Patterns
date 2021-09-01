package DesignPatterns.StrategyPattern;

import DesignPatterns.FactoryPattern.Exceptions.InvalidTerrainException;
import DesignPatterns.StrategyPattern.Processors.Processors;
import DesignPatterns.StrategyPattern.RAM.UserType;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    /**
     * This is the driver class, which takes the user input and then creates a laptop with the configuration object supplied
     * Using the configuration, there are simple factories which spit out the behaviour for processor and ram
     *
     * and later you can see that I'm changing the behaviour of the processor and the ram at runtime, this is the power of strategy pattern
     * This the impact of favouring composition over inheritance
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the user type \n 1. Personal \n 2. Development");
        UserType userType = UserType.values()[input.nextInt()-1];
        System.out.println("Select the processor you would like \n 1. A1 Bionic \n 2. Intel i9");
        Processors processor = Processors.values()[input.nextInt()-1];

        Configuration configuration = new Configuration("My computer",processor, userType);

        Laptop laptop = new Laptop(configuration);

        System.out.println(laptop.getProcessor().processor());
        System.out.println(laptop.getRamConfig().RAMConfiguration());

        laptop.setProcessor(Processors.INTELI9);
        laptop.setRamConfig(UserType.DEVELOPER);

        System.out.println(laptop.getProcessor().processor());
        System.out.println(laptop.getRamConfig().RAMConfiguration());

    }
}
