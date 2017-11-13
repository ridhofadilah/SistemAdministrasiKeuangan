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
  "duration": 74928433,
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
  "duration": 1697913,
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
  "duration": 51418,
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
  "duration": 22245,
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
  "duration": 54701,
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
  "duration": 71841,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/InputDataPengajuanDana.feature");
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
  "name": "Melakukan Input Pengajuan Dana",
  "description": "",
  "id": "mengelola-pengajuan-dana-fakultas;melakukan-input-pengajuan-dana",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Berhasil"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data pengajuan dana yang akan dimasukan sesuai format",
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
  "location": "InputPengajuanDanaContext.data_pengajuan_dana_yang_akan_dimasukan_sesuai_format()"
});
formatter.result({
  "duration": 55795,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 22245,
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
  "duration": 40478,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Melakukan Input Pengajuan Dana",
  "description": "",
  "id": "mengelola-pengajuan-dana-fakultas;melakukan-input-pengajuan-dana",
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
  "name": "Data pengajuan dana yang akan dimasukan sesuai format",
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
  "location": "InputPengajuanDanaContext.data_pengajuan_dana_yang_akan_dimasukan_sesuai_format()"
});
formatter.result({
  "duration": 24798,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 28810,
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
  "duration": 62359,
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
  "duration": 32092,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengeluaran_dana()"
});
formatter.result({
  "duration": 23339,
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
  "duration": 50689,
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
  "duration": 35009,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengeluaran_dana()"
});
formatter.result({
  "duration": 35738,
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
  "duration": 67464,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/LaporanTahunan.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Laporan Tahunan",
  "description": "     Mengelola Data Laporan Tahunan",
  "id": "mengelola-laporan-tahunan",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Melakukan Input Laporan Tahunan",
  "description": "",
  "id": "mengelola-laporan-tahunan;melakukan-input-laporan-tahunan",
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
  "name": "Data laporan tahunan yang akan dimasukkan dan sesuai format",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Melakukan laporan tahunan",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon laporan tahunan \"Laporan Tahunan tersimpan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_laporan_tahunan_yang_akan_dimasukkan_dan_sesuai_format()"
});
formatter.result({
  "duration": 44855,
  "status": "passed"
});
formatter.match({
  "location": "InputPengajuanDanaContext.melakukan_laporan_tahunan()"
});
formatter.result({
  "duration": 34644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laporan Tahunan tersimpan",
      "offset": 24
    }
  ],
  "location": "DemoContext.respon_laporan_tahunan(String)"
});
formatter.result({
  "duration": 76217,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Melakukan Input Laporan Tahunan",
  "description": "",
  "id": "mengelola-laporan-tahunan;melakukan-input-laporan-tahunan",
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
  "name": "Data laporan tahunan yang akan dimasukkan dan sesuai format",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Melakukan laporan tahunan",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal laporan tahunan \"Laporan Tahunan gagal tersimpan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.data_laporan_tahunan_yang_akan_dimasukkan_dan_sesuai_format()"
});
formatter.result({
  "duration": 46313,
  "status": "passed"
});
formatter.match({
  "location": "InputPengajuanDanaContext.melakukan_laporan_tahunan()"
});
formatter.result({
  "duration": 45220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laporan Tahunan gagal tersimpan",
      "offset": 30
    }
  ],
  "location": "DemoContext.respon_gagal_laporan_tahunan(String)"
});
formatter.result({
  "duration": 78040,
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
  "duration": 86427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "irwan",
      "offset": 47
    }
  ],
  "location": "LoginContext.Login_ke_dalam_sistem_keuangan_dengan_account(String)"
});
formatter.result({
  "duration": 98097,
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
  "duration": 95909,
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
  "duration": 58347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "afandi",
      "offset": 47
    }
  ],
  "location": "LoginContext.Login_ke_dalam_sistem_keuangan_dengan_account(String)"
});
formatter.result({
  "duration": 82416,
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
  "duration": 80228,
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
  "duration": 55430,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembagian_dana()"
});
formatter.result({
  "duration": 25891,
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
  "duration": 76581,
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
  "duration": 54336,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembagian_dana()"
});
formatter.result({
  "duration": 30633,
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
  "duration": 83510,
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
  "duration": 279703,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembayaran_mahasiswa()"
});
formatter.result({
  "duration": 34644,
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
  "duration": 99921,
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
  "duration": 44490,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembayaran_mahasiswa()"
});
formatter.result({
  "duration": 21880,
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
  "duration": 88980,
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
  "location": "InputPengajuanDanaContext.data_pengajuan_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 327111,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 56159,
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
  "duration": 158632,
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
  "location": "InputPengajuanDanaContext.data_pengajuan_dana_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem()"
});
formatter.result({
  "duration": 52513,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 41572,
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
  "duration": 77310,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/ViewPengeluaranDana.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "View Pengeluaran Dana",
  "description": "     Admin Fakultas melihat detail pengeluaran dana yang pernah ia inputkan",
  "id": "view-pengeluaran-dana",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Pembagian dana fakultas",
  "description": "",
  "id": "view-pengeluaran-dana;pembagian-dana-fakultas",
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
  "name": "Admin fakultas masuk ke halaman homepage admin fakultas pengeluarn dana",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Mengklik tombol pengeluaran \"view pengeluaran dana\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon sistem pengeluaran \"Tampil Data Pengeluaran Dana\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "ViewPengeluaranDanaContext.Admin_fakultas_masuk_ke_halaman_homepage_admin_fakultas_pengeluarn_dana()"
});
formatter.result({
  "duration": 95544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "view pengeluaran dana",
      "offset": 29
    }
  ],
  "location": "ViewPengeluaranDanaContext.Mengklik_tombol_pengeluaran(String)"
});
formatter.result({
  "duration": 118153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tampil Data Pengeluaran Dana",
      "offset": 27
    }
  ],
  "location": "ViewPengeluaranDanaContext.respon_sistem_pengeluaran(String)"
});
formatter.result({
  "duration": 81687,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumbertesting/viewPembagianDana.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "View Pembagian Dana",
  "description": "     Admin Fakultas melihat pembagian dana yang dilakukan oleh pihak wakil rektor",
  "id": "view-pembagian-dana",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Pembagian dana fakultas",
  "description": "",
  "id": "view-pembagian-dana;pembagian-dana-fakultas",
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
  "name": "Admin fakultas masuk ke halaman homepage admin fakultas",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Mengklik tombol \"view pembagian dana\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon sistem \"Tampil Data Pembagian Dana\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "VeiwPembagianDanaContext.Admin_fakultas_masuk_ke_halaman_homepage_admin_fakultas()"
});
formatter.result({
  "duration": 96273,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "view pembagian dana",
      "offset": 17
    }
  ],
  "location": "VeiwPembagianDanaContext.Mengklik_tombol(String)"
});
formatter.result({
  "duration": 97368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tampil Data Pembagian Dana",
      "offset": 15
    }
  ],
  "location": "VeiwPembagianDanaContext.respon_sistem(String)"
});
formatter.result({
  "duration": 86427,
  "status": "passed"
});
});