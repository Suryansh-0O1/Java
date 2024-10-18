public class Switch {
    public static void main(String[] args) {

        int SwitchValue = 1;

//        switch (SwitchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was actually a 3, a 4, or a 5");
//                System.out.println("Actually it was a " + SwitchValue);
//            default:
//                System.out.println("Was not 1, 2, 3, 4, or 5");
//                break;
//        }
        switch (SwitchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was actually a 3, a 4, or a 5");
                System.out.println("Actually it was a " + SwitchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "XYZ";
        System.out.println(month +" is in the " + GetQuarter(month) + " quarter");
    }

    public static String GetQuarter(String Month){
//        switch (Month){
//            case "JANUARY":
//            case "FEBURARY":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAY":
//            case "JUNE":
//                return "2st";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3st";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                String BadResponse = Month + " is bad";
//                return BadResponse;
//        }
//
//        return "Bad";
//    }

        return switch (Month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3st";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4st";
            default -> {
                String BadResponse = Month + " is bad";
                yield BadResponse;
            }
        };

    }
}
