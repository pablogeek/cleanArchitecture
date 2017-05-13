package com.videoanuncios.videoanunciosapp.modules.AdsList.domain;

import com.videoanuncios.videoanunciosapp.data.AdRepository;
import com.videoanuncios.videoanunciosapp.data.interfaces.AdRepositoryInterface;

/**
 * Created by pablomartinez on 13/05/2017.
 */

public class AdListInteractorImpl implements AdListInteractor {

    private AdListInteractorCallback callback;
    private AdRepositoryInterface adRepository;

    public AdListInteractorImpl(AdRepositoryInterface adRepository){
        this.adRepository = adRepository;
    }

    @Override
    public void setCallback(AdListInteractorCallback callback) {
        this.callback = callback;
    }

    @Override
    public void latestAds() {
        callback.onAdsReceived(adRepository.getAdsByDefault());
    }
}
