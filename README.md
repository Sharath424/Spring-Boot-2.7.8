# Spring Boot 2.7.8 

![Spring boot :2.8](/images/spring-boot.png)
## Spring History

![Spring boot :2.8](/images/rod-johnson.png)

It was developed by Rod Johnson in 2003.

The first version was written by Rod Johnson, who released the framework with the publication of his book Expert One-on-One J2EE Design and Development in October 2002. The framework was first released under the Apache 2.0 license in June 2003. The first production release, 1.0, was released in March 2004.[2] The Spring 1.2.6 framework won a Jolt productivity award and a JAX Innovation Award in 2006.[3][4] Spring 2.0 was released in October 2006, Spring 2.5 in November 2007, Spring 3.0 in December 2009, Spring 3.1 in December 2011, and Spring 3.2.5 in November 2013.[5] Spring Framework 4.0 was released in December 2013.[6] Notable improvements in Spring 4.0 included support for Java SE (Standard Edition) 8, Groovy 2, some aspects of Java EE 7, and WebSocket.

![Spring boot :2.8](/images/spring-history.png)

## What is Spring
* Spring is a complete and a modular framework for developing enterprise application in java
* Spring framework can be user for all layer implementation for a real time appllication
* Spring can be used for the development of particular layer of a real time application.

**what is spring Framework ?**

Java Framework is a platform of pre-written codes used by java developers to develop the application(java or web application)

Java Framework Principle abides the hollywood principle that is **Don't call us ,we'll call you**.Also called inversion of flow or inverstion of Control

![Spring  :java-Framework-Principle](/images/Java-Framework-principle.png)   

" Let's take plain old java, here Class A has a dependency upon Class B and Class C to instantiate we use a new operator and  it will become tight coupling. To avoid the tight coupling we are injecting the object at run time and trying to make it loose coupling."

## why we will use Framework 

A framework will help us to reuse the code in the application field because it is well-tested code by 100-1000 developers and the community. That's why we always see if a framework is available if not we should write custom code.

**why Spring is popular ?**

* Simplicity - It is simple because as it in non-invasive.it uses POJO or POJI

* Testability - For developing and teting Spring Server(container) is not mandatory

* Loose Coupling - Spring objects are loosely coupled.It will inject the object at runtime in the IOC container or application context.

**Different Java Framework**

![Spring  :java-Framework](/images/Java-Framework.png)   

## Spring Features

* Lightweight: Spring Framework is lightweight with respect to size and transparency. 
* Inversion Of Control (IoC): In Spring Framework, loose coupling is achieved using Inversion of Control. The objects give their own dependencies instead of creating or looking for dependent objects.
* Aspect Oriented Programming (AOP): By separating application business logic from system services, Spring Framework supports Aspect Oriented Programming and enables cohesive development.
* Container: Spring Framework creates and manages the life cycle and configuration of application objects.
* MVC Framework: Spring Framework is a MVC web application framework. This framework is configurable via interfaces and accommodates multiple view technologies.
* Transaction Management: For transaction management, Spring framework provides a generic abstraction layer. It is not tied to J2EE environments and it can be used in container-less environments.
* JDBC Exception Handling: The JDBC abstraction layer of the Spring Framework offers an exception hierarchy, which simplifies the error handling strategy.

![Spring  :java-Framework](/images/Spring-features.png)  

**Spring Framework Ecosystem**

![Spring  :Ecosystem](/images/spring-eco.png)   

## Spring Architecture/Module

![Spring  :Architecture](/images/spring-architecture.png)

**Test** :

This layer provides support of testing the Code (unit testing etc).

**Spring Core Container** :
The Spring Core container contains core, beans, context and expression language (EL) modules. 

* Core and Beans: These modules provide IOC and Dependency Injection features.
* Context: This module supports internationalization  EJB, JMS, Basic Remoting.

* Expression Language:  It is an extension to the EL defined in JSP. It provides support to setting and getting property values, method invocation, accessing collections and indexers, named variables, logical and arithmetic operators, retrieval of objects by name etc.

**AOP, Aspects and Instrumentation** :
These modules support aspect oriented programming implementation where you can use Advices, Pointcuts etc. to decouple the code.

The aspects module provides support to integration with AspectJ.

The instrumentation module provides support to class instrumentation and classloader implementations.

**Data Access / Integration** :
This group comprises of JDBC, ORM, OXM, JMS and Transaction modules. These modules basically provide support to interact with the database.

**Web** : This group comprises of Web, Web-Servlet, Web-Struts and Web-Portlet. These modules provide support to create web application.

## Model View Controller
![Spring :MVC](/images/mvc.png)   

**Model** :- It contains the data of the application

**View**  :- view repesents the particular format (HTML,JSTL etc)

**Controller**  :- it cantains the business logic 

**Understanding the flow of the MVC** :- 

The controller gets the request from the user, and based on the request controller decides whether it should send a view or get some information from the model. If the information is needed from the model, it will send the request to the model and get the data from the model and send the data to the user through the view page.

## IOC Container

**IOC Container** :

The container gets its instructions on what objects to instantiate, configure, and assemble by reading the configuration metadata provided. The configuration metadata can be represented either by XML, Java annotations, or Java code. The following diagram represents a high-level view of how Spring works. The Spring IoC container makes use of Java POJO classes and configuration metadata to produce a fully configured and executable system or application.

![Spring :IOC-container](/images/ioc-container.png)  

IoC container is responsible to instantiate, configure and assemble the objects. The IoC container gets informations from the XML file and works accordingly

configured by loading the xml files or by detecting specific java annotations on configuration classes.

Two types of ioc continers:-

* Bean factory
* Application Context

1. BeanFactory Container
This is the simplest container providing the basic support for DI and is defined by the org.springframework.beans.factory.BeanFactory interface. The BeanFactory and related interfaces, such as BeanFactoryAware, InitializingBean, DisposableBean, are still present in Spring for the purpose of backward compatibility with a large number of third-party frameworks that integrate with Spring.

2. ApplicationContext Container
This container adds more enterprise-specific functionality such as the ability to resolve textual messages from a properties file and the ability to publish application events to interested event listeners. This container is defined by the org.springframework.context.ApplicationContext interface.

**IOC Features** :

* It creates the objects 
* configures and assembles their dependencies 
* manages their entire life cycle

![Spring :IOC-Features](/images/ioc-features.png)  

## Dependency Injection

Dependency injection is a fundamental aspect of the Spring framework, through which the Spring container **injects** objects into other objects or **dependencies**. Simply put, this allows for loose coupling of components and moves responsibility for managing components onto the container.

![Spring :Dependency-injection](/images/dependenc-injection.png)

**Types Of Dependency Injection**

1. **Constructor Based Dependency Injection**

Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on the other class.

We can inject the dependency by constructor. The <constructor-arg> subelement of <bean> is used for constructor injection. Here we are going to inject

* primitive and String-based values
* Dependent object (contained object)
* Collection values etc.

2. **Setter Based Dependency Injection**

Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument constructor or no-argument static factory method to instantiate your bean.

We can inject the dependency by setter method also. The <property> subelement of <bean> is used for setter injection. Here we are going to inject


* primitive and String-based values
* Dependent object (contained object)
* Collection values etc.

![Spring :types-of-dependency](/images/types-of-dependency.png)

## Bean

Beans are the objects that from the backbone of the Application and are managed by the Spring Iox container.
Spring Ioc Container instantiates,assembles and manages The bean Object
The Configuration metadata that are supplied to the container are used to create the beans object.

**bean life cycle**

![Spring :bean-life-cycle](/images/bean-life-cycle.png)

The life cycle of a Spring bean is easy to understand. When a bean is instantiated, it may be required to perform some initialization to get it into a usable state. Similarly, when the bean is no longer required and is removed from the container, some cleanup may be required.

To define setup and teardown for a bean, we simply declare the <bean> with initmethod and/or destroy-method parameters. The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation. Similarly, destroymethod specifies a method that is called just before a bean is removed from the container.

**Bean Dependency Injection**:-
It’s a design pattern which removes the dependency from the Programming code ,that makes the application easy to manage and test
Dependency injection makes our Programming code loosely coupled, which means change in implementation does not affect the user or invoking application

## Bean Scope

![Spring :dispatcher](/images/bean-scope.png)

| Sl.no    | scope    |
| :------- | :------- |
| 1        | singleton: This scopes the bean definition to a single instance per Spring IoC container (default).   |
| 2        | prototype: This scopes a single bean definition to have any number of object instances.               |
| 3        | request: This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring   ApplicationContext.  |
| 4        | session: This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.   |
| 5        | global-session: This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.   |

## Dispatcher Servlet

![Spring :dispatcher](/images/dispatcher.png)

**Servlet** : is an specification as part of jee ascepts . servlet are used to creating the dispatcher servlets.

In Spring MVC all incoming requests go through a single servlet is called Dispatcher Servlet (front controller). The front controller is a design pattern in web application development. A single servlet receives all the request and transfers them to all other components of the application.

The job of DispatcherServlet is to take an incoming URI and find the right combination of handlers (Controller classes) and views (usually JSPs). When the DispatcherServlet determines the view, it renders it as the response. Finally, the DispatcherServlet returns the Response Object to back to the client.

![Spring :dispatcher](/images/dispatcher-servlet.png)


# Spring Conditional Configuration 

# Bootstrapping Spring boot project

## What is spring boot?

Spring Boot makes it easy to create stand-alone, production-grade Spring based applications that you can "just run".

we take an opinionated view of the spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration

Spring Boot enables developers to focus on the business logic behind their microservice.It aims to take care of all the nitty-gritty technical details involved in developing microservices.

# Creating Web Project (Rest API)

# Unit Testing

# Adding Data JPA dependency

# Configuring applicatio
