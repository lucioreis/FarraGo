package inf221.trabalho.com.farrago.controller;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.model.FachadaSingleton;

public class Busca extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private List<String> nomeDeCidades;
    private static  ArrayAdapter<String> arrayCidade, arrayTag, arrayTema, arrayFaixa;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        //spinner = (Spinner) findViewById(R.id.spinner_busca_cidade);
        //TODO = Crregar lista de cidade s do banco de dados
       // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        nomeDeCidades = new ArrayList<>();
        nomeDeCidades.add("Viçosa");
        nomeDeCidades.add("Acapulco");
        arrayCidade = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, new String[]{"Cidade", "Viçosa", "Acapulco", "Pindamonhangaba"});
        nomeDeCidades.add("bebida liberada");
        arrayTag = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, new String[]{"Tag","OpenBar"});
        arrayTema = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, new String[]{"Tema", "micareta", "festa a fantasia"});
        arrayFaixa = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, new String[]{"Faixa Etária", "até 10", "10-14", "14-16", "16-18", "18 ou mais"});
    }

    public void fazerPesquisaPorIngresso(View v){
       //List<String> filtrosSelecionados = (new BuscaTab()).getItensSelecionados();
        startActivity(new Intent(this, ResultadoDaBusca.class));
    }

    public void fazerPesquisaPorEvento(View v){
        startActivity(new Intent(this, ResultadoDaBusca.class));
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_busca, container, false);
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            //return PlaceholderFragment.newInstance(position + 1);
            switch (position) {
                case 0:
                    BuscaTab v = BuscaTab.builder(R.layout.busca_tab_eventos)
                            .arrayCidade(arrayCidade)
                            .arrayTag(arrayTag)
                            .arrayTema(arrayTema)
                            .arrayFaixa(arrayFaixa);
                    return v;
                case 1:
                     v = BuscaTab.builder(R.layout.busca_tab_ingressos)
                             .arrayCidade(arrayCidade);

                    return v;
                case 2:
                    return new BuscaTab(R.layout.busca_tab_vendedores);
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
            }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Eventos";
                case 1:
                    return "Ingressos";
                case 2:
                    return "Vendedores";
            }
            return null;
        }
    }
}
