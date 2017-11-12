# language: id

Fitur: Mengelola Pembayaran Mahasiswa
	Mengelola Data Pembayaran Mahasiswa

	@Normal
	Skenario: Melakukan Pembayaran Mahasiswa
		Dengan Data pembayaran baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem
		Ketika Melakukan pembayaran mahasiswa
		Maka responnya "Mahasiswa sukses melakukan pembayaran"

        @Gagal
        Skenario: Melakukan Pembayaran Mahasiswa
		Dengan Data pembayaran baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem
		Ketika Melakukan pembayaran mahasiswa
		Maka responnya gagal dengan pesan "Mahasiswa gagal melakukan pembayaran"
