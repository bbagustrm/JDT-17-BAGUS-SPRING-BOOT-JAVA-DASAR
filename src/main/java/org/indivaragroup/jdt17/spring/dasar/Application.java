package org.indivaragroup.jdt17.spring.dasar;

import org.indivaragroup.jdt17.spring.dasar.configuration.*;
import org.indivaragroup.jdt17.spring.dasar.exam.configuration.DistributionConfiguration;
import org.indivaragroup.jdt17.spring.dasar.exam.configuration.SalesConfiguration;
import org.indivaragroup.jdt17.spring.dasar.exam.configuration.StorageConfiguration;
import org.indivaragroup.jdt17.spring.dasar.exam.service.DistibutionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//
//		var context = new AnnotationConfigApplicationContext(
//				JDTConfiguration.class
//		);
//
//		System.out.println(context.getBean("getInitialConfiguration"));
//
//		context.close();
//
//		// example singleton
//		var db1 = DatabaseConfiguration.getInstance();
//		var db2 = DatabaseConfiguration.getInstance();
//
//		System.out.println("database-1 = "+ db1);
//		System.out.println("database-2 = "+ db2);
//
//		// example getbean()
//		var contextBean = new AnnotationConfigApplicationContext(
//				BeanConfiguration.class
//		);
//		WorldDTO worldDTO = contextBean.getBean(WorldDTO.class);
//		System.out.println(worldDTO);
//
//		contextBean.close();
//
//		// example duplicate bean
//
//		var contextDuplicateBean = new AnnotationConfigApplicationContext(
//				DuplicateBeanConfiguration.class
//		);
//
//		HelloDTO hello1 = contextDuplicateBean.getBean("hello1", HelloDTO.class);
//		HelloDTO hello2 = contextDuplicateBean.getBean("hello2", HelloDTO.class);
//
//		System.out.println(hello1);
//		System.out.println(hello2);
//
//		contextDuplicateBean.close();
//
//		// example primary bean
//
//		var contextPrimaryBean = new AnnotationConfigApplicationContext(
//				PrimaryBeanConfiguration.class
//		);
//
//		WorldDTO world1 = contextPrimaryBean.getBean(WorldDTO.class);
//		WorldDTO world2 = contextPrimaryBean.getBean(WorldDTO.class);
//
//		System.out.println(world1);
//		System.out.println(world2);
//
//		contextPrimaryBean.close();
//
//
//		// example name bean
//
//		var contextNameBean = new AnnotationConfigApplicationContext(
//				BeanNameConfiguration.class
//		);
//
//		HelloDTO hello3 = contextNameBean.getBean("helloSatuBean",HelloDTO.class);
//		HelloDTO hello4 = contextNameBean.getBean("helloDuaBean",HelloDTO.class);
//
//		System.out.println(hello3);
//		System.out.println(hello4);
//
//		contextNameBean.close();
//
//
//		// tanpa Dependency Injection
//		HelloInjection helloInjection = new  HelloInjection();
//		WorldInjection worldInjection = new  WorldInjection();
//
//		HelloWorldInjection helloWorldInjection = new HelloWorldInjection(
//				helloInjection,
//				worldInjection
//		);
//
//
//
//		// pake Dependency Injection
//		var helloWorldWithInjectionContext = new AnnotationConfigApplicationContext(
//				HelloWorldWithInjection.class
//		);
//
//		HelloWorldWithInjection helloWorldWithInjection = helloWorldWithInjectionContext.getBean(HelloWorldWithInjection.class);
//		System.out.println(helloWorldWithInjection.helloInjection().name());
//		System.out.println(helloWorldWithInjection.worldInjection().name());
//
//
//		helloWorldWithInjectionContext.close();
//
//		// pake Depends On
//		var dependsOnBeanContext = new AnnotationConfigApplicationContext(
//				DependsOnConfiguration.class
//		);
//
//		System.out.println("Call the depends on : " + dependsOnBeanContext.getBean("foo"));
//		System.out.println("Call the depends on : " + dependsOnBeanContext.getBean("bar"));
//
//		dependsOnBeanContext.close();


		var storageContext = new AnnotationConfigApplicationContext(
				DistributionConfiguration.class,
				SalesConfiguration.class,
				StorageConfiguration.class
		);

		DistibutionService distributionService = storageContext.getBean(DistibutionService.class);

		distributionService.printDistribution();

		storageContext.close();

		SpringApplication.run(Application.class, args);
	}

}
