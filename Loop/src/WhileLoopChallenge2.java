public class WhileLoopChallenge2 {
    public static int sumDigit(int num){
        if (num<0)
            return -1;
        int sum = 0;
        while (num>0){
            sum += num %10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(1234));
    }
}
