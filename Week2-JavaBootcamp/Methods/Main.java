public class Main {

    public static void main(String[] args) {

        String msj = "Today weather is good ";
        String msj2 = giveCity();
        System.out.println(msj2);
        int sum1 = sum(5,9);
        System.out.println(sum1);
        System.out.println(msj);
        int sum2 = sum2(1,2,3,4,5,6,7,8,9);
        System.out.println("--------------");
        System.out.println(sum2);

    }
    public static void add (){
        System.out.println();
    }

    public static void delete (){
        System.out.println();
    }

    public static void update (){
        System.out.println();
    }

    public static int sum (int x, int y){
        return x+y;
    }

    public static int sum2 (int... numbers){
        int sum =0;

        for (int number: numbers) {
            sum+=number;
        }
        return sum;
    }
    public static String giveCity (){
        return "Hatay";
    }

}
