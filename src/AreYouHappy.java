import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String Happy = JOptionPane.showInputDialog(null, "Are you happy?");
if (Happy.equals ("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}
if (Happy.equals ("no")) {
	String Question = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	

if (Question.equals ("no")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
}
if (Question.equals ("yes")) {
	JOptionPane.showMessageDialog(null,  "Change something then!!!");
}

}









}
}
