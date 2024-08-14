package som.rakesh.SpringCore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
	
	}
}
