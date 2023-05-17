package in.ineuron.Main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessage;

public class ConstructorInjection {
	
	
  public static void main(String[] args) {
	
	  
	  
	   @SuppressWarnings("resource")
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   
	   
	   
	   System.out.println("No of beans is :: " + context.getBeanDefinitionCount());
	   System.out.println("Bean id  is :: " + Arrays.toString(context.getBeanDefinitionNames()));
	   
	   WishMessage bean = context.getBean("wmg" , WishMessage.class);
	   System.out.println("Hash Code of bean ::=> "+bean.hashCode());
	   
	   bean.generateMessage();
	   
	   
	   System.out.println("\n\n***************** Second Time GetBean ********************");
	   /**
	    Same Bean reference will given to the bean1 bcz by-default IOC container is Singleton and the Bean
	    is given from internal cache.
	    */
	   
       WishMessage bean1 = context.getBean("wmg" , WishMessage.class);
       System.out.println("Hash Code of bean1 ::=> "+bean1.hashCode());
	   
	   bean1.generateMessage();
	  
	  
	  
	  
}

}
