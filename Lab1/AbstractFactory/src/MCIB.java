public class MCIB implements Bank{
    private final String BankName;
    public MCIB(){
        BankName="MCIB Bank";
    }
    @Override
    public String getBankName() {
        return BankName;
    }
}
