# (REVISI)UAS_Algo 2_Fatwa Fatahillah Fatah_1214038_1B

Nama : Fatwa Fatahillah Fatah

NPM : 1214038

Prodi : D4TI 

Kelas : 1B

Penjelasan:

Buat program yang terkoneksi mysql
1. Pertama unduh library mysql.
2. Lalu buat program dan database beserta tabelnya. Tabel diberi nama “arah” dan isikan dengan dua kolom yaitu id dan kunci.
3. Setelah itu pada project greenfoot, klik Tools pada tab bar,  lalu pilih preference. Setelah itu pada User Libraries from config, klik add File dan pilih file jar yang telah di unduh pertama.
4. Lalu buat class baru dengan klik edit->new class, lalu beri nama Koneksi.
5. Import library sql dengan import java.sql.*;
6. Lalu buat variable a dengan tipe data String.
7. Pada Constructor buat code untuk get data ke database.

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/dbgreenfootuas";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            String query = "SELECT * FROM `arah` WHERE `id` = 1";
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet kunci = stmt.executeQuery(query);
                while(kunci.next()){                   
                    x = kunci.getString("kunci");
                }  
                
            } catch (SQLException e) {
                x = "gagal";
                System.out.println(e);
            }
            

        } catch (ClassNotFoundException e) {
            x = "gagal";
            System.out.println(e);
        }//end try catch



8. Buat method yang akan me-return nilai dari database.
   
        public static String sampleMethod()
        {
            return x;
        }

9. Lalu pada class MyWorld membuat objek baru dari class Bee.

10. Lalu tambah kan actor baru, dengan dengan nama Bee.

11. Lalu pada class Bee, pada method act, ambil data dari Koneksi, set show text dan cek nilainya untuk menentukan arah jalan.

        public class Bee extends Actor
        {
            public void act()
            {
                // Add your action code here.

                Koneksi koneksi = new Koneksi();
                String s = koneksi.sampleMethod();
                getWorld().showText("Nilai Dari Database = " + s, 100, 100);
                checkKeyPress(s);
                s = String.valueOf(s);
            }
            private void checkKeyPress(String s){
                if (s.equals("w")){
                     setLocation(getX(), getY()-2);
                }
                if (s.equals("s")){
                     setLocation(getX(), getY()+2);
                }
                if (s.equals("a")){
                     setLocation(getX()-2, getY());
                }
                if (s.equals("d")){
                     setLocation(getX()+2, getY());
                }
            }
        }

Maaf telat mengumpulkan pak🙏
