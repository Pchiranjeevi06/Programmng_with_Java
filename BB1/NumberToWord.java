package BB1;

import java.util.HashMap;

public class NumberToWord {
    public static void main(String[] args) {
        HashMap<Integer, String[]> hash = new HashMap<Integer, String[]>();
        hash.put(0,new String[]{"eleven", "twelve","thirteen", "fourteen","fifteen","sixteen", "seventeen", "eighteen", "nineteen"});
        hash.put(1, new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"});
        hash.put(2, new String[]{"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"});
        hash.put(3, new String[]{"hundred"});
        hash.put(4, new String[]{"thousand"});


        int num = 1119,num1=num;
        String word = "";
        int count = 1;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            if (count > 2) {
                String string = hash.get(1)[digit-1] + hash.get(count)[0];
                word = string + " " + word;
            } else {
                if((count==2 && num1%100<20)&&(digit!=0||digit==1)){
                    String string = hash.get(0)[num1%10-1];
                    word="";
                    word = "and "+ string + " " + word;
                }
                else {
                    if(digit!=0){
                    String string = hash.get(count)[digit - 1];
                    word = string + " " + word;
                    }
                }
            }
            count++;
        }
        System.out.println(word);
    }
}