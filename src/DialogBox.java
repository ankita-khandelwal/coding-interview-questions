
public class DialogBox extends Widget{

	 HorizontalPanel  horizontalPanel = new HorizontalPanel();
	 Button button = new Button();
	 Label topLabelBar = new Label();
	 TextArea messageBoxTextArea = new TextArea();
	
	
	public DialogBox()
	{
		
		//Set the position of all the items.
		
		//Add all the items to the widget.
		
		messageBoxTextArea.setEditable(false);
		
		horizontalPanel.insertWidget(button, null);
		horizontalPanel.insertWidget(messageBoxTextArea,button);
		
		horizontalPanel.insertWidget(topLabelBar, messageBoxTextArea);
		
		
		
		
		
	}
	
	
}
