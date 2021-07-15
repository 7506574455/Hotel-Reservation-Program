package com.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("Press 1 to add hotel\nPress 2 to show all hotel\nPress 3 to exit ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Hotel hotel = new Hotel();
                System.out.println("Enter a hotel name : ");
                String name = scanner.next();
                System.out.println("Enter Rates : ");
                int price = scanner.nextInt();
                hotel.setHotelName(name);
                hotel.setHotelPrice(price);
                hotelArrayList.add(hotel);
            } else if (choice == 2) {
                for (Hotel hotel : hotelArrayList) {
                    System.out.println(hotel.hotelName + " " + hotel.hotelPrice);
                }
            } else {
                flag = false;
            }
        }

    }
}