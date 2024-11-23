package base;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;

public interface BasePage {

    default void logPageAccess(String pageName){
        System.out.println("Access class using BasePage");
    }
    //public <T > T  doClick();
}
