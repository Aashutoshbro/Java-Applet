import java. applet.*;
 import java.awt.*; 
public class ap extends Applet 
{
int h, w;
 public void init() 
{
h = getSize().height;
w = getSize().width; 
setName ("MyApplet"); 
}
 public void paint(Graphics gx) 
{ 
gx.drawRoundRect(11, 29, 130, 119, 3, 2); 
}
 }