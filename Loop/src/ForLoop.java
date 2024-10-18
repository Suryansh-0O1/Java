public class ForLoop {
    public static void main(String[] args) {
//        System.out.println("0 is " + (IsPrime(0) ? "" : "NOT ") + "a Prime Number");
//        System.out.println("1 is " + (IsPrime(1) ? "" : "NOT ") + "a Prime Number");
//        System.out.println("2 is " + (IsPrime(2) ? "" : "NOT ") + "a Prime Number");
//        System.out.println("3 is " + (IsPrime(3) ? "" : "NOT ") + "a Prime Number");
//        System.out.println("4 is " + (IsPrime(4) ? "" : "NOT ") + "a Prime Number");
        int prime = 0;
        for (int i = 40 ; i <= 50 ; i++){
            if (IsPrime(i)){
                System.out.println("The number " + i + " is prime");
                prime++;
            }

            if  (prime==3)
                break;
        }
    }

    public static boolean IsPrime(int num){
        if (num <=1 ){
            return false;
        }
        for (int i = 2; i<=num/2; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
