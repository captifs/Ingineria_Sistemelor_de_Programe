package Laborator_ISP_Asociatie;

public class Application {
	public static void main(String args[]) {
		Client primul = new Client();
		primul.setCNP(1234567891234L);
		primul.setNume("Mihai");
		primul.setPrenume("Burduja");
		Client doilea = new Client();
		doilea.setCNP(1234567891543L);
		doilea.setNume("Andrei");
		doilea.setPrenume("Mihai");
		doilea.afisare();
		
		
		AsigurareAuto a1 = new AsigurareAuto();
		a1.setAnFabricatie(1999);
		a1.setClient(primul);
		a1.setDataInceput("2020-12-10");
		a1.setDataSfarsit("2021-01-01");
		a1.setNumarIdentificare("CNL 722");
		a1.setPutere(50);
		a1.afisare();
		
		AsigurareAuto a2 = new AsigurareAuto();
		a2.setAnFabricatie(2002);
		a2.setClient(doilea);
		a2.setDataInceput("2019-12-10");
		a2.setDataSfarsit("2020-01-01");
		a2.setNumarIdentificare("CNF 222");
		a2.setPutere(150);
		a2.afisare();
		
		
			
		AgentAsigurari agent = new AgentAsigurari();
		agent.addAsigurare(a1);
		agent.addAsigurare(a2);
		agent.afisareListaAsigurari();
		
	}
}
