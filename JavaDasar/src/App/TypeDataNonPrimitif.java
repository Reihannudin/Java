package App;

public class TypeDataNonPrimitif {
    public static void main(String[] args) {
        Byte iniByte = null;
        Integer iniInteger = 10000;
        Long iniLong = 10000L;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        //conversi data primitif -> bukan primtif
        int iniInt = 100;
        Integer iniIntNO = iniInt;

        //conversi data bukan primtif -> primtif
        float floatInt = iniIntNO.floatValue();
        short shortInt = iniIntNO.shortValue();

        System.out.println(floatInt);

    }
}
