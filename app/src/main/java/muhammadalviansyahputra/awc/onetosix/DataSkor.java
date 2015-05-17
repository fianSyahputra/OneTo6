package muhammadalviansyahputra.awc.onetosix;

/**
 * Created by fian on 5/12/2015.
 */
public class DataSkor {

    private static int Skor=0;
    private static String winner="";
    private static int Angka=0;

    public static int getAngka() {
        return Angka;
    }

    public static void setAngka(int angka) {
        Angka = angka;
    }

    public static String getWinner() {
        return winner;
    }

    public static void setWinner(String winner) {
        DataSkor.winner = winner;
    }

    public static int getSkor() {
        return Skor;
    }

    public static void setSkor(int skor) {
        Skor = skor;
    }

    public static void tambahSkor(int tambah){
        Skor+=tambah;
    }
    public static void resetSkor(){
        Skor = 0; winner="";
    }
}
