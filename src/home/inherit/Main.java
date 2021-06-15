package home.inherit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien[] arr = {};

        do {
            Manage.showMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr = Manage.addNhanVien(arr);
                    break;
                case 2:
                    for (NhanVien nhanvien : arr) {
                        System.out.println(nhanvien);
                    }
                    break;
                case 3:
                    Manage.displayCondition(arr);
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
