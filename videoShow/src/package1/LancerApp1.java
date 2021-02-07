package package1;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class LancerApp1 {
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedImage imgVador= ImageIO.read(new File("images/person2.png"));
		BufferedImage imgLeila= ImageIO.read(new File("images/person1.png"));
		
	
		
		// création de la fenêtre de l'application
		JFrame laFenetre= new JFrame("Animation Train, etc.");
		laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		laFenetre.setSize(512, 512);
		
		// création de la zône de dessin dans la fenêtre
		Dessin d = new Dessin();
		laFenetre.getContentPane().add(d);
		
		// affiche la fenêtre
		laFenetre.setVisible(true);
		
		// les trains de cercles avec image et en couleur
		TrainCercle[] lesTrains= new TrainCercle[10];
		lesTrains[0] = new TrainCercleImage(d, 10, imgVador); d.ajouterObjet(lesTrains[0]);
		lesTrains[1] = new TrainCercleImage(d, 10, imgLeila); d.ajouterObjet(lesTrains[1]);
		for (int i = 2; i < 10; i++) {
			lesTrains[i] = new TrainCercleCouleur(new Color((float) Math.random(), (float) Math.random(),
		(float) Math.random()), d, 10, 10);
		d.ajouterObjet(lesTrains[i]);
		}
		
		
		
		
		
		Visage visage = new Visage(d,100,300,50,50);
		
		
		Etoile etoileV = new Etoile(400,100,60,5.f,Color.green,Color.green);
		Etoile etoileJ = new Etoile(320,200,60,5.f,Color.yellow,Color.yellow);
		
		PolygoneRegulier polygoneN = new PolygoneRegulier(5,250,100,60,5.f,Color.black,Color.black);
		PolygoneRegulier polygoneG = new PolygoneRegulier(5,60,100,60,5.f,Color.gray,Color.gray);
		
		MvtCirculaire movmentC_plygone =  new MvtCirculaire(350,300,150,50,10);
		MvtCirculaire movmentC_etoile =  new MvtCirculaire(500,400,150,50,10);
		MvtCirculaire movmentC_visage =  new MvtCirculaire(300,300,150,35,10);


		AnimationForme animationEtoille = new AnimationForme(etoileJ,movmentC_etoile);
		AnimationForme animationPolygone = new AnimationForme(polygoneG,movmentC_plygone);
		AnimationForme animationVisage = new AnimationForme(visage,movmentC_visage);

		
		d.ajouterObjet(visage);
		d.ajouterObjet(etoileV);
		d.ajouterObjet(polygoneN);
		d.ajouterObjet(animationEtoille);
		d.ajouterObjet(animationPolygone);
		d.ajouterObjet(animationVisage);

	  
	    

		while(true) {
		// la zone de dessin se réaffiche
		d.repaint();
		// un temps de pause pour avoir le temps de voir le nouveau dessin
		d.pause(50);
		//réaliser à tous les trains un déplacement élémentaire
		d.animer();
		visage.deplacer();
		}

	}

}
