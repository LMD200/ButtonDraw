# ButtonDraw

ButtonDraw is a Java application that demonstrates interactive drawing using directional buttons and a movable cursor. The project showcases object-oriented principles and event-driven programming by allowing users to draw lines in various directions on a graphical frame.

## Features

- **Directional Drawing**: Move a cursor and draw lines by clicking Up, Down, Left, or Right buttons.
- **Centralized Cursor Control**: A `Cursor` object maintains the current drawing location and updates as you draw.
- **Event-Driven Interaction**: Each button responds to mouse events, changing color and drawing a new line segment in the selected direction.
- **Modular and Extensible**: Uses abstraction for button types, allowing easy addition of new directional or custom drawing buttons.
- **Simple GUI**: Built using the `wheels.users` library and Java AWT classes.

## Architecture

- **MyApp**: The main application frame that initializes the cursor and directional buttons.
- **Cursor**: Tracks the current location for drawing. Shared by all buttons.
- **DrawButton (Abstract)**: Base class for all directional buttons, handles mouse interaction and line drawing.
- **UpButton, DownButton, LeftButton, RightButton**: Extend `DrawButton` to implement movement in each direction.
- **Event Handling**: Mouse press and release events trigger visual feedback and drawing actions.

## Example Usage

When you launch the application, you'll see four directional buttons arranged around a central point. Clicking any button draws a line from the current cursor position to the next position in the chosen direction, updating the cursor for subsequent moves.

## How It Works

- **Cursor Movement**: The `Cursor` object holds the current drawing location. Each button computes the next point and updates the cursor.
- **Drawing Lines**: On mouse release, a button draws a line segment from the cursor’s current location to the next calculated point.
- **Button Feedback**: Buttons change color on press and release for visual interaction.
- **Extensibility**: Abstract methods allow easy customization for new types of movement or drawing behaviors.

## Getting Started

1. Ensure you have Java and the `wheels.users` library installed.(included in the repo under the "lib" folder0
2. Compile and run `MyApp.java`.
3. Click the directional buttons to draw lines on the frame.
