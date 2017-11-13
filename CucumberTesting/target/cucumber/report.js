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
  "duration": 102682828,
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
  "duration": 2302113,
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
  "duration": 60413,
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
  "duration": 41911,
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
  "duration": 60413,
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
  "duration": 47198,
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
  "duration": 49840,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengeluaran_dana()"
});
formatter.result({
  "duration": 24920,
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
  "duration": 74383,
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
  "duration": 32472,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengeluaran_dana()"
});
formatter.result({
  "duration": 43044,
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
  "duration": 55126,
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
  "duration": 37003,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembagian_dana()"
});
formatter.result({
  "duration": 27941,
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
  "duration": 79670,
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
  "duration": 35492,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembagian_dana()"
});
formatter.result({
  "duration": 30584,
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
  "duration": 80425,
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
  "duration": 46065,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembayaran_mahasiswa()"
});
formatter.result({
  "duration": 31339,
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
  "duration": 71741,
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
  "duration": 46065,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pembayaran_mahasiswa()"
});
formatter.result({
  "duration": 19634,
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
  "duration": 57392,
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
  "duration": 46065,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 27186,
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
  "duration": 78914,
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
  "duration": 41534,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.melakukan_pengajuan_dana()"
});
formatter.result({
  "duration": 32094,
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
  "duration": 107610,
  "status": "passed"
});
});