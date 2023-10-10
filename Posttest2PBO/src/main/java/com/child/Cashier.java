/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.child;

import com.induk.Employee;

/**
 *
 * @author ASUS
 */
public final class Cashier extends Employee {
    public Cashier(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama kasir: " + getName() + ", Gaji: $" + getSalary());
    }
}