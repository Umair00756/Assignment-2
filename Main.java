import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                //Problem#1
//        System.out.println("Enter a String to check it is a paliindrome or not");
//        String str = sc.nextLine();
//        int i = 0;
//        int j = str.length()-1;
//        while(i>j){
//
//            if(str.charAt(i) != str.charAt(j)){
//
//                System.out.println("Not palindrome");
//
//            }
//            i++;
//            j--;
//        }
//        System.out.println("It is Palindrome");
                //Problem#2

//        System.out.println("Enter a input string:");
//        String sttr = sc.nextLine();
//        if(Pattern.compile("([a-zA-Z]+\\d+|[a-zA-Z]+|[a-zA-Z]+.[a-zA-Z]+)@gmail.com").matcher(sttr).matches())
//            System.out.println("Valid");
//
//        else{
//            System.out.println("Invalid");
//        }




//                Problem#3
//        LocalDate today = LocalDate.now();
//        String newDate = today.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
//        System.out.println("before: "+today);
//        System.out.println("After: "+ newDate);
//                Problem#4
//
//        System.out.println("Enter date:");
//        String str = sc.nextLine();
//        LocalDate date = LocalDate.parse(str);
//        date = date.plusDays(30);
//        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
//
//                Problem#5
//        System.out.println("Enter  a number in decimal");
//        String str = sc.nextLine();
//        int mInt = Integer.parseInt(str);
//        int num;
//        String [] rnChars = {"M","CM","D","C","XC","L","X","IX","V","I"};
//        String retVals = "";
//        int [] rnVals = {1000,900,500,100,90,50,10,9,5,1};
//        for(int i =0 ;i <rnVals.length; i++) {
//            num = mInt / rnVals[i];
//            if (num == 0) continue;
//            retVals += (num == 4 && i > 0) ? rnChars[i] + rnChars[i - 1]: rnChars[i];
//            mInt = mInt % rnVals[i];
//        }
//        System.out.println("Romen number is: " +retVals);
//
//                Problem#6
//        System.out.println("Enter a String");
//        String strrr = sc.nextLine();
//        if(Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]").matcher(strrr).matches())
//            System.out.println("Valid");
//        else
//            System.out.println("Invalid");
//
//                Problem#7
//
//        String []strr ={"flower", "flow","flight"};
//        if(strr.length==0){
//            System.out.println("empty");
//        }
//        else if(strr.length==1){
//            System.out.println(strr[0]);
//        }
//        else {
//
//            String firstStr = strr[0];
//            for(int i = 0; i<strr.length; i++){
//
//                String currStr = strr[i];
//                int  j =0;
//                while(j<currStr.length() && j<firstStr.length() && currStr.charAt(j) == firstStr.charAt(j)){
//                    j++;
//                }
//                if(j==0){
//
//                    System.out.println("This is not matched");
//                    break;
//
//                }
//                firstStr = currStr.substring(0,j);
//
//            }
//            System.out.println(firstStr);
//        }
//
//                    Problem#8
//
//        System.out.println("Enter a string");
//        String str =sc.nextLine();
//        String newStr = "";
//        char [] arr =str.toCharArray();
//        for(int i = 0; i<arr.length ;i ++){
//            int j;
//            for( j =0 ;j<i; j++){
//                if(arr[i] == arr[j]){
//                    break;
//
//                }
//
//
//
//            }
//            if(i==j){
//                newStr += arr[i];
//            }
//
//
//        }
//
//        char[] arr1 = newStr.toCharArray();
//        Arrays.sort(arr1);
//        newStr = String.valueOf(arr1);
//        System.out.println(newStr);
        }

    }

