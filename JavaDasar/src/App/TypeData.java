package App;

public class TypeData {
    public static void main(String[] args) {

        //tipe data number
        byte iniByte = 100;
        short iniShort = 10;
        int iniInt = 62;
        float iniFloat = 4.2f;
        double iniDouble = 6.3;
        long iniLong = 100_000_000;
        int deximalInt = 65;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b111010101;

        System.out.println(iniByte);
        System.out.println(binaryDecimal);

        //konversi
        byte konversiByte = (byte) iniInt;
        System.out.println(konversiByte);

        //tipe data char
        char n = 'N';
        char a = 'A';
        char d = 'D';
        char i = 'I';


        System.out.print(n);
        System.out.print(a);
        System.out.print(d);
        System.out.print(i);
        System.out.println(a);

        //tipe data boolean

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        //tipe data String
        String firstName = "Nadia";
        String lastName = "Fairus";

        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(fullName);

        //variable
        String name ;
        name = "Nadia";
        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Fairisqy";
        System.out.println(name);

        var firstNameVar = "Nadia";
        var middleNameVar = "Fairus";
        var lastNameVar = "Sukma";

        System.out.println( firstNameVar + " " + middleNameVar + " " + lastNameVar);

        final String application = "Belajar Java";
        System.out.println(application);
    }
}
