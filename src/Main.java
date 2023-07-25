import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
        System.out.println( "------------");
        System.out.println( hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println( "-----------");
        System.out.println( isCatPlaying(true,10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println( "-----------");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("ilk sayıyı giriniz");
            double num1 = scanner.nextDouble();
            System.out.println("ikinci sayıyı giriniz");
            double num2 = scanner.nextDouble();
            System.out.println(area(num1,num2));
        }catch (Exception ex){
            System.out.println("geçersiz değer");
        }
        System.out.println( "-----------");
        try {
            System.out.println("yarıçap giriniz");
            double radius = scanner.nextDouble();

            System.out.println(area(radius));
        }catch (Exception ex){
            System.out.println("geçersiz değer");
        }
    }

    public static boolean shouldWakeUp(boolean isBarking, int time){
        if(time < 0 || time > 23) return false;
        if (!isBarking) return false;
        return time < 8 || time >= 20;
    }
    public static boolean hasTeen(int ...nums){
        for(int num: nums) {
            if (num>=13 && num<=19){
                return true;
            }
        }
        return false;
    }
    public static boolean isCatPlaying(boolean isSummer, int temperature){
        return ((isSummer && temperature > 25 && temperature <= 45) ||
                (!isSummer && temperature > 25 && temperature <= 35));
    }
    public static double area(double num1, double num2){
        if (num1<0 || num2< 0){
            return -1;
        }
        return num1*num2;
    }
    public static double area(double radius){
        if (radius< 0){
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
