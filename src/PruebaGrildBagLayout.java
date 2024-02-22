import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame {
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaInicio() {
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(825,570);
		setTitle("T1_A3_VargasGarciaOscar");
		setVisible(true);
		//setLocationRelativeTo(null);
		
		JLabel txt1 = new JLabel("The Classic Form includes all visible fiel for this list.");
		agregarComponente(txt1, 0, 0, 1, 1);
		
		JLabel txt2 = new JLabel("Form Options");
		agregarComponente(txt2, 0, 1, 1, 1);
		
		JLabel txt3 = new JLabel("Include the following");
		agregarComponente(txt3, 0, 2, 1, 1);
		
		JCheckBox ckb1 = new JCheckBox("a title for your foam");
		agregarComponente(ckb1, 0, 3, 1, 1);
		
		JTextField caja1 = new JTextField("Subscribe to our mailing list");
		agregarComponente(caja1, 0, 4, 2, 1);
		
		JLabel txtespacio = new JLabel(" ");
		agregarComponente(txtespacio, 0, 5, 1, 1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields");
		bg.add(radio1);
		agregarComponente(radio1, 0, 6, 2, 1);
		JRadioButton radio2 = new JRadioButton("all fields");
		bg.add(radio2);
		agregarComponente(radio2, 0, 7, 2, 1);
		
		JLabel txt4 = new JLabel("(edit required fields in the form builder)");
		agregarComponente(txt4, 0, 8, 2, 1);
		
		JLabel txtespacio2 = new JLabel(" ");
		agregarComponente(txtespacio2, 0, 9, 1, 1);
		
		JCheckBox ckb2 = new JCheckBox("interest group fields");
		agregarComponente(ckb2, 0, 10, 2, 1);
		
		JCheckBox ckb3 = new JCheckBox("requiered field indicators");
		agregarComponente(ckb3, 0, 11, 1, 1);
		
		JLabel txtespacio3 = new JLabel(" ");
		agregarComponente(txtespacio3, 0, 12, 1, 1);
		
		JLabel txt5 = new JLabel("Set form width");
		agregarComponente(txt5, 0, 13, 1, 1);
		
		JTextField caja2 = new JTextField();
		agregarComponente(caja2, 0, 14, 2, 1);
		
		JLabel txtespacio4 = new JLabel(" ");
		agregarComponente(txtespacio4, 0, 15, 1, 1);
		
		JLabel txt6 = new JLabel("Enhance your form");
		agregarComponente(txt6, 0, 16, 1, 1);
		
		JCheckBox ckb4 = new JCheckBox("enable evil popup mode");
		agregarComponente(ckb4, 0, 17, 1, 1);
		
		JCheckBox ckb5 = new JCheckBox("disable all JavaScript");
		agregarComponente(ckb5, 0, 18, 1, 1);
		
		JCheckBox ckb6 = new JCheckBox("include archive link");
		agregarComponente(ckb6, 0, 19, 1, 1);
		
		JCheckBox ckb7 = new JCheckBox("inclide MonkeyRewars link");
		agregarComponente(ckb7, 0, 20, 1, 1);
		
		JLabel txtespacio5 = new JLabel(" ");
		agregarComponenteSinFill(txtespacio5, 1, 0, 1, 1);
		
		JLabel txt7 = new JLabel("Preview");
		agregarComponenteSinFill(txt7, 2, 0, 1, 1);
		
		JLabel txt8 = new JLabel("* indicate required");
		agregarComponenteSinFill(txt8, 3, 1, 1, 1);
		
		JLabel txt9 = new JLabel("Email Address");
		agregarComponenteSinFill(txt9, 2, 1, 1, 1);
		
		JTextField caja3 = new JTextField();
		agregarComponenteSinFill(caja3, 2, 2, 2, 1);
		
		JLabel txt10 = new JLabel("First Name");
		agregarComponenteSinFill(txt10, 2, 3, 1, 1);
		
		JTextField caja4 = new JTextField();
		agregarComponenteSinFill(caja4, 2, 4, 2, 1);
		
		JLabel txt11 = new JLabel("Last Name");
		agregarComponenteSinFill(txt11, 2, 5, 1, 1);
		
		JTextField caja5 = new JTextField();
		agregarComponenteSinFill(caja5, 2, 6, 2, 1);
		
		JButton btn1 = new JButton("Subscribe");
		agregarComponenteSinFill(btn1, 2, 7, 1, 1);
		
		JLabel txtespacio6 = new JLabel(" ");
		agregarComponenteSinFill(txtespacio6, 2, 8, 1, 1);
		
		JLabel txt12 = new JLabel("Copy/paste onto your site");
		agregarComponenteSinFill(txt12, 2, 9, 1, 1);
		
		JTextField caja6 = new JTextField("                                                                                       ");
		gbc.fill = GridBagConstraints.VERTICAL;
		agregarComponente(caja6, 2, 10, 2, 20);
		
		pack();
		setLocationRelativeTo(null);
		
		
	}//Constructor
	
	public void agregarComponente(JComponent c, int x, int y, int w, int h){
		
		gbc.gridx = x;
		gbc.gridy =y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(c);
		
	}//Metodo
	
	public void agregarComponenteSinFill(JComponent c, int x, int y, int w, int h){
		
		gbc.gridx = x;
		gbc.gridy =y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		gbc.anchor = GridBagConstraints.WEST;
		//
		add(c);
		
	}//Metodo
	
	
}

public class PruebaGrildBagLayout {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaInicio();
			}
		}
		);
		

	}

}
