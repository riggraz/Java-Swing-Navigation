# Java Swing Navigation
## An easy to use library to navigate between JPanels in Swing.

## How does it work?
You just need to use two classes: ```ScreenManager``` and ```Screen```.
First create a ```ScreenManager``` instance and then attach ```Screen```s to it:

  	screenManager = new ScreenManager();
		
	screenManager.addScreen(new HomeScreen(), "HOMESCREEN");
	screenManager.addScreen(new AboutScreen(), "ABOUTSCREEN");

where ```HomeScreen``` and ```AboutScreen``` are classes that extends the ```Screen``` class:

	class HomeScreen extends Screen {
		JButton aboutBtn;
	
		public HomeScreen() {
			add(new JLabel("Welcome!"));
			aboutBtn = new JButton("Go to about screen");
			aboutBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					navigateTo("ABOUTSCREEN");
				}
			}
		}
	}

As you can see in the example above, inside ```Screen``` classes you can call the method ```navigateTo(String screenName)``` which is used to navigate to the specified screen.

[Click here](#) for a complete example.

## Where can I get it?
[Click here](https://github.com/riggraz/Java-Swing-Navigation/releases/) to download the JAR file.

## Who is the author?
Riccardo Graziosi.
