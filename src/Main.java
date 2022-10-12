public class Main
{
    public static void main(String[] args)
    {
        sayHello();

        sayHello(13);

        sayMsg("Damn Riley", 35);

        int favNum = 3;

        int doubleInt = doubleIt(favNum);
        System.out.println("Double is " + doubleInt);
    }

    //user define static methods go here - after the main
    public static void sayHello()
    {
        System.out.println("Hello!");
    }

    public static void sayHello(int times)
    {
        for(int i = 0; i <= times; i++)
            System.out.println("Hello!");
    }

    public static void sayMsg(String msg, int times)
    {
        for(int i = 0; i <= times;i++)
            System.out.println(msg);
    }

    public static int doubleIt(int num)
    {
        int retVal = 0;

        retVal = num * 2;

        return retVal;
    }


}