package com.company;

public class Main {

    public static void main(String[] args) {


        Frigider nostru = new Frigider();
        nostru.setApa("frigusor");
        nostru.setBere("Chisinau");
        nostru.setCarne("de pui");
        nostru.setCartofi(20);
        nostru.setRosii(43);
        System.out.println("in frigider se gaseste  apa: " + nostru.getApa());
        System.out.println("in frigider se gaseste  bere : " +  nostru.getBere());
        System.out.println("in frigider se gaseste carne  : " + nostru.getCarne());
        System.out.println("in frigider se gasesc : " + nostru.getCartofi() + " cartofi");
        System.out.println("in frigider se gasesc : " + nostru.getRosii() + " rosii");


    }
}
