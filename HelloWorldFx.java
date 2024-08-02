// Setup the Environment for running Java
// ######################################
// 
// Java Binaries:
// =============
// export PATH=/Users/xyz/Library/Java/JavaVirtualMachines/jdk-22.0.2.jdk/Contents/Home/bin:$PATH
// 
// 
// JavaFx libs:
// ===========
// export PATH=/Users/xyz/Library/Java/JavaVirtualMachines/javafx-sdk-22.0.2/lib:$PATH
// 
// 
// Compiling & Running
// ===================
// Native java applications can be compiled run using javac/java as normal.
// JavaFx applications need to be compiled and run using the commands as shown below:
// 
// 
// JavaFx compiling & running
// ==========================
// 
// $ javac --module-path "/Users/xyz/Library/Java/JavaVirtualMachines/javafx-sdk-22.0.2/lib" --add-modules javafx.controls,javafx.fxml helloworldfx/HelloWorldFx.java
// 
// $ java --module-path "/Users/xyz/Library/Java/JavaVirtualMachines/javafx-sdk-22.0.2/lib" --add-modules javafx.controls,javafx.fxml helloworldfx.HelloWorldFx
// 

package helloworldfx;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
