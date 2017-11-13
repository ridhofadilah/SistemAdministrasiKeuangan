/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumbertesting;


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
public class KonfirmasiPembayaranContext {
    String respon;
    
    @Dengan("^Data konfirmasi pembayaran yang diinput melalui sistem$")
    public void Data_konfirmasi_pembayaran_yang_diinput_melalui_sistem() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);

    }

    @Ketika("^Input data konfirmasi pembayaran dengan id \"([^\"]*)\"$")
    public void Input_data_konfirmasi_pembayaran_dengan_id(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        respon = Demo.inputKonfirmasiPembayaran(arg1);
    }

    @Maka("^respon sistem berhasil \"([^\"]*)\"$")
    public void respon_sistem_lunas(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ///kode untuk cek ke database apakah user sudah ada
        Assert.assertEquals(arg1, respon);
    }

    @Maka("^respon sistem gagal \"([^\"]*)\"$")
    public void respon_sistem_gagal(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1, respon);
    }
}
