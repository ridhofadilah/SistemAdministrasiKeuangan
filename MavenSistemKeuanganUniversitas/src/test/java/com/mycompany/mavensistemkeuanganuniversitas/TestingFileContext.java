/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas;

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
public class TestingFileContext {
String respon;
    
    @Dengan("^Nim yang diinputkan pada kolom cek status pada menu cek status pembayaran mahasiswa$")
    public void Nim_yang_diinputkan_pada_kolom_cek_status_pada_menu_cek_status_pembayaran_mahasiswa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);

    }

    @Ketika("^Cek status pembayaran dengan nim \"([^\"]*)\"$")
    public void mLogin_ke_dalam_sistem_keuangan_dengan_account(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        respon = TestingFile.cekStatusPembayaran(arg1);
    }

    @Maka("^respon sistem lunas \"([^\"]*)\"$")
    public void respon_sistem_lunas (String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ///kode untuk cek ke database apakah user sudah ada
        Assert.assertEquals(arg1, respon);
    }

    @Maka("^respon sistem belum lunas \"([^\"]*)\"$")
    public void respon_sistem_belum_lunas (String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1, respon);
    }
}
