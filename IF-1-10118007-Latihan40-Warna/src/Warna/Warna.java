package Warna;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Melihat Kepribadian Seseorang berdasarkan warna
 * @author Rama
 */
public class Warna {

	public static String RESET = "\u001b[0m";
	public static String Black = "\u001b[30m";
	public static String RED = "\u001b[31m";
	public static String Green = "\u001b[32m";
	public static String YELLOW = "\u001b[33m";
	public static String BLUE = "\u001b[34m";
	public static String PURPLE = "\u001b[35m";
	public static String CYAN = "\u001b[36m";
	public static String WHITE = "\u001b[37m";
	public static String BGRED = "\u001b[41m";
	public static String BGGREEN = "\u001b[42m";
	public static String BGYELLOW = "\u001b[43m";
	public static String BGBLUE = "\u001b[44m";
	public static String BGMAGENTA = "\u001b[45m";

	
	public void warnaPribadi(String warnaDiri) {
		String warna = warnaDiri.toUpperCase();
        
        System.out.print(RESET+"Warna Favoritmu adalah");
        switch(warna){
            case "MERAH":
                System.out.print(RED+" MERAH \n"+RESET);
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil risiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat menahan marah namun jika sudah tahap puncak"
                        + " "
                        + "toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta."
                );
                break;
            case "HIJAU":
                System.out.print(Green+" HIJAU \n"+RESET);
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaan,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri,\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan "
                        + "kepercayaan."
                );
                break;
            case "KUNING":
                System.out.print(YELLOW+" KUNING \n"+RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul,\n"
                        + "3. Periang,\n"
                        + "4. Senang menolong,\n"
                        + "5. Lincah dan aktif,\n"
                        + "6. Tidak suka meremehkan kekurangan orang lain,\n"
                        + "7. Loyal,\n"
                        + "8. Hangat,\n"
                        + "9. Meskipun karakternya optimis dan idealis,"
                        + "seringkali goyah dan tidak stabil,\n"
                        + "10. Cenderung penakut."
                );
                break;
            case "BIRU":
                System.out.print(BLUE+" BIRU \n"+RESET);
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana,\n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah,\n"
                        + "4. Dinamis,\n"
                        + "5. Senang berbagi,\n"
                        + "6. Bersahabat,\n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang"
                        + ",\n"
                        + "8. Menyembunyikan perasaan karena karakternya yang"
                        + " cenderung"
                        + "mencari jalan damai."
                );
                break;
            case "UNGU":
                System.out.print(PURPLE+" UNGU \n"+RESET);
                System.out.println("1. Optimis,\n"
                        + "2. TIdak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah yang "
                        + "memiliki mental yang kuat,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab seringkali menutupi"
                        + " "
                        + "perasaannya,\n"
                        + "7. Terkadang bersikap keras kepala dan angkuh."
                );
                break;
            default:
                System.out.println(" Oops.. Belum Terdefinisikan");
                break;
        }
	}

}