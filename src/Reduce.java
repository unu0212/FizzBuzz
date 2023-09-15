public class Reduce {
    public static void main(String[] args) {
        int count = 1;
        for(int n = 100; n > 0;){
            boolean even = n % 2 == 0;
            if ( even){
                n = n/2;
                count += 1;
            }
            else {
                n -= 1;
                count += 1;
            }
    }
        System.out.println(count);
    }
}
