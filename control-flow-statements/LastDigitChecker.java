public class LastDigitChecker {

   public static void main(String [] args){

        System.out.println(hasSameLastDigit (41,22,71));
        System.out.println(isValid (10));

    }

    public static boolean hasSameLastDigit(int fDigit, int sDigit, int tDigit) {

        if((isValid(fDigit) && isValid(sDigit) && isValid(tDigit))) {

            if(fDigit % 10 == sDigit % 10 || sDigit % 10 == tDigit % 10 || fDigit % 10== tDigit % 10) {

                return true;

            }

        }
        return false;

    }
    public static boolean isValid(int number) {

        return(number >= 10 && number <= 1000);

    }
}
