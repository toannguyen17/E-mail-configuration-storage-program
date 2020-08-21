package emailprogram.service;

import emailprogram.model.Email;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceEmail implements Service<Email> {
    private static Email config;

    public ServiceEmail(){
    }

    public Email getConfig(){
        return config;
    }

    @Override
    public void insert(Email element) {
        config = element;
    }

    @Override
    public void update(Email element) {
        config = element;
    }
}
