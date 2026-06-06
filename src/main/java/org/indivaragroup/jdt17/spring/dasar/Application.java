package org.indivaragroup.jdt17.spring.dasar;

import org.indivaragroup.jdt17.spring.dasar.configuration.*;
import org.indivaragroup.jdt17.spring.dasar.connection.ConnectionLifeCycleBean;
import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.indivaragroup.jdt17.spring.dasar.dto.HelloWorld;
import org.indivaragroup.jdt17.spring.dasar.dto.PaymentGatewayClient;
import org.indivaragroup.jdt17.spring.dasar.dto.WorldDTO;
import org.indivaragroup.jdt17.spring.dasar.exam.configuration.DistributionConfiguration;
import org.indivaragroup.jdt17.spring.dasar.exam.configuration.SalesConfiguration;
import org.indivaragroup.jdt17.spring.dasar.exam.configuration.StorageConfiguration;
import org.indivaragroup.jdt17.spring.dasar.exam.service.DistibutionService;
import org.indivaragroup.jdt17.spring.dasar.server.BeanServer;
import org.indivaragroup.jdt17.spring.dasar.service.MerchantService;
import org.indivaragroup.jdt17.spring.dasar.service.impl.MerchantServiceImpl;
import org.indivaragroup.jdt17.spring.dasar.service.impl.MyComponentImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
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


//		var storageContext = new AnnotationConfigApplicationContext(
//				DistributionConfiguration.class,
//				SalesConfiguration.class,
//				StorageConfiguration.class
//		);
//
//		DistibutionService distributionService = storageContext.getBean(DistibutionService.class);
//
//		distributionService.printDistribution();
//
//		storageContext.close();
//
//		// Lazy Bean
//
//		var lazyBeanContext = new AnnotationConfigApplicationContext(
//				LazyConfiguration.class
//		);
//
////		System.out.println(lazyBeanContext.getBean("hello"));
////		System.out.println(lazyBeanContext.getBean("world"));
//
//		// Scope Prototype -> membuat objek baru setiap dipanggil
//
//		lazyBeanContext.close();
//
//
//		var	prototypeContext = new AnnotationConfigApplicationContext(
//			PrototypeConfiguration.class
//		);
//
//		System.out.println(prototypeContext.getBean("world4"));
//		System.out.println(prototypeContext.getBean("world4"));
//		System.out.println(prototypeContext.getBean("world4"));
//
//
//		prototypeContext.close();
//
//
//		// Doubleton
//
//		var doubletonContext = new AnnotationConfigApplicationContext(
//				DoubletonConfiguration.class
//		);
//
//		WorldDTO world1 = doubletonContext.getBean(WorldDTO.class);
//		WorldDTO world2 = doubletonContext.getBean(WorldDTO.class);
//		WorldDTO world3 = doubletonContext.getBean(WorldDTO.class);
//
//		System.out.println(world1 == world2);
//		System.out.println(world1 == world3);
//
//		doubletonContext.close();
//
//
//		// life cycle bean
//		var lifeCycleBeanContext = new AnnotationConfigApplicationContext(
//				LifeCycleConfiguration.class
//		);
//
//		ConnectionLifeCycleBean connectionLifeCycleBean = lifeCycleBeanContext.getBean(ConnectionLifeCycleBean.class);
//		System.out.println(connectionLifeCycleBean);
//
//		lifeCycleBeanContext.close();
//
//
//		// life cycle annotation bean
//
//		var lifeCycleAnnotationBeanContext = new AnnotationConfigApplicationContext(
//				LifeCycleAnnotationConfiguration.class
//		);
//
//		BeanServer serverBean = lifeCycleAnnotationBeanContext.getBean(BeanServer.class);
//		System.out.println(serverBean);
//
//		lifeCycleAnnotationBeanContext.close();
//
//
//		// Import Annotation
//
//		var importAnnotaionContext = new AnnotationConfigApplicationContext(ImportConfiguration.class);
//
//		HelloDTO hello7 = importAnnotaionContext.getBean(HelloDTO.class);
//		WorldDTO world8 = importAnnotaionContext.getBean(WorldDTO.class);
//
//		System.out.println(hello7);
//		System.out.println(world8);
//
//		importAnnotaionContext.close();


		// Constructor Based DI

//		var constructorBasedDIContext = new AnnotationConfigApplicationContext(
//				ComponentConfiguration.class
//		);
//
//        HelloWorld helloWorld = constructorBasedDIContext.getBean(HelloWorld.class);
//
//		System.out.println(helloWorld.getHello().getClass().getName());
//		System.out.println(helloWorld.getWorld());
//
//		helloWorld.doSomething();
//
//
//		constructorBasedDIContext.close();

//		var factoryBeanContext = new AnnotationConfigApplicationContext(
//				FactoryBeanConfiguration.class
//		);
//
//		PaymentGatewayClient client = factoryBeanContext.getBean(
//				PaymentGatewayClient.class
//		);
//		System.out.println(client);
//
//		factoryBeanContext.close();

//		var inheritanceContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
//
//		// Bisa diakses lewat interface
//		MerchantService service = inheritanceContext.getBean(MerchantService.class);
//		System.out.println(service.getName());
//
//		// Atau lewat implementasinya langsung
//		MerchantServiceImpl impl = inheritanceContext.getBean(MerchantServiceImpl.class);
//		System.out.println(impl.getName());
//
//		inheritanceContext.close();

		var awareContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

		MyComponentImpl component = awareContext.getBean(MyComponentImpl.class);
		component.doSomething();

		awareContext.close();


		SpringApplication.run(Application.class, args);


	}

}
