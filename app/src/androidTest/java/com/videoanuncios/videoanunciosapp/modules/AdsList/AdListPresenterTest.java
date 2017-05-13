package com.videoanuncios.videoanunciosapp.modules.AdsList;

import com.videoanuncios.videoanunciosapp.data.mocks.AdRepositoryMock;
import com.videoanuncios.videoanunciosapp.modules.AdsList.domain.AdListInteractor;
import com.videoanuncios.videoanunciosapp.modules.AdsList.domain.AdListInteractorImpl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pablomartinez on 12/05/2017.
 */
public class AdListPresenterTest {


    private  AdListPresenter presenter;


    public AdListPresenterTest(){
        AdListInteractor interactor = new AdListInteractorImpl(new AdRepositoryMock());
        this.presenter = new AdListPresenterImpl(null, interactor);
    }

    @Test
    public void testAds(){


    }

}