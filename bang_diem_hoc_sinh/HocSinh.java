package bang_diem_hoc_sinh;

public class HocSinh implements Comparable<HocSinh> {
    private String ma, ten, xepLoai;
    private Double diemTb;

    public HocSinh(int ma, String ten, Double diemTb) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diemTb = diemTb;
        this.xepLoai = xepLoai(diemTb);
    }

    private String xepLoai(Double f) {
        if (f >= 9.0) return "XUAT SAC";
        else if (f >= 8.0) return "GIOI";
        else if (f >= 7.0) return "KHA";
        else if (f >= 5.0) return "TB";
        else return "YEU";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTb + " " + xepLoai;
    }

    @Override
    public int compareTo(HocSinh o) {
        return diemTb <= o.diemTb ? 1 : -1;
    }
}