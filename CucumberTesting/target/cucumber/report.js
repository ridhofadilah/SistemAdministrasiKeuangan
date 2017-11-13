$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mycompany/cucumbertesting/DemoTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola User",
  "description": "Mengelola data user",
  "id": "mengelola-user",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Memasukan User Baru",
  "description": "",
  "id": "mengelola-user;memasukan-user-baru",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data user baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukan data user dengan nama \"badu\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon \"user sukses dimasukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_user_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 68396792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "badu",
      "offset": 33
    }
  ],
  "location": "DemoContext.memasukan_data_user_dengan_nama(String)"
});
formatter.result({
  "duration": 2454973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user sukses dimasukan",
      "offset": 8
    }
  ],
  "location": "DemoContext.respon(String)"
});
formatter.result({
  "duration": 61265,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Memasukan User Baru",
  "description": "",
  "id": "mengelola-user;memasukan-user-baru",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Duplikat"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data user baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukan data user dengan nama \"deni\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal dengan pesan \"duplicate\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_user_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 24798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "deni",
      "offset": 33
    }
  ],
  "location": "DemoContext.memasukan_data_user_dengan_nama(String)"
});
formatter.result({
  "duration": 53242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "duplicate",
      "offset": 27
    }
  ],
  "location": "DemoContext.respon_gagal_dengan_pesan(String)"
});
formatter.result({
  "duration": 36467,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/InputDataPengeluaran.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Pengeluaran Dana Fakultas",
  "description": "     Mengelola Data Pengeluaran Dana Fakultas",
  "id": "mengelola-pengeluaran-dana-fakultas",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Melakukan Input Pengeluaran Dana",
  "description": "",
  "id": "mengelola-pengeluaran-dana-fakultas;melakukan-input-pengeluaran-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data pengeluaran dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Melakukan pengeluaran dana",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon pengeluaran dana \"Pengeluaran Dana Berhasil\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pengeluaran_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 30268,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengeluaran_dana()"
});
formatter.result({
  "duration": 14951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pengeluaran Dana Berhasil",
      "offset": 25
    }
  ],
  "location": "DemoContext.respon_pengeluaran_dana(String)"
});
formatter.result({
  "duration": 43031,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Melakukan Input Pengeluaran Dana",
  "description": "",
  "id": "mengelola-pengeluaran-dana-fakultas;melakukan-input-pengeluaran-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data pengeluaran dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Melakukan pengeluaran dana",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal pengeluaran dana \"Pengeluaran Dana Gagal\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pengeluaran_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 27715,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengeluaran_dana()"
});
formatter.result({
  "duration": 17504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pengeluaran Dana Gagal",
      "offset": 31
    }
  ],
  "location": "DemoContext.respon_gagal_pengeluaran_dana(String)"
});
formatter.result({
  "duration": 73299,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Login User pada Sistem",
  "description": "     Mengelola Login User pada Sistem",
  "id": "login-user-pada-sistem",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Login User",
  "description": "",
  "id": "login-user-pada-sistem;login-user",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data account yang dimiliki ketika divalidasi ada di database system",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Login ke dalam sistem keuangan dengan account \"irwan\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon login \"Login Berhasil\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "LoginContext.Data_account_yang_dimiliki_ketika_divalidasi_ada_di_database_system()"
});
formatter.result({
  "duration": 47772,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "irwan",
      "offset": 47
    }
  ],
  "location": "LoginContext.mLogin_ke_dalam_sistem_keuangan_dengan_account(String)"
});
formatter.result({
  "duration": 49230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Berhasil",
      "offset": 14
    }
  ],
  "location": "LoginContext.respon(String)"
});
formatter.result({
  "duration": 74028,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login User",
  "description": "",
  "id": "login-user-pada-sistem;login-user",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data account yang dimiliki ketika divalidasi ada di database system",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Login ke dalam sistem keuangan dengan account \"afandi\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon login gagal \"Login Gagal cek account anda\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "LoginContext.Data_account_yang_dimiliki_ketika_divalidasi_ada_di_database_system()"
});
formatter.result({
  "duration": 59441,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "afandi",
      "offset": 47
    }
  ],
  "location": "LoginContext.mLogin_ke_dalam_sistem_keuangan_dengan_account(String)"
});
formatter.result({
  "duration": 70382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Gagal cek account anda",
      "offset": 20
    }
  ],
  "location": "LoginContext.respon_gagal_dengan_pesan(String)"
});
formatter.result({
  "duration": 72570,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/PembagianDana.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Pembagian Dana Fakultas",
  "description": "     Mengelola Data Pembagian Dana Fakultas",
  "id": "mengelola-pembagian-dana-fakultas",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Melakukan Pembagian Dana",
  "description": "",
  "id": "mengelola-pembagian-dana-fakultas;melakukan-pembagian-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data pembagian dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Melakukan pembagian dana",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon pembagian dana \"Pembagian Dana Berhasil\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pembagian_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 48866,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembagian_dana()"
});
formatter.result({
  "duration": 27715,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pembagian Dana Berhasil",
      "offset": 23
    }
  ],
  "location": "DemoContext.respon_pembagian_dana(String)"
});
formatter.result({
  "duration": 80228,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Melakukan Pembagian Dana",
  "description": "",
  "id": "mengelola-pembagian-dana-fakultas;melakukan-pembagian-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data pembagian dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Melakukan pembagian dana",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal pembagian dana \"Pembagian Dana Gagal\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pembagian_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 40114,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembagian_dana()"
});
formatter.result({
  "duration": 23339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pembagian Dana Gagal",
      "offset": 29
    }
  ],
  "location": "DemoContext.respon_gagal_pembagian_dana(String)"
});
formatter.result({
  "duration": 83145,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/PembayaranMahasiswa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Pembayaran Mahasiswa",
  "description": "Mengelola Data Pembayaran Mahasiswa",
  "id": "mengelola-pembayaran-mahasiswa",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Melakukan Pembayaran Mahasiswa",
  "description": "",
  "id": "mengelola-pembayaran-mahasiswa;melakukan-pembayaran-mahasiswa",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data pembayaran baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Melakukan pembayaran mahasiswa",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "responnya \"Mahasiswa sukses melakukan pembayaran\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pembayaran_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 47772,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembayaran_mahasiswa()"
});
formatter.result({
  "duration": 32456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mahasiswa sukses melakukan pembayaran",
      "offset": 11
    }
  ],
  "location": "DemoContext.responnya(String)"
});
formatter.result({
  "duration": 90439,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Melakukan Pembayaran Mahasiswa",
  "description": "",
  "id": "mengelola-pembayaran-mahasiswa;melakukan-pembayaran-mahasiswa",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data pembayaran baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Melakukan pembayaran mahasiswa",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "responnya gagal dengan pesan \"Mahasiswa gagal melakukan pembayaran\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pembayaran_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 40479,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembayaran_mahasiswa()"
});
formatter.result({
  "duration": 37197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mahasiswa gagal melakukan pembayaran",
      "offset": 30
    }
  ],
  "location": "DemoContext.responnya_gagal_dengan_pesan(String)"
});
formatter.result({
  "duration": 64182,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/PengajuanDana.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Pengajuan Dana Fakultas",
  "description": "     Mengelola Data Pengajuan Dana Fakultas",
  "id": "mengelola-pengajuan-dana-fakultas",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Melakukan Pengajuan Dana",
  "description": "",
  "id": "mengelola-pengajuan-dana-fakultas;melakukan-pengajuan-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data pengajuan dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Melakukan pengajuan dana",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon pengajuan dana \"Pengajuan Dana Berhasil\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pengajuan_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 44125,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 23339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pengajuan Dana Berhasil",
      "offset": 23
    }
  ],
  "location": "DemoContext.respon_pengajuan_dana(String)"
});
formatter.result({
  "duration": 66006,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Melakukan Pengajuan Dana",
  "description": "",
  "id": "mengelola-pengajuan-dana-fakultas;melakukan-pengajuan-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data pengajuan dana yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Melakukan pengajuan dana",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal pengajuan dana \"Pengajuan Dana Gagal\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_pengajuan_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 43761,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 62359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pengajuan Dana Gagal",
      "offset": 29
    }
  ],
  "location": "DemoContext.respon_gagal_pengajuan_dana(String)"
});
formatter.result({
  "duration": 84240,
  "status": "passed"
});
});