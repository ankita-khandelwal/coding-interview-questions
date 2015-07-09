public class HelpDialogBox extends DialogBox{

	ClickListener closeButtonClickListener; // should provide definition here of what should happen when user clicks on close button.
	
	public HelpDialogBox(String helpMessage)
	{
		button.setClickHandler(Button.ClickListener.closeButtonClickListener);
		topLabelBar.setText("Help");
		button.setText("Close");
		messageBoxTextArea.setText(helpMessage);
		
		
		//set the position of all the items relative to horizontalPanel.
	
		
		
		
	}

	private class ClickListener {
	}
}
