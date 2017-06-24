package inf221.trabalho.com.farrago.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.model.Evento;
import inf221.trabalho.com.farrago.model.Ingresso;

/**
 * Created by lucio on 6/23/2017.
 */

public class PersonalizadoArrayAdapter extends BaseAdapter {
    private final List<?> objetos;
    private final Activity act;

    public PersonalizadoArrayAdapter(List<?> objetos, Activity act){
        this.objetos = objetos;
        this.act = act;
    }
    @Override
    public int getCount() {
        return objetos.size();
    }

    @Override
    public Object getItem(int position) {
        return objetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*View view = act.getLayoutInflater().inflate(R.layout.list_view_text_style, parent, false);
        if(objetos.get(position) instanceof Ingresso){
            Ingresso ingresso = (Ingresso) objetos.get(position);
            TextView textView = (TextView) view.findViewById(R.id.texto_da_list_view);
            ImageView imageView = (ImageView) view.findViewById(R.id.imagem_da_list_view);
            imageView.setImageResource(R.drawable.ticket);
            textView.setText(ingresso.getEvento().getNomeDoEvento());
            return view;
        } else {
            Evento evento = (Evento) objetos.get(position);
            TextView textView = (TextView) view.findViewById(R.id.texto_da_list_view);
            ImageView imageView = (ImageView) view.findViewById(R.id.imagem_da_list_view);
            imageView.setImageResource(R.drawable.festa_icone);
            textView.setText(evento.getNomeDoEvento());
            return view;
        } */
        return convertView;
    }
}
