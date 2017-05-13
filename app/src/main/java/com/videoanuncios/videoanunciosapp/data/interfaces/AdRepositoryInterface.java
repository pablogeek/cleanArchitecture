package com.videoanuncios.videoanunciosapp.data.interfaces;

import com.videoanuncios.videoanunciosapp.domain.model.Ad;

import java.util.List;

/**
 * Created by pablomartinez on 13/05/2017.
 */

public interface AdRepositoryInterface {

    public List<Ad> getAdsByDefault();

}
