FROM openjdk:17
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d ./out src/org/example/sample/Main.java
CMD java -classpath ./out org.example.sample.Main