package com.videoanuncios.videoanunciosapp.modules.AdsList;

import com.videoanuncios.videoanunciosapp.common.BasePresenter;
import com.videoanuncios.videoanunciosapp.domain.model.Ad;

import java.util.List;

/**
 * Created by pablomartinez on 11/05/2017.
 */

public interface AdListPresenter extends BasePresenter {


    public void latestItems();

    interface AdListView{
        void setAdds(List<Ad> ads);
    }

}
