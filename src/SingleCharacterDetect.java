/**
 * Created by upxs078 on 2/1/17.
 */
public class SingleCharacterDetect {
    public static void main(String[] args) {
//        one input only, the sample string
        if(args.length == 0) {
//            no input
            System.out.println("No input given. Try again with a single input string.");
        }   else if(args.length > 1) {
//            too many inputs
            System.out.println("Too many inputs given. Try again with a single input string.");
        } else {
            char[] charArr = args[0].toCharArray();
            char result;

            result = detect(charArr);

            System.out.println("The first non-repeating character in the provided string is '" + result + "'.");
        }
    }

    public static char detect(char[] arr) {
        int count;
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    count++;
                if((j == arr.length-1) && (count == 1))
                    return arr[i];
            }
        }
        return '\u0000';
    }
}
