package com.videoanuncios.videoanunciosapp.modules.AdsList.domain;

import com.videoanuncios.videoanunciosapp.data.AdRepository;
import com.videoanuncios.videoanunciosapp.domain.model.Ad;

import java.util.List;

/**
 * Created by pablomartinez on 13/05/2017.
 */

public interface AdListInteractor {

    public void latestAds();


    public void setCallback(AdListInteractorCallback callback);

    interface AdListInteractorCallback{
        void onAdsReceived(List<Ad> ads);
    }

}
