import java.util.*;

/**
 * Write a description of class PracticeBasics1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeBasicsI
{
    public static int[] funnyNumbers(int amt, int a, int b)
    {
       int array[] = new int[amt];
       if (a > b){
        for(int i = 0; i < amt; i++)
        {
            array[i] = (int)((Math.random()*( a - b + 1)) + b);
        }
        return array;
       }else{
        for (int i = 0; i < amt; i++)
        {
            array[i] = (int)((Math.random()* (b - a + 1)) + a);
        }
        return array;
       }
    }
    
    public static ArrayList<Integer> removeDupicates(int[] arr)
    {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int num : arr)
        {
            for (int i : arr)
            {
                if(arrList.get(num) == arrList.get(i) && num != i)
                {
                    arrList.remove(num);
                }
            }
        }
        return arrList;
    }
    
      public static double avg(int[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return (sum/arr.length);
    }
    
    public static double avg(ArrayList<Integer> arr)
    {
        double sum = 0;
        for (int i : arr)
        {
            sum += arr.get(i);
        }
        return (sum/arr.size());
    }
    
    public static String tWords(String[] arr)
    {
        String fString = "";
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].indexOf("t") != -1)
            {
                fString += arr[i];
            }
        }
        return fString;
    }
    
    public static void printNums(int [] arr)
    {
        for(int a : arr)
        {
            System.out.println(arr[a]);
        }
    }
}

