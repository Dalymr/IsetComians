package com.dalymr.isetcomians;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

        // Main Class
public class MainActivity extends AppCompatActivity {

        // Loading time ( Splash Screen Display time )
    private static final int SPLASH_TIME_OUT = 5000; // 2 sec
        // Layout Display
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Removes App Title
        Objects.requireNonNull(getSupportActionBar()).hide();

        // Shows Splash Screen from layout "splash_screen.xml"
        setContentView(R.layout.splash_screen);
        ImageView logo = findViewById(R.id.logo);
        ObjectAnimator animator = ObjectAnimator.ofFloat(logo, "alpha", 0f, 1f);
        animator.setDuration(3000);
        animator.start();


        // Redirection to help Website when clicking " Can't Sign in ? "
        new Handler().postDelayed(() -> {
            setContentView(R.layout.activity_main);
            TextView myTextView = (TextView) findViewById(R.id.needHelpRedirect);
            myTextView.setMovementMethod(LinkMovementMethod.getInstance());
            myTextView.setText(Html.fromHtml("<a href='https://www.isetcom.tn' style='text-decoration:none;'>Can't Sign in ?</a>"));
        }, SPLASH_TIME_OUT);
    }
        // Sign in button
    //TODO: Sign in
    public void onBtnClick(View view) {
        EditText studentId = findViewById(R.id.studentIdInput);
        EditText pass = findViewById(R.id.passwordInput);
    }
}