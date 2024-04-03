package test.apiUserClient;

import io.qameta.allure.Step;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import test.data.User;
import test.TestUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static test.TestUtils.USER_TEMP;

public class ServicesUserSteps extends UserBaseApiClient {

    private static ServicesUserSteps userSteps;

    public static ServicesUserSteps getInstance() {
        if (userSteps == null) {
            synchronized (ServicesUserSteps.class) {
                if (userSteps == null) {
                    userSteps = new ServicesUserSteps();
                }
            }
        }
        return userSteps;
    }

    @Step("Check error message {0} for response {1}")
    public ServicesUserSteps checkErrorResponseMessage(String message, Response response){
        assertThat(response.getBody().jsonPath().get("message").toString()).isEqualTo(message);
        return this;
    }

    @Step("Check correct status {status}")
    public ServicesUserSteps checkStatusResponse(int status, Response response){
        assertThat(((RestAssuredResponseImpl) response).getStatusCode()).isEqualTo(status);
        return this;
    }

    @Step("Check parameter {expectedValue} is equal to {actualValue}")
    public ServicesUserSteps checkParamInResponseBody(Object expectedValue, Object actualValue){
        assertThat(expectedValue).isEqualTo(actualValue);
        return this;
    }

    @Step("Get User by userName {userName}")
    public User getUserByUserName(String userName){
        Response response = getUser(userName);
        checkStatusResponse(200, response);
        return response.as(User.class);
    }

    @Step("Create user by user {user}")
    public ServicesUserSteps createUserSuccessfully(User user) {
        Response response = postUser(user);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Create user by user {user}")
    public ServicesUserSteps createUserByStaticData() {
        User user = TestUtils.userData();
        Response response = postUser(user);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Update User with Name {user.name}")
    public ServicesUserSteps updateUserSuccessfully(String userName) {
        User user1 =TestUtils.generateSimpleTemplateUser();
        User user2 = getUserByUserName(userName);
        user2.setFirstName(TestUtils.getRandomWord());
        Response response = putUser(user1,userName);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Delete User with Name {user.name}")
    public ServicesUserSteps deleteUserSuccessfully(String userName) {
        Response response = deleteUser(userName);
        checkStatusResponse(200, response);
        return this;
    }

}
