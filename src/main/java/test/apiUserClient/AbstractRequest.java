package test.apiUserClient;

import io.restassured.response.Response;

public interface AbstractRequest {
    Response getUser(String username);
    Response postUserWithList(Object object);
    Response putUser(Object object, String username);
    Response deleteUser(String username);
    Response getUserLogin(Object object);
    Response getUserLogout(Object object);
    Response postUserWithArray(Object object);
    Response postUser(Object object);
}
