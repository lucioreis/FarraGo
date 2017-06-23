package inf221.trabalho.com.farrago.model;

import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;

public class CompradorIngresso implements Serializable {
    @DatabaseField(generatedId = true)
    public int idCompradorIngresso;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    public Comprador comprador;

    @DatabaseField(canBeNull =  false, foreign = true, foreignAutoRefresh = true)
    public Ingresso ingresso;

    public CompradorIngresso(){}

    public CompradorIngresso(Comprador c, Ingresso i){
        this.comprador = c;
        this.ingresso = i;
    }
}
