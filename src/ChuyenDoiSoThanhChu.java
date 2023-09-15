import java.util.Scanner;

public class ChuyenDoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 0 đến 9: ");
        int number = scanner.nextInt();
        String result = convertToWord(number);
        System.out.println("Kết quả: " + result);
    }
    public static String convertToWord(int number) {
        switch (number) {
            case 0:
                return "Số Không";
            case 1:
                return "Số Một";
            case 2:
                return "Số Hai";
            case 3:
                return "Số Ba";
            case 4:
                return "Số Bốn";
            case 5:
                return "Số Năm";
            case 6:
                return "Số Sáu";
            case 7:
                return "Số Bảy";
            case 8:
                return "Số Tám";
            case 9:
                return "Số Chín";
            default:
                return "Số Không hợp lệ";
        }
    }
}
