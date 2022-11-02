package com.example.myapp;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainViewModel extends AndroidViewModel {
private static final String TAG = "MainViewModel";
private final MutableLiveData<List<Image>> imagesFromLiveData = new MutableLiveData<>();
private final CompositeDisposable compositeDisposable = new CompositeDisposable();
private int page = 1;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<Image>> getImagesFromLiveData() {
        return imagesFromLiveData;
    }

    public void loadImage(){
       Disposable disposable = ApiFactory.apiService.loadImage(page)
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(new Consumer<List<Image>>() {
                   @Override
                   public void accept(List<Image> images) throws Throwable {
                       // page++;
                       imagesFromLiveData.setValue(images);
                   }
               }, new Consumer<Throwable>() {
                   @Override
                   public void accept(Throwable throwable) throws Throwable {
                       Log.d(TAG, throwable.toString());
                   }
               });
       compositeDisposable.add(disposable);
   }

    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.dispose();
    }
}
