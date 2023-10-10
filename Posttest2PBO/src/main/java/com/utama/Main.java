/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utama;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

import com.child.*;
import com.induk.*;
public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> peopleList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah karyawan");
            System.out.println("2. Tambah manager");
            System.out.println("3. Tambah kasir");
            System.out.println("4. Tambah pelanggan");
            System.out.println("5. Tambah produk sendal");
            System.out.println("6. Tampilkan semua informasi");
            System.out.println("7. Perbarui informasi");
            System.out.println("8. Hapus informasi");
            System.out.println("0. Exit");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (choice) {
                case 1:
                    System.out.print("Nama Karyawan: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Gaji Karyawan: ");
                    double employeeSalary = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Employee(employeeName, employeeSalary));
                    break;
                case 2:
                    System.out.print("Nama Manager: ");
                    String managerName = scanner.nextLine();
                    System.out.print("Gaji Manager: ");
                    double managerSalary = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Manajer(managerName, managerSalary));
                    break;
                case 3:
                    System.out.print("Nama Kasir: ");
                    String cashierName = scanner.nextLine();
                    System.out.print("Gaji Kasir: ");
                    double cashierSalary = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Cashier(cashierName, cashierSalary));
                    break;
                case 4:
                    System.out.print("Nama Pelanggan: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Dompet Pelanggan: ");
                    double wallet = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Customer(customerName, wallet));
                    break;
                case 5:
                    System.out.print("Nama sendal: ");
                    String productName = scanner.nextLine();
                    System.out.print("Harga sendal: ");
                    double productPrice = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Product(productName, productPrice));
                    break;
                case 6:
                    for (Person person : peopleList) {
                        person.displayInfo();
                    }
                    break;

                case 7:
                    System.out.print("Masukkan nama untuk mengupdate: ");
                    String updateName = scanner.nextLine();
                    boolean found = false;

                    for (Person person : peopleList) {
                        if (person.getName().equals(updateName)) {
                            found = true;
                            if (person instanceof Employee) {
                                System.out.print("Masukkan gaji baru: ");
                                double newSalary = scanner.nextDouble();
                                scanner.nextLine(); // Membersihkan newline dari buffer
                                ((Employee)person).setSalary(newSalary);
                            } else if (person instanceof Customer) {
                                System.out.print("Masukkan dompet baru: ");
                                double newWallet = scanner.nextDouble();
                                scanner.nextLine(); // Membersihkan newline dari buffer
                                ((Customer) person).setWallet(newWallet);
                            } else if (person instanceof Product) {
                                System.out.print("Masukkan harga baru: ");
                                double newPrice = scanner.nextDouble();
                                scanner.nextLine(); // Membersihkan newline dari buffer
                                ((Product) person).setPrice(newPrice);
                            }
                            System.out.println("Informasi berhasil diupdate.");
                        }
                    }

                    if (!found) {
                        System.out.println("Tidak dapat menemukan entitas dengan nama tersebut.");
                    }

                    break;
                case 8:
                    System.out.print("Masukkan nama untuk menghapus: ");
                    String deleteName = scanner.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < peopleList.size(); i++) {
                        Person person = peopleList.get(i);
                        if (person.getName().equals(deleteName)) {
                            peopleList.remove(i);
                            removed = true;
                            System.out.println("Entitas berhasil dihapus.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Tidak dapat menemukan entitas dengan nama tersebut.");
                    }

                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}

