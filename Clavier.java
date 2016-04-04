import java.io.* ;
class Clavier
{ 
  public static String lireString ()   // lecture d'une chaine
  { String ligne_lue = null ;
    try
    { InputStreamReader lecteur = new InputStreamReader (System.in) ;
      BufferedReader entree = new BufferedReader (lecteur) ;
      ligne_lue = entree.readLine() ;
    }
    catch (IOException err)
    { System.exit(0) ;
    }
    return ligne_lue ;
  }


  public static char lirechar ()   // lecture d'une chaine
  { char a = 'A' ;
    int b=0;
    try
    { InputStreamReader lecteur = new InputStreamReader (System.in) ;
      BufferedReader entree = new BufferedReader (lecteur) ;
      b = entree.read() ;
      a = (char)b;
    }
    catch (IOException err)
    { System.exit(0) ;
    }
    return a ;
  }


public static int lireInt ()         // lecture d'un int
  { int n=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      n = Integer.parseInt(ligne_lue) ;
      }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return n ;
  }
}

