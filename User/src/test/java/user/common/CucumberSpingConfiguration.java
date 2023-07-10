package user.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import user.UserApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserApplication.class })
public class CucumberSpingConfiguration {}
