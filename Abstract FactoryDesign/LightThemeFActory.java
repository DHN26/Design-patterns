package abstractFactoryDesign;

public class LightThemeFActory implements GUIInterface{

	@Override
	public Button createButton() {
		return new LightButton();
	}

	@Override
	public Textarea createTextarea() {
		return new LightTextarea();
	}

}
