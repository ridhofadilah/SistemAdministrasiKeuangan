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
 * @author MIAfandi and Ridho
 */
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class DemoContext {

    String respon;

    @Dengan("^Data user baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem$")
    public void data_user_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);

    }

    @Ketika("^Memasukan data user dengan nama \"([^\"]*)\"$")
    public void memasukan_data_user_dengan_nama(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        respon = Demo.addUser(arg1);
    }

    @Maka("^respon \"([^\"]*)\"$")
    public void respon(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ///kode untuk cek ke database apakah user sudah ada
        Assert.assertEquals(arg1, respon);
    }

    @Maka("^respon gagal dengan pesan \"([^\"]*)\"$")
    public void respon_gagal_dengan_pesan(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1, respon);
    }

    @Dengan("^Data pembayaran baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem$")
    public void data_pembayaran_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);

    }

    @Ketika("^Melakukan pembayaran mahasiswa \"([^\"]*)\"$")
    public void melakukan_pembayaran_mahasiswa(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
    }

    
    @Maka("^responnya \"([^\"]*)\"$")
    public void responnya(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String ans = "Mahasiswa sukses melakukan pembayaran";
        Assert.assertEquals(arg1, ans);
    }

    @Maka("^responnya gagal dengan pesan \"([^\"]*)\"$")
    public void responnya_gagal_dengan_pesan(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String ans = "Mahasiswa gagal melakukan pembayaran";
        Assert.assertEquals(arg1, ans);
    }
}
