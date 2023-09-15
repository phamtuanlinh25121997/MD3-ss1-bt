import java.util.Scanner;

public class TinhChuViDienTichHinhVuong {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập độ dài cạnh của hình vuông: ");
//        double sideLength = scanner.nextDouble();
//        // Kiểm tra nếu độ dài cạnh là số âm
//        if (sideLength < 0) {
//            System.out.println("Độ dài cạnh không thể là số âm.");
//        } else {
//            // Tính chu vi và diện tích
//            double perimeter = calculatePerimeter(sideLength);
//            double area = calculateArea(sideLength);
//
//            System.out.println("Chu vi của hình vuông: " + perimeter);
//            System.out.println("Diện tích của hình vuông: " + area);
//        }
//    }
//    // Hàm tính chu vi hình vuông
//    public static double calculatePerimeter(double sideLength) {
//        return 4 * sideLength;
//    }
//    // Hàm tính diện tích hình vuông
//    public static double calculateArea(double sideLength) {
//        return sideLength * sideLength;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập CD của hình CN:");
        double CD = scanner.nextDouble();
        System.out.println("Nhập CR của hình CN:");
        double CR = scanner.nextDouble();
        double  area = CD*CR;
        double perimeter =(CD+CR)*2;
            System.out.println("Chu vi của hình CN: " + perimeter);
            System.out.println("Diện tích của hình CN: " + area);
   }
}
