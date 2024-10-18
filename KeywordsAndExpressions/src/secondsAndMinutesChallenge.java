public class secondsAndMinutesChallenge {
    public static String getDurationString(int seconds){
        if (seconds<0){
            return "Invalid Argument";
        }
        int hours = seconds/3600;
        int minutes = (seconds/60)%60;
        int second = seconds%60;
        return (String.format("%02d",hours) +"h "+ String.format("%02d",minutes) + "m "+
                String.format("%02d",second) + "s");
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes<0 || seconds < 0 || seconds > 59){
            return "Invalid Argument";
        }
        return getDurationString((minutes*60+seconds));
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(61,1));
    }
}
