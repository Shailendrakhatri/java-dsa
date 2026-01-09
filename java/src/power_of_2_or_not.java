public class power_of_2_or_not {
    public static boolean isPowerof2(int n){
        return (n&(n-1)) ==0;
    }
    public static void main(String args[]){
        System.out.println(isPowerof2(16));
    }
}
