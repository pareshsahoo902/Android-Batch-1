package com.release.demoapk.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.release.demoapk.R;

public class OtpBottomFragment extends BottomSheetDialogFragment {

    EditText otp;
    Button otpBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.get_otp_layout,container,false);


        otp = view.findViewById(R.id.otpEditText);
        otpBtn = view.findViewById(R.id.otpBtn);

        otpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "OTP IS: "+otp.getText().toString().trim(), Toast.LENGTH_SHORT).show();
            }
        });



        return view;

    }
}
