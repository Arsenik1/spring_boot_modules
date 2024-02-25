package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {

    @Autowired
    private FieldInjectionBean fieldBean;

    private SetterInjectionBean setterBean;
    @Autowired
    public void setSetterBean(SetterInjectionBean injectionBean)
    {
        this.setterBean = injectionBean;
    }

    private ConstructorInjectionBean constructorBean;
    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean injectionBean)
    {
        this.constructorBean = injectionBean;
    }

    public void print()
    {
        fieldBean.print();
        setterBean.print();
        constructorBean.print();
    }
}
