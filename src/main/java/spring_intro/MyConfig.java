package spring_intro;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_intro")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        System.out.println("catBean");
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
