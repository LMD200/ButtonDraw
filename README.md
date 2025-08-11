ButtonDraw is a Java Swing application that demonstrates interactive shape manipulation and object-oriented design patterns. The project allows users to move colored ellipses around a panel using directional buttons, select shapes with mouse clicks, and quit the application with a dedicated button.

## Features

- **Interactive Shape Movement**: Move selected ellipses up, down, left, or right using buttons.
- **Multiple Selectable Shapes**: Click to select which ellipse to move.
- **Smart Shape Design**: Shapes are implemented using containment and delegation, encapsulating color, size, and movement logic.
- **Clean Object-Oriented Structure**: Uses proxies, listeners, and abstract classes to separate concerns.
- **Graphical User Interface**: Built with Java Swing components.

## Architecture

- **App**: The main JFrame that initializes the UI.
- **ShapeMover**: The central JPanel that hosts the control buttons and drawing area.
- **ShapePanel**: Responsible for drawing ellipses and handling mouse events for selection.
- **MovingEllipse & MovingEllipseProxy**: Encapsulate ellipse movement logic and proxy selection.
- **ColorShape & ColorEllipse**: Abstract and concrete classes representing colored, drawable shapes.
- **MoveButtonRow & Directional Buttons**: UI components for shape movement, each with its own event listener.
- **QuitButton**: Safely exits the application.

## Example Usage

When you run the application, you will see two colored ellipses (circles). Use the direction buttons to move the currently selected ellipse by 25 pixels in the chosen direction. Click on either ellipse to select it. Press "Quit" to exit the application.

## Key Classes (Sample)

```java
public class App extends JFrame { ... }
public abstract class ColorShape { ... }
public class MoveButtonRow extends JPanel { ... }
public class MovingEllipse extends ColorEllipse { ... }
public class MovingEllipseProxy { ... }
public class ShapeMover extends JPanel { ... }
public class ShapePanel extends JPanel { ... }
public class ColorEllipse extends ColorShape { ... }
```

## How It Works

- **Selection**: Mouse clicks set which ellipse is controlled via a proxy.
- **Movement**: Directional buttons trigger movement methods in the proxy, updating the shape’s position.
- **Drawing**: Ellipses are rendered with customizable colors, borders, and fill.
- **Extensibility**: The design allows easy addition of new shapes or controls.

## Getting Started

1. Ensure you have Java and Swing libraries installed.(required wheels folder is included in the repo in the "lib" folder)
2. Compile and run `App.java`.
3. Interact with the GUI as described above.
