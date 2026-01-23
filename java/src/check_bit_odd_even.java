public class check_bit_odd_even {
    public static void odd_even(int n) {
        int bitMAsk = 1;
        if((n& bitMAsk) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }

    }
    public static void main(String[] args) {
        odd_even(24);
    }
}
