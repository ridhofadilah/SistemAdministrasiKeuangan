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
  "duration": 91813775,
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
  "duration": 2264732,
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
  "duration": 65699,
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
  "duration": 32849,
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
  "duration": 61545,
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
  "duration": 52107,
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
  "duration": 59657,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
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
  "duration": 44177,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
});