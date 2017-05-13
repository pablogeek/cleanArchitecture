package com.videoanuncios.videoanunciosapp.data;

import com.videoanuncios.videoanunciosapp.data.interfaces.AdRepositoryInterface;
import com.videoanuncios.videoanunciosapp.domain.model.Ad;

import java.util.List;

/**
 * Created by pablomartinez on 13/05/2017.
 */

public class AdRepository implements AdRepositoryInterface {
    @Override
    public List<Ad> getAdsByDefault() {
        return null;
    }
}
