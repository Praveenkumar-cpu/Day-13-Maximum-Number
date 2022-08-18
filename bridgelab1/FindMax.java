package bridgelab1;
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
        int i;
        Integer inums[]={10,2,5,4,6,1};
        Float f[]={2.2f,5.4f,1.6f,8.3f,4.6f,1.4f};
        String str[] = {"praveen","vijay","arun"};
        FindMax<Integer> iob = new FindMax<>(inums);
        FindMax<Float>dob = new FindMax<Float>(f);
        FindMax<String>sm = new FindMax<String>(str);
        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Max value in float: " + dob.max());
        System.out.println("Max string in three: " + sm.max());

    }
}
