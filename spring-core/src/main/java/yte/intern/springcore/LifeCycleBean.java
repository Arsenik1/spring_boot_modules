package yte.intern.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean
{
    public void print()
    {
        System.out.println("Printteyim");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Ben postConstruct");
    }

    LifeCycleBean()
    {
        System.out.println("Constructordayim");
    }

    @PreDestroy
    public void parcala()
    {
        System.out.println("PARCALANIYORUM");
    }
}
