
package dplec037c;

public class AdvanceAccount implements Bank{

    @Override
    public String withdraw(Double amount) {
        return amount+"amount is withdrawn from Advance Account";
    }
    
}
