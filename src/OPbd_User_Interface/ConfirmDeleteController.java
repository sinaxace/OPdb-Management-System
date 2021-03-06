package OPbd_User_Interface;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import poojas.angels.FileManager;

/**
 * FXML Controller class
 *
 * @author SinaM
 */
public class ConfirmDeleteController implements Initializable {

    @FXML private Label lblIndex;
    @FXML private Button btnCancel, btnDelete;
    
    @FXML
    private void cancelAction(){
        Stage stage = (Stage) btnCancel.getScene().getWindow(); 
        stage.close();
    }
    /**
     * @method deleteAction in ConfirmDeleteController sets the fixed string of that record to null and changes indexes
     */
    @FXML
    private void deleteAction(ActionEvent event){
        FileManager.deleteRecord(Integer.parseInt(lblIndex.getText()));
        FileManager.resetIndex();
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void setIndex(String index) {
        lblIndex.setText(index);
    }
}
