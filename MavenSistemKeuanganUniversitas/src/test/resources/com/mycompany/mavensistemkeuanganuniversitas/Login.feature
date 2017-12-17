# language: id

    Fitur: Login User pada Sistem
           Mengelola Login User pada Sistem

           @Normal
           Skenario: Login User
		Dengan Data account yang dimiliki ketika divalidasi ada di database system
		Ketika Login ke dalam sistem keuangan dengan account "irwan"
		Maka respon login "Login Berhasil"

           @Gagal
           Skenario: Login User
		Dengan Data account yang dimiliki ketika divalidasi ada di database system
		Ketika Login ke dalam sistem keuangan dengan account "afandi"
		Maka respon login gagal "Login Gagal cek account anda"



