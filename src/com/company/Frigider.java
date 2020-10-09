package com.company;

class Frigider {
     private String carne;
     private String bere;
     private String apa;
     private int rosii;
     private int cartofi;

     Frigider() {

     }
         public void setCarne (String carne){
             this.carne = carne;
         }
         public void setBere (String bere){
             this.bere = bere;
         }
         public void setApa (String apa){
             this.apa = apa;
         }
         public void setRosii ( int rosii){
             this.rosii = rosii;
         }
         public void setCartofi ( int cartofi){
             this.cartofi = cartofi;
         }

         public int getCartofi () {
             return cartofi;
         }

         public int getRosii () {
             return rosii;
         }
         public String getCarne () {
             return carne;
         }
         public String getBere () {
             return bere;
         }
         public String getApa () {
             return apa;
         }
     }

