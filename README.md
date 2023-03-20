# springbootmockito
JUnit- Java Unit Testing
JUnit Framework- Mockito Framework
What is JUnit?
JUnit is a unit testing open-source framework for the Java programming language. 
Java Developers use this framework to write and execute automated tests. In Java, 
there are test cases that have to be re-executed every time a new code is added.

JUnit- Java Framework for write test cases to test functionality/methods

Why JUnit Test Cases:

1. To find bugs early in the development phase, which increases the code’s reliability
2. The framework enables the developer to invest more time in reading the code than writing it JUnitFramework
3. This makes the code more readable, reliable, and bug-free
4. It boosts the confidence of the developer and motivates them immensely

Mocking-
Mocking is a process of developing the objects that act as the mock or clone of the real objects. 
In other words, mocking is a testing technique where mock objects are used instead of real objects 
for testing purposes. Mock objects provide a dummy output for a dummy input passed to it.

Mockito Framework-
Mockito is a Java-based mocking framework used for unit testing of Java application. Mockito plays 
a crucial role in developing testable applications.

Mockito Setup-
<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
		<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-core</artifactId>
    <version>2.0.0-RC.4</version>
    <scope>test</scope>
    </dependency>
<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-module-junit4</artifactId>
    <version>2.0.0-beta.5</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-api-mockito2</artifactId>
    <version>2.0.0-beta.5</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>cglib</groupId>
    <artifactId>cglib</artifactId>
    <version>3.2.9</version>
</dependency>
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-inline</artifactId>
    <version>2.15.0</version>
</dependency>

@SpringBootTest- This is Test class

@RunWith- A JUnit Runner is class that extends JUnit's abstract Runner class. Runners are used for
 running test classes. The Runner that should be used to run a test can be set using the @RunWith annotation.

when() method-
It enables stubbing methods. It should be used when we want to mock to return specific values when
 particular methods are called. In simple terms, "When the getAllData() method is called, then return
 actual values." It is mostly used when there is some condition to execute.

verify() method-
The verify() method is used to check whether some specified methods are called or not. In simple terms,
 it validates the certain behavior that happened once in a test.

times() method-
It is used to verify the exact number of method invocations, which means it declares how many times a 
method is invoked.

Static importing packages-

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
 
