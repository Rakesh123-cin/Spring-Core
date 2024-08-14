package cm.rakesh.SpringCore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cm/rakesh/SpringCore/SpEL/stereoconfig.xml");
		Demo d = context.getBean(Demo.class);
		System.out.println(d);
	}

}
