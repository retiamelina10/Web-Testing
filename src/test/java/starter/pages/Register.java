package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

        private By fieldName() {
                return By.xpath("//div[label[text()='Nama Lengkap']]/input");
        }

        private By fieldEmail() {
                return By.xpath("//div[label[text()='Email']]/input");
        }

        private By fieldPassword() {
                return By.xpath("//div[label[text()='Password']]/input");
        }

        private By registerButton() {
                return By.xpath("//button/span[text()='Register']");
        }

        private By headerThePage() {
                return By.xpath("//div[@class='v-main__wrap']");
        }

        public void openUrlRegister() {
                openAt("/auth/register");
        }


        public void inputName(String arg1) {
                $(fieldName()).type(arg1);
        }

        public void inputEmail(String arg2) {
                $(fieldEmail()).type(arg2);
        }

        public void inputPassword(String arg3) {
                $(fieldPassword()).type(arg3);
        }

        public void clickRegisterButton() {
                $(registerButton()).click();
        }

        public void goTOpage() {
                $(headerThePage()).isDisplayed();
        }
}
