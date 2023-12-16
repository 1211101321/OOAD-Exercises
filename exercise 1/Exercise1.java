public class Exercise1
{   public static final int SIZE = 4;
    public static void main(String args[])
    {   Animal[] a = new Animal[SIZE];
        a[0] = new Cat("Garfield");
        a[1] = new Snake("Kaa",5);
        a[2] = new Cat("Fluffy");
        a[3] = new Snake("Nagini",10);
        
        for (int i=0; i<SIZE;i++)
            a[i].speak();
    } 
}