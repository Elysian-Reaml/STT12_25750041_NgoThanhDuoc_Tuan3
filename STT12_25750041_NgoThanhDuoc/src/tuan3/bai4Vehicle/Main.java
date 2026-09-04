package tuan3.bai4Vehicle;

public class Main {
    public static void main(String[] args) throws Exception{

        Vehicle xe1 = new Vehicle(
                "Nguyễn Thu Loan",
                "Future Neo",
                100,
                35000000
        );

        Vehicle xe2 = new Vehicle(
                "Lê Minh Tồn",
                "Ford Ranger",
                3000,
                250000000
        );

        Vehicle xe3 = new Vehicle(
                "Nguyễn Minh Triết",
                "Landscape",
                1500,
                1000000000
        );

        System.out.printf("%-20s %-15s %10s %18s %18s%n",
                "Tên chủ xe",
                "Loại xe",
                "Dung tích",
                "Trị giá",
                "Thuế phải nộp");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.printf("%-20s %-15s %10d %,18.2f %,18.2f%n",
                xe1.getChuXe(),
                xe1.getLoaiXe(),
                xe1.getDungTichXiLanh(),
                xe1.getTriGiaXe(),
                xe1.tinhThue());

        System.out.printf("%-20s %-15s %10d %,18.2f %,18.2f%n",
                xe2.getChuXe(),
                xe2.getLoaiXe(),
                xe2.getDungTichXiLanh(),
                xe2.getTriGiaXe(),
                xe2.tinhThue());

        System.out.printf("%-20s %-15s %10d %,18.2f %,18.2f%n",
                xe3.getChuXe(),
                xe3.getLoaiXe(),
                xe3.getDungTichXiLanh(),
                xe3.getTriGiaXe(),
                xe3.tinhThue());       
        }
}
