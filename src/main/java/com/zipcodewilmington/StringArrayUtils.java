package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
    int length = array.length;
        return array[length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int length = array.length;
        return array[length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
    for (String s: array) {
        if (s == value) {
            return true;
        }
    }
    return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
//    Converting array to array list
        List<String> list = Arrays.asList(array);
        // Reversing the list using Collections.reverse() method
        Collections.reverse(list);
        // Converting list back to Array
        String[] reversedArray = list.toArray(array);
        return reversedArray;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i=0; i<array.length/2; i++){
            if(!array[i].equals(array[array.length-1-i])){
                return false;
            }
        }
        return true;
    }

//        String revArray[] = new String[0];
//        int strLength = array.length;
//        int count =0;
//
//        for (int i =0 ; i<(strLength-1)/2; i++){
//            if (array[i] == revArray[strLength-1]){
//                     count = count + 1;
//            }
//            else{
//                count = 0;
//                break;
//            }
//        }
//        if (count > 0)
//            return true;
//            else
//                return false;
        
//        for (String s : array){
//
//        }
//        List<String> list = Arrays.asList(array);
//        // Reversing the list using Collections.reverse() method
//        Collections.reverse(list);
//        // Converting list back to Array
//        String[] reversedArray = list.toArray(array);
//
//        if(reversedArray == array)
//            return true;
//        else
//        return false;
//    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        int arrayCount=0;
        int charCount=0;
        int found=0;
        int charValue='a';
        String temp;
        while(charValue<='z') {
            while (arrayCount < array.length) {
                temp = array[arrayCount].toLowerCase();
                while (charCount < temp.length()) {
                    if (temp.charAt(charCount) == charValue) {
                        found = 1;
                    }
                    charCount++;
                }
                charCount = 0;
                arrayCount++;
            }
            if (found == 0) {
                return false;
            }
            arrayCount = 0;
            found = 0;
            charValue++;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfOcc=0;
        for(int i= 0; i< array.length; i++){
            if (array[i] == value){
                numOfOcc = numOfOcc +1;
            }

        }

//        List asList = Arrays.asList(array);
//        Set<String> mySet = new HashSet<String>(asList);
//        int numOfOcc=0;
//        for(String s: mySet){
         //   System.out.println(s + " " + Collections.frequency(asList,s));
//        }
        return numOfOcc;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
    // Converting array to arrayList
    List<String> arrList = new ArrayList<String>(Arrays.asList(array));

    // Using remove mtd of arrayList to remove the element
        arrList.remove(valueToRemove);

    // Converting arrayList to array before returning
    array = arrList.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

////        // Converting array to arrayList
//        List<String> newList = new ArrayList<String>(Arrays.asList(array));
//
//        newList.add(array[0]);
//        for (int i=1; i< array.length-1; i++){
//            if (array[i-1] != array[i]){
//                newList.add(array[i]);
//            }
//        }
        // Converting arrayList to array before returning
//        //array = newList.toArray(new String[0]);
//        String[] newArr = new String[newList.size()];
//        newList.toArray(newArr);
//        String [] arrTemp = {""};
//        for (int i=0;i< array.length-1; i++){
//            for (int j = i+1; j< array.length; i++){
//                if (array[i] == array[j] ){
//                    arrTemp[i] = array[i];
//                }
//            }
//        }

        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;
    }


}
