package TEST1;
public class AS{
    public static void main(String[] args){
        java.util.Scanner scanner =
                new java.util.Scanner(System.in);
 
        System.out.print("��J��:");
        int length = scanner.nextInt();
 
        System.out.print("��J�e:");
        int width = scanner.nextInt();
 
        for (int i = width; i > 0; i--){
            for (int j = length; j > 0; j--){
                System.out.print("@");
            }
            System.out.println(); // ����
        }
    }

}