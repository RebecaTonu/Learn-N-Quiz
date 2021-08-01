package com.example.learnnquiz.Conturi;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.example.learnnquiz.R;


public class Inregistrare extends AppCompatActivity implements View.OnClickListener {

    private final AppCompatActivity activity = Inregistrare.this;
    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutNume;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutParola;
    private TextInputEditText textInputEditTextNume;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextParola;
    private AppCompatButton appCompatButtonRegister;
    private AppCompatTextView appCompatTextViewLoginLink;

    private ValidareCont validareCont;
    private Participantdb participantdb;
    private Admin admin;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inregistrare);
        getSupportActionBar().hide();

        initViews();
        initListeners();
        initObjects();
    }

    private void initViews(){
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
        textInputLayoutNume = (TextInputLayout) findViewById(R.id.textInputLayoutNume);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutParola = (TextInputLayout) findViewById(R.id.textInputLayoutParola);
        textInputEditTextNume = (TextInputEditText) findViewById(R.id.textInputEditTextNume);
        textInputEditTextEmail = (TextInputEditText) findViewById(R.id.textInputEditTextEmail);
        textInputEditTextParola = (TextInputEditText) findViewById(R.id.textInputEditTextParola);
        appCompatButtonRegister = (AppCompatButton) findViewById(R.id.appCompatButtonRegister);
        appCompatTextViewLoginLink = (AppCompatTextView) findViewById(R.id.appCompatTextViewLoginLink);
    }

    private void initListeners(){
        appCompatButtonRegister.setOnClickListener(this);
        appCompatTextViewLoginLink.setOnClickListener(this);
    }

    private void initObjects(){
        validareCont = new ValidareCont(activity);
        participantdb = new Participantdb(activity);
        admin = new Admin();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.appCompatButtonRegister:
                postDataToSQLite();
                break;
            case R.id.appCompatTextViewLoginLink:
                finish();
                break;
        }
    }

    private void postDataToSQLite(){
        if (!validareCont.isInputEditTextFilled(textInputEditTextNume, textInputLayoutNume, getString(R.string.error_message_name))) {
            return;
        }
        if (!validareCont.isInputEditTextFilled(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }

        if (!validareCont.isInputEditTextFilled(textInputEditTextParola, textInputLayoutParola, getString(R.string.error_message_password))) {
            return;
        }


        if (!participantdb.checkUtilizator(textInputEditTextEmail.getText().toString().trim())) {

            admin.setNume(textInputEditTextNume.getText().toString().trim());
            admin.setEmail(textInputEditTextEmail.getText().toString().trim());

            admin.setParola(textInputEditTextParola.getText().toString().trim());

            participantdb.addUtilizator(admin);


            Snackbar.make(nestedScrollView, getString(R.string.success_message), Snackbar.LENGTH_LONG).show();
            emptyInputEditText();


        } else {

            Snackbar.make(nestedScrollView, getString(R.string.error_email_exists), Snackbar.LENGTH_LONG).show();
        }


    }

    private void emptyInputEditText(){
        textInputEditTextNume.setText(null);
        textInputEditTextEmail.setText(null);
        textInputEditTextParola.setText(null);

    }

}
