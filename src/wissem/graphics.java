package wissem;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class graphics extends JFrame {

	private JPanel contentPane;
	public graphics() {
		setBounds(450, 150, 572, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlabel = new JLabel();
		jlabel.setBounds(0, 0, 568, 405);
		contentPane.add(jlabel);
		String selection =((JTextField)fenetre_principale.dateChooser.getDateEditor().getUiComponent()).getText();

		String result[]=new String[6];
		result=selection.split("-");
		String	l1=result[2];//recuperation du nbre de jours
		String	l2=result[1];//recuperation du nbre de mois
		int i=Integer.parseInt(l1);//conversation en entier
		int j=Integer.parseInt(l2);//conversation string en entier
		if(j==03)
		{
			if(i>=1 && i<=7)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine1.png"))	;
			}
			else if(i>=7 && i<=14)
			{
			
			jlabel.setIcon(new ImageIcon("image\\semaine2.png"))	;
			}
			else if(i>=14 && i<=21)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine3.png"))	;
			}
			else
			{
			jlabel.setIcon(new ImageIcon("image\\semaine4.png"))	;
			}
}
		else if(j==04)
		{
			if(i>=1 && i<=7)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine5.png"))	;
			}
			else if(i>=7 && i<=14)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine6.png"))	;
			}
			else if(i>=14 && i<=21)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine7.png"))	;
			}
			else
			{
			jlabel.setIcon(new ImageIcon("image\\semaine8.png"))	;
			}	
		}
		else
		{
			if(i>=1 && i<=7)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine9.png"))	;
			}
			else if(i>=7 && i<=14)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine10.png"))	;
			}
			else if(i>=14 && i<=21)
			{
			jlabel.setIcon(new ImageIcon("image\\semaine11.png"))	;
			}
			else
			{
			jlabel.setIcon(new ImageIcon("image\\semaine12.png"))	;
			}		
		}

	}

}

