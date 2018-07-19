import java.awt.CardLayout;

import javax.swing.JPanel;

public class ScreenManager extends JPanel {

	private static final long serialVersionUID = 1L;

	public ScreenManager() {
		setLayout(new CardLayout());
	}
	
	public void addScreen(Screen screen, String screenName) {
		add(screen, screenName);
	}
	
}