package tuan3.bai4Vehicle;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private int dungTichXiLanh;
    private double triGiaXe;

    public Vehicle() {
    }

    public Vehicle(String chuXe, String loaiXe,
                   int dungTichXiLanh, double triGiaXe) throws Exception {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        setDungTichXiLanh(dungTichXiLanh);
        setTriGiaXe(triGiaXe);
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) throws Exception {
        if (dungTichXiLanh >= 0) {
            this.dungTichXiLanh = dungTichXiLanh;
        } else {
            this.dungTichXiLanh = 0;
        	throw new Exception("Loi");
        }
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        if (triGiaXe >= 0) {
            this.triGiaXe = triGiaXe;
        } else {
            this.triGiaXe = 0;
        }
    }

    public double tinhThue() {
        if (dungTichXiLanh < 100) {
            return triGiaXe * 0.01;
        } else if (dungTichXiLanh <= 200) {
            return triGiaXe * 0.03;
        } else {
            return triGiaXe * 0.05;
        }
    }

}
