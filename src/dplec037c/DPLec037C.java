
package dplec037c;

public class DPLec037C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankFactory creator=new BankFactory();
        Bank AliAcc=creator.getNewAccount("simple");
        System.out.println(AliAcc.withdraw(12334.22));
        Bank AlixAcc=creator.getNewAccount("advance");
        System.out.println(AlixAcc.withdraw(334.22));
    }
    
}
