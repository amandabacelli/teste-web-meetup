package meetup.reprograma.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import meetup.reprograma.pages.CustomerPage;
import meetup.reprograma.pages.HomePage;
import meetup.reprograma.setup.Hooks;
import org.junit.Assert;

public class CustomerSteps {

    private final HomePage homePage = new HomePage(Hooks.getDriver());
    private final CustomerPage customerPage = new CustomerPage(Hooks.getDriver());

    @Dado("que eu esteja na tela inicial")
    public void que_eu_esteja_na_tela_inicial() {
        Assert.assertTrue("Página não encontrada",homePage.valid_message_welcome());
    }

    @Quando("acesso o menu Customers")
    public void acesso_o_menu_Customers() {
         customerPage.enter_menu_customers();
    }

    @Quando("adiciono um novo customer com o email {string}")
    public void adiciono_um_novo_customer_com_o_email(String email) {
        customerPage.add_new_customer(email);
    }

    @Então("o email {string} é cadastrado com sucesso")
    public void o_email_é_cadastrado_com_sucesso(String email) {
        Assert.assertFalse("Customer cadastrado", customerPage.valid_customer(email));
    }

    @Quando("acesso o cadastro do email")
    public void acesso_o_cadastro_do_email() {
        customerPage.click_customer();
    }

    @Então("verifico se está cadastrado")
    public void verifico_se_está_cadastrado() {
        Assert.assertFalse("Customer não cadastrado", customerPage.valid_customer("teste@teste.com.br"));
    }


}
