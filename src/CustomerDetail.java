public class CustomerDetail {
    private String name;
    private int ssn;
    private String accountType;
    private int initialDeposit;
    private long accountNumber;

    public CustomerDetail() {
    }

    public CustomerDetail(String name, int ssn, String accountType, int initialDeposit, long accountNumber) {
        this.name = name;
        this.ssn = ssn;
        this.accountType = accountType;
        this.initialDeposit = initialDeposit;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

}
