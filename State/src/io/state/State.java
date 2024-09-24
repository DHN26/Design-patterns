package io.state;

public interface State {
	void changeSignal(Context c);
	String getState();
}
