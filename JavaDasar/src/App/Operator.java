package App;

public class Operator {
    public static void main(String[] args) {

        //Operasi Matematika
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        //Operasi Perbandingan

        int y = 100;
        int z = 100;

        System.out.println(y > z);
        System.out.println(y < z);
        System.out.println(y >=z);
        System.out.println(y <=z);
        System.out.println(y ==z);
        System.out.println(y !=z);

        //operasi boolean
        var absen = 75;
        var nilaiAkhir = 80;
        var nilaiEkstra = 60;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        boolean lulusEkstra = nilaiEkstra >= 75;

        var lulus = lulusAbsen && lulusNilai || lulusEkstra;
        System.out.println(lulus);
    }
}
