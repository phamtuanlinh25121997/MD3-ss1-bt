import java.util.Scanner;

public class TinhDiemTrungBinhVaPhanLoaiHS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán:");
        double Toan = scanner.nextDouble();
        System.out.println("Nhập điểm môn Lý :");
        double Ly = scanner.nextDouble();
        System.out.println("Nhập điểm môn Hoá :");
        double Hoa = scanner.nextDouble();
        System.out.println("Nhập điểm môn Văn :");
        double Van = scanner.nextDouble();
        System.out.println("Nhập điểm môn Tiếng Anh:");
        double Anh = scanner.nextDouble();
        double DiemTrungBinh = (Toan + Ly + Hoa + Van + Anh)/5;
        if ( DiemTrungBinh >= 9){
            System.out.println("HSXS");
        }else if (DiemTrungBinh >= 8 ){
            System.out.println("HSG");
        }else if (DiemTrungBinh >=6.5){
            System.out.println("HSTT");
        } else if (DiemTrungBinh >=5) {
            System.out.println("HSTB");
        }else{
            System.out.println("HSY");
        }
        System.out.println("DIemTrungBinh"+DiemTrungBinh );
    }

}
