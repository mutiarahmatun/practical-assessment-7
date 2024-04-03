package test.apiUserClient;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class UserBaseApiClient implements AbstractRequest {
    @Override
    public Response getUser(String username) {
        return given().log().all().contentType(JSON).when().log().all().get(username);
    }

    @Override
    public Response deleteUser(String username) {
        return given().log().all().contentType(JSON).when().log().all().delete(username);
    }

    @Override
    public Response getUserLogin(Object user) {
        return given().log().all().contentType(JSON).when().log().all().body(user).get();
    }

    @Override
    public Response getUserLogout(Object user) {
        return given().log().all().contentType(JSON).when().log().all().body(user).get();
    }

    @Override
    public Response postUser(Object user) {
        return given().log().all().contentType(JSON).when().log().all().body(user).post();
    }

    public Response postUserData(String user) {
        return given().log().all().contentType(JSON).when().log().all().body(user).post();
    }

    @Override
    public Response postUserWithArray(Object userArray) {
        return given().log().all().contentType(JSON).when().log().all().body(userArray).post();
    }

    @Override
    public Response postUserWithList(Object userList) {
        return given().log().all().contentType(JSON).when().log().all().body(userList).post();
    }

    @Override
    public Response putUser(Object user, String username) {
        return given().log().all().contentType(JSON).when().log().all().body(user).put(username);
    }
}
