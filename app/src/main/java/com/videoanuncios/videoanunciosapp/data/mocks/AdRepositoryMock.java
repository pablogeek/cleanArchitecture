package com.videoanuncios.videoanunciosapp.data.mocks;

import com.videoanuncios.videoanunciosapp.data.interfaces.AdRepositoryInterface;
import com.videoanuncios.videoanunciosapp.domain.model.Ad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablomartinez on 13/05/2017.
 */

public class AdRepositoryMock implements AdRepositoryInterface {


    @Override
    public List<Ad> getAdsByDefault() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad("My test ad1", 10.0, ""));
        ads.add(new Ad("My test ad2", 12.0, ""));
        ads.add(new Ad("My test ad3", 20.0, ""));
        ads.add(new Ad("My test ad4", 60.0, ""));
        ads.add(new Ad("My test ad5", 8.5, ""));
        ads.add(new Ad("My test ad6", 6.2, ""));
        return ads;
    }
}
