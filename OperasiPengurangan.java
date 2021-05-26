/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperasiBilangan; 

/**
 *
 * @author User
 */
public class OperasiPengurangan extends OperasiBilanganAbs {
    
    protected double a = 6.5;
    protected double b = 0.5;
    protected double c;
    
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = a - b;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        c = get_A() - get_B();
        return c;
    }

    @Override
    protected void tampil() {
        System.out.println("        PENGURANGAN        ");
        System.out.println("Bilangan A = "+ get_A());
        System.out.println("Bilangan B = "+ get_B());
        System.out.println("Hasil Pengurangan A - B = "+ get_C());

    }   
}
