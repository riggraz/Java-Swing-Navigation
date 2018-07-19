# Java Swing Navigation
## An easy to use library to navigate between JPanels in Swing.

## How does it work?
You just need to use two classes: ScreenManager and Screen.
First create a ScreenManager instance and then attach Screens to it:

  	screenManager = new ScreenManager();
		
	screenManager.addScreen(new HomeScreen(), HOMESCREEN);
	screenManager.addScreen(new AboutScreen(), ABOUTSCREEN);

where HomeScreen and AboutScreen are classes that extends the Screen class. Inside Screen classes you can call the method ```navigateTo(String screenName)``` which is used to navigate to the specified screen.

[Click here](#) for a complete example.

## Where can I get it?
[Click here](#) to download the JAR file.

## Who is the author?
Riccardo Graziosi.
