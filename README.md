# java-api-library
This repository is a collection of examples or simple projects in using the built-in Java api library.

### 👋 Hello 👋
If you found this work to be helpful and would like support me, please consider buying a [☕ ko-fi](https://ko-fi.com/yuelchen) :)

---
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
A java utility for an unordered collection of objects - data type. 
