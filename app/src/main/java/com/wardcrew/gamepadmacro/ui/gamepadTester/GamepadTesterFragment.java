package com.wardcrew.gamepadmacro.ui.gamepadTester;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.wardcrew.gamepadmacro.databinding.FragmentGamepadTesterBinding;


public class GamepadTesterFragment extends Fragment {

    private FragmentGamepadTesterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        GamepadTesterViewModel gamepadTesterViewModel =
//                new ViewModelProvider(this).get(GamepadTesterViewModel.class);

        binding = FragmentGamepadTesterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textDashboard;
//        gamepadTesterViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}