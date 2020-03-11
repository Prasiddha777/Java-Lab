# Applet
An applet is a Java program that runs in a Web browser. An applet can be a fully functional Java application because it has the entire Java API at its disposal.

There are some important differences between an applet and a standalone Java application, including the following -

1.An applet is a Java class that extends the java.applet.Applet class.

2.A main() method is not invoked on an applet, and an applet class will not define main().

3.Applets are designed to be embedded within an HTML page.

4.When a user views an HTML page that contains an applet, the code for the applet is downloaded to the user's machine.

5.A JVM is required to view an applet. The JVM can be either a plug-in of the Web browser or a separate runtime environment.

## Life Cycle of an Applet
Four methods in the Applet class gives you the framework on which you build any serious applet -

init - This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.

start - This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.

stop - This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.

destroy - This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.

paint - Invoked immediately after the start() method, and also any time the applet needs to repaint itself in the browser. The paint() method is actually inherited from the java.awt.