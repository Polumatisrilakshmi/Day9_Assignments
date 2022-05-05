package com.bridgelabz;
import javax.swing.*;
import java.util.*;

public class AddressBook {
    public static class PersonInfo {
        String First_Name;
        String Last_Name;
        String Address;
        String PhoneNumber;
        String State;
        String City;
        PersonInfo(String n,String s,String a, String p,String q,String r) {
            First_Name = n;
            Last_Name = s;
            Address = a;
            PhoneNumber = p;
            State = q;
            City = r;
        }
        void display() {
            JOptionPane.showMessageDialog(null,"First Name: " + First_Name +"\nLast Name : " + Last_Name +"\nAddress: " + Address + "\nPhone no: " + PhoneNumber + "\nstate : " + State + "\ncity : " + City);
        }
    }

    public static void main(String[] args) {
            PersonInfo ab = new PersonInfo(null,null,null,null,null,null);
            ab.display();
        }
    }


