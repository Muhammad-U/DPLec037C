
package dplec037c;

public class SimpleAccount implements Bank{
    String results="Simple ";

    @Override
    public String withdraw(Double amount) {
        return amount+"amount is withdrawn from Simple Account";
    }
}
