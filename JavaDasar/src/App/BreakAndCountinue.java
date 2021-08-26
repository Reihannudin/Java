package App;

public class BreakAndCountinue {
    public static void main(String[] args) {
        var counter = 1;

        while (true){
            System.out.println("Perulangan " + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }

        System.out.println("Perulangan berhenti");

        //countinue
        for(var counterNew = 1; counterNew <= 100; counterNew++){
            if(counterNew % 2 == 0){
                continue;
            }

            System.out.println("Perulangan Ganjil " + counterNew);
        }
    }
}
