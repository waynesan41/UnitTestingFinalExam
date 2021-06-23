public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        if(numbers.indexOf('-')  == -1){
            System.out.print("EXPECTION THROW ");
            throw new IllegalArgumentException("There can't be Negative Number");
        }
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}