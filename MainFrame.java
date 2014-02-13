import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Creates a new JFrame.
 * 
 * @author Hesse D.
 * @version 0.1
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame
{
   static TextField sysTF;
   static TextField keyLengthTF;
   static JTextField keyTF;
   static TextField userTF;
   /**
    * Constructor. Setup the window items.
    * 
    */
   public MainFrame()
   {
      super("Bippity's Server -Raffle Ticket Generator-");
      JFrame.setDefaultLookAndFeelDecorated(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setJMenuBar(new MyMenuBar(this));

      JPanel panel = new JPanel();
      JPanel southPanel = new JPanel();
      JPanel formPanel = new JPanel();
      JPanel inputPanel = new JPanel();
      keyTF = new JTextField(); //generated key field
      sysTF = new TextField();
      keyLengthTF = new TextField();
      userTF = new TextField(); //username input field
      
      panel.setLayout(new BorderLayout(5, 5));
      formPanel.setLayout(new BorderLayout(2,5));
      inputPanel.setLayout(new GridLayout(2, 2));
      southPanel.setLayout(new BorderLayout());
      
      inputPanel.add(new JLabel("Username:"), BorderLayout.NORTH);
      inputPanel.add(userTF, BorderLayout.SOUTH);
      
      southPanel.add(new JLabel("Generated key:"), BorderLayout.NORTH);
      southPanel.add(keyTF, BorderLayout.SOUTH); //key.createKey()
      

      //TODO: Drop down menu
      /*inputPanel.add(new JLabel("Number system (Base Number):"));
      inputPanel.add(sysTF);
      inputPanel.add(new JLabel("Key length:"));
      inputPanel.add(keyLengthTF);
      */
      
      

      formPanel.add(southPanel, BorderLayout.SOUTH);
      formPanel.add(inputPanel, BorderLayout.NORTH);
      panel.add(formPanel, BorderLayout.CENTER);
      
      panel.add(new CopyButton(), BorderLayout.SOUTH);
      panel.add(new GenButton(), BorderLayout.EAST);
      
      add(panel);
   }
   
   /**
    * Return the "number system".
    * 
    * @return
    *       number system
    */
   public static String getNumberSystem()
   {
   //  return sysTF.getText();
     return "16";
   }
   
   /**
    * Return the key length.
    * 
    * @return
    *       key length
    */
   public static String getLength()
   {
    //  return keyLengthTF.getText();
    return "6";
   }
   
   public static String getUser()
   {
   	String user = userTF.getText();
   	return user.substring(0,1) + user.substring(user.length()-1);
   }
   
   /**
    * Sets the Key.
    * 
    * @param key
    *           New key
    */
   public static void setKey(String key)
   {
      keyTF.setText(key);
   }
   
   public static String getKey()
   {
       return keyTF.getText();
   }
}
