import java.awt.* ;
import java.io.* ;
import java.util.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//class IOException extends Exception
//{ }

class FenText extends JFrame implements ActionListener 
{ 


  private JTextField classe,matiere,date;
  private JComboBox combo1;
  private JButton bouton ;
  private JLabel Lclasse,Lmatiere,Ldate ;
  private JLabel Llib1,Llib2,Llib3,Llib4,Llib5,Llib6,Llib7,Llib8,Llib9,Llib10 ;
  private JLabel Ln1,Ln2,Ln3,Ln4,Ln5,Ln6,Ln7,Ln8,Ln9,Ln10 ;
  private JLabel[] ln = new JLabel[25];
  private JCheckBox cb011,cb012,cb013,cb014,cb015,cb016,cb017,cb018,cb019;
  private JCheckBox[][] X=new JCheckBox[30][20];
  int e, h, numele;
  String TS2IR[] = {"TS2IR" , "AKARKACH       ", "CONNER           ", "DAULHAC          " , "DAVION            " , "DENNU             ", "DUCASTE          " , "GRACIAS           " , "HAQUIN         " , "JUSSY          " , "KABA         " , "LABBE         " , "LEREST        " , "MHOMA          " , "NGUYEN         " , "SADOWSKI       " , "SIBY        " , "TAFFONNEAU     " , "TORRENTE        " , "WALTER         " , "YOUSSOUF        " };
  String TS2IRBD[] = {"TS2IR" , "AKARKACH", "CONNER", "DAULHAC" , "DAVION" , "DENNU", "DUCASTE" , "GRACIAS" , "HAQUIN" , "JUSSY" , "KABA" , "LABBE" , "LEREST" , "MHOMA" , "NGUYEN" , "SADOWSKI" , "SIBY" , "TAFFONNEAU" , "TORRENTE" , "WALTER" , "YOUSSOUF" };



  public FenText ()
  { 

  for(e = 0;e<30;e++)
   { for(h = 0;h<20;h++)
       { 
       X[e][h]=new JCheckBox("    ",true);
       }
   }

    setTitle ("Saisie des Absences.") ;
    setSize (1200, 1000) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new GridLayout(20,10)) ;



    JPanel y1 = new JPanel();
    Lclasse=new JLabel("CLASSE:");
    y1.add(Lclasse);

    classe = new JTextField(8) ;
    y1.add(classe) ;
    classe.setText("TS2IR");

    Lmatiere=new JLabel("MATIERE:");
    y1.add(Lmatiere);

    combo1 = new JComboBox();
    combo1.addItem("INFO");
    combo1.addItem("MATH");
    combo1.addItem("PHYSIQUE");
    combo1.addItem("ANGLAIS");
    combo1.addItem("FRANCAIS");
    y1.add(combo1);


    Ldate=new JLabel("DATE:");
    y1.add(Ldate);

    date = new JTextField(8) ;
    y1.add(date) ;
    SimpleDateFormat formater = null;
    Date aujourdhui = new Date();
    formater = new SimpleDateFormat("yyyy-MM-dd");
    date.setText(formater.format(aujourdhui));
    contenu.add(y1);

    JPanel y2 = new JPanel();
    Llib1=new JLabel("ELEVES         ");
    y2.add(Llib1);
    Llib2=new JLabel("08H15");
    y2.add(Llib2);
    Llib3=new JLabel("09H15");
    y2.add(Llib3);
    Llib4=new JLabel("10H25");
    y2.add(Llib4);
    Llib5=new JLabel("11H25");
    y2.add(Llib5);
    Llib6=new JLabel("12H50");
    y2.add(Llib6);
    Llib7=new JLabel("13H50");
    y2.add(Llib7);
    Llib8=new JLabel("14H50");
    y2.add(Llib8);
    Llib9=new JLabel("16H00");
    y2.add(Llib9);
    Llib10=new JLabel("17H00");
    y2.add(Llib10);
    contenu.add(y2);


    //===================== JPANEL ELEVES.......================

    JPanel[] panele = new JPanel[25];
    JPanel var1 = new JPanel(); panele[1]= var1;
    JPanel var2 = new JPanel(); panele[2]= var2;
    JPanel var3 = new JPanel(); panele[3]= var3;
    JPanel var4 = new JPanel(); panele[4]= var4;
    JPanel var5 = new JPanel(); panele[5]= var5;
    JPanel var6 = new JPanel(); panele[6]= var6;
    JPanel var7 = new JPanel(); panele[7]= var7;
    JPanel var8 = new JPanel(); panele[8]= var8;
    JPanel var9 = new JPanel(); panele[9]= var9;
    JPanel var10 = new JPanel(); panele[10]= var10;
    JPanel var11 = new JPanel(); panele[11]= var11;
    JPanel var12 = new JPanel(); panele[12]= var12;
    JPanel var13 = new JPanel(); panele[13]= var13;
    JPanel var14 = new JPanel(); panele[14]= var14;
    JPanel var15 = new JPanel(); panele[15]= var15;
    JPanel var16 = new JPanel(); panele[16]= var16;

    JLabel va1 = new JLabel(); ln[1]=va1;
    JLabel va2 = new JLabel(); ln[2]=va2;
    JLabel va3 = new JLabel(); ln[3]=va3;
    JLabel va4 = new JLabel(); ln[4]=va4;
    JLabel va5 = new JLabel(); ln[5]=va5;
    JLabel va6 = new JLabel(); ln[6]=va6;
    JLabel va7 = new JLabel(); ln[7]=va7;
    JLabel va8 = new JLabel(); ln[8]=va8;
    JLabel va9 = new JLabel(); ln[9]=va9;
    JLabel va10 = new JLabel(); ln[10]=va10;
    JLabel va11 = new JLabel(); ln[11]=va11;
    JLabel va12 = new JLabel(); ln[12]=va12;
    JLabel va15 = new JLabel(); ln[15]=va15;
    JLabel va16 = new JLabel(); ln[16]=va16;
    JLabel va17 = new JLabel(); ln[17]=va17;
    JLabel va18 = new JLabel(); ln[18]=va18;

    for (numele=1;numele<=8;numele++)
    {
      e=numele;
      ln[e].setText(TS2IR[e]);
      panele[e].add(ln[e]);
      for (h=0;h<20;h++) { X[e][h].setSelected(false); }
      for (h=8;h<17;h++) { panele[e].add(X[e][h]); }
      contenu.add(panele[e]);
    }




    JPanel y6 = new JPanel();
    bouton = new JButton ("ENREGISTRER") ;
    y6.add(bouton) ;
    contenu.add(y6);
    


    bouton.addActionListener(this) ;

  }

 public void ecritDB()
 {
 try {
    Class.forName("com.mysql.jdbc.Driver");
    }
catch (ClassNotFoundException e)
    {
    System.out.println("######################Drive Class Not Found."); e.printStackTrace(); return; 
    }

try {
    String ordreSQL;
    //Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gps?user=tintin&password=tintin");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/absences16","root", "");
    Statement commande = conn.createStatement(); 
    for (e=1;e<=2;e++)
      { for (h=8;h<17;h++)
        {       
           if (X[e][h].isSelected()) 
             {       
                ordreSQL="insert into absences16 values('TS2IR"+e+"','"+TS2IRBD[e]+"','"+date.getText()+"','"+h+"','"+classe.getText() +"','"+combo1.getSelectedItem()+"');";
                System.out.println(ordreSQL);
                commande.executeUpdate(ordreSQL);
             }       
        }       
      }   
    commande.close();
    conn.close();
        
    } 
       catch (SQLException ex)
         {       
            System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
         }       
 }


  public void ecritfichier()  //   throws IOException
  {
    String nomFichier ;

    String ordreSQL;
    for (e=1;e<=2;e++)
      { for (h=8;h<17;h++)
        {
           if (X[e][h].isSelected()) 
             {
                ordreSQL="insert into absences16 values('TS2IR"+e+"','"+TS2IRBD[e]+"','"+date.getText()+"','"+h+"','"+classe.getText() +"','"+combo1.getSelectedItem()+"');";
                System.out.println(ordreSQL);
             }
        }
      }  


    System.out.println ("Nom du fichier a creer : ") ;
    nomFichier = Clavier.lireString() ;
    try { 
    DataOutputStream sortie = new DataOutputStream
                              (new FileOutputStream (nomFichier)) ;

      String texte = classe.getText() ;
      sortie.writeBytes(texte) ; 
      sortie.writeByte(10) ;
      //texte = matiere.getText() ;
      texte=combo1.getSelectedItem().toString();
      sortie.writeBytes(texte) ;
      sortie.writeByte(10) ;
      texte = date.getText() ;
      sortie.writeBytes(texte) ;
      sortie.writeByte(10) ;

    sortie.close() ;
    System.out.println ("**** fin creation fichier ****") ;
    //System.exit(0);
    } //fin try
     catch(Exception e2) {System.out.println("ERREUR E/S...");}
     //catch(FileNotFoundException e3) {System.out.println("DEJA CAPTUREE !!! E/S...");}
  }

  public void actionPerformed (ActionEvent e) // throws IOException pas possible 
  { 
    if (e.getSource() == bouton)
    {
    //ecritfichier();
    ecritDB();
    System.exit(0);
    }
  }
}
public class ecran16H
{ public static void main (String args[]) 
  { FenText fen = new FenText() ;
    fen.setVisible(true) ;
  }
}

