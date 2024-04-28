package com.wardcrew.gamepadmacro.ui.macro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MacroViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MacroViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}