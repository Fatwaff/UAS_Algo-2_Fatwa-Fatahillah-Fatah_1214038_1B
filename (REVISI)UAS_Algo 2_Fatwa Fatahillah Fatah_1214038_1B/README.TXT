Dani Ferdinan
1214050
D4TI 1B
Penjelasan UAS

Membuat program yang terkoneksi mysql
1.	Pertama unduh library mysql terlebih dahulu.
2.	Lalu buat program terlebih dahulu dan buat data base beserta tabelnya. Tabel nya beri nama “arah” dan isikan dengan dua attribute yaitu id dan kunci.
3.	Setelah itu pada project greenfoot, klik Tools pada tab bar,  lalu pilih preference. Setelah itu pada User Libraries from config, klik add File dan pilih file jar yang telah di unduh pertama.
4.	Lalu buat class baru dengan klik edit->new class, lalu beri nama Konek.
5.	Import library sql dengan import java.sql.*;
6.	Lalu buat variable a dengan tipe data String.
7.	Pada Constructor buat code untuk get data ke database.
String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/uas_algo2";
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
                    a = kunci.getString("kunci");
                }  
                
            } catch (SQLException e) {
                a="gagal";
                System.out.println(e);
            }
            

        } catch (ClassNotFoundException e) {
            a="gagal";
            System.out.println(e);
        }//end try catch



8.	Buat method yang akan me return nilai dari db.
    public static String sampleMethod()
    {
        return a;
    }

9.	Lalu pada class MyWord membuat objek baru dari class Bee.

10.	Lalu tambah kan actor baru, dengan dengan nama Bee.

11.	Lalu pada class Bee, pada method act, ambil data dari Konek, set show text dan cek nilainya untuk menentukan arah jalan.

public class Bee extends Actor
{
    public void act()
    {
        // Add your action code here.
        
        Konek konek = new Konek();
        String s = konek.sampleMethod();
        getWorld().showText("Nilai Dari Database = " + s, 120, 30);
        checkKeyPress(s);
        s = String.valueOf(s);
    }
    private void checkKeyPress(String s){
        if (s.equals("w")){
             setLocation(getX(), getY()+4);
        }
        if (s.equals("a")){
             setLocation(getX(), getY()-4);
        }
        if (s.equals("s")){
             setLocation(getX()-4, getY());
        }
        if (s.equals("d")){
             setLocation(getX()+4, getY());
        }
    }
}

