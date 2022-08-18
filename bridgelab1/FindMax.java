package bridgelab1;

import java.util.Scanner;

class FindMax<T extends Comparable<T>>
{
    T[] number;
    FindMax(T[] o)
    {
        number = o;
    }

    public T max()
    {
        T v = number[0];
        for(int i=1; i < number.length;i++)
            if(number[i].compareTo(v) > 0)
                v = number[i];
        return v;
    }
}
class TestMaximum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Integer inums[]={10,2,5};
        FindMax<Integer> iob = new FindMax<>(inums);
        System.out.println("Max value in Number: " + iob.max());
    }
}
