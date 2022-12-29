package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NodeQueryPage {
    private By CHECK_BOX = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox");
    private WebDriver driver;
    public NodeQueryPage(WebDriver driver) {
        this.driver = driver;
    }
    public NodeQueryPage checkBox() {
        driver.findElement(CHECK_BOX).click();
        return this;
    }
    public Boolean checkIfTheBoxIsChecked() {
        return driver.findElement(CHECK_BOX).getAttribute("checked").contains("true");
    }
}
