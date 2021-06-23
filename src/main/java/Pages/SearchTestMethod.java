package Pages;

import org.openqa.selenium.support.ui.ExpectedCondition;


public class SearchTestMethod {
    public SearchTestMethod() {
        this.exp = 22;
    }
    private int exp;

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if (exp != 0){
            this.exp = exp;
        }
    }

}
