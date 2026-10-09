<div align="center">

# 🔷 Pewarisan (Inheritance) Bentuk Geometri

**Program Java untuk memahami konsep pewarisan kelas: Bentuk → Bujursangkar, Lingkaran → Silinder.**

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Konsep-Inheritance-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Selesai-success?style=for-the-badge)

</div>

---

## 📖 Deskripsi

Proyek ini mendemonstrasikan konsep **inheritance (pewarisan)** dan **method overriding** pada Java. Terdapat satu kelas induk `Bentuk` yang memiliki atribut `warna`, lalu diturunkan menjadi beberapa kelas turunan yang masing-masing menghitung **luas** atau **volume** dengan caranya sendiri.

---

## ✨ Fitur Utama

| Fitur | Keterangan |
|-------|------------|
| 🧬 Pewarisan bertingkat | `Silinder` mewarisi `Lingkaran`, yang mewarisi `Bentuk` |
| 🎨 Atribut warna | Diwariskan dari kelas induk `Bentuk` ke semua kelas turunan |
| ♻️ Method overriding | `printInfo()` ditulis ulang di setiap kelas turunan |
| 📐 Hitung luas | Bujursangkar dan lingkaran |
| 🧮 Hitung volume | Silinder menggunakan luas alas × tinggi |

---

## 🖼️ Tampilan Program

<div align="center">

<!-- 👇 GANTI GAMBAR DI BAWAH INI 👇 -->
![Screenshot Hasil Program](Inheritance%20dan%20Polymorphism.png)
<!-- 👆 GANTI GAMBAR DI ATAS INI 👆 -->

*Gambar: Tampilan output program di terminal*


</div>

---

## 🗂️ Struktur Proyek

```
📁 Pewarisan-Bentuk
 ├── 📁 images
 │    └── 🖼️ nama-gambar.png
 ├── 📄 Bentuk.java         → Kelas induk (atribut warna)
 ├── 📄 BujurSangkar.java   → Turunan Bentuk (sisi, luas)
 ├── 📄 Lingkaran.java      → Turunan Bentuk (radius, luas)
 ├── 📄 Silinder.java       → Turunan Lingkaran (tinggi, volume)
 ├── 📄 Main.java           → Program utama
 └── 📄 README.md
```

---

## 🌳 Hierarki Kelas

```
                 Bentuk
                 (warna)
                 /     \
                /       \
       BujurSangkar    Lingkaran
          (sisi)        (radius)
                           |
                           |
                        Silinder
                        (tinggi)
```

---

## 🧩 Penjelasan Kelas

### `Bentuk` (Kelas Induk)
- Atribut: `warna`
- Method: `getWarna()`, `setWarna()`, `printInfo()`

### `BujurSangkar` *extends* `Bentuk`
- Atribut tambahan: `sisi`
- `hitungLuas()` → `sisi × sisi`
- `printInfo()` di-override untuk menampilkan warna dan luas

### `Lingkaran` *extends* `Bentuk`
- Atribut tambahan: `radius`, konstanta `PHI = 3.14159`
- `hitungLuas()` → `PHI × radius × radius`
- `printInfo()` di-override untuk menampilkan warna dan luas

### `Silinder` *extends* `Lingkaran`
- Atribut tambahan: `tinggi`
- `hitungVolume()` → `hitungLuas() × tinggi`
- `printInfo()` di-override untuk menampilkan warna dan volume

---

## 🚀 Cara Menjalankan

**1. Pastikan Java (JDK) sudah terpasang**
```bash
java -version
```

**2. Compile seluruh file**
```bash
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java Main.java
```

**3. Jalankan program**
```bash
java Main
```

---

## 🧪 Skenario Simulasi

| Objek | Kelas | Warna | Parameter | Hasil |
|-------|-------|-------|-----------|------:|
| `b` | Bentuk | hitam | – | – |
| `bs` | BujurSangkar | kuning | sisi = 4 | Luas = 16.0 |
| `l` | Lingkaran | putih | radius = 9 | Luas = 254.46879 |
| `s` | Silinder | coklat | tinggi = 12, radius = 6 | Volume ≈ 1357.17 |

### 📟 Contoh Output

```
Bentuk berwarna hitam
Bujursangkar berwarna kuning, luas = 16.0
Lingkaran putih, luas = 254.46879
Silinder warna coklat, volume = 1357.1668799999998
```

---

## 🎓 Konsep OOP yang Digunakan

- **Inheritance** → kelas turunan memakai atribut dan method dari kelas induk (`extends`)
- **Method Overriding** → `printInfo()` didefinisikan ulang di tiap kelas turunan (`@Override`)
- **Constructor Chaining** → pemanggilan `super(...)` untuk mengisi atribut kelas induk
- **Encapsulation** → atribut `private` diakses melalui getter dan setter
- **Konstanta** → `PHI` dideklarasikan sebagai `static final`

---

## 🔮 Pengembangan Selanjutnya

- [ ] Menambah bentuk lain (persegi panjang, segitiga, kubus)
- [ ] Menambah method `hitungKeliling()`
- [ ] Menggunakan polimorfisme dengan `ArrayList<Bentuk>`
- [ ] Membuat input nilai dengan `Scanner`

---

## 👤 Identitas Pembuat

| | |
|---|---|
| **Nama** | `Mardatilah` |
| **NIM** | `F1D02510014` |
| **Kelas** | `Informatika B` |

<div align="center">

⭐ *Dibuat dengan semangat belajar Java* ⭐

