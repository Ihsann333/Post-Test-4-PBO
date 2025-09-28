# Post-Test-4-PBO
## Nur Ihsan 2409116051

## package main

<img width="276" height="89" alt="image" src="https://github.com/user-attachments/assets/69ef2d18-61c9-4ab2-9fc2-0f9f3abc2151" />

Bagian ini mendefinisikan bahwa class berada pada package main. Program juga mengimpor class Scanner dari library Java untuk membaca input pengguna, serta class service dari package service yang berisi logika CRUD.

<img width="464" height="41" alt="image" src="https://github.com/user-attachments/assets/0e261066-1e56-4767-ad41-1aac7de46fff" />

Main adalah class utama yang berisi method main sebagai titik masuk program ketika dijalankan.

<img width="445" height="71" alt="image" src="https://github.com/user-attachments/assets/b9b9f5ec-7622-4133-afe4-70ae0bfc1bde" />

Di sini dibuat objek scanner untuk membaca input dari keyboard, objek serv untuk memanggil fungsi CRUD, serta variabel opsi untuk menyimpan pilihan menu pengguna.

<img width="704" height="208" alt="image" src="https://github.com/user-attachments/assets/90959785-fa91-4c5e-90f6-a0f35e30a2ab" />

Bagian ini menampilkan menu interaktif yang berisi opsi CRUD (tambah, lihat, ubah, hapus, cari) serta keluar dari program. Menu akan terus ditampilkan berulang selama pengguna belum memilih keluar.

<img width="527" height="131" alt="image" src="https://github.com/user-attachments/assets/b561d87f-f7ff-4ccc-8415-22b7ef12a02b" />

Blok ini memastikan bahwa input dari pengguna berupa angka. Jika bukan angka, program tidak error, melainkan menampilkan pesan kesalahan.

<img width="582" height="182" alt="image" src="https://github.com/user-attachments/assets/fb6a7846-1152-4702-b7eb-92d2d028f2b2" />

Bagian ini menjalankan logika berdasarkan pilihan pengguna. Misalnya jika pengguna memilih 1, maka fungsi create() dari service akan dipanggil, dan seterusnya.

<img width="263" height="79" alt="image" src="https://github.com/user-attachments/assets/00a4ffb4-0a23-45d1-9e3e-5c4a73797257" />

Menu akan terus berulang sampai pengguna memilih angka 6 (keluar), dan Scanner ditutup setelah program selesai dijalankan untuk menghindari memory leak.

## package model

<img width="287" height="248" alt="image" src="https://github.com/user-attachments/assets/b0b08528-8d4e-4533-a5e5-2006f5a44909" />

Class ini berada di dalam package model, Class model merepresentasikan satu ruang coworking.
Atributnya diberi modifier private → ini adalah bentuk encapsulation, sehingga atribut hanya bisa diakses melalui method getter dan setter, bukan langsung dari luar class.
kode → kode unik ruang (contoh: C101)
nama → nama ruang (contoh: "Ruang Rapat")
kapasitas → kapasitas orang yang bisa ditampung

<img width="589" height="113" alt="image" src="https://github.com/user-attachments/assets/7f8e9220-18bc-4acc-a7d2-b8f23883ef3b" />

Konstruktor ini digunakan untuk membuat objek baru model dengan menginisialisasi nilai kode, nama, dan kapasitas. Keyword this membedakan antara atribut class dengan parameter.

<img width="450" height="530" alt="image" src="https://github.com/user-attachments/assets/14c72b80-9ffd-4d9d-a986-5c66cc6a18b8" />

Getter dan setter ini adalah implementasi encapsulation:
get...() digunakan untuk membaca nilai atribut.
set...() digunakan untuk mengubah nilai atribut dengan cara yang lebih aman (misalnya bisa ditambahkan validasi).

<img width="282" height="64" alt="image" src="https://github.com/user-attachments/assets/e21d535b-92d3-428c-83ea-28f55ffda4ca" />

Method ini mengembalikan jenis ruang (General Space secara default).
Di sini nantinya inheritance + overriding digunakan:
Kalau ada subclass MeetingRoom, method ini bisa dioverride jadi "Meeting Room".
Kalau ada subclass PrivateOffice, method ini bisa dioverride jadi "Private Office".

<img width="1044" height="103" alt="image" src="https://github.com/user-attachments/assets/4053396d-c28f-4584-831f-bb89e879383e" />

Method ini mengoverride method bawaan toString() dari class Object.
Fungsinya untuk menampilkan data objek dalam bentuk string yang lebih informatif. Jadi kalau kamu langsung System.out.println(objekModel), otomatis akan keluar detail lengkap ruang coworking (kode, nama, kapasitas, tipe).

## package service

<img width="284" height="243" alt="image" src="https://github.com/user-attachments/assets/71233c95-74ee-4542-a4c3-e4d84da15f8e" />

Class service berada di dalam package service.
ArrayList dipakai untuk menyimpan data coworker space.
Scanner digunakan untuk input dari pengguna.
model, RuangAcara, dan RuangMeeting adalah class dari package model yang merepresentasikan ruang coworking.

<img width="687" height="71" alt="image" src="https://github.com/user-attachments/assets/ba714b03-3010-472f-b1fa-94f30564540f" />

Class service berisi logika CRUD.
coworkerList adalah list yang menampung semua data coworking space.
scanner digunakan untuk membaca input keyboard.
Modifier private memastikan encapsulation sehingga data hanya bisa diakses lewat method di class ini.

<img width="716" height="121" alt="image" src="https://github.com/user-attachments/assets/f0169d32-c9c4-402c-a371-d130569f18df" />

Konstruktor ini langsung menambahkan beberapa data contoh ketika objek service dibuat. Jadi, saat program pertama kali dijalankan, daftar coworking space tidak kosong.

<img width="822" height="571" alt="image" src="https://github.com/user-attachments/assets/4cdcee79-9407-4925-b5f6-f46619c3a033" />

Method ini untuk menambah data baru:
Pengguna mengisi kode, nama, dan kapasitas.
Pengguna memilih tipe ruang (Meeting atau Acara).
Dibuat objek baru sesuai tipe (RuangMeeting atau RuangAcara).
Objek dimasukkan ke coworkerList.
Di sini terlihat inheritance + overriding bekerja, karena RuangMeeting dan RuangAcara adalah subclass dari model.

<img width="738" height="226" alt="image" src="https://github.com/user-attachments/assets/9477eaa2-10e3-4f42-a8a0-9aebabf2b445" />

Menampilkan seluruh data coworking space. Jika list kosong maka menampilkan pesan. Kalau ada isi menampilkan dengan nomor urut.
Karena toString() sudah dioverride di model, setiap objek akan tampil dengan informasi lengkap (kode, nama, kapasitas, tipe).

<img width="622" height="272" alt="image" src="https://github.com/user-attachments/assets/030dde8e-63b3-4209-86b3-e253f3c88efb" />

Mengubah data ruang berdasarkan nomor urut.
Pertama tampilkan daftar data.
Pengguna pilih nomor lalu dicek valid/tidak.
Jika valid, data lama diganti dengan data baru lewat setter.
Lagi-lagi di sini encapsulation digunakan, karena perubahan data dilakukan lewat setter, bukan langsung mengakses atribut.\

<img width="628" height="361" alt="image" src="https://github.com/user-attachments/assets/6d5d84f8-e88c-462c-8065-9bcf462780db" />

Menghapus data dari list berdasarkan nomor yang dipilih pengguna.
Jika nomor tidak valid maka tampilkan pesan error.

<img width="888" height="415" alt="image" src="https://github.com/user-attachments/assets/0b5eb341-7a12-43a8-9fca-ef8fae5d0595" />

Mencari ruang berdasarkan kata kunci yang cocok dengan kode atau nama. Jika ketemu → tampilkan. Jika tidak ada → beri pesan “Data tidak ditemukan.”

<img width="437" height="185" alt="image" src="https://github.com/user-attachments/assets/1e6d64dd-07c4-4d47-b8d0-95c80b7d0ba2" />

Baris pertama mendefinisikan bahwa class berada dalam package model, sehingga dapat dipanggil dari package lain seperti service. RuangMeeting adalah subclass yang mewarisi (inheritance) dari superclass model. Dengan keyword extends, kelas ini otomatis mendapatkan semua atribut dan method yang dimiliki model (seperti kode, nama, kapasitas, serta getter-setter).

<img width="435" height="183" alt="image" src="https://github.com/user-attachments/assets/a99c05dc-8679-435c-b9d2-e6bafed483c7" />

Class ini berada di dalam package model, sehingga bisa digunakan di file lain seperti service. RuangAcara adalah subclass dari kelas induk model. Dengan extends, kelas ini otomatis mewarisi atribut (kode, nama, kapasitas) dan method yang ada di superclass.

<img width="603" height="76" alt="image" src="https://github.com/user-attachments/assets/662aa34e-33c6-4382-a601-08bd5dc5250c" />

Konstruktor dipanggil saat membuat objek RuangAcara. super(...) digunakan untuk mengakses konstruktor milik superclass model, agar atribut kode, nama, dan kapasitas langsung terisi.

<img width="281" height="89" alt="image" src="https://github.com/user-attachments/assets/50e7714d-a208-455a-a2af-a3d4fe8dd12d" />

Method ini meng-override method getTipe() yang ada di superclass. Setiap objek RuangAcara yang dipanggil dengan getTipe() akan selalu mengembalikan string "Ruang Acara". Dengan overriding ini, sistem bisa membedakan antara RuangAcara dan RuangMeeting meskipun keduanya sama-sama turunan dari model.

<img width="318" height="29" alt="image" src="https://github.com/user-attachments/assets/bdca6d37-2797-40c0-b296-ce22b71d6f57" />

menandakan bahwa class model adalah abstract class.
Artinya, class ini tidak bisa dibuat objeknya langsung, melainkan hanya dipakai sebagai cetakan dasar bagi class turunan.
Di dalamnya terdapat method

<img width="386" height="38" alt="image" src="https://github.com/user-attachments/assets/5b6099ae-02e2-427e-a72f-5104e66ece5b" />

yang juga bersifat abstract. Method ini hanya berisi nama dan tipe nilai kembaliannya saja tanpa isi, sehingga setiap class turunan seperti RuangMeeting dan RuangAcara wajib menuliskan isi method tersebut sendiri.
Dengan cara ini, kerangka dasar seperti atribut kode, nama, dan kapasitas sudah ditentukan di satu tempat, tetapi detail tipe ruang bisa berbeda sesuai subclass yang membuatnya.

<img width="343" height="26" alt="image" src="https://github.com/user-attachments/assets/66b0800b-3473-4018-8503-f9555e6987b5" />

berisi daftar method create, read, update, dan delete.
Interface ini bertindak sebagai kontrak: setiap class yang menuliskan

<img width="473" height="29" alt="image" src="https://github.com/user-attachments/assets/35bf9501-046f-43e4-8fd1-b4fbfc5539f4" />

(seperti pada file src/service/service.java) harus menyediakan implementasi dari semua method tersebut.
Dengan adanya kontrak ini, kita dijamin bahwa class service akan selalu memiliki fungsi CRUD lengkap, meskipun cara kerjanya bisa diatur sendiri di dalam class tersebut.

contoh overloading:

<img width="255" height="28" alt="image" src="https://github.com/user-attachments/assets/184ef12c-0eaf-41f9-b0d3-c9fe99b7d9b4" />
<img width="402" height="30" alt="image" src="https://github.com/user-attachments/assets/8d95fce2-fecd-40fc-81a9-c41f7e0e1dde" />

Kedua method memiliki nama yang sama tetapi parameter berbeda.
Versi tanpa parameter digunakan untuk meminta input kata kunci langsung dari pengguna, lalu di dalamnya memanggil versi dengan parameter untuk melakukan pencarian.
Karena Java dapat memilih method yang sesuai berdasarkan cara pemanggilannya, kita bisa memanggil search() atau search("C101") sesuai kebutuhan tanpa harus membuat nama method baru.

contoh overriding:

<img width="574" height="52" alt="image" src="https://github.com/user-attachments/assets/57a1a174-471c-44c5-a482-f3be07f69615" />
<img width="495" height="47" alt="image" src="https://github.com/user-attachments/assets/f104f4da-2537-46e1-8f68-063570854274" />

Dengan overriding ini, meskipun objek disimpan dalam variabel bertipe model, ketika getTipe() dipanggil Java tetap akan menjalankan method sesuai jenis objek sebenarnya.
