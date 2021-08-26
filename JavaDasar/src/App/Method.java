package App;

public class Method {
    public static void main(String[] args) {
        //memanggil methode biasa/ hanya methode
        sayHello();
        //memanggil methode dengan paramameter
        sayGoodbye("nadia", "fairus");
        //memanggil methode return value
        System.out.println(sum(200, 200));
        //memanggil return value argument
        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "x", 100));
        System.out.println(hitung(200, "/", 100));
        System.out.println(hitung(200, "salah", 100));
        //memanggil methode overloading
        bilangHalo();
        bilangHalo("nadia");
        bilangHalo("andrian", "reihannudin");
        //memanggil recrusvie methode
        System.out.println(factorialLoop(4));
        System.out.println(factorialRecursive(10));
        loop(10);

    }

    //method biasa
    static void sayHello(){
        System.out.println("hello ");
    }

    //method parameter
    static void sayGoodbye(String firstName, String lastName){
        System.out.println("goodbye " + firstName + " " + lastName);
    }

    //methode return value
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    //methode return value argument
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-" :
                return value1 - value2;
            case "x" :
                return  value1 * value2;
            case "/" :
                return value1 / value2;
            default:
                return 0;
        }
    }

    //methode overloading
    static void bilangHalo(){
        System.out.println("Halo");
    }

    static void bilangHalo(String nama){
        System.out.println("Halo " + nama);
    }

    static void bilangHalo(String firstName, String lastName){
        System.out.println("Halo " + firstName + " " + lastName);
    }

    //recrusive methode
    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
