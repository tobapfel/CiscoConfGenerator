package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CiscoConfGeneratorController {

	@FXML
	private Button BTNvlanchange;

	@FXML
	private Button BTNgenerate;

	@FXML
	private TextField TBenable;

	@FXML
	private TextField TBdomain;

	@FXML
	private TextField VLANip;

	@FXML
	private Button BTNbrowse;

	@FXML
	private RadioButton BTNnein;

	@FXML
	private TextField TBvlanname;

	@FXML
	private TextField TBpassword;

	@FXML
	private TextField TBsshpassword;

	@FXML
	private TableColumn<?, ?> COLid;

	@FXML
	private ToggleGroup toggleencrypt;

	@FXML
	private TextField TBvty;

	@FXML
	private TableColumn<?, ?> COLip;

	@FXML
	private Button BTNdelete;

	@FXML
	private TextField TBvlanid;

	@FXML
	private Button BTNvlanadd;

	@FXML
	private TextField TBHostname;

	@FXML
	private RadioButton BNTja;

	@FXML
	private TextField TBsshuser;

	@FXML
	private TableColumn<?, ?> COLname;

	@FXML
	private TextField TBpath;

	@FXML
	private TableView<?> TableView;

	@FXML
	void actionja(ActionEvent event) {

	}

	@FXML
	void actionnein(ActionEvent event) {

	}

	@FXML
	void vlanadd(ActionEvent event) {

	}

	@FXML
	void deleteList(ActionEvent event) {

	}

	@FXML
	void vlanchange(ActionEvent event) {

	}

	@FXML
	void generate(ActionEvent event) {

	}

}
