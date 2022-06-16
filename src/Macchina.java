
public class Macchina {
		
		private String nome ;
		private int cilindrata;
		private String targa;
		private int prezzo;
		private String colore;
		private int numeroMarce;
		private boolean motoreAcceso;
		private int marciaCorrente;
		private int Marcia;
		
		public String getNome() {
			return nome;
		}
		
		public int getcilindrata() {
			return cilindrata;
		}
		
		public String getTarga() {
			return targa;
		}
		
		public int getPrezzo() {
			return prezzo;
		}
		
		public String getColore() {
			return colore ;
		}
		
		public int getNumeroMarce() {
			return numeroMarce; 
		}
		
		public boolean isMotoreAcceso() {
			return motoreAcceso;
		}
		
		public int getMarciaCorrente() {
			return marciaCorrente;
		}
		
		// setters
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setCilindrata(int cilindrata) {
			this.cilindrata = cilindrata;
		}
		
		public void setTarga(String targa) {
			this.targa = targa;
		}
		
		public void setPrezzo(int prezzo) {
			this.prezzo = prezzo;
		}
		
		public void setColore(String colore) {
			this.colore = colore;
		}
		
		private void setNumeroMarce(int numeroMarce) {
			this.numeroMarce = numeroMarce; 
			
		}
		
		private void setMotoreAcceso(boolean motoreAcceso) {
			this.motoreAcceso = motoreAcceso;
		}
		
		private void setMarciaCorrente(int marciaCorrente) {
			if (marciaCorrente >= 0 && marciaCorrente <= numeroMarce)
				this.marciaCorrente = marciaCorrente;
		}
		
		public Macchina(String nome, int cilindrata, String targa, int prezzo, String colore, int numeroMarce) {
			
			setNome(nome);
			setCilindrata(cilindrata);
			setTarga(targa);
			setPrezzo(prezzo);
			setColore(colore);
			setNumeroMarce(numeroMarce);
			setMotoreAcceso(false);
			setMarciaCorrente(0);
			
		}

	public void accendiMotore() {
		if (isMotoreAcceso()) {
	       setMarciaCorrente(0);
	       setMotoreAcceso(true);
	    }
	}

	public void spegniMotore() {
			if (isMotoreAcceso()) {
		       setMarciaCorrente(0);
		       setMotoreAcceso(false);
			}
	}
	 
	public void cambiaMarcia(int numeroMarce) {
	    this.marciaCorrente = numeroMarce;
	}

	public void scalaMarcia() {
		if (this.marciaCorrente > 1 && this.marciaCorrente <= this.numeroMarce) {
			this.marciaCorrente--;
		   } else {
			   System.out.println( "Errore");
		   }
	}
	public void aumentaMarcia() {
		if (this.marciaCorrente > 0 && this.Marcia < this.numeroMarce) {
			this.marciaCorrente++;
		   } else {
			   System.out.println( "Errore");
		   }
	}

	public int getValore() {
		return this.prezzo;
	}

	public void stampaInformazioni() {
		System.out.println("Modello auto :" +this.nome );
		System.out.println("Cilindrata :" +this.cilindrata );
		System.out.println("Targa:" +this.getTarga() );
		System.out.println("Prezzo della vettura:" +this.prezzo );
		System.out.println("Colore auto:" +this.getColore() );
		System.out.println("Numero marce :" +this.numeroMarce);
	}
}
