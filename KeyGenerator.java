import java.util.Random;

/**
 * Generate a new Key.
 * 
 * @author Hesse D.
 * @version 1.0
 */
public class KeyGenerator
{

   private int n = 0; // lï¿½nge des Strings.
   private int nsys = 0; // zahlensystem (Auch a-z mï¿½glich (36)//Number system
   private Random r = new Random();

   /**
    * Constructor.
    * 
    * @param length
    *           Length of the Key.
    * @param zSys
    *           Number system.
    */
   public KeyGenerator(int length, int nSys)
   {
      if (length <= 1)
      {
         throw new IllegalArgumentException("Key length is too short!");
      }
      else if (nSys < 1)
      {
         throw new IllegalArgumentException("Number system is too small!");
      }
      n = length;
      nsys = nSys;
   }

   /**
    * Creates the new Key.
    * 
    * @return String with generated key
    */
   public final String createKey()
   {
      StringBuffer buf = new StringBuffer();
      for (int i = 0; i <= n - 1; ++i)
      {
         buf.append(Integer.toString(r.nextInt(nsys), nsys));
      }
      
      String user = MainFrame.getUser();
      return user.toUpperCase() + buf.toString().toUpperCase();

   }
   
   /**
    * Set the "number system".
    * 
    * @param sys
    *           number system.
    */
   public final void setNumberSys(int sys)
   {
      nsys = sys;
   }
   
   /**
    * Set the length of the new key.
    * 
    * @param len
    *           length
    */
   public final void setLength(int length)
   {
      n = length;
   }

}
