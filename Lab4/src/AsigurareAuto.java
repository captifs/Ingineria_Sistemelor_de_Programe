// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Laborator_ISP_Asociatie;

/************************************************************/
/**
 * 
 */
public class AsigurareAuto  {
	/**
	 * 
	 */
	private String numarIdentificare;
	/**
	 * 
	 */
	private int anFabricatie;
	/**
	 * 
	 */
	private int putere;
	/**
	 * 
	 */
	private String dataInceput;
	/**
	 * 
	 */
	private String dataSfarsit;
	/**
	 * 
	 */
	private Client client;
	

	/**
	 * 
	 */
	public void afisare() {
		client.afisare();
		System.out.println(numarIdentificare + " " + anFabricatie + " " + putere + " " + dataInceput + " " + dataSfarsit);
		
	}
	public void linkClient(Client c) {
		this.client = c;	
	}
	public String getNumarIdentificare() {
		return numarIdentificare;
	}
	public void setNumarIdentificare(String numarIdentificare) {
		this.numarIdentificare = numarIdentificare;
	}
	public int getAnFabricatie() {
		return anFabricatie;
	}
	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}
	public int getPutere() {
		return putere;
	}
	public void setPutere(int putere) {
		this.putere = putere;
	}
	public String getDataInceput() {
		return dataInceput;
	}
	public void setDataInceput(String dataInceput) {
		this.dataInceput = dataInceput;
	}
	public String getDataSfarsit() {
		return dataSfarsit;
	}
	public void setDataSfarsit(String dataSfarsit) {
		this.dataSfarsit = dataSfarsit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
};