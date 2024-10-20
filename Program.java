public class programTn7
{
    public static void main (String [] args){
        // 1 schruteBuck = 20 klevins
        final double schruteBuck = 20;
        // 1 klevin 12 stanley nickels
        final double klevin = 12;
        // String noOfSchruteBucks = "7.17.9";
        double noOfSchruteBucks = 7;
        double noOfKlevins = 7;
        double stanleyNickels = 9;
        double toklevin = stanleyNickels / klevin;
        System.out.println("toKlevin is " + toklevin);
        double convertValueSchruteBucks = (17+toklevin)/schruteBuck;
        System.out.println("The value is " + convertValueSchruteBucks);
        double convertedValue= 7 + convertValueSchruteBucks;
        double finalSchruteBucks =Math.round(convertedValue * 100.0) / 100.0;
        System.out.println("Final SchruteBucks Value is " + finalSchruteBucks);
        
    }
}
