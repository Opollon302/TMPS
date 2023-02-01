public class MAIB implements Bank{
    private final String BankName;
    public MAIB(){
        BankName="MAIB Bank";
    }
    @Override
    public String getBankName() {
        return BankName;
    }
}
