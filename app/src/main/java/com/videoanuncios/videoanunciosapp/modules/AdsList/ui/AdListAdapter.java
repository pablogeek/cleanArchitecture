package com.videoanuncios.videoanunciosapp.modules.AdsList.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.videoanuncios.videoanunciosapp.R;
import com.videoanuncios.videoanunciosapp.common.imageloader.ImageCacheManager;
import com.videoanuncios.videoanunciosapp.domain.model.Ad;

import java.util.List;

/**
 * Created by pablomartinez on 30/12/15.
 */
public class AdListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Ad> adList;

    public AdListAdapter(Context c, List<Ad> listOffers) {
        mContext = c;
        this.adList = listOffers;
    }

    public void setOffersList(List<Ad> offersList) {
        this.adList = offersList;
    }

    public int getCount() {
        return adList.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        final Ad ad = this.adList.get(position);
        ImageView imageView;
        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.list_ad_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.imgMain = (NetworkImageView) convertView.findViewById(R.id.list_offer_item_image);
            viewHolder.lblAdTitle = (TextView) convertView.findViewById(R.id.list_offer_item_title);
            viewHolder.lblAdPrice = (TextView) convertView.findViewById(R.id.list_offer_item_price);
            viewHolder.lblAdCategory = (TextView) convertView.findViewById(R.id.list_offer_item_category);

            convertView.setTag(viewHolder);

            // if it's not recycled, initialize some attributes
            /*imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);*/
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        //viewHolder.imgMain.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_photo_camera_white_36dp));
        viewHolder.imgMain.setDefaultImageResId(R.drawable.ic_photo_camera_white_36dp);

        viewHolder.imgMain.setImageUrl(ad.getUrlImage(), ImageCacheManager.getInstance().getImageLoader());
        /*OffersParse.getImageByOfferId(offer.getOfferId(), new ParseImagesListener() {
            @Override
            public void onGetImage(Bitmap bitmap) {
                if (viewHolder != null && viewHolder.imgMain != null && viewHolder.offerId.equals(offer.getOfferId())) {
                    offer.setImage(bitmap);
                    viewHolder.imgMain.setImageBitmap(bitmap);
                }
            }
        });*/

        //viewHolder.imgMain.setImageResource(mThumbIds[position]);
        //viewHolder.imgMain.setImageBitmap(null);

        if(ad.getPrice() != 0.0){
            viewHolder.lblAdPrice.setText(String.valueOf(ad.getPrice()));
        }else{
            viewHolder.lblAdPrice.setText("Not defined");
        }
        viewHolder.lblAdTitle.setText(ad.getTitle());

        //viewHolder.lblOfferCategory.setText(offer.getCategory());
        //viewHolder.adId = ad.getOfferId();
       // if (offer.getImage()!= null) {
         //   viewHolder.imgMain.setImageBitmap(offer.getImage());
        //}



        return convertView;
    }



    private static class ViewHolder {
        NetworkImageView imgMain;
        TextView lblAdTitle;
        TextView lblAdPrice;
        TextView lblAdCategory;
        String adId;
    }
}
