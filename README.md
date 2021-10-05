# java-api-library
A repository for storing solutions to Java practice problems, using Java API library and other exploratory projects. 

## Getting Started
1. Install [Java](https://java.com/en/download/help/download_options.xml) on your computer. 
2. Choose an [Integrated Development Environment (IDE)](https://en.wikipedia.org/wiki/Integrated_development_environment) - *pick and choose your own or one of the options below*:
    - [Eclipse](https://www.eclipse.org/downloads/) - *FYI, repository projects will be created with Eclipse IDE*.
    - [Intellij IDEA](https://www.jetbrains.com/help/idea/installation-guide.html).
3. Start IDE and designate your workspace location or import this repository project. 

## About Java 
Source: Head First Java by Bert Bates and Kathy Sierra
+ **The 5 W's and How of Java**
    - **What** is java? </br>
    Java is a friendly object-oriented programming language that was designed to be portable - follows the principle of write once and run anywhere. An [object-oriented programming](https://en.wikipedia.org/wiki/Object-oriented_programming) language - also known as OOP - referes to a language that uses the concept of objects to contain data for running through procedures. </br>
    
    - **When** was Java created? </br>
    Java was developed in the 1990's and offically release on January 23, 1996; it's first appearance however was a bit earlier, on May 23, 1995. </br>
    
    - **Who** developed Java? </br>
    Java was originally developed by a computer scientist from Canada, [James Gosling](https://en.wikipedia.org/wiki/James_Gosling) while at Sun Microsystems; often referred to as "Dr. Java" for his contributions to the Java Platform. Sun Microsystems was a company that mostly sold computers, computer components, software and information technology services. The company has since been acquired by [Oracle](https://en.wikipedia.org/wiki/Oracle_Corporation) for $7.4 Billion US; officially completed on Janurary 27, 2010. 
    
    - **Why** do developers program in Java? </br>
    Java is a popular programming languge used by many companies in the IT industry (or any industry that works with technology really - i.e. Mortgage company that develops software for internal use). One of the reasons why people continue to use Java as the programming lanugage of choice is because of it's simplicity, robust and reusability of code - this saves developers and businesses a lot of time and money. </br> 
    
    - **Where** can I learn how to program in Java? </br>
    You can learn Java through a number of online resources, I'll link some below: </br>
        - [CodeAcademy](https://www.codecademy.com/learn/learn-java)
        - [GeeksForGeeks](https://www.geeksforgeeks.org/java-how-to-start-learning-java/)
        - [Oracle (Docs)](https://docs.oracle.com/javase/tutorial/java/index.html)
        - [TutorialsPoint](tutorialspoint.com/java/index.htm)
        - [w3schools](https://www.w3schools.com/java/)
    
    - **How** does Java work? *Credit for image: Head First Java* </br>
    ![Head First Java](/Head%20First%20Java%20-%20How%20Java%20Works%20Image.png)
    
    *Tip(s) - Don't get discouraged if you get stuck, there are so many online forums and resources that more than likely, other developers have had and solved the issue you are seeing; a simple google search might be all you need to do. Get friendly with stackoverflow.com.*

---
## Java API Library
### Scanner
A java utility for obtaining input for primitive types and Strings; see below two projects for source examples:
- [GuessingGames](https://github.com/yuelchen/explore-java-api-library/tree/master/GuessingGames/src/com/yuelchen): a simple (number) guessing game where the user provides the system a range from which it can pick a random number. The user is then allowed to guess the random number the system generated and once correctly guessed, the system will return with the count of guesses made. 
- [IntroScanner](https://github.com/yuelchen/explore-java-api-library/tree/master/IntroScanner/src/com/yuelchen/main): a list of input prompts for retrieving String and primitive types (i.e. boolean, int, long and double) from within main method in the form of a survey and then returns summary at the end. 

### Properties
A java utility for loading, adding, removing and storing configuration properties. 
This allows configuration properties to be driven through an external file rather than hard coded values - leading to release changes being configuration dependent rather than code dependent. 
- [IntroProperties](https://github.com/yuelchen/explore-java-api-library/tree/master/IntroProperties/src/com/yuelchen/main): a list of Properties operations such as loading properties file, adding property, removing property (if it exists) and storing properties to a file. 

### Patterns
A java utility for matching values against a given pattern (i.e. Regex expression). 
- [IntroPatterns](https://github.com/yuelchen/java-api-library/tree/master/IntroPatterns/src/com/yuelchen/main): examples for using regex expression to match against an array of String values. 

### Runnable
A java utility for multi-threading when you do not require a response and simply hava a list of tasks or actions that is needed to be performed.  
- [IntroRunnable](https://github.com/yuelchen/java-api-library/tree/master/IntroRunnable/src/com/yuelchen/main): example for creating runnable class to perform some operation and how to execute a runnable object.The operation is to print a given name, x number of times (43 by default) and have callable print the response. 

### Callable
A java utility for callable class when you do care about the worker completion and want a response once tasks or actions that is needed to be performed are complete. 
- [IntroCallable](https://github.com/yuelchen/java-api-library/tree/master/IntroCallable/src/com/yuelchen/main): example for creating callable class to perform some operation and how to execute / retrieve response for callable object. The operation is to print a given name, x number of times (43 by default) and have callable return the response. 

### ExecutorService
A java utility for ExecutorService class to schedule and execute concurrent methods (threads). 
- [IntroExecutorService](https://github.com/yuelchen/java-api-library/tree/master/IntroExecutorService/src/com/yuelchen): example for assigning  runnable / callable objects for execution. The example uses random number generator to either return a result that can be retrieved once worker finishes running (callable) or simply executes steps and prints out result (runnable). 

### List 
A java utility for an unordered collection of objects - data structure. 
- [IntroListTypes](https://github.com/yuelchen/java-api-library/tree/master/IntroListTypes/src/com/yuelchen/main): examples for different List implementations for managing objects. The examples all does essentially the same thing with a different approach logic-wise. 
   - ArrayList
   - LinkedList
   - Stack
   - Vector
   - CopyOnWriteArrayList

