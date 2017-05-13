package com.videoanuncios.videoanunciosapp.modules.AdsList;

import com.videoanuncios.videoanunciosapp.domain.model.Ad;
import com.videoanuncios.videoanunciosapp.modules.AdsList.domain.AdListInteractor;

import java.util.List;

/**
 * Created by pablomartinez on 11/05/2017.
 */

public class AdListPresenterImpl implements AdListPresenter, AdListInteractor.AdListInteractorCallback {


    private AdListView view;
    private AdListInteractor interactor;

    public AdListPresenterImpl(AdListView view, AdListInteractor interactor){
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }


    @Override
    public void latestItems() {
        interactor.latestAds();
    }

    @Override
    public void onAdsReceived(List<Ad> ads) {
        view.setAdds(ads);
    }
}
