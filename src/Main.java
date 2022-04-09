import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите десятичное целое число ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Введите в какую систему перевести число ");
        int isch = input.nextInt();

        String otvet= "";
        String[] bukvi = {"A","B","C","D","E","F"};
        while (number >0)
            {
            int c = number % isch;
            if (c < 10)
                {
                otvet = Integer.toString (number % isch) + otvet;
                }else
                {
                otvet = bukvi [c -10] + otvet;
                }

            number = number / isch;
            //System.out.println("number "+number);

            }
    System.out.println("Результат: число в " +isch+" исчислении запишется так :" +otvet);

    if (isch == 2)
    {
        String str ;
        int score  = otvet.length();
        double desat = 0;
        otvet = reverseString(otvet);// перевернул строку
        //for (int i = score; i > 0; i--)
        for (int i = 0; i < score; i++)
        {
            //str = otvet.substring(i-1,i);
            str = otvet.substring(i,i+1);
            //double chislo =(Integer.parseInt(str));
            //double vstepeni = Math.pow(2,i-1);
            //desat = desat + chislo * vstepeni;
            //desat = desat + (Integer.parseInt(str)) * Math.pow(2,i-1);
            desat = desat + (Integer.parseInt(str)) * Math.pow(2,i);
        }
        System.out.println("из двоичной в десятиричную Результат:" +desat);
    }
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
