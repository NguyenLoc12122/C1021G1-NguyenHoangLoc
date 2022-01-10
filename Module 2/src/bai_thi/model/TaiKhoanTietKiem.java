package bai_thi.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private int tienGui;
    private String ngayGui;
    private double laiSuat;
    private String kiHan;

    public TaiKhoanTietKiem(String bankCode, String nameAccount, String dateOpenAccount,
                            int tienGui, String ngayGui, double laiSuat, String kiHan) {
        super(bankCode, nameAccount, dateOpenAccount);
        this.tienGui = tienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem() {
    }

    public int getTienGui() {
        return tienGui;
    }

    public void setTienGui(int tienGui) {
        this.tienGui = tienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                super.toString()+
                ", tienGui=" + tienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
