package home.inherit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien[] arr = {};

        do {
            System.out.println("Menu");
            System.out.println("1. Add Part-time");
            System.out.println("2. Add Full-time");
            System.out.println("3. Display");
            System.out.println("4. Display condition");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr = Manage.addNhanVienPartTime(arr);
                    break;
                case 2:
                    arr = Manage.addNhanVienFullTime(arr);
                    break;
                case 3:
                    for (NhanVien nhanvien : arr) {
                        System.out.println(nhanvien);
                    }
                    break;
                case 4:
                    Manage.displayCondition(arr);
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
