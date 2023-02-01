public class BankFactory extends AbstractFactory{
    //generates Bank object
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("MAIB")){
            return new MAIB();
        } else if(bank.equalsIgnoreCase("MCIB")){
            return new MCIB();
        }
        return null;
    }
    //generates Loan object
    public Loan getLoan(String loan) {
        return null;
    }
}
