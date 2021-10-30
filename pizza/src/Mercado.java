

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

public class Mercado extends JFrame  implements ActionListener{
	
 JLabel lblprod,lblqtd,lblvalor,lblp1,lblp2,lblp3,lblp4,lblp5,lblp6,lblp7,lblresultado;
 JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
 JButton	btcompra;
 JCheckBox chp1,chp2,chp3,chp4,chp5,chp6,chp7;
 JPanel  painel2, painel3;
 double result;
 double batata,cenoura,cebola,beterraba,pimentao,tomate,pepino; 
 double valor1 ,valor2 ,valor3 ,valor4 ,valor5 ,valor6 ,valor7 ;
 
 Mercado() {
	    this.setTitle("Mercadinho Unip");
		this.setSize(400, 350);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
	
	
		lblprod = new JLabel("Produto         ");
		lblvalor = new JLabel("Valor(R$)");
		lblqtd= new JLabel("Quantidade(Kg)");
		
		chp1 = new JCheckBox("Batata");
		chp2 = new JCheckBox("Cenoura");
		chp3 = new JCheckBox("Cebola");
		chp4 = new JCheckBox("Beterraba");
		chp5 = new JCheckBox("Pepino");
		chp6 = new JCheckBox("Pimentão");
		chp7 = new JCheckBox("Tomate");
		
		
		painel2  = new JPanel(new GridLayout(8,3,8,3));
		
		lblp1 = new JLabel("R$ 1.50");
		lblp2 = new JLabel("R$ 2.00");
		lblp3 = new JLabel("R$ 3.10");
		lblp4 = new JLabel("R$ 2.35");
		lblp5 = new JLabel("R$ 1.85");
		lblp6 = new JLabel("R$ 3.00");
		lblp7 = new JLabel("R$ 3.50");
		btcompra = new JButton("Comprar");
		btcompra.addActionListener(this );
		lblresultado = new JLabel("Total a pagar: R$");
			
		painel3  = new JPanel();
		
		txt1 = new JTextField("");
		txt2 = new JTextField("");
		txt3 = new JTextField("");
		txt4 = new JTextField("");
		txt5 = new JTextField("");
		txt6 = new JTextField("");
		txt7 = new JTextField("");
		
		
		
		
		painel2.add(lblprod);   painel2.add(lblvalor);     painel2.add(lblqtd);
		painel2.add(chp1);      painel2.add(lblp1);      painel2.add(txt1);
		painel2.add(chp2);      painel2.add(lblp2);      painel2.add(txt2);
		painel2.add(chp3);      painel2.add(lblp3);      painel2.add(txt3);
		painel2.add(chp4);      painel2.add(lblp4);      painel2.add(txt4);
		painel2.add(chp5);      painel2.add(lblp5);      painel2.add(txt5);
		painel2.add(chp6);      painel2.add(lblp6);      painel2.add(txt6);
		painel2.add(chp7);      painel2.add(lblp7);      painel2.add(txt7);
		                        painel3.add(btcompra);
		                        painel3.add(lblresultado);

		
		this.getContentPane().add(painel2, BorderLayout.CENTER);
		this.add(painel3, BorderLayout.SOUTH);
		this.setVisible(true);
		
	}

	   
	   
	   
	  
 public static void main(String[] args) {
	 Mercado t = new Mercado();
		t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		t.setVisible(true);
	}

public void actionPerformed(ActionEvent e) {
	valor1=0;
	 if(chp1.isSelected()) {
	     batata = Double.parseDouble(txt1.getText());
	    valor1=1.50*batata;
	    result=valor1+valor2+valor3+valor4+valor5+valor6 +valor7;
	   }
	 valor2=0;  
	 if(chp2.isSelected()) {
		   cenoura = Double.parseDouble(txt2.getText());
	    valor2=2.00*cenoura;
	   }
	   
	 valor3=0;
	 if(chp3.isSelected()) {
		   cebola = Double.parseDouble(txt3.getText());
	    valor3=3.10*cebola;
	   }
	  
	 valor4=0;
	 if(chp4.isSelected()) {
		   beterraba = Double.parseDouble(txt4.getText());
	    valor4=2.35*beterraba;
	   }
	  
	 valor5=0;
	 if(chp5.isSelected()) {
		   pepino = Double.parseDouble(txt5.getText());
	    valor5=1.85*pepino;
	   }
	 valor6=0;
	 if(chp6.isSelected()) {
		   pimentao = Double.parseDouble(txt6.getText());
	    valor6=3.00*pimentao;
	   }
	 valor7=0;
	 if(chp7.isSelected()) {
		   tomate = Double.parseDouble(txt7.getText());
	    valor7=3.50*tomate;
	   }
	   
	result=valor1+valor2+valor3+valor4+valor5+valor6 +valor7;
        lblresultado.setText("Total a pagar: R$" + result);
}




	}
	