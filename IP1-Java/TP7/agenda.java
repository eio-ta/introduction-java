import java.io.*;
import java.util.*;

class agenda {
	public static void print (int[]t){
		for(int i=0; i<t.length; i=i+1){
			System.out.print(t[i]+" ");
		}
		System.out.println();
	}

    // parametres 2016
    static int yearLength = 366; // 2016 est une année bisextile
    static int firstWDay = 4; // 2016 commence un vendredi
    


    /* ***********************************************************/
    /* FONCTION PRINCIPALE                                       */
    /* ***********************************************************/


    public static void main (String [] args) {

	// chargement de l'agenda a partir du fichier
	String [] t = loadAgenda("agenda.dat");
	t[101]= "Mon anniversaire";
	t[126]= "Anniversaire de Tara";

	for(int i=166; i<174; i++) {
	    t[i]= "Bac";
	}

	int compteur = 1;
	for(int i=253; i<366; i++) {
	    if(i%7 == 3) {
		t[i] = "TP " + compteur + " IP1";
		compteur = compteur+1;
	    }
	}

	showAgenda3(t);
	//showAgenda(t, 96, false);
	//print(dateOfDayNumber(86));	


	// modifier et/ou afficher l'agenda
	
    }




    /* ***********************************************************/
    /* PROCEDURE D'AFFICHAGE                                     */
    /* ***********************************************************/

    // a partir de la question 3, definissez ici la procedure
    // d'affichage showAgenda
	public static void showAgenda (String[]t, int startDay, boolean reverse){
	        if(!reverse){
			for(int i=startDay; i<t.length; i=i+1){
				if(!t[i].equals("")){
					System.out.println(i+" "+t[i]);
				}
			}
		}else{
			for(int i=startDay; i>=0; i=i-1){
				if(!t[i].equals("")){
					System.out.println(i+" "+t[i]);
				}
			}
		}
	}
	public static void showAgenda1 (String[]t){
		String[] wDays= {"Lun","Mar","Mer","Jeu","Ven","Sam","Dim"};
		int x=0;
		for(int i=0; i<t.length; i=i+1){
			if(!t[i].equals("")){
				x=x+1;
			}
		}
		System.out.println("Il y a "+x+" événements dans l'agenda");
		
		for(int i=0; i<t.length; i=i+1){
			if(!t[i].equals("")){
			System.out.println(wDays[(i+4)%7]+" "+dateOfDayNumber(i)[0]+"/"+dateOfDayNumber(i)[1]+" "+t[i]);
			}
		}
	}
    
	public static int[] dateOfDayNumber (int dayNumber){
		int[]t=new int[2];
		int x=1;
		int[] daysInMonth={31,29,31,30,31,30,31,31,30,31,30,31};
		for(int i=0; i<12; i=1+i){
			if(dayNumber>=daysInMonth[i]){
				x=x+1;
				dayNumber=dayNumber-daysInMonth[i];
			}
		}
		t[0]=dayNumber+1;
		t[1]=x;
		return t;
	}

    public static void showAgenda3 (String[] t){
	String []wMonths = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin","Juillet","Aout","Septembre","Octobre","Novembre","Décembre"};
	String[] wDays = {"Lun","Mar","Mer","Jeu","Ven","Sam","Dim"};
	int[] daysInMonth={31,29,31,30,31,30,31,31,30,31,30,31};
	int d=0;

	for(int i=0; i<12; i++) {
	    System.out.println (wMonths[i]);
	    System.out.println ("---------------------------");

	    for(int j=0; j<7; j++) {
		System.out.print (wDays[j] + " ");
	    }
	    System.out.println ();

	    for (int j=0; j<(d+4)%7; j++) {
		System.out.print("    ");
	    }

	    for(int j=0; j<daysInMonth[i]; j++) {
		if(t[d].length() == 0) {
		    System.out.print("..." + " ");
		} else {
		    int n = dateOfDayNumber(d)[0];
		    if(n<10) {
			System.out.print("0"+n+" ");
		    } else {
			System.out.print(n+"  ");
		    }
		}
		d++;
		if((d+4)%7 == 0) {
		    System.out.println();
		}
	    }
	    System.out.println("\n");
	}
    }
	

    /* ***********************************************************/
    /* CONVERSION DE DATE                                     */
    /* ***********************************************************/

    // corrigez la fonction ci-dessous

    public static int monthOfDayNumber (int dayNumber) {
	int [] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
	int res = 1;
	for (int i = 0; i<12; i++){  
	    if (dayNumber >= daysInMonth[i]) {
		dayNumber = dayNumber - daysInMonth[i];
		res = res + 1; 
	    }
	}
	return res;
    }


    /* ***********************************************************/
    /* ANNEXE                                                    */
    /* ***********************************************************/

    public static String [] loadAgenda(String fileName) {
    // Lit un fichier contenant un agenda et le renvoie sous forme
    // de tableau

	String [] res = new String[yearLength];

	for (int i=0;i<yearLength;i++){
	    res[i] = "";
	}

	try { 
	    Scanner sc = new Scanner (new File(fileName)).useDelimiter("\n");
	    while (sc.hasNext()) {
		String [] line = sc.next().split(":");
		int day = Integer.parseInt(line[0]);
		String desc = line[1];
		res[day] = desc;
	    }
	    return res;
	} catch (IOException e) {
	    System.out.println("erreur de lecture de fichier"); 
	    return res;
	}
	
    }

}
