package com.wardcrew.gamepadmacro.ui.macro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wardcrew.gamepadmacro.databinding.FragmentMacroBinding;

public class MacroFragment extends Fragment {

    private FragmentMacroBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MacroViewModel macroViewModel =
                new ViewModelProvider(this).get(MacroViewModel.class);

        binding = FragmentMacroBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textMacro;
//        macroViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}