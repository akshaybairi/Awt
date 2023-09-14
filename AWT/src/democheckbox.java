import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class democheckbox extends Frame implements ItemListener {
      Checkbox cpp,java;
      TextField disp;
      democheckbox(){
    	  setTitle("checkbox example");
    	  setSize(500,300);
    	  setFont(new Font("verdana",Font.BOLD,30));
    	  cpp=new Checkbox();
    	  cpp.setLabel("c++");
    	  java=new Checkbox("JAVA",true,null);
    	  disp=new TextField(25);
    	  setLayout(new FlowLayout());
    	  add(cpp);
    	  add(java);
    	  add(disp);
    	  cpp.addItemListener(this);
    	  java.addItemListener(this);
    	  setVisible(true);
      }
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
