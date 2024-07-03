package Collection_FrameWorks.Generics;

import java.util.Arrays;

public class GenricSort {

    public static <T> void swap(T[] arr,int i,int j)
    {
      T temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }

    public static <T extends Comparable<T>> void sort_this(T[]a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    swap(a, j, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer arr1[]={3,5,6,7,1,-3,-5,-9,-10,34};
        Character arr2[]={'b','g','n','a','A','E'};
        String arr3[]={"Rocky","Garuda","Tina","Adheera"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        sort_this(arr1);
        sort_this(arr2);
        sort_this(arr3);
      System.out.println("After Sort..");
      System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

  
}

