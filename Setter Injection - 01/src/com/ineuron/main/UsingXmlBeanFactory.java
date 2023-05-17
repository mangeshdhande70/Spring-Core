package com.ineuron.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ineuron.service.WishMessageGenerator;

public class UsingXmlBeanFactory {
	
	public static void main(String[] args) throws IOException {
		
		FileSystemResource fileSystemResource = new FileSystemResource("src/com/ineuron/config/applicationContext.xml");
		
		System.out.println("***********ApplicationContext container starting************");
		
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(fileSystemResource);

		
		System.out.println("No of beans is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id  is :: " + Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.out.println("\n***********ApplicationContext container started*************");

		System.in.read();

		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hashcode value of wmg is :: " + wmg.hashCode());
		System.out.println(wmg);
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");

		WishMessageGenerator wmg1 = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode value of wmg1 is :: " + wmg1.hashCode());
		System.out.println(wmg1);
		String result1 = wmg1.generateMessage("kohli");
		System.out.println(result1);

		System.out.println();
	
		
	}

}
