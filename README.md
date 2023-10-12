# pbo-post-test-2
Program dimulai dengan mendefinisikan paket dan mengimpor beberapa kelas dan paket lain yang akan digunakan.

Kelas Main adalah kelas utama dari program. Di dalamnya terdapat metode main yang merupakan titik masuk eksekusi program.

Pada awalnya, program membuat sebuah objek Scanner untuk membaca input dari pengguna dan sebuah ArrayList bernama peopleList yang akan digunakan untuk menyimpan entitas-entitas seperti karyawan, manajer, kasir, pelanggan, dan produk.

Program masuk ke dalam loop while (true) yang berarti program akan berjalan terus menerus sampai diberi perintah untuk keluar.

Di dalam loop, program mencetak menu pilihan ke layar dan meminta pengguna untuk memilih salah satu opsi dengan membaca input menggunakan scanner.nextInt().

Program menggunakan struktur switch-case untuk menangani pilihan pengguna. Setiap case mewakili satu pilihan dari menu dan akan menjalankan operasi terkait.

Contohnya, jika pengguna memilih 1, program akan meminta nama dan gaji karyawan baru, dan kemudian membuat objek Employee dan menambahkannya ke peopleList.

Jika pengguna memilih 6, program akan mencetak informasi dari semua entitas yang ada di peopleList.

Jika pengguna memilih 0, program akan menutup scanner dan keluar dari program.

Terdapat juga operasi untuk mengupdate informasi dan menghapus entitas dari peopleList. Ini dilakukan dengan mencari entitas berdasarkan nama dan kemudian melakukan operasi yang sesuai.

Contohnya, jika pengguna memilih 7 (update informasi), program akan meminta nama entitas yang ingin diupdate, kemudian mengecek tipe entitas (Employee, Customer, atau Product) dan melakukan operasi update sesuai.

Jika pengguna memilih 8 (hapus informasi), program akan meminta nama entitas yang ingin dihapus, dan kemudian mencari dan menghapus entitas tersebut dari peopleList.

Jika pengguna memilih opsi yang tidak valid, program memberi pesan kesalahan.
