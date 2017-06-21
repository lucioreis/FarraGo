package inf221.trabalho.com.farrago.controller;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.controller.FragmentTab1;
import inf221.trabalho.com.farrago.controller.FragmentTab2;

public class GerarBoleto extends FragmentActivity {

    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gerar_boleto);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabs);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Cartão", null),
                FragmentTab1.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Boleto", null),
                FragmentTab2.class, null);

    }



}
