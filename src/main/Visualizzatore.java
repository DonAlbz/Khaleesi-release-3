package main;

import inputDati.InputDati;

public class Visualizzatore {
	public final static String VUOTO="Vuoto";
	public final static String SPADA="Spada";
	public final static String ARCO="Arco";
	public final static String PUGNALE="Pugnale";
	public final static String POZIONE="Pozione";
	public final static String FORZIERE="Forziere";
	private final static String OGGETTO_TROVATO="Hai trovato l'oggetto: %s.\n";
	private final static String RACCOGLIERE="Lo vuoi raccogliere?";
	private final static String APRIRE="Lo vuoi aprire?";
	private static final String USARE_POZIONE = "Vuoi usarla?";
	private final static String RICHIESTA_NOME_GUERRIERO = "Inserisci il nome del tuo guerriero: ";
	public final static String FORZIERE_VUOTO = "Il forziere e' vuoto.";
	public static final String FORZIERE_TROVATE_MONETE = "Nel forziere hai trovato %d monete e te ne sei impossessato.\n";
	public static final String FORZIERE_TROVATO_VELENO = "Nel forziere hai trovato del veleno. Hai subito %d danni.\n";
	private static final String CASELLA_VUOTA_TROVATA = "La casella e' vuota.";
	private static final String DROPPARE = "Vuoi lasciare la tua arma su questa casella?";
	private static final String GUERRIERO_CURATO="%s e' stato curato di %d punti ferita.\nOra la sua salute ammonta a %d punti ferita.\n";
	private static final String ARRIVEDERCI = "Grazie per aver giocato a The Shandon Adventure!";
	private static final String BENVENUTO = "Benvenuto in The Shandon Adventure!";
	public static final String ORCO = "Hai trovato un Orco\n";
	private static final String COMBATTI_ORCO = "Vuoi combattere? ";
	private static final String REPORT_COMBATTIMENTO = "Nel combattimento %s ha subito %d danni.\n";
	private static final String PUNTI_VITA = "Ora il tuo guerriero ha %d punti vita.\n";
	private static final String MORTO = "Sfortunatamente il tuo guerriero e' morto.";
	private static final String FUGA_RIUSCITA = "La fuga e' riuscita con successo";
	private static final String FUGA_NON_RIUSCITA = "La fuga non e' riuscita";
	
	public static boolean scegliRaccoltaArma(String nomeOggetto){
		System.out.printf(OGGETTO_TROVATO, nomeOggetto);
		return InputDati.yesOrNo(RACCOGLIERE);				
	}
	
	public static Boolean scegliDropArma() {
		System.out.println(CASELLA_VUOTA_TROVATA);
		return InputDati.yesOrNo(DROPPARE);			
	}
	
	public static boolean scegliAperturaForziere(String nomeOggetto){
		System.out.printf(OGGETTO_TROVATO, nomeOggetto);
		return InputDati.yesOrNo(APRIRE);				
	}
	
	public static boolean scegliUtilizzoPozione(String nomeOggetto) {
		System.out.printf(OGGETTO_TROVATO, nomeOggetto);
		return InputDati.yesOrNo(USARE_POZIONE);				
	}


	public static String richiestaNomeGuerriero() {
		return InputDati.leggiStringaNonVuota(RICHIESTA_NOME_GUERRIERO);
	}

	public static void notificaCura(String nome, int totaleCura, int puntiVita) {
		System.out.printf(GUERRIERO_CURATO, nome, totaleCura, puntiVita);		
	}

	public static Boolean scegliCombattiOrco() {
		System.out.printf(ORCO);
		return InputDati.yesOrNo(COMBATTI_ORCO);				
	}
	
	public static void reportCombattimento(String nomeGuerriero, int danniSubiti){
		System.out.printf(REPORT_COMBATTIMENTO, nomeGuerriero, danniSubiti);
	}
	
	public static void reportPuntiVita(int puntiVita) {
		System.out.printf(PUNTI_VITA, puntiVita);
	}
	
	public static void morto() {
		System.out.println(MORTO);			
	}
	
	public static void printBenvenuto() {
		System.out.println(BENVENUTO );		
	}
	
	public static void printArrivederci() {
		System.out.println(ARRIVEDERCI);
		
	}

	public static void fugaRiuscita(boolean b) {
		if (b)
			System.out.println(FUGA_RIUSCITA);
		else
			System.out.println(FUGA_NON_RIUSCITA);
	}

}
