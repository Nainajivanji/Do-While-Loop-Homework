package dowhileloop;

public class oddevennumberstentoprint {
    public static void main(String[] args) {
        int i = 1, n = 20;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " Even number");
            }
            i++;
            if (i%2!=0){
                System.out.println(i + " odd number");
            }
        }
        while (i <= n);

    }
}




