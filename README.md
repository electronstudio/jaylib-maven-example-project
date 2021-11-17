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
