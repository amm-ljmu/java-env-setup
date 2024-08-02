Setup the Environment for running Java
######################################

Java Binaries:
=============
export PATH=/Users/xyz/Library/Java/JavaVirtualMachines/jdk-22.0.2.jdk/Contents/Home/bin:$PATH


JavaFx libs:
===========
export PATH=/Users/xyz/Library/Java/JavaVirtualMachines/javafx-sdk-22.0.2/lib:$PATH


Compiling & Running
===================
Native java applications can be compiled run using javac/java as normal.
JavaFx applications need to be compiled and run using the commands as shown below:


JavaFx compiling & running
==========================

$ javac --module-path "/Users/xyz/Library/Java/JavaVirtualMachines/javafx-sdk-22.0.2/lib" --add-modules javafx.controls,javafx.fxml helloworldfx/HelloWorldFx.java

$ java --module-path "/Users/xyz/Library/Java/JavaVirtualMachines/javafx-sdk-22.0.2/lib" --add-modules javafx.controls,javafx.fxml helloworldfx.HelloWorldFx






