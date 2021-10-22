package wissem;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class monTest extends JFrame {

	boolean fievre=false,fatigue=false,toux=false,courbature=false,congestion=false,ecoulement=false,mauxDeGorge=false;	
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					monTest frame = new monTest();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public monTest() {
		super("   Un simple questionnaire pour vérifier votre santé ");
		setBackground(Color.WHITE);
		
		setBounds(850, 300, 590, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 267, 474);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("image\\unnamed.jpg"));
		panel.add(lblNewLabel);
		
		
		
		
		Button button = new Button("Envoyer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(fievre==true||fatigue==true||toux==true||courbature==true||congestion==true||ecoulement==true||mauxDeGorge==true)
				{
					msg="Vous devez visitez un medecin le plus tôt possible.Il est probable que vous êtes infectés par le COVID-19 ";
				}
				else
				{
					msg="Vous êtes en bonne santé , mais quand même vous devez rester chez vous ";
				}
				JOptionPane.showMessageDialog(null,msg);
					
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241,57,81));
		button.setBounds(317, 308, 168, 36);
		contentPane.add(button);
		
		Label label = new Label("                 Le test contre le covid-19");
		label.setBounds(287, 10, 217, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Cochez la case si vous avez les symptomes");
		label_1.setBounds(287, 69, 255, 22);
		contentPane.add(label_1);
		
		Checkbox checkbox = new Checkbox("fi\u00E8vre");
		checkbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					fievre=true;
				}
				else
					fievre=false;
			}
		});
		checkbox.setBounds(273, 97, 194, 22);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Sensation de fatigue");
		checkbox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					fatigue=true;
				}
				else
					fatigue=false;			}
		});
		checkbox_1.setBounds(273, 125, 168, 22);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("Toux s\u00E8che");
		checkbox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					toux=true;
				}
				else
					toux=false;
			}
		});
		checkbox_2.setBounds(273, 153, 95, 22);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("Des courbatures et des douleurs");
		checkbox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					courbature=true;
				}
				else
					courbature=false;
			}
		});
		checkbox_3.setBounds(273, 181, 194, 22);
		contentPane.add(checkbox_3);
		
		Checkbox checkbox_4 = new Checkbox("Une congestion nasale");
		checkbox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					congestion=true;
				}
				else
					congestion=false;
			}
		});
		checkbox_4.setBounds(273, 209, 194, 22);
		contentPane.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("Un \u00E9coulement nasal");
		checkbox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					ecoulement=true;
				}
				else
					ecoulement=false;
			}
		});
		checkbox_5.setBounds(273, 237, 168, 22);
		contentPane.add(checkbox_5);
		
		Checkbox checkbox_6 = new Checkbox("Des maux de gorge");
		checkbox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					mauxDeGorge=true;
				}
				else
					mauxDeGorge=false;
			}
		});
		checkbox_6.setBounds(273, 266, 194, 22);
		contentPane.add(checkbox_6);
		
		TextField textField = new TextField();
		textField.setBounds(416, 402, 151, 28);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Votre commentaire");
		lblNewLabel_1.setBounds(272, 394, 138, 36);
		contentPane.add(lblNewLabel_1);
		
	}
}