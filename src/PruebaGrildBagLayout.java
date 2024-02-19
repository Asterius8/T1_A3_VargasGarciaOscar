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
		
		JLabel txt1 = new JLabel("The Classic Form includes all visible fiel for this list.");
		agregarComponente(txt1, 0, 0, 2, 1);
		
		JLabel txt2 = new JLabel("Form Options");
		agregarComponente(txt2, 0, 1, 1, 1);
		
		JLabel txt3 = new JLabel("Include the following");
		agregarComponente(txt3, 0, 2, 1, 1);
		
		JCheckBox ckb1 = new JCheckBox();
		agregarComponente(ckb1, 0, 3, 1, 1);
		
		JLabel txt4 = new JLabel("a title for your foam");
		agregarComponente(txt4, 1, 3, 1, 1);
		
		JTextField caja1 = new JTextField("Subscribe to our mailing list");
		agregarComponente(caja1, 0, 4, 2, 1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields");
		agregarComponente(radio1, 0, 6, 2, 1);
		JRadioButton radio2 = new JRadioButton("all fields");
		agregarComponente(radio2, 0, 7, 2, 1);
		
		
	}//Constructor
	
	public void agregarComponente(JComponent c, int x, int y, int w, int h){
		
		gbc.gridx = x;
		gbc.gridy =y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		gbc.anchor = GridBagConstraints.WEST;
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
