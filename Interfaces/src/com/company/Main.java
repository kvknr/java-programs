package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone vinoPhone;
        vinoPhone = new DeskPhone(1234567890);
        vinoPhone.powerOn();
        vinoPhone.callPhone(1234567890);
        vinoPhone.answer();

        vinoPhone = new MobilePhone(987654321);
        vinoPhone.powerOn();
        vinoPhone.callPhone(987654321);



    }
}
