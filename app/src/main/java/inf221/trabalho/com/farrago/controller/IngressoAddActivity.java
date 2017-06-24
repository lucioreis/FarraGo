package inf221.trabalho.com.farrago.controller;


import java.sql.SQLException;
import java.util.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.model.DatabaseHelper;
import inf221.trabalho.com.farrago.model.Ingresso;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

public class IngressoAddActivity extends Activity implements OnClickListener {

    private DatabaseHelper databaseHelper = null;

    private EditText busca_et;
    private ImageButton buscar_btn;

    private Dao<Ingresso, Integer> IngressoDao;

    private List<Ingresso> ingressos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busca_tab_ingressos);

        busca_et = (EditText) findViewById(R.id.texto_de_pesquisa);

        buscar_btn = (ImageButton) findViewById(R.id.buscar_ingresso_btn);

        buscar_btn.setOnClickListener(this);
    }

    // inicializacao
    private DatabaseHelper getHelper() {
        if (databaseHelper == null) {
            databaseHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
        }
        return databaseHelper;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (databaseHelper != null) {
            OpenHelperManager.releaseHelper();
            databaseHelper = null;
        }
    }

    @Override
    public void onClick(View v) {
        showMessageDialog("TA AQUI VIADO");
        if (busca_et.getText().toString().trim().length() > 0) {

            try {
                IngressoDao = getHelper().getIngressoDao();
                ingressos = IngressoDao.queryForAll();
            } catch (SQLException e) {
                showMessageDialog("LANCOU EXCESSAO");
            }
            showMessageDialog("Carregou a tabela, primeira cidade = "+ingressos.get(0).cidade);
            // TEM QUE IMPRIMIR OS INGRESSOS

        } else {
            showMessageDialog("Campo de busca nao pode ser vazio");
        }
    }

    private void showMessageDialog(final String message) {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage(message);
        final AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}