package br.com.digitalhouse.firebaseapp.dh_firebase_cecisousa.interfaces;

import br.com.digitalhouse.firebaseapp.dh_firebase_cecisousa.model.Result;

public interface FavoriteItemClick {

    void addFavoriteClickListener(Result result);
    void removeFavoriteClickListener(Result result);
}
