<h1 align="center">API Manajemen Pengguna dengan Otentikasi </h1>
<p align="center"><i>Configuration app run / clean & build.</i></p>
<br>

## Website

Link : http://203.194.113.181:7000

<a href="https://awesome-github-readme-profile.netlify.app"><img src="https://raw.githubusercontent.com/elangosundar/awesome-README-templates/master/awesome-github-profile.png" alt="Awesome README Templates" /></a>

# API

Link : http://203.194.113.181:7000
- http://203.194.113.181:7000/api/list endpoint untuk registrasi pengguna (nama/email, kata sandi) /GET
- http://203.194.113.181:7000/api/login endpoint untuk menerima data login (email, kata sandi) dan memverifikasi keberadaan pengguna di database /POST
- http://203.194.113.181:7000/api/registrasi endpoint untuk mengambil daftar pengguna /POST
- http://203.194.113.181:7000/api/update/{id} endpoint untuk mengupdate data pengguna /POST
- http://203.194.113.181:7000/api/delete/{id} endpoint untuk menghapus data pengguna /DELETE

# Development

- Java 11
- Maven
- Spring boot
- postgresql 

# Configuration

- Buat rule dengan username 'ptaz' dan password 'ptaz'
- buat database dengan nama 'ptaz'

# Clean & Build

mvn install

# Run

java -jar /target/ptaz-0.0.1-SNAPSHOT.jar

## :pencil: License

This project is licensed under [MIT](https://opensource.org/licenses/MIT) license.

