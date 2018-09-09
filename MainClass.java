import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainClass extends Application {
  Button button;
  public static void main(String[] args) {
  launch(args);
}

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Window-1");
    button=new Button("Click");
    StackPane layout=new StackPane();
    layout.getChildren().add(button);

    Scene scene=new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
