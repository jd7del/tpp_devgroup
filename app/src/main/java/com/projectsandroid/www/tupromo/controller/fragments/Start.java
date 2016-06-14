package com.projectsandroid.www.tupromo.controller.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.merhold.extensiblepageindicator.ExtensiblePageIndicator;
import com.projectsandroid.www.tupromo.R;
import com.projectsandroid.www.tupromo.model.Promocion;
import com.projectsandroid.www.tupromo.web_service.GsonRequest;
import com.projectsandroid.www.tupromo.web_service.Util_promociones;
import com.projectsandroid.www.tupromo.web_service.Web_request_singleton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Start extends Fragment {

    String URL_BASE = "http://jasondelgado.net/API/promociones/lista";
    static final int NUM_ITEMS = 4;
    ImageFragmentPagerAdapter imageFragmentPagerAdapter;
    ViewPager viewPager;
    ListView lv_noticias;
    ListView lv_noticias2;
    //prueba 1

    public static final String[] IMAGE_NAME = {
            "http://sabservices.in/include/img/user-blogs/administrator-33-83.jpg",
            "http://www.candnpetroleum.co.za/projects/projects.jpg",
            "http://www.insidejoy.co.za/wp-content/uploads/2014/11/PuzzlePiece2.jpg",
            "http://thispersonstinks.com/wp-content/uploads/2014/03/projects-splash3.jpg",};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_start, container, false);

        imageFragmentPagerAdapter = new ImageFragmentPagerAdapter(getFragmentManager());
        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        viewPager.setAdapter(imageFragmentPagerAdapter);

        ExtensiblePageIndicator extensiblePageIndicator = (ExtensiblePageIndicator) rootView.findViewById(R.id.flexibleIndicator);
        extensiblePageIndicator.initViewPager(viewPager);


//        ArrayList<Noticia> not = new ArrayList<>();
//
//        not.add(new Noticia("noticia 1", "detalle 1", "https://yt3.ggpht.com/-2pQcWEv_57U/AAAAAAAAAAI/AAAAAAAAAAA/_hhB2K2cRBk/s100-c-k-no-rj-c0xffffff/photo.jpg"));
//        not.add(new Noticia("noticia 2", "detalle 2", "http://padelcv.com/wp-content/uploads/2015/11/noticias.png"));
//        not.add(new Noticia("noticia 3", "detalle 3", "http://a2.mzstatic.com/eu/r30/Purple5/v4/07/cd/3a/07cd3ae5-4419-0a8e-764c-97744cf08d5e/icon100x100.png"));
//        not.add(new Noticia("noticia 4", "detalle 4", "http://a1.mzstatic.com/us/r30/Music6/v4/ae/a0/dc/aea0dc51-f0b2-5a49-f4c9-ce1ab5be40d3/cover100x100.jpeg"));
//        not.add(new Noticia("noticia 5", "detalle 5", "http://1.bp.blogspot.com/-I3QNbK7yIIk/T6Uqmzz05DI/AAAAAAAAABU/JZe7lAuqoIo/s100-c/images.jpg"));
//        not.add(new Noticia("noticia 6", "detalle 6", "http://padelcv.com/wp-content/uploads/2015/11/noticias.png"));
//
//        lv_noticias = (ListView) rootView.findViewById(R.id.lv_noticias);
//        lv_noticias.setAdapter(new Noticia_adapter(this.getContext(), not));
        cargar_promociones();
        return rootView;
    }

    /*
     * metodo que carga las promociones desde el webService
     */
    private void cargar_promociones() {
        // Añadir petición GSON a la cola
        Web_request_singleton.getInstance(getContext()).addToRequestQueue(
                new GsonRequest<>(
                        URL_BASE,
                        Util_promociones.class,
                        null,
                        new Response.Listener<Util_promociones>() {
                            @Override
                            public void onResponse(Util_promociones response) {
                                //aqui implementar logica para peticion de respuesta
                                for(Promocion p: response.getPromociones()) {
                                    //muestra en el logcat, el id de la tienda, comprobando la respuesta
                                    Log.d("promt", "id tienda: " + p.getTienda().getId());
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("app", "Error Volley: " + error.getMessage());
                            }
                        }
                )
        );
    }

    public static Start newInstance() {
        Start instance = new Start();
        return instance;
    }

    //Para imagenes inicio--------------------------------------------------------------------------
    public static class ImageFragmentPagerAdapter extends FragmentPagerAdapter {
        public ImageFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            return SwipeFragment.newInstance(position);
        }
    }

    public static class SwipeFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View swipeView = inflater.inflate(R.layout.fragment_swipe_fragment, container, false);

            NetworkImageView imagen = (NetworkImageView) swipeView.findViewById(R.id.imageView);
            //ImageView imageView = (ImageView) swipeView.findViewById(R.id.imageView);
            Bundle bundle = getArguments();
            int position = bundle.getInt("position");
            String imageFileName = IMAGE_NAME[position];

            // Petición el image loader
            ImageLoader imageLoader = Web_request_singleton.getInstance(getContext()).getImageLoader();

            //int imgResId = getResources().getIdentifier(imageFileName, "drawable", getActivity().getPackageName());
            imagen.setImageUrl(imageFileName,imageLoader);

            return swipeView;
        }

        @Override
        public void onDetach() {
            super.onDetach();
        }

        static SwipeFragment newInstance(int position) {
            SwipeFragment swipeFragment = new SwipeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            swipeFragment.setArguments(bundle);
            return swipeFragment;
        }
    }
    //Para imagenes inicio--------------------------------------------------------------------------
}