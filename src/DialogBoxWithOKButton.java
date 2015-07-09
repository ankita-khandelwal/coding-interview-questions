public class DialogBoxWithOKButton extends DialogBox{
	
	Button.ClickListener okButtonClickListener; // should provide functions here of what we want to do when user presses OK button
	
	public DialogBoxWithOKButton(String message, String title)
	{
		button.setClickHandler(okButtonClickListener);
		topLabelBar.setText(title);
		button.setText("OK");
		messageBoxTextArea.setText(message);
		
	}

}
