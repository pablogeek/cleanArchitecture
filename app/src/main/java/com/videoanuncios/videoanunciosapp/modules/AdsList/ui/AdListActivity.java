package com.videoanuncios.videoanunciosapp.modules.AdsList.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;

import com.videoanuncios.videoanunciosapp.R;
import com.videoanuncios.videoanunciosapp.data.mocks.AdRepositoryMock;
import com.videoanuncios.videoanunciosapp.domain.model.Ad;
import com.videoanuncios.videoanunciosapp.modules.AdsList.AdListPresenter;
import com.videoanuncios.videoanunciosapp.modules.AdsList.AdListPresenterImpl;
import com.videoanuncios.videoanunciosapp.modules.AdsList.domain.AdListInteractor;
import com.videoanuncios.videoanunciosapp.modules.AdsList.domain.AdListInteractorImpl;

import java.util.List;

/**
 * Created by pablomartinez on 11/05/2017.
 */

public class AdListActivity extends AppCompatActivity implements AdListPresenter.AdListView{


    private AdListPresenter presenter;

    private GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adlist);

        this.gridview = (GridView) findViewById(R.id.adlist_gridview);

        AdListInteractor interactor = new AdListInteractorImpl(new AdRepositoryMock());
        this.presenter = new AdListPresenterImpl(this,interactor);
        interactor.setCallback((AdListPresenterImpl)this.presenter);
        this.presenter.start();
        this.presenter.latestItems();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.stop();
    }

    @Override
    public void setAdds(List<Ad> ads) {
        AdListAdapter adapter = new AdListAdapter(this,ads);
        this.gridview.setAdapter(adapter);
    }
}
