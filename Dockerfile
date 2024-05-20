FROM openjdk:11.0
COPY target/GFG-Calculator.jar GFG-Calculator.jar
CMD java -jar GFG-Calculator.jar