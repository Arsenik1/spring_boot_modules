package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {
    private BeanTest myBean;
    private ComponentTest myComponent;

    @Autowired
    InjectionTest(BeanTest beanTest, ComponentTest componentTest)
    {
        myBean = beanTest;
        myComponent = componentTest;
    }

    public void print()
    {
        System.out.println("Bean: " + myBean + " Component: " + myComponent);
    }
}
