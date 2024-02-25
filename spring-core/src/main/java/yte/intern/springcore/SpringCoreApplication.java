package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

		//ComponentTest componentTest = context.getBean(ComponentTest.class);
		//DependencyInjectionTest dependancyTest = context.getBean(DependencyInjectionTest.class);
		//dependancyTest.print();
		//LifeCycleBean cycleBean = context.getBean(LifeCycleBean.class);
		//cycleBean.print();
		BeanTest newBean = context.getBean(BeanTest.class);
		ComponentTest newComponent = context.getBean(ComponentTest.class);
		InjectionTest newInjection = context.getBean(InjectionTest.class);
		newInjection.print();
	}

}