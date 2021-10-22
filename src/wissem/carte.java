package wissem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;

import java.awt.Color;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.TextField;

//--------------------------------------------------------
public class carte {
	
	public static void main(String[] args) {

		fenetre_principale tunisiamap =new fenetre_principale();
		tunisiamap.getContentPane().setBackground(new Color(199, 237, 255));
		tunisiamap.setVisible(true);
		tunisiamap.setResizable(false);
		
	}
}

//------------------------------------------------------
class fenetre_principale extends JFrame{
	
	 private static Object[] elements =new Object[] {"--","Gafsa","Monastir","Ariana","Beja","Ben_Arous","Bizerte","Gabes","Jendouba","Kairouan","Kasserine","Kebili","Kef","Mahdia","Manouba","Medenine","Monastir","Nabeul","Sfax","Sidi_Bouzid","Siliana","Sousse","Tataouine","Tozeur","Tunis","Zaghouan"};
	 static JComboBox<String> combobox = new JComboBox(elements);
	 private static ImageIcon icone = new ImageIcon("image\\image.png");
	 
	 static  JLabel lblImage =new JLabel(icone);
     static JPanel panel =new JPanel ();
     static final JDateChooser dateChooser = new JDateChooser();
     private JButton monBouton1;
     private JButton monBouton2;
     private JButton monBouton3;
     private JButton monBouton4;
     private JButton monBouton5;
     static JTextPane textPane1 = new JTextPane();
     static JTextPane textPane2 = new JTextPane();
     static JTextPane textPane3 = new JTextPane();
	 JLabel compte1;
	 JLabel compte2;
	 JLabel compte3;
	
	 public fenetre_principale() {
		
		
		super("The COVID 19 detective in Tunisia");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1500,1000);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panel);
		panel.setLayout(null);
		//------------calendrier et combobox
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(1000, 90, 185, 19);
		combobox.setBounds(800, 90, 100, 19);
		panel.add(dateChooser);
		panel.add(combobox);
		//----------l'image 
		lblImage.setBounds(0, 0, 800, 700);
		panel.add(lblImage);
		//---------les boutons 
		monBouton3=new JButton("total");
		monBouton3.setBounds(1000, 400, 116, 21);
		panel.add(monBouton3);
		ecoutebouton ecout3=new ecoutebouton("total");
		monBouton3.addActionListener(ecout3);
		
		monBouton1=new JButton("recherche");
		monBouton1.setBounds(1000, 161, 116, 21);
		panel.add(monBouton1);
		ecoutebouton ecout=new ecoutebouton("recherche");
		monBouton1.addActionListener(ecout);
		
		monBouton2=new JButton("test");
		monBouton2.setBounds(800, 161, 116, 21);
		panel.add(monBouton2);
		
		monBouton2.addActionListener(new ActionListener() {
	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			
	 			monTest f = new monTest();
	 			f.setVisible(true);	
	 			f.setLocationRelativeTo(null);
	 		}
	 	});	
		monBouton4=new JButton("statistiques");
		monBouton4.setBounds(800, 400, 116, 21);
		panel.add(monBouton4);
		ecoutebouton ecout4=new ecoutebouton("statistiques");
		monBouton4.addActionListener(ecout4);
		
		monBouton5=new JButton("Reset");
		monBouton5.setBounds(1200, 400, 116, 21);
		panel.add(monBouton5);
		monBouton5.addActionListener(new ActionListener() {
	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			
					fenetre_principale.textPane1.setText("");
					fenetre_principale.textPane2.setText("");
					fenetre_principale.textPane3.setText("");
	 		}
	 	});






		textPane1.setBounds(1150,430, 144, 35);
		panel.add(textPane1);
		textPane2.setBounds(1150,470, 144, 35);
		panel.add(textPane2);
		textPane3.setBounds(1150,510, 144, 35);
		panel.add(textPane3);
		compte1 = new JLabel("nombre de cas confirmés: ");
		panel.add(compte1);
		compte1.setBounds(1000,430, 160, 35);
		compte2 = new JLabel("nombre de deces");
		compte2.setBounds(1000,470, 160, 35);
		panel.add(compte2);
		compte3 = new JLabel("nombre de cas retablis");
		panel.add(compte3);
	    compte3.setBounds(1000,510, 160, 35);
}}
	
	class ecoutebouton  implements ActionListener {
		//------les methodes de la classe ecoutebouton
		String chaine;
		JPanel	frame2 = new JPanel();
		//----constructeur paramétré
	   	 public ecoutebouton(String a) {chaine=a;}
	   	 
	   	 fenetre_secondaire h =new fenetre_secondaire();
	   	public void actionPerformed(ActionEvent e) {
    		 	 String x="";
    			 String select =((JTextField)fenetre_principale.dateChooser.getDateEditor().getUiComponent()).getText();//la date choisie
    			 
    			 if (chaine.contentEquals("total")||chaine.contentEquals("statistiques")) {
    				 x="total";// x prend la valeur de chaine relative au bouton total
    				
    			 }
    			 if (chaine.contentEquals("recherche")) {
    				 x=  (String) fenetre_principale.combobox.getSelectedItem();//x prend la valeur du  mois selectionné 
    				 
    				 
    			 }
    			 
    			   if (select.contentEquals("")) // si l'utilisateur n'a pas choisi une date 
    			  {
    				   JOptionPane.showMessageDialog(null,"selectionner une date");
    				   
    		       }
    			   else if(chaine.contentEquals("recherche") &&  fenetre_principale.combobox.getSelectedItem().equals("--")){
    				   fenetre_principale.lblImage.setIcon(new  ImageIcon("image\\image.png"));
    				   JOptionPane.showMessageDialog(null,"selectioner un gouvernerat");
    				   
    			   }

    			   else {  //si tout est bien on exécute le bloc suivant 
    				   
   					String ch="";
   					String ch1="";
   					String result[]=new String[6];
   					String result1[]=new String[6];
   					String result2[]=new String[6];
   					try {
   					FileReader fr=new FileReader("image\\"+x+".txt");  // la lecture du contenu de chaque fichier contenant les statistiques du covid 19
   					BufferedReader br= new BufferedReader(fr);
   					
   					int k=0;
   					
   					while( br.ready()&&k==0) {
   						ch=br.readLine();
   						result = ch.split(" ");
   						if (result[0].contentEquals(select)) {
   							k=1;
   						}
   					    }
   					br.close();
   					
   					if(k==1) {
   						if(chaine.contentEquals("total")) {
   							fenetre_principale.textPane1.setText(result[1]);
   							fenetre_principale.textPane2.setText(result[2]);
   							fenetre_principale.textPane3.setText(result[3]);
   					}
   						else if(chaine.contentEquals("statistiques")) {
   							graphics graphe =new graphics();
   							graphe.setVisible(true);
   						}
   						else {
   							
						h.casConfirme.setText("nombre de cas confirmés: "+ result[1]);
						h.casDeces.setText("nombre de deces: "+ result[2]);
						h.casRetabli.setText("nombre de cas retablis: "+ result[3]);
						h.leGouvernorat.setText((String)fenetre_principale.combobox.getSelectedItem());
						h.setVisible(true);
	   					//fenetre_principale.frame.remove(fenetre_principale.jlabel);
	   					fenetre_principale.lblImage.setIcon(new  ImageIcon("image\\"+fenetre_principale.combobox.getSelectedItem()+".png"));
   						}
   					}
   		   				else {
   		   						String message;
   		   						result1 = result[0].split("-");
   		   						result2 = select.split("-");
   		   						int J1=Integer.parseInt(result1[2]);
   		   						int J2=Integer.parseInt(result2[2]);
   		   						int M1=Integer.parseInt(result1[1]);
   		   						int M2=Integer.parseInt(result2[1]);
   		   						int A1=Integer.parseInt(result1[0]);
   		   						int A2=Integer.parseInt(result2[0]);
   		   					    if((J2>J1 && M1==M2 && A1==A2)||( M2>M1 && A1==A2)||(A2>A1)) {
   		   					    	message="pas encore";
   		   					    }
   		   					    else {
   		                            message= "pas de corona";
   		   					    }
   		   					 JOptionPane.showMessageDialog(null,message);
   		   					}
    						

   						
   					}
   					catch (Exception ex)
   					{System.out.println("Erreur "+ex);}
   					finally {}   
    			   }   			   
     }
 }

class fenetre_secondaire extends JFrame {
	 JLabel casConfirme;
	 JLabel casDeces;
	 JLabel casRetabli;
	 JLabel leGouvernorat;
	 static JPanel frame1;
	public fenetre_secondaire() {
		setBounds(600, 50, 450, 300);
		frame1 = new JPanel();
		frame1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frame1);
		frame1.setLayout(null);
		casConfirme= new JLabel();
		frame1.add(casConfirme);
		casConfirme.setBounds(72, 68,291, 21);
		casDeces = new JLabel();
		casDeces.setBounds(77, 142,291, 21);
		frame1.add(casDeces);
		casRetabli= new JLabel();
		frame1.add(casRetabli);
		casRetabli.setBounds(77, 214,291, 21);
		leGouvernorat = new JLabel();
	    frame1.add(leGouvernorat);
	    leGouvernorat.setBounds(174, 10, 166, 19);
	}
}
