public class SpeedConverter {

    public static void main(String[] args){
        double kilometersPerHour = 2.4;
        double milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(milesPerHour);
    }

    public static double toMilesPerHour(double kilometersPerHour){
        double val;
        if(kilometersPerHour < 0)
            return -1;
        else {
            val = kilometersPerHour * 1.60934;
            return Math.round(val);
        }

    }

}