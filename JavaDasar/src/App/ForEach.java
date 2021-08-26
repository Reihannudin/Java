package App;

public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        //tanpa for each
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        // for each
        for(String name: names){
            System.out.println(name);
        }
    }
}