package HelloWorldSwing;
import javax.swing.*;
import java.awt.*;     
import java.awt.event.*;
public class GUIDemo extends JFrame {
    public GUIDemo(){               
//   create content which holds the components
    JPanel content=new JPanel();
//        create label
    JLabel label1=new JLabel("hello world");
//    create textfield
    JTextField textfield=new JTextField(20);
    textfield.getText();
//    add scroll to the textfield
    JScrollPane scroll=new JScrollPane(textfield);
//    create ComboBox and add the event to the options
    String[] arr={"css","html","js"};
   JComboBox subchoise=new JComboBox(arr);
   subchoise.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
         JComboBox combo = (JComboBox)ae.getSource(); 
	 String currentFont = (String)combo.getSelectedItem(); 
         System.out.println("Selected font: " + currentFont);

        }
       });
//   how to create CheckBox
   JCheckBox cBox=new JCheckBox("case",true);
//   how to create a Radio button and border for it
JRadioButton yesButton = new JRadioButton("Yes" , true);
JRadioButton noButton = new JRadioButton("No" , false); 
JRadioButton maybeButton = new JRadioButton("Maybe", false); 
ButtonGroup bgroup = new ButtonGroup();
bgroup.add(yesButton); 
bgroup.add(noButton);
bgroup.add(maybeButton);
//how to create slider
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
slider.setMajorTickSpacing(10);
slider.setMinorTickSpacing(5);
slider.setPaintTicks(true);
slider.setPaintLabels(true);
//JOptionPane creation  to get input and display ouPut
String ans;
ans=JOptionPane.showInputDialog("what is your name?");

JOptionPane.showMessageDialog(null, "My name is "+ans);

//    add all the components to the content
    content.add(label1);
    content.add(new JLabel("Enter your ID:", JLabel.CENTER));
    content.add(textfield);
    content.add(subchoise);
    content.add(cBox);
    content.add(yesButton);
    content.add(noButton);
    content.add(maybeButton);
//    content.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Married?"));
    content.add(slider);
//    create your own contentpane
    setContentPane(content);
    }
    
}
