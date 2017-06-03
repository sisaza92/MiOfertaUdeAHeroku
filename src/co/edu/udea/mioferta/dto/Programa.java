package co.edu.udea.mioferta.dto;

/**
 *
 * @author CristianCamilo
 */
public class Programa {
    
    private Long codigoPrograma;
    private String nombrePrograma;
    private String estado;

    public Programa(Long codigoPrograma, String nombrePrograma, String estado) {
        this.codigoPrograma = codigoPrograma;
        this.nombrePrograma = nombrePrograma;
        this.estado = estado;
    }

    
    
    public Long getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(Long codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
