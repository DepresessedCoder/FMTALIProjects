package com.cars;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class Main{
    static public void main(String []args){
        Scanner input = new Scanner (System.in);
        Collection<Car> cars = new ArrayList<>();

        System.out.println(" Welcome");
        System.out.println(" 1. Capture vehicle details\n" +
                " 2. View vehicle report\n" +
                " 3. Exit\n");

        int menuOption = input.nextInt();

        while((menuOption == 1) || (menuOption == 2)){
            if (menuOption == 1) {
                Car carObj = new Car();
                int year;
                int millage;
                String make ;
                String model;
                String plateNum="";
                String vinNum ;

                System.out.println("Enter make");
                make = input.next();

                System.out.println("Enter model");
                model = input.next();

                System.out.println("Enter vin");
                vinNum = input.next();


            while(!(vinNum.length() == 17)){
                System.out.println ("Vin number must be 17 characters. Please re-enter");
                vinNum = input.next();
            }
            System.out.println("Enter 1 for old format license plate number and 2 for new format license plate numbers.");
            int plateChoice = input.nextInt();
            if(plateChoice == 1){
                System.out.println("Enter plate number");
                plateNum = input.next();
            } else if(plateChoice == 2 ){
                System.out.println("Enter plate number");
                plateNum = input.next();
            }
            System.out.println("Enter millage");
            millage = input.nextInt();

            System.out.println("Enter year");
            year = input.nextInt();

            carObj.setMake(make);
            carObj.setModel(model);
            carObj.setPlateNum(plateNum);
            carObj.setVin(vinNum);
            carObj.setYear(year);
            carObj.setMillage(millage);

            cars.add(carObj);
        } else {
            if(cars.isEmpty()){
                System.out.println(" No cars have been captured");
            }else{
                System.out.println( "VEHICLE REPORT");
                for (Car carObject: cars){
                    System.out.println("Make:" + carObject.getMake() +
                            "Model:" + carObject.getModel() +
                            "Plate Number:" + carObject.getPlateNum() +
                            "Vin number:" + carObject.getVin() +
                            " Year:" + carObject.getYear() +
                            "Millage:" + carObject.getMillage());
                }
            }
        }
        System.out.println(" 1. Capture vehicle details" +
                " 2. View vehicle report" +
                " 3. Exit");
        menuOption = input.nextInt();
    }
        System.out.println("Thank You");
    }

}


