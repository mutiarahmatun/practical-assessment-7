package test;

import org.kohsuke.randname.RandomNameGenerator;
import test.data.User;

import java.util.Random;

public class TestUtils {
    public static final RandomNameGenerator RND = new RandomNameGenerator();

    public static String getRandomWord(){
        return RND.next();
    }

    public static String getRandomPath(){ return "/" + getRandomWord();}

    public static Integer getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }

    public static User generateSimpleTemplateUser(){
        return User.builder()
                .id(Integer.toString(TestUtils.getRandomNumber()))
                .username(TestUtils.getRandomWord())
                .firstName(TestUtils.getRandomWord())
                .lastName(TestUtils.getRandomWord())
                .email(TestUtils.getRandomWord())
                .password(TestUtils.getRandomWord())
                .build();
    }

    public static User userData() {
        return User.builder()
                .id(Integer.toString(TestUtils.getRandomNumber()))
                .username("mutiarahmatun")
                .firstName("Mutia Rahmatun")
                .lastName("Husna")
                .email("mutia.husnarahmatun@gmail.com")
                .password(TestUtils.getRandomWord())
                .build();
    }

    public static final String NO_URLS_PET = "{\n" +
            "    \"id\": 11111,\n" +
            "    \"status\": \"available\"\n" +
            "    \"category\": {\n" +
            "        \"id\": -236061256,\n" +
            "        \"name\": \"spatial_hammer\"\n" +
            "    },\n" +
            "    \"name\": \"philosophical_eagle\",\n" +
            "}";

    public static final String INCORRERECT_ID_PET = "{\n" +
            "    \"id\": qqqqqq,\n" +
            "    \"category\": {\n" +
            "        \"id\": -236061256,\n" +
            "        \"name\": \"spatial_hammer\"\n" +
            "    },\n" +
            "    \"name\": \"philosophical_eagle\",\n" +
            "    \"photoUrls\": [\n" +
            "        \"qwerty\",\n" +
            "        \"asdfg\"\n" +
            "    ],\n" +
            "    \"tags\": [\n" +
            "        {\n" +
            "            \"id\": 831590553,\n" +
            "            \"name\": \"written_mask\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"status\": \"available\"\n" +
            "}";

    public static final String INCORRECT_CATEGORY_TAG_PET = "{\n" +
            "    \"id\": 1234567,\n" +
            "    \"category\": {\n" +
            "        \"id\": qqyyy,\n" +
            "        \"name\": \"spatial_hammer\"\n" +
            "    },\n" +
            "    \"name\": \"philosophical_eagle\",\n" +
            "    \"photoUrls\": [\n" +
            "        \"qwerty\",\n" +
            "        \"asdfg\"\n" +
            "    ],\n" +
            "    \"tags\": [\n" +
            "        {\n" +
            "            \"id\": uuuuu,\n" +
            "            \"name\": \"written_mask\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"status\": \"available\"\n" +
            "}";

    public static final String INCORRECT_TAGS_TYPE_PET =
            "{\"id\":311453208," +
                    "\"name\":\"philosophical_eagle\"," +
                    "\"photoUrls\":[\"qwerty\",\"asdfg\"]," +
                    "\"tags\":{\"id\":831590553,\"name\":\"written_mask\"}," +
                    "\"status\":\"available\"}";

    public static final String USER_TEMP = "{\"id\": \"1267291\",\"username\": \"mutiarahmatun\",\"firstName\": \"Mutia Rahmatun\",\"lastName\": \"Husna\",\"email\": \"mutia.rahmatun@gmail.com\",\"password\": \"mutia1234\",\"phone\": \"1234567890\",\"userStatus\": \"active\"}";

}
