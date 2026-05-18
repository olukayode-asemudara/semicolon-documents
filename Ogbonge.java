
public class Ogbonge{

    public static int getLargestOf(int[] numbers){

       int largest = numbers[0];

       for(int index= 1; index < numbers.length; index++){
        if (numbers[index] > largest) largest = numbers[index];
    }

        return largest;
    }

    public static int [] reverseArray(int [] preciousNumbers){

        int [] reversedArray = new int [preciousNumbers.length];
        
        int indexOfNewArray = 0;        

        for(int index = preciousNumbers.length - 1; index >= 0; index--){
            
            reversedArray[indexOfNewArray] = preciousNumbers[index];
            indexOfNewArray++;
        }

        return reversedArray;
    }

    public static boolean isPresent(int[] numbers, int numberToFind){

        boolean eDeyThere = false;
        for(int index= 0; index < numbers.length; index++){
            if (numberToFind == numbers[index]){ 
                eDeyThere = true;            
                break;
              }
        }
        return eDeyThere;
    }



    public static String [] extractDigitsOf(String number){
        String [] extractedDigits = new String[number.length()];

        for(int index= 0; index < number.length(); index++){
        String text = "";
        extractedDigits[index] = text +=  number.charAt(index);
    }

    return extractedDigits;
}

}
