import java.util.Scanner;

public class SoChiaHetCho3Va5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        int KT = scanner.nextInt();
        String LT = "";
        if (KT%5 ==0 & KT%3 ==0){
            System.out.println("Chỉ chia hết cho 5 và 3");
        } else if (KT%5 ==0) {
            System.out.println("Chỉ chia hết cho 5");
        } else if (KT%3 ==0) {
            System.out.println("Chỉ chia hết cho 3");
        } else {
            System.out.println("Không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}
