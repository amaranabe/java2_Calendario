import java.util.Date;

import java.text.SimpleDateFormat;
import java.text.ParseException;

class Fotografia {


	public Fotografia () {
		Date fechaFoto=null;

	}

	private int codigo;
	private String nombreAutor;
	private String ubicación;
	private Date fechaFoto;
	
	

	public void setCodigo (int idcodigo) {
		this.codigo=idcodigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setNombreAutor(String idnombreAutor) {
		this.nombreAutor=idnombreAutor;
	}

	public String getNombreAutor() {
		return this.nombreAutor;
	}

	public void setUbicacion (String idubicacion) {
		this.ubicación=idubicacion;
	}

	public String getUbicacion () {
		return this.ubicación;
	}

	public void setFechaFoto (Date idfechaFoto) {
		this.fechaFoto=idfechaFoto;
	}

	public Date getFechaFoto () {
		return this.fechaFoto;
	}

	//convertir string que soliciti a fecha:
	public Date convertirfecha(String fecha){

    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
    
    try {
        fechaFoto = formatofecha.parse(fecha);
    }
    
    catch (ParseException ex)
    {
        System.out.println(ex);
    }
    return fechaFoto;
}

}