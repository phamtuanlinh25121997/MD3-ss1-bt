import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn hãy nhập số tiền USD tôi sẽ chuyển sang VND cho bạn: ");
        double USD = scanner.nextDouble();
        double chuyenDoi = USD * 23490;
        System.out.printf("số tiền bạn chuyển từ USD: %f sang tiền VND là: %f VND", USD, chuyenDoi);
    }
}

