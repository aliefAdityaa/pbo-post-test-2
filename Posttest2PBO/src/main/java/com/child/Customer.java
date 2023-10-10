/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.child;

import com.induk.Person;

/**
 *
 * @author ASUS
 */
public final class Customer extends Person {
    public double wallet;

    public Customer(String name, double wallet) {
        super(name);
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama pelanggan: " + getName() + ", Isi dompet: $" + getWallet());
    }
}
