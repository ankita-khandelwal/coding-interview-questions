class Button extends Widget {
	public void setText(String text){}
	public void getText(){}
	public void setClickHandler (ClickListener clickListener){}
	public void getClickHandler(){}

	public static class ClickListener {
		public static ClickListener closeButtonClickListener;
	}
}
