import java.util.*;

public class appleiiemulator {
	public static void main(String[] args) {
		//Declare vars for use
		Scanner input = new Scanner(System.in);
		boolean emulatorIsRunning;
		emulatorIsRunning = true;
		boolean pegasus;
		pegasus = false;
		
		//Initial emulator boot
		System.out.println("]");
		while(emulatorIsRunning = true) {
			//Username request
			System.out.print("Username: ");
			String user = input.nextLine();
			//Sets correct username and compares inputted user with correct string
			String corrUser = "Syphus590";
			if(user.equals(corrUser)) {
				System.out.println("Accepted");
			}
			else {
				System.out.println("Invalid or unknown username");
			}
			while(user.equals(corrUser)) {
				//Password request
				System.out.print("Password: ");
				String pass = input.nextLine();
				//Sets correct password and compares inputted password with correct string along with backdoor password
				String corrPass = "VZ$JK$MEDZ5AT";
				String passBackdoor = "Spire";
				if(pass.equals(corrPass)||pass.equals(passBackdoor)) {
					System.out.println("Access Granted");
				}
				else {
					System.out.println("Incorrect Password");
				}
				while(pass.equals(corrPass)||pass.equals(passBackdoor)) {
					//Requests for directory
					System.out.print("Input Directory ID: ");
					String dir = input.nextLine();
					
					//Tests for Pegasus Dir and gives user dir, otherwise notifies user directory specified does not exist
					String pegasusDir = "Pegasus";
					if(dir.equals(pegasusDir)) {
						System.out.println("Access Granted");
					} else {
						System.out.println("No Such Directory");
					}
					while(dir.equals(pegasusDir)) {
						pegasus();
					}

					//Other directories may go here in the future
					
				}
			}
		}
		//Notifies user of end of emulation
		System.out.println("End of emulation");
	}
	
	//Makes the pegasus method (Directory)
	private static void pegasus() {
		//Calls input var for Scanners
		Scanner input = new Scanner(System.in);
		
	System.out.println("Listing Files.");
		System.out.println("   A: Potential Test Subject Matches"+"\n"+"	   For Trial 2A8764B");
		System.out.println("   B: Chat Log 23632");
		System.out.println("   C: Chat Log 23645");
		System.out.println("   D: Pegasus773.avi");
		System.out.println("   E: 863ConfirmedSubjects.zip");
		System.out.print("Read File: ");
		String pegasusFileRead = input.nextLine();
		
		//Sets vars A, B, C, D, and E (with lowercase variants) for file selection
		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		String E = "E";
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		
		//Determines file chosen by user and directs user to that specific file
		if(pegasusFileRead.equals(A)||pegasusFileRead.equals(a)) {
			trialDocs();
		}
		if(pegasusFileRead.equals(B)||pegasusFileRead.equals(b)) {
			log32();
		}
		if(pegasusFileRead.equals(C)||pegasusFileRead.equals(c)) {
			log45();
		}
		if(pegasusFileRead.equals(D)||pegasusFileRead.equals(d)) {
			pegasus773AVI();
		}			
		if(pegasusFileRead.equals(E)||pegasusFileRead.equals(e)) {
			confSubjectsZIP();
		}	
	}
	
	private static void trialDocs() {
		Scanner input = new Scanner(System.in);
		//Prints the trial documents to console
		System.out.println("nAME: [classified],pATIENT ID: A5159"+"\n"+",bLOOD tYPE: A+,aLLERGIES: none specifie"+"\n"+"d,sTATUS: unknown,pHONE nUmber: [redacte"+"\n"+"d],mEDICATION: oxymorphone (severe leg p"+"\n"+"ain)");
		System.out.println("nAME: mary t.,pATIENT ID: P7892,bLOO"+"\n"+"D tYPE: A+,aLLERGIES: none specified,sTA"+"\n"+"TUS: terminated from project,pHONE nUMBE"+"\n"+"R: [redacted],mEDICATION: doxepine (inso"+"\n"+"mnia)");
		System.out.println("nAME: natalya r.,pATIENT ID: [classified"+"\n"+"],bLOOD tYPE: B-,aLLERGIES: tree nuts,sT"+"\n"+"ATUS: recovered,pHONE nUMBER: [redacted]"+"\n"+",mEDICATION: none");
		System.out.println("nAME: osamu w.,pATIENT ID: A5158,bLO"+"\n"+"OD tYPE: O-,aLLERGIES: none specified,sT"+"\n"+"ATUS: [reading failed],pHONE nUMBER: [re"+"\n"+"dacted],mEDICATION: doxepine (insomnia)");
		System.out.println("nAME: robert i.,pATIENT ID: M2378,bL"+"\n"+"OOD tYPE: AB+,aLLERGIES: canine fur, fel"+"\n"+"ine fur,sTATUS: recovered,pHONE nUMBER:"+"\n"+" [redacted],mEDICATION: NSAID (digestive "+"\n"+"pain)");
		System.out.println("nAME: jenna k.,pATIENT ID: [reading fail"+"\n"+"ed],bLOOD tYPE: unknown,aLLERGIES: [read"+"\n"+"ing failed],sTATUS: deceased,pHONE nUMBE"+"\n"+"R: [redacted],mEDICATION: none");
		System.out.println("nAME: mark s.,pATIENT ID: B5187,bLOO"+"\n"+"D tYPE: A-,aLLERGIES: none specified,sTA"+"\n"+"TUS: unknown,pHONE nUMBER: [redacted],mE"+"\n"+"DICATION: oxymorphone (amputation pain)");
		System.out.println("nAME: [classified],pATIENT ID: [redacted"+"\n"+"],bLOOD tYPE: [redacted],aLLERGIES: [red"+"\n"+"acted],sTATUS: [redacted],pHONE nUMBER: "+"\n"+"[redacted],mEDICATION: [redacted]");
		System.out.println("nAME: jim s.,pATIENT ID: A5234,bLOOD"+"\n"+" tYPE: B+,aLLERGIES: latex, insect sting"+"\n"+"s,sTATUS: hospitalized,pHONE nUMBER: [re"+"\n"+"dacted],mEDICATION: none");
		System.out.println("nAME: charlotte g.,pATIENT ID: [reading "+"\n"+"failed],bLOOD tYPE: B+,aLLERGIES: none s"+"\n"+"pecified,sTATUS: [classified],pHONE nUMB"+"\n"+"ER: [redacted],mEDICATION: none");
		//Waits for user to input ENTER to return to file selection
		for(;;) {
			System.out.println("");
			System.out.println("Enter To Return To Pegasus Directory");
			
			String returnToPegasusFromA = input.nextLine();
			String returnToPegasusFromAString = "";
			if(returnToPegasusFromA.equals(returnToPegasusFromAString)) {
				break;
			} else {
				break;
			}
		}
	}
	
	private static void log32() {
		Scanner input = new Scanner(System.in);
		//Prints Log #23632 to console, and waits for user to input ENTER to go to next line
		System.out.print("D - They're out of cream in the break ro"+"\n"+"om.");
		nextLine();
		System.out.print("B27 - Regular or vanilla?");
		nextLine();
		System.out.print("D - Hazelnut.");
		nextLine();
		System.out.print("B27 - Order confirmed.");
		nextLine();
		System.out.print("D - I have the lab report concerning pat"+"\n"+"ient A5159");
		nextLine();
		System.out.print("B27 - And the results?");
		nextLine();
		System.out.print("D - Allodynia in the shins when attempti"+"\n"+"ng to walk. We assume it might be due to"+"\n"+" complications from the spinal fusion.");
		nextLine();
		System.out.print("B27 - Will that affect the timeline for "+"\n"+"experiment #5?");
		nextLine();
		System.out.print("D - Yes.");
		nextLine();
		System.out.print("B27 - Copy that.");
		nextLine();
		System.out.print("D - I will be in the lab at 11 AM tomorr"+"\n"+"ow.");
		nextLine();
		System.out.print("B27 - Can you be there at 9 AM?");
		nextLine();
		System.out.print("D - No.");
		nextLine();
		System.out.print("B27 - Nelson needs you to run the second"+"\n"+" trial for experiment #6");
		nextLine();
		System.out.print("D - The participant isnt ready.");
		nextLine();
		System.out.print("B27 - These are direct orders.");
		nextLine();
		System.out.print("D - I wont repeat myself. You can have N"+"\n"+"elson contact me directly.");
		nextLine();
		System.out.print("B27 - Confirmed.");
		nextLine();
		//Prompts user to input ENTER to return to the file selection
		for(;;) {
			System.out.println("Enter to return to Pegasus directory");
			
			String returnToPegasusFromB = input.nextLine();
			String returnToPegasusFromBString = "";
			if(returnToPegasusFromB.equals(returnToPegasusFromBString)) {
				break;
			} else {
				break;
			}
		}
	}
	
	private static void log45() {
		Scanner input = new Scanner(System.in);
		//Prints log #23645 to console, and waits for user to input ENTER to go to next line
		System.out.print("GR - Theyre out of cream in the break ro"+"\n"+"om.");
		nextLine();
		System.out.print("D - Regular or vanilla?");
		nextLine();
		System.out.print("GR - Hazelnut.");
		nextLine();
		System.out.print("D - Order confirmed.");
		nextLine();
		System.out.print("GR - Update needed on experiment #6.");
		nextLine();
		System.out.print("D - The second participants encephalitis"+"\n"+" worsened overnight. Like the first one,"+"\n"+" and they were pronounced brain dead at "+"\n"+"5:15 AM. The experiment is halted until "+"\n"+"further notice.");
		nextLine();
		System.out.print("GR - Do we not have a back-up trial subj"+"\n"+"ect?");
		nextLine();
		System.out.print("D - No.");
		nextLine();
		System.out.print("GR - Copy that. Status update on experim"+"\n"+"ent #474 and #927");
		nextLine();
		System.out.print("D - Trials for experiment #474 & #927 ha"+"\n"+"ve been postponed until further studying"+"\n"+" can be done considering the subjects si"+"\n"+"de effects. All are being treated in the"+"\n"+" Pegasus sub-section.");
		nextLine();
		System.out.print("GR - We can provide more participants, i"+"\n"+"f the current ones arent useful.");
		nextLine();
		System.out.print("D - I dont think that's a wise decision.");
		nextLine();
		System.out.print("GR - Explain.");
		nextLine();
		System.out.print("D - Interviews for the specific particip"+"\n"+"ants took weeks. And we're already behin"+"\n"+"d schedule as it is. And more importantl"+"\n"+"y, it wouldn't be ethically responsible "+"\n"+"testing something that has as many linge"+"\n"+"ring issues as it does.");
		nextLine();
		System.out.print("D - We'd be guaranteeing more delays");
		nextLine();
		System.out.print("GR - I'm sure you're aware, but we have "+"\n"+"an abundance of participation. It won't "+"\n"+"be a problem.");
		nextLine();
		System.out.print("GR - It's fruitless if each and every on"+"\n"+"e turns out exactly the same because we "+"\n"+"didn't fix what we needed to.");
		nextLine();
		System.out.print("GR - Nelson believes that every particip"+"\n"+"ant is different, perhaps we'll see diff"+"\n"+"erent results.");
		nextLine();
		System.out.print("D - I would be practically guaranteeing "+"\n"+"that they would be facing severe adverse"+"\n"+" effects.");
		nextLine();
		System.out.print("GR- So this is mainly an ethical proble"+"\n"+"m, then?");
		nextLine();
		System.out.print("D - Yes.");
		nextLine();
		System.out.print("GR - I'll be in touch with the legal tea"+"\n"+"m. Please leave the waivers on my desk.");
		nextLine();
		//Prompts user to input ENTER to return to file selection
		for(;;) {
			System.out.println("Enter to return to Pegasus directory");
			
			String returnToPegasusFromC = input.nextLine();
			String returnToPegasusFromCString = "";
			if(returnToPegasusFromC.equals(returnToPegasusFromCString)) {
				break;
			} else {
				break;
			}
		}
	}
	
	private static void pegasus773AVI() {
		//Prints an error if user attempts to select the AVI file
		Scanner input = new Scanner(System.in);
		System.out.println("Error. Unknown format.");
		for(;;) {
			System.out.println("Enter to return to Pegasus directory");
			
			String returnToPegasusFromD = input.nextLine();
			String returnToPegasusFromDString = "";
			if(returnToPegasusFromD.equals(returnToPegasusFromDString)) {
				break;
			} else {
				break;
			}
		}
	}
	
	private static void confSubjectsZIP() {
		//Prints an error if user attempts to select the ZIP file
		Scanner input = new Scanner(System.in);
		System.out.println("Error. Unknown format.");
		for(;;) {
			System.out.println("Enter to return to Pegasus directory");
			
			String returnToPegasusFromE = input.nextLine();
			String returnToPegasusFromEString = "";
			if(returnToPegasusFromE.equals(returnToPegasusFromEString)) {
				break;
			} else {
				break;
			}
		}
	}
	
	//The method used to wait for user to input ENTER to go to the next line in chats
	private static void nextLine() {
		Scanner input = new Scanner(System.in);
		String newLine = input.nextLine();
		String newLineString = "";
		if(newLine.equals(newLineString)) {
			System.out.println("");
		}
	}
}