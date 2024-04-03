import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import test.apiUserClient.ServicesUserSteps;

@Feature("Add new user")
public class AddNewUserTest extends BaseTest {
    private ServicesUserSteps apiClient = ServicesUserSteps.getInstance();

    @Test(description = "Adding new user")
    @Severity(SeverityLevel.CRITICAL)
    public void addingNewUser() {
        apiClient.createUserSuccessfully(user);
    }

    @Test(description = "Adding new user by static data")
    @Severity(SeverityLevel.NORMAL)
    public void addNewUserData() {
        apiClient.createUserByStaticData();
    }

    @Test(description = "Search user by username")
    @Severity(SeverityLevel.CRITICAL)
    public void searchUser() {
        apiClient.getUserByUserName("mutiarahmatun");
    }

    @Test(description = "Update user by username")
    @Severity(SeverityLevel.NORMAL)
    public void updateUser() {
        apiClient.updateUserSuccessfully("mutiarahmatun");
    }

    @Test(description = "Delete user by username")
    @Severity(SeverityLevel.NORMAL)
    public void deleteUser() {
        apiClient.deleteUser("mutiarahmatun");
    }
}
