
public class DialogBoxWithSaveAndCancelButtons extends DialogBox{
	
	Button cancelButton = new Button();
	ClickListener cancelButtonClickListener; // provide defintition here of what should happen when user clicks on cancel button.
	ClickListener saveButtonClickListener; // provide defintion here of what should happen when user clicks on save button
	
	public DialogBoxWithSaveAndCancelButtons(String title, String message)
	{
		
		cancelButton.setText("Cancel");
		button.setClickHandler(saveButtonClickListener);
		cancelButton.setClickHandler(cancelButtonClickListener); // this gets called when user clicks cancel buttons.
		super.horizontalPanel.insertWidget(cancelButton, button);
		topLabelBar.setText(title);
		button.setText("Save");
		messageBoxTextArea.setText(message);
		
	}
	
	
}
