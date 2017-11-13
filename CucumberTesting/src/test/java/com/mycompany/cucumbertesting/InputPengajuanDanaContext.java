/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumbertesting;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;

/**
 *
 * @author MIAfandi
 */
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})

public class InputPengajuanDanaContext {
    @Dengan("^Data pengajuan dana yang akan dimasukan sesuai format$")
public void data_pengajuan_dana_yang_akan_dimasukan_sesuai_format() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);
}

@Ketika("^Melakukan laporan tahunan$")
public void melakukan_laporan_tahunan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);
}

@Dengan("^Data pengajuan dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem$")
public void data_pengajuan_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    
   boolean expected = false;
        ///kode untuk cek ke database apakah user sudah ada
        boolean result = false;///harusnya dari database.
        Assert.assertEquals(expected, result);
}
}
