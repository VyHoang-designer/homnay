import java.util.Random;
import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner để nhận đầu vào
        Display();

        while (true) {
            System.out.print("Chuc nang: ");
            int choice = scanner.nextInt();  // Nhận lựa chọn của người dùng
            if (choice == 1) {
                Confirm(scanner);  // Truyền scanner vào phương thức Confirm
				CheckCCCD(scanner);
            } 
            else if (choice == 0) {
                System.out.println("Thoat chương trình.");
                break;  // Thoát khỏi vòng lặp và kết thúc chương trình
            } 
            else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            Display();  // Hiển thị lại menu sau mỗi lần nhập
        }
        scanner.close();  // Đóng scanner khi không sử dụng nữa
    }   
    
    public static void Display()
    {
        // Dùng printf để căn chỉnh các cột và in ra theo định dạng
        System.out.printf("+%-13s+%-21s+%-13s+\n", "-------------", "---------------------", "-------------");
        System.out.printf("| %-13s| %-21s| %-13s|\n", "NGAN HANG SO", "FX123456@v1.0.0", "");
        System.out.printf("+%-13s+%-21s+%-13s+\n", "-------------", "---------------------", "-------------");
        System.out.printf("| %-13s| %-21s| %-13s|\n", "1. Nhap CCCD", "", "");
        System.out.printf("| %-13s| %-21s| %-13s|\n", "0. Thoat", "", "");
        System.out.printf("+%-13s+%-21s+%-13s+\n", "-------------", "---------------------", "-------------");    
    }
    
    public static void Confirm(Scanner scanner)
    {
        Random random = new Random();
        int numberRandom = random.nextInt(100, 999);  // Sinh ra số ngẫu nhiên từ 100 đến 999
        while(true)
        {
            System.out.println("Nhap ma xac thuc: " + numberRandom);  // Hiển thị mã xác thực cho người dùng
            int number = scanner.nextInt();  // Nhận đầu vào từ người dùng
            if(number == numberRandom){
                System.out.println("Chinh xac");
                break;  // Thoát khỏi vòng lặp khi mã xác thực chính xác
            }
            else{
                System.out.println("Ma xac nhan khong dung. Vui long thu lai");
            }
        }
    }
	public static void CheckCCCD(Scanner scanner)
    {
        while (true) {
            System.out.println("Vui long nhap so CCCD: ");
            String numberCCCD = scanner.next(); // Nhập CCCD dưới dạng chuỗi

            // Kiểm tra nếu CCCD bắt đầu bằng "0" và có độ dài là 12
            if (numberCCCD.charAt(0) == '0' && numberCCCD.length() == 12) {
                System.out.println("CCCD hợp lệ!");
                break; // Thoát khỏi vòng lặp nếu CCCD hợp lệ
            } else {
                System.out.println("Vui long nhap lai hoac go 'No' de thoat:");
                String text = scanner.next();
                if (text.equalsIgnoreCase("No")) {
                    System.out.println("Thoat chuong trinh.");
                    break; // Thoát khỏi vòng lặp và kết thúc chương trình
                }
            }
        }
    }
}
