package bai_thi.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private String soThe;
    private int accountMoney;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String bankCode, String nameAccount, String dateOpenAccount, String soThe, int accountMoney) {
        super(bankCode, nameAccount, dateOpenAccount);
        this.soThe = soThe;
        this.accountMoney = accountMoney;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                super.toString() +
                "soThe='" + soThe + '\'' +
                ", accountMoney=" + accountMoney +
                '}';
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public int getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(int accountMoney) {
        this.accountMoney = accountMoney;
    }
}
