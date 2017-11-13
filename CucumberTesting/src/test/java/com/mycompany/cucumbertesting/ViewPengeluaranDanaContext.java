/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumbertesting;

import cucumber.api.CucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;
/**
 *
 * @author MIAfandi
 */
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class ViewPengeluaranDanaContext {
    String respon;
    
    @Dengan("^Admin fakultas masuk ke halaman homepage admin fakultas pengeluarn dana$")
    public void Admin_fakultas_masuk_ke_halaman_homepage_admin_fakultas_pengeluarn_dana() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);

    }

    @Ketika("^Mengklik tombol pengeluaran \"([^\"]*)\"$")
    public void Mengklik_tombol_pengeluaran (String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        respon = Demo.viewPengeluranDana(arg1);
    }

    @Maka("^respon sistem pengeluaran \"([^\"]*)\"$")
    public void respon_sistem_pengeluaran(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ///kode untuk cek ke database apakah user sudah ada
        Assert.assertEquals(arg1, respon);
    }
}
