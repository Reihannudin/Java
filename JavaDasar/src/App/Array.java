package App;

public class Array {
    public static void main(String[] args) {
        String[] stringArray = new String[3];

        stringArray[0] = "nadia";
        stringArray[1] = "fairus";
        stringArray[2] = "sukma";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[2] = "wijaya";
        System.out.println(stringArray[2]);


        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Nadia", "Fairus", "Sukma"
        };
        namaNama[0] = null;
        System.out.println(namaNama[0]);

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };
        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        //array dalam array
        String[][] members = {
                {"Nadia", "raihannudin"},
                {"Andrian", "Fairus"},
                {"Fairisqy"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
