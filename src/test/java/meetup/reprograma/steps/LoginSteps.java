package meetup.reprograma.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import meetup.reprograma.pages.LoginPage;
import meetup.reprograma.setup.Hooks;
import org.junit.Assert;

public class LoginSteps {

    //TODO instanciar classes que iremos utilizar
    private final LoginPage loginPage = new LoginPage(Hooks.getDriver());

    //TODO os asserts serão nessa pagina
    @Dado("que eu esteja na tela de login")
    public void que_eu_esteja_na_tela_de_login() {
        Assert.assertTrue("Página Login não foi apresentada.", loginPage.valid_page());
        //Aqui usamos o assert true esperando que a validação da pagina seja feita, caso nao seja, ele retorna false
        // com a mensagem descrita
    }

    @Quando("faço login com o username {string} e password {string}")
    public void faço_login_com_o_username_e_password(String username, String password) {
        loginPage.input_username(username);
        loginPage.input_password(password);
        loginPage.click_btn_login();
    }

    @Então("sou autenticado com sucesso")
    public void sou_autenticado_com_sucesso()  {
        Assert.assertTrue("Login não realizado",loginPage.valid_message_welcome_admin());
    }

}
