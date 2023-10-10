/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.induk;

/**
 *
 * @author ASUS
 */
abstract public class Person {
    final String name;

    public Person(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    abstract public void displayInfo();
}
