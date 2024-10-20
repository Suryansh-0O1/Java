public class OverloadingMethods {
    public static double convertToCentimeters(int inches){
        return inches*2.54;
    }

    public static double convertToCentimeters(int foot, int inches){
        return convertToCentimeters((foot*12 + inches));
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(71));
        System.out.println(convertToCentimeters(5,11));
    }
}
