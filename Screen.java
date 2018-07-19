import java.awt.CardLayout;

import javax.swing.JPanel;

public class Screen extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void navigateTo(String screenName) {
		CardLayout cl = (CardLayout) this.getParent().getLayout();
		cl.show(this.getParent(), screenName);
	}

}