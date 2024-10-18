public class WhileLoopChallenge {
    public static boolean isEvenNumber(int num){
        return (num%2==0);
    }

    public static void main(String[] args) {
        int j = 5,oddCount = 0, evenCount = 0;
        while (j<=20){
            if (isEvenNumber(j)){
                System.out.println("The Number " + j + " is Even");
                evenCount++;
            }else{
                oddCount++;
            }

            if (evenCount==5)
                break;
            j++;
        }
        System.out.println("The Number of Even Numbers found are: " + evenCount);
        System.out.println("The Number of Odd Numbers found are: " + oddCount);
    }
}
