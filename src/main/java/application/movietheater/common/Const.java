package application.movietheater.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Const {

    public  static String LOCAL_MAIL_LINK = "http://localhost:8080/api/v1/user/confirm?token=";

    public static String REGEX_PATTERN = "^(.+)@(\\S+)$";

    public static int PAGE_SIZE = 20;

    //region Database
    public static String DB_USERNAME;
    public static String DB_PASSWORD;

    @Value("$spring.datasource.username")
    public void setDbUsername(String dbUsername) {
        DB_USERNAME = dbUsername;
    }
    @Value("${spring.datasource.password}")
    public void setDbPassword(String dbPassword) {
        DB_PASSWORD = dbPassword;
    }
    //endregion


    //region Mail

    //endregion
}
