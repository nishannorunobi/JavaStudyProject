

# Compile and Run this project from terminal , Terminal location under JavaLearning project directory

In Unix and Linux environments
javac -cp "libs/*" -d bin $(find src -name "*.java")
java -cp "bin:libs/*" com.nishan.java.lambda_expression.LamdaTest

In windows environment
Compile
javac -d out -cp "libs/*" src\**\*.java
Run 
java -cp "bin;libs/*" com.nishan.java.lambda_expression.LamdaTest
