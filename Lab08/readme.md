Eventhandling in Java
Changing the state of an object is known as an event. For example, click on button, dragging mouse etc. The java.awt.event package provides many event classes and Listener interfaces for event handling.

Event Classes and Listener interfaces
Event Classes	| Listener Interfaces
--------------  | -------------------
ActionEvent	| ActionListener
MouseEvent	| MouseListener and MouseMotionListener
MouseWheelEvent	| MouseWheelListener
KeyEvent	| KeyListener
ItemEvent	| ItemListener
TextEvent	| TextListener
AdjustmentEvent	| AdjustmentListener
WindowEvent	| WindowListener
ComponentEvent	|ComponentListener
ContainerEvent	| ContainerListener
FocusEvent	| FocusListener
To perform event handling register the component with the Listener
Registration Method
For registering the component with listener , many classes provide registration methods.For example:

Button -public void addActionListener(ActionListener a){}
MenuItem public void addActionListener(ActionListener a){}
TextField -public void addActionListener(ActionListener a){} -public void addTextListener(TextListener a){}
TextArea -public void addTextListener(TextListener a){}
Checkbox -public void addItemListener(ItemListener a){}
Choice -public void addItemListener(ItemListener a){}
List -public void addActionListener(ActionListener a){} -public void addItemListener(ItemListener a){}
Java Event Handling Code
We can put the event handling code into one of the following places:

Within class
Other class
Anonymous class