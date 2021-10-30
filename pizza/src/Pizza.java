


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

public class Pizza extends JFrame  implements ActionListener{
	
 JLabel lblsabor,lblindividual,lblfamilia,lblregular,lblcobertura,lblp1,lblp2,lblp3,lblpresunto,lblcatupiry,lbltomate,lblbacon,lblchamp,lblcebola,lblresultado;
 JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
 JButton	btcompra;
 JCheckBox ind1,ind2,ind3,reg1,reg2,reg3,fam1,fam2,fam3,cbpresunto,cbcatupiry,cbtomate,cbbacon,cbchamp,cbcebola;
 JPanel  painel2, painel3,painel4,painel5;
 JTextArea total;
 double result;
 double pep,mussa,supre,bacon,cebola,champ,tomate,catupiry,presunto; 
 double valor1 ,valor2 ,valor3 ,valor4 ,valor5 ,valor6 ,valor7, valor8, valor9, valor10, valor11, valor12, valor13,valor14,valor15;
 
 Pizza() {
	    this.setTitle("Pizzaria");
		this.setSize(450, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
	
	
		lblsabor = new JLabel("Sabor da Pizza   ");
		lblindividual = new JLabel("$Individual");
		lblfamilia= new JLabel("$Familia");
		lblregular =new JLabel("$Regular");
		lblcobertura = new JLabel("Cobertura Extras R$");
		
		ind1 = new JCheckBox("15,00");
		ind2 = new JCheckBox("12,00");
		ind3 = new JCheckBox("17,00");
		reg1 = new JCheckBox("27,00");
		reg2 = new JCheckBox("21,60");
		reg3 = new JCheckBox("30,60");
		fam1 = new JCheckBox("33,00");
		fam2 = new JCheckBox("26,40");
		fam3 = new JCheckBox("37,40");
		
		
		lblp1 = new JLabel("Pepperoni");
		lblp2 = new JLabel("Mussarela");
		lblp3 = new JLabel("Supreme");
		
		cbbacon = new JCheckBox("Bacon");
		cbcebola = new JCheckBox("Cebola");
		cbchamp = new JCheckBox("Champignon");
		cbtomate = new JCheckBox("Tomate");
		cbcatupiry= new JCheckBox("Catupiry");
		cbpresunto= new JCheckBox("Presunto");
		lblbacon = new JLabel("2,00");
		lblcebola = new JLabel("1,50");
		lblchamp = new JLabel("2,50");
		lbltomate = new JLabel("1,00");
		lblcatupiry= new JLabel("3,00");
		lblpresunto= new JLabel("2,50");
		
		btcompra = new JButton("Comprar");
		btcompra.addActionListener(this );
		lblresultado = new JLabel("Total a pagar:");
		total= new JTextArea(1,5);
	
		painel2  = new JPanel(new GridLayout(4,4,4,4));
		
		painel2.add(lblsabor);   painel2.add(lblindividual);     painel2.add(lblregular);    painel2.add(lblfamilia);
		painel2.add(lblp1);      painel2.add(ind1);              painel2.add(reg1);          painel2.add(fam1);
		painel2.add(lblp2);      painel2.add(ind2);              painel2.add(reg2);          painel2.add(fam2);
		painel2.add(lblp3);      painel2.add(ind3);              painel2.add(reg3);          painel2.add(fam3);
	    
		
		
		painel3  = new JPanel(new GridLayout(3,3,3,3));
	
		painel3.add(cbbacon);		painel3.add(lblbacon); 		painel3.add(cbtomate); 		painel3.add(lbltomate);
		painel3.add(cbcebola);		painel3.add(lblcebola);		painel3.add(cbcatupiry); 	painel3.add(lblcatupiry);
		painel3.add(cbchamp); 		painel3.add(lblchamp);		painel3.add(cbpresunto); 	painel3.add(lblpresunto);
		
		
		painel4= new JPanel(new FlowLayout());
		
		painel4.add(lblcobertura);
		
		painel5= new JPanel(new FlowLayout());
		painel5.add(btcompra);painel5.add(lblresultado);painel5.add(total);
		
		
		this.getContentPane().add(painel2, BorderLayout.CENTER);
		this.add(painel4, BorderLayout.EAST);
		this.add(painel3, BorderLayout.SOUTH);
		this.add(painel5, BorderLayout.SOUTH);
		
		
		this.setVisible(true);
		
	}
 public static void main(String[] args) {
	 Pizza t = new Pizza();
		t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		t.setVisible(true);
	}


public void actionPerformed(ActionEvent e) {
	 
	valor1=0;
	 if(ind1.isSelected()) {
		 valor1=15.00;
	   }
	 valor2=0;
	 if(ind2.isSelected()) { 
	    valor2=12.00;
	   }
	 valor3=0;  
	 if(ind3.isSelected()) {   
	    valor3=17.00;
	   }
	  valor4=0;  
	 if(reg1.isSelected()) {
		    valor4=27.00;
	   }
	 valor5=0; 
	 if(reg2.isSelected()) {
	    valor5=21.60;
	   }
	 valor6=0; 
	 if(reg3.isSelected()) {
		    valor6=30.60;
	   }
	 valor7=0;
	 if(fam1.isSelected()) {
		   valor7=33.00;
	   }
	 valor8=0;
	 if(fam2.isSelected()) {
		  valor8=26.40;
	   }
	 valor9=0;
	 if(fam3.isSelected()) {
		    valor9=37.40;
	   }
	 valor10=0;  
	 if(cbbacon.isSelected()) {
		  valor10=2.00;
	   }
	 valor11=0;
	 if(cbcebola.isSelected()) {
	   valor11=1.50;
	   }
	 valor12=0;  
	 if(cbchamp.isSelected()) {
		   valor12=2.50;
	   }
	 valor13=0; 
	 if(cbtomate.isSelected()) {
		   valor13=1.00;
		   }
	 valor14=0; 
	 if(cbcatupiry.isSelected()) {
		   valor14=3.00;
		   }
	 valor15=0;  
	 if(cbpresunto.isSelected()) {
		   valor15=2.50;
		   }
	 

	   
	result=valor1+valor2+valor3+valor4+valor5+valor6 +valor7+valor8+valor9+valor10+valor11+valor12+valor13+valor14+valor15;
	total.setText(Double.toString(result));
}


	
	}
	


