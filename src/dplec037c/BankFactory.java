
package dplec037c;

public class BankFactory {
    public Bank getNewAccount(String accType){
        if("simple".equalsIgnoreCase(accType)){
            return new SimpleAccount();
        }
        if("Advance".equalsIgnoreCase(accType)){
            return new AdvanceAccount();
        }
        return null;
    }
}
