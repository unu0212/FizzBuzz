public class Multiples {


    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i < 1000; i++){
            boolean divby3 = i % 3 == 0;
            boolean divby5 = i % 5 == 0;

            if (divby3 || divby5){
                count += 1;
            }
            i += 1;
        }
        System.out.println(count);
        }

    }
