# ECOWASTEWATER

Platfrom sanitasi ini digunakan untuk mempermudah masyarakat dalam melaporkan permasalahan air limbah langsung ke pihak terkait, dan juga dapat membantu masyarakat memahami pentingnya menjaga sanitasi melalui action, laporan dapat dibuat dengan cepat dan tepat, serta melalui community yang memperkuat kerja sama antara masyarakat dan instansi agar penanganan air limbah lebih efektif dan lingkungan tetap terjaga.

## EcowasteWater 
EcowasteWater merupakan patform yang berfungsi sebagai sistem digital untuk mempermudah pengelolaan sanitasi dan air limbah melalui pemantauan, pelaporan, dan penyimpanan data secara terpusat. Melalui platform ini, masyarakat dapat melaporkan permasalahan terkait fasilitas sanitasi atau air limbah dengan cepat, sementara pihak pengelola dapat langsung menerima laporan, memverifikasi kondisi di lapangan, dan menindaklanjutinya sesuai prioritas. Sistem ini juga menyimpan data inspeksi, kondisi instalasi, dan riwayat perawatan secara otomatis, sehingga proses evaluasi dan pengambilan keputusan menjadi lebih akurat dan efisien.


## OOP
Object Oriented Programming (OOP) merupakan fondasi dalam pengembangan aplikasi karena memungkinkan proses pemrograman dilakukan dengan cara yang lebih terstruktur, terorganisir, dan mudah dikembangkan.


### Encapsulation


Penggunakan Encapsulation pada program agar data penting seperti atribut idUser, username, password, dll tidak bisa diubah sembarangan dari luar kelas. Data hanya bisa diakses lewat method setter/getter, dengan tujuan mencegah perubahan data langsung dari luar class (melindungi integritas data).

<img width="662" height="410" alt="image" src="https://github.com/user-attachments/assets/eddd1e02-4850-42b6-b1d3-38c7b0078874" />


### Abstraction

Penggunaan abstraction yaitu untuk menyembunyikan detail teknis, hanya menampilkan fungsi yang penting agar sistem lebih mudah dipahami, dan program lain cukup memanggil DatabaseConfig.getConnection() untuk dapat koneksi.

<img width="664" height="176" alt="image" src="https://github.com/user-attachments/assets/e3984697-96c6-4269-abde-d7d3c37335a8" />


### Inheritance

penggunaan inheritance konseptual, seperti admin, Petugas, dan masyarakat mewarisi atribut dasar dari User (id_user, username, password, dll), dengan tujuan untuk menghindari duplikasi atribut dan menandakan semua role punya dasar yang sama dari User.

<img width="973" height="333" alt="image" src="https://github.com/user-attachments/assets/8bcb898f-114c-4867-a364-d946c4842201" />


### Polymorphism

Class menggunakan polymorphism untuk mewarisi (inheritance) dari class induk, Jadi ini adalah bentuk polymorphism. Satu method dengan nama sama (validateLogin) tapi hasilnya berbeda tergantung role (admin/petugas/masyarakat).
 
<img width="980" height="335" alt="image" src="https://github.com/user-attachments/assets/42b8f500-f0a2-40f7-b9c6-3610cb064b51" />


### Interface 

Kode BaseDAO<T> merupakan interface dasar yang menentukan struktur umum untuk semua kelas Data Access Object (DAO) dalam sistem. Interface ini berisi deklarasi metode penting seperti insert, update, delete, getById, dan getAll, yang digunakan untuk mengelola data di database. 

<img width="544" height="319" alt="image" src="https://github.com/user-attachments/assets/c6140a2e-7cb3-4f74-be0c-401225897f7d" />


## Packages
Packages berfungsi mengelompokkan class dan file-file program lainnya ke dalam satu wadah atau folder tertentu. Dengan adanya package, struktur program menjadi lebih teratur, mudah dikelola, serta menghindari konflik nama class yang sama.

<img width="191" height="158" alt="image" src="https://github.com/user-attachments/assets/d71d46c5-2081-4051-9f4a-5ecd97f78ce8" />


### Icon
Package icon diguanakn untuk menyimpan file-file ikon atau gambar, dengan adanya package icon, file tidak akan bercampur dengan class java, sehingga struktur project lebih rapi dan terorganisir.

<img width="231" height="378" alt="image" src="https://github.com/user-attachments/assets/11e3201e-9ca9-4529-b442-5137ee41871d" />


### Koneksi
Package koneksi berfungsi untuk tempat mengelola semua file yang berkaitan dengan koneksi ke database. Terdapat dua file yaitu DatabaseConfig.java yang berfungsi untuk menghubungkan aplikasi ke database seperti MySQL. Kemudian ada file TesKoneksi.java yang berfungsi untuk memastikan bahwa database dapat di akses sebelum aplikasi di gunakan.

<img width="240" height="275" alt="image" src="https://github.com/user-attachments/assets/b02539b8-2b06-4284-85bb-65c001c7b4f8" />


### Main
Package Main berfungsi sebagai pusat logika, yaitu tempat menyimpan semua class yang terkait dengan proses uatama atau tampilan program.

<img width="229" height="362" alt="image" src="https://github.com/user-attachments/assets/af1eddf8-e6e5-4180-a6a4-7a361b36c31c" />


### File untuk Admin yang di awali huruf "A"
* A_Edit_Status.java 
* A_Hapus_Laporan.java
* A_Lihat_Laporan.java 
* A_Register_Petugas.java
* A_Welcome.java
* A_update_data_petugas.java 

### File untuk Masyarakat yang di awali dengan huruf "M"
* M_Buat_Laporan.java
* M_Lihat_Laporan.java
* M_Welcome.java 

### File untuk Petugas yang diawali huruf "P"
* P_Edit_Status.java 
* P_Lihat_Laporan.java
* P_Tindak_Lanjut.java 
* P_Welcome.java 

### Halaman Umum
* Landing_Page.java
* Login.java
* Register_Masyarakat.java
* PA_SanitasiAirLimbah.java 


## Dependencies, Java Dependencies, dan Project Files

### Dependencies 
* AbsoluteLayout-RELEASE270.jar : Library layout bawaan NetBeans untuk mengatur posisi komponen secara bebas (AbsoluteLayout). Biasanya dipakai saat design GUI di NetBeans.
* mysql-connector-j-9.4.0.jar : Driver koneksi ke database MySQL/MariaDB. Tanpa file ini aplikasi tidak bisa melakukan connect, INSERT, SELECT, UPDATE, dll ke MySQL.
* protobuf-java-4.31.1.jar : Library Google Protocol Buffers. Biasanya dipakai oleh MySQL Connector versi baru untuk komunikasi atau serialisasi data.

### Java Dependencies
* JDK 24 (Default) : Artinya project menggunakan Java Development Kit versi 24 sebagai compiler dan runtime.

### Project Files
* Berisi struktur file utama project (source code .java, form .form, dan package lainnya).


## Flowchart & Use Case

### Flowchart

<img width="4645" height="2872" alt="Keseluruhan drawio" src="https://github.com/user-attachments/assets/64582bed-fe5e-422e-978a-70c434e2dd17" />


### Login

<img width="687" height="1197" alt="Login drawio" src="https://github.com/user-attachments/assets/2ece9671-e149-46f7-b633-dcf7bbb0a996" />


### Registrasi

<img width="252" height="1503" alt="Regis drawio" src="https://github.com/user-attachments/assets/dd30bafe-112e-4c76-b07d-43172b8a14df" />


### Petugas

<img width="888" height="1045" alt="Petugas drawio" src="https://github.com/user-attachments/assets/5eac6815-54cc-4865-8c56-3c96a1125824" />


### Masyarakat

<img width="990" height="1242" alt="Masyarakat drawio" src="https://github.com/user-attachments/assets/bff1554d-7a48-49b1-9142-fe8e77d88f2a" />


### Admin

<img width="1030" height="1838" alt="Admin drawio" src="https://github.com/user-attachments/assets/760e7434-0400-49cc-9364-262327a8dac9" />


### Use Case

<img width="787" height="670" alt="use case drawio (1)" src="https://github.com/user-attachments/assets/bf7479e7-86e0-4dcc-9c83-4f7ae922aed6" />


## Graphical User Interface (GUI)

### Halaman Landing Page

Halaman ini merupakan halaman ketika masuk ke sistem
<img width="1195" height="667" alt="image" src="https://github.com/user-attachments/assets/638f39bf-c4fc-4a6e-9ba3-6eec756c0f9c" />


### Halaman Login 

Halaman ini merupakan halaman ketika masuk ke sistem dan memilih login dengan role tertentu, dan registrasi masyarakat ketika belum memiliki akun.
<img width="1190" height="661" alt="image" src="https://github.com/user-attachments/assets/0937feb3-933e-46d1-a710-4331380795bc" />


## Admin

### Halaman Wellcome 

Halaman ini merupakaan halaman awal ketika login sebagai admin dengan fitur fitur tertentu
<img width="1194" height="669" alt="image" src="https://github.com/user-attachments/assets/169498a2-0054-4bd7-a8a1-712d8bb4f7bd" />


### Halaman Lihat Laporan

Halaman ini berisi seluruh laporan yang masuk dari masyarakat.
<img width="1192" height="669" alt="image" src="https://github.com/user-attachments/assets/652f1d7e-3b6e-4a9f-98e3-460ced59757c" />


### Halaman Hapus laporan

Halaman ini menampilkan seluruh laporan dan dapat menghapus laporan yang telah di tindaki.
<img width="1197" height="670" alt="image" src="https://github.com/user-attachments/assets/bf3f536b-03c6-4009-ae77-8d4fc5df9e4d" />


### Halaman Registrasi Petugas

Halaman ini merupakan halaman untuk registrasi akun petugas, dan hanya bisa diakses olah admin.
<img width="1194" height="634" alt="image" src="https://github.com/user-attachments/assets/bd8b0ae2-52af-49f6-ae97-851d480ef12f" />


### Halaman Ubah Status

Halaman ini menampilkan seluruh laporan dan admin dapat merubah status laporan seperti mengunngu atau selesai.
<img width="1195" height="668" alt="image" src="https://github.com/user-attachments/assets/f6ee60aa-153e-417b-9589-0418d6af5cd2" />


### Halaman lihat data petugas

Halaman ini menampilkan seluruh data petugas
<img width="1194" height="673" alt="image" src="https://github.com/user-attachments/assets/18e435b2-56d8-4bd4-b95f-067a36f5d18f" />


### Halaman Edit data Petugas

Halaman ini menampilkan inputan data petugas dengan tujuan merubah data petugas yang sudah terdaftar sebelumnya.
<img width="1193" height="665" alt="image" src="https://github.com/user-attachments/assets/491ca16b-8829-431a-b784-3a09aeed5a00" />


## Petugas

### Halaman Wellcome 

Halaman ini menampilkan halaman awal ketika login sebagai petugas.
<img width="1192" height="669" alt="image" src="https://github.com/user-attachments/assets/00074904-38c7-4d15-95be-350616578107" />


### Halaman Lihat Laporan

halaman ini menampilkan seluruh laporan yang masuk dari masyarakat.
<img width="1192" height="668" alt="image" src="https://github.com/user-attachments/assets/e00e43be-2cdd-4c92-9eef-28f0170bd87f" />


### Halaman Ubah Status

Halaman ini menampilkan seluruh laporan masyarakart dan dapat merubah status laporan seprti menunggu, di proses, atau selesai.
<img width="1193" height="668" alt="image" src="https://github.com/user-attachments/assets/8798a306-c6cd-4221-ba9d-d727f4ae49a3" />


### Halaman Tindak lanjut

Halaman ini menampilkan halaman tindak lanjut dari laporan seperti tanggal laporan, foto hasil tindakan, dan keterangan. 
<img width="1195" height="670" alt="image" src="https://github.com/user-attachments/assets/9b621cab-aaa8-415d-9e47-53af171684bb" />


## Masyarakat

### Halaman Wellcome 

Halaman ini menampilkan ketika login sebagai masyarakat
<img width="1195" height="675" alt="image" src="https://github.com/user-attachments/assets/6b9e92f7-4761-41bf-8744-cf1dbd64dff9" />


### Halaman Buat Laporan

Halaman ini menampilkan inputan untuk membuat laporan dari masyarakat
<img width="1193" height="669" alt="image" src="https://github.com/user-attachments/assets/4158cf96-cca9-4cd9-a185-5c1f353f39a0" />

### Halaman Lihat Laporan
Halaman ini menampilkan hasil laporan yang telah di buat sebelumnya
<img width="1195" height="680" alt="image" src="https://github.com/user-attachments/assets/0798d426-1bf1-4883-80c2-e6ec0e80c4f9" />



