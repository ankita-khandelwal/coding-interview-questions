public class DialogBoxWithCloseButton extends DialogBox{
	
	 Button.ClickListener closeButtonClickListener;
	
	public DialogBoxWithCloseButton(String message, String title)
	{
		button.setClickHandler(closeButtonClickListener); // this listener will get the call back when user clicks on close button.
		
		topLabelBar.setText(title);
		button.setText("Close");
		messageBoxTextArea.setText(message);
		
	}

}
