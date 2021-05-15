import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdamLoginTest extends BaseTests{

    @Test
    public void login() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
        homePage.setEmail("<email>");
        homePage.setPassword("<password>");
        homePage.confirmCredentials();

        MinerPage minerPage = homePage.clickMiner();
        minerPage.clickActivate();
        assertTrue(minerPage.isCountdownRunning());
    }
}
