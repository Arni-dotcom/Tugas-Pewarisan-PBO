# Exploration Program: Shape Inheritance (Bentuk, BujurSangkar, Lingkaran, Silinder)

Program Java ini dibuat untuk memenuhi tugas eksplorasi Pemrograman Berorientasi Objek (OOP) mengenai konsep Inheritance (Pewarisan), Polymorphism, serta penggunaan 'ArrayList'.

## Stuktur Kelas & Hierarki
Program ini menerapkan hirarki pewarisan sebagai berikut:
- "Bentuk.java" (Superclass): Kelas induk utama yang menyimpan atribut 'warna'.
- "BujurSangkar.java" (Subclass dari 'Bentuk'): Mengukur luas bujur sangkar berdasarkan variabel 'sisi'.
- "Lingkaran.java" (Subclass dari 'Bentuk'): Mengukur luas lingkaran berdasarkan variabel 'radius' dan konstanta 'PHI'.
- "Silinder.java" (Subclass dari 'Lingkaran'): Mengukur volume silinder memanfaatkan variabel 'tinggi' dan method 'hitungLuas()' dari kelas 'Lingkaran'.
- "Main.java": Menjalankan program utama dengan memasukkan seluruh objek ke dalam 'ArrayList<Bentuk>' lalu menampilkan informasi masing-masing bentuk.

## Modul / Library Utama
- "java.util.ArrayList": Digunakan untuk menyimpan dan mengelola objek-objek bentuk secara dinamis dalam satu koleksi data.

## Hasil Eksekusi Program
![Hasil Running](Screenshot%20(166).png)

