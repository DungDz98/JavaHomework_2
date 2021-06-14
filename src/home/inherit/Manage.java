package home.inherit;

import java.util.Scanner;

class Manage {
//    public static NhanVien[] addNhanVien(NhanVien[] arr) {
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        do {
//            System.out.println("Ban muon them Nhan vien Part time hay Full time?");
//            System.out.println("1. Nhan vien Part Time");
//            System.out.println("2. Nhan vien Full Time");
//            System.out.println("3. Exit");
//            System.out.println("Enter your choice");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    addNhanVienPartTime(arr);
//                    break;
//                case 2:
//                    addNhanVienFullTime(arr);
//                    break;
//                case 3:
//                    flag = false;
//                    return arr;
//            }
//        } while (flag);
//    }

    public static NhanVien[] addNhanVienPartTime(NhanVien[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your fullName: ");
        String fullName = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your phoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter workingHours: ");
        int workingHours = Integer.parseInt(sc.nextLine());

        NhanVien nhanvien = new NhanVienPartTime(id, fullName, age, phoneNumber, email, workingHours);
        NhanVien[] arrNew = new NhanVien[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = nhanvien;
        return arrNew;
    }

    public static NhanVien[] addNhanVienFullTime(NhanVien[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your fullName: ");
        String fullName = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your phoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter bonusMoney: ");
        double bonusMoney = sc.nextDouble();
        System.out.println("Enter penaltyMoney: ");
        double penaltyMoney = sc.nextDouble();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        NhanVien nhanvien = new NhanVienFullTime(id, fullName, age, phoneNumber, email, bonusMoney, penaltyMoney, salary);
        NhanVien[] arrNew = new NhanVien[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = nhanvien;
        return arrNew;
    }

    public static void displayCondition(NhanVien[] arr) {
        double sum = 0;
        for (NhanVien nhanvien : arr) {
            if (nhanvien instanceof NhanVienFullTime) {
                sum += ((NhanVienFullTime) nhanvien).getNetWage();
            } else {
                sum += ((NhanVienPartTime) nhanvien).getNetWage();
            }
        }
        double average = sum / arr.length;
        System.out.println("Average of NetWage: " + average);
        System.out.println("Danh sach nhan vien luong thap hon luong TB: ");
        for (NhanVien nhanvien : arr) {
            if (nhanvien instanceof NhanVienFullTime) {
                if (((NhanVienFullTime) nhanvien).getNetWage() < average) {
                    System.out.println(nhanvien);
                }
            }
        }

    }
}
