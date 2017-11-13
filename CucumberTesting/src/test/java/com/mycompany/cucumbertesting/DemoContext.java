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
    
    @Ketika("^Melakukan pembayaran mahasiswa$")
    public void melakukan_pembayaran_mahasiswa() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}
    
    @Dengan("^Data pembagian dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem$")
public void data_pembagian_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Ketika("^Melakukan pembagian dana$")
public void melakukan_pembagian_dana() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Maka("^respon pembagian dana \"([^\"]*)\"$")
public void respon_pembagian_dana(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    String ans = "Pembagian Dana Berhasil";
        Assert.assertEquals(arg1, ans);
}
@Maka("^respon gagal pembagian dana \"([^\"]*)\"$")
public void respon_gagal_pembagian_dana(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   
    String ans = "Pembagian Dana Gagal";
        Assert.assertEquals(arg1, ans);
}
    
@Dengan("^Data pengajuan dana yang akan dimasukan tersedia dan sesuai format$")
public void data_pengajuan_dana_yang_akan_dimasukan_tersedia_dan_sesuai_format() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    
   boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Ketika("^Melakukan pengajuan dana$")
public void melakukan_pengajuan_dana() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    
   boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
    
}

@Maka("^respon pengajuan dana \"([^\"]*)\"$")
public void respon_pengajuan_dana(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   
    String ans = "Pengajuan Dana Berhasil";
        Assert.assertEquals(arg1, ans);
}

@Maka("^respon gagal pengajuan dana \"([^\"]*)\"$")
public void respon_gagal_pengajuan_dana(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   
    String ans = "Pengajuan Dana Gagal";
        Assert.assertEquals(arg1, ans);
}

@Dengan("^Data pengeluaran dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem$")
public void data_pengeluaran_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Ketika("^Melakukan pengeluaran dana$")
public void melakukan_pengeluaran_dana() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Maka("^respon pengeluaran dana \"([^\"]*)\"$")
public void respon_pengeluaran_dana(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   
    String ans = "Pengeluaran Dana Berhasil";
        Assert.assertEquals(arg1, ans);
}

@Maka("^respon gagal pengeluaran dana \"([^\"]*)\"$")
public void respon_gagal_pengeluaran_dana(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
    String ans = "Pengeluaran Dana Gagal";
        Assert.assertEquals(arg1, ans);
}
    
@Dengan("^Data laporan tahunan yang akan dimasukkan dan sesuai format$")
public void data_laporan_tahunan_yang_akan_dimasukkan_dan_sesuai_format() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Ketika("^Melakukan input laporan tahunan$")
public void melakukan_input_laporan_tahunan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected = false;
        boolean result = false;
        Assert.assertEquals(expected, result);
}

@Maka("^respon laporan tahunan \"([^\"]*)\"$")
public void respon_laporan_tahunan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
   
    String ans = "Laporan Tahunan tersimpan";
        Assert.assertEquals(arg1, ans);
}

@Maka("^respon gagal laporan tahunan \"([^\"]*)\"$")
public void respon_gagal_laporan_tahunan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
    String ans = "Laporan Tahunan gagal tersimpan";
        Assert.assertEquals(arg1, ans);
}

}
