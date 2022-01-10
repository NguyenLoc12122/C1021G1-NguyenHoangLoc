package bai_thi.model;

public abstract class TaiKhoanNganHang {
    private int id;
    private static int idAuto=0;
    private String bankCode;
    private String nameAccount;
    private String dateOpenAccount;

    public TaiKhoanNganHang( String bankCode, String nameAccount, String dateOpenAccount) {
        idAuto++;
        this.id = idAuto;
        this.bankCode = bankCode;
        this.nameAccount = nameAccount;
        this.dateOpenAccount = dateOpenAccount;
    }

    public TaiKhoanNganHang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdAuto() {
        return idAuto;
    }

    public static void setIdAuto(int idAuto) {
        TaiKhoanNganHang.idAuto = idAuto;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getDateOpenAccount() {
        return dateOpenAccount;
    }

    public void setDateOpenAccount(String dateOpenAccount) {
        this.dateOpenAccount = dateOpenAccount;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", bankCode='" + bankCode + '\'' +
                ", nameAccount='" + nameAccount + '\'' +
                ", dateOpenAccount='" + dateOpenAccount ;
    }
}
