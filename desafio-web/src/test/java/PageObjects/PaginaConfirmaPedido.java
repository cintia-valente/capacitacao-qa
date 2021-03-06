package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaConfirmaPedido {

    private WebDriver driver;
    private Espera espera;

    public PaginaConfirmaPedido(WebDriver driver) {

        this.driver = driver;
        espera = new Espera(driver);
    }

    public WebElement pegarBotaoConfirmaPedido(){

        return espera.visibilidadeDoElemento(By.xpath("//p[@class='cart_navigation clearfix']/button[@class='button btn btn-default button-medium']"));
    }

}


