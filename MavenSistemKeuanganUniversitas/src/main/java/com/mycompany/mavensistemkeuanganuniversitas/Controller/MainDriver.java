/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.Controller;

import com.mycompany.mavensistemkeuanganuniversitas.Contoller.ControllerLogin;
import com.mycompany.mavensistemkeuanganuniversitas.Model.Aplikasi;

/**
 *
 * @author MIAfandi
 */
public class MainDriver {
    public static void main(String[] args) {
        Aplikasi driver = new Aplikasi();
        new ControllerLogin(driver);
    }
}
