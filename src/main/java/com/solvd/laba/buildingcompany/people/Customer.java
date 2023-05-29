package com.solvd.laba.buildingcompany.people;
import com.solvd.laba.buildingcompany.exceptions.NameException;
import com.solvd.laba.buildingcompany.manage.Building;
import com.solvd.laba.buildingcompany.manage.ILogin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer implements ILogin {
    private final static Logger LOGGER = LogManager.getLogger(Customer.class);
    private String fullName;

    public Customer(String fullName, int age){
        if(fullName.length() > 0 && fullName.length() <= 30) {
            this.fullName = fullName;
        } else {
            throw new NameException("Name is incorrect length.");
        }
        LOGGER.debug("New customer created");
    }
    public final void login() {LOGGER.info("Customer logged into account");}
}


