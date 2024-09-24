package abstractFactoryDesign;

public class DarkThemeFactory implements GUIInterface{

	@Override
	public Button createButton() {
		return new DarkButton();
	}

	@Override
	public Textarea createTextarea() {
		return new DarkTextarea();
	}

}
