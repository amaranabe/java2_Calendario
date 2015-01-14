import java.util.ArrayList;

class Calendario {


	public Calendario () {


	}


	int año;
	ArrayList<Fotografia> fotografias;
	String patrocinador;

	public void setAño (int idaño) {
		this.año=idaño;
	}

	public int getAño() {
		return this.año;
	}

	public void setFotografias(ArrayList<Fotografia> idfotografias) {
		this.fotografias=idfotografias;
	}

	public ArrayList<Fotografia> getFotografias() {
		return this.fotografias;
	}

	public void setPatrocinador (String idpatrocinador) {
		this.patrocinador=idpatrocinador;
	}

	public String getPatrocinador () {
		return this.patrocinador;
	}




}