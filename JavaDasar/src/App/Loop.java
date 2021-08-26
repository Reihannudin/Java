package App;

public class Loop {
    public static void main(String[] args) {

        //for loop
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan for " + counter);
        }

        var counter = 1;


        //while loop
        while (counter <= 10) {
            System.out.println("Perulangan while " + counter);

            counter++;
        }

        //do while loop

        var value = 15;

        do {
            System.out.println("perulangan do while " + value);
            value++;
        } while (value <= 10);
    }
}
