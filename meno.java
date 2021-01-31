import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MenusSwingDemo {
private JFrame frame;
public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {
public void run() {
try {
MenusSwingDemo window = new MenusSwingDemo();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public MenusSwingDemo() {
frame = new JFrame();
frame.setBounds(100, 100, 629, 450);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar menuBar = new JMenuBar();
frame.setJMenuBar(menuBar);
javax.swing.JMenu menu1 = new javax.swing.JMenu("Files");
menuBar.add(menu1);
javax.swing.JMenu SubMenu = new javax.swing.JMenu("projects");
menu1.add(SubMenu);
JMenuItem submenuProject = new JMenuItem("New Project");
submenuProject.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(submenuProject," You have selected New Project");
}
});
SubMenu.add(submenuProject);
JMenuItem SubMenuJava = new JMenuItem("Java Project");
SubMenuJava.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(SubMenuJava," You have selected Java Project");
}
});
SubMenu.add(SubMenuJava);
JMenuItem menuitem2 = new JMenuItem("Open");
menuitem2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(menuitem2," You have selected to Open Project");
}
});
menu1.add(menuitem2);
JCheckBoxMenuItem checkboxExit = new JCheckBoxMenuItem("Exit");
checkboxExit.setSelected(true);

checkboxExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(frame.EXIT_ON_CLOSE);
}
});
menu1.add(checkboxExit);
javax.swing.JMenu menu2 = new javax.swing.JMenu("Edit");
menuBar.add(menu2);
JMenuItem menuCut = new JMenuItem("Cut");
menu2.add(menuCut);
JMenuItem menuCopy = new JMenuItem("Copy");
menu2.add(menuCopy);
JMenuItem menuPaste = new JMenuItem("Paste");
menu2.add(menuPaste);
javax.swing.JMenu menu3 = new javax.swing.JMenu("Help");
menuBar.add(menu3);
JMenuItem menuhelp = new JMenuItem("Help");
menu3.add(menuhelp);
frame.getContentPane().setLayout(null);
JTextArea textArea = new JTextArea();
textArea.setBounds(0, 0, 381, 213);

frame.getContentPane().add(textArea);
JPopupMenu popupMenu = new JPopupMenu();
popupMenu.setBounds(0, 0, 16, 42);
addPopup(frame.getContentPane(), popupMenu);
JMenuItem popupCut = new JMenuItem("Cut");
popupMenu.add(popupCut);
JMenuItem popupCopy = new JMenuItem("Copy");
popupMenu.add(popupCopy);
JMenuItem popupPaste = new JMenuItem("Paste");
popupMenu.add(popupPaste);
JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
mntmNewMenuItem.setBounds(54, 85, 137, 26);
frame.getContentPane().add(mntmNewMenuItem);
}
private static void addPopup(Component component, final JPopupMenu popup) {
component.addMouseListener(new MouseAdapter() {
public void mousePressed(MouseEvent e) {
if (e.isPopupTrigger()) {
showMenu(e);

}
}
public void mouseReleased(MouseEvent e) {
if (e.isPopupTrigger()) {
showMenu(e);
}
}
private void showMenu(MouseEvent e) {
popup.show(e.getComponent(), e.getX(), e.getY());
}
});
}
}