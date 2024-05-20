# Example Maven project for Jaylib

You can import this project into IntelliJ or Eclipse.

## Use it to run the included examples in IntelliJ

Right-click on the example and select `run`.

## Use it to run the included examples from the command line

    mvn compile exec:java -Dmain.class="examples.HeightMap"
    mvn compile exec:java -Dmain.class="examples.CubicMap"

## Use it as the basis of your own game.

Edit `Main.java` with your own code.  (You can delete the examples.)  Then

To run:

    mvn compile exec:java

To build an uberjar you can distribute:

    mvn package

To run your uberjar (requires user has Java installed):

    java -jar target/jaylib-maven-example-project-1.0-SNAPSHOT.jar

## Native image

You will need to download [Graal](https://www.graalvm.org/downloads/) and extract the archive.  Set an env variable
with the location, e.g.

    export GRAALVM_HOME=/home/richard/Downloads/graalvm-jdk-22+36.1/

Then to build a native image you can distribute that doesn't require Java to run:

    mvn clean -Pnative package

If you have any game resouces (images, sounds) that you store *inside* your jar file then
you will need to edit src/main/resources/META-INF/native-image/reflect-config.json
to let native-image find them.





