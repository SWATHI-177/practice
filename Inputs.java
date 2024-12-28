import java.util.Scanner;

public class Inputs {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("TAKING INPUTS FROM USER IN ALL DATA TYPES");
        int num=scanner.nextInt();
        String string=scanner.nextLine();
        short small=scanner.nextShort();
        long BigNum=scanner.nextLong();
        float Dec=scanner.nextFloat();
        byte Num=scanner.nextByte();
        double bigdec=scanner.nextDouble();
        boolean bool=scanner.nextBoolean();
        System.out.println("NUMBER :" + num);
        System.out.println("STRING :" + string);
        System.out.println("Small :" + small);
        System.out.println("LONG :" + BigNum);
        System.out.println("DECIMAL :" + Dec);
        System.out.println("Byte :" + Num);
        System.out.println("DOUBLE :" + bigdec);
        System.out.print("BOOLEAN :" + bool);




        scanner.close();

    }
    
}
