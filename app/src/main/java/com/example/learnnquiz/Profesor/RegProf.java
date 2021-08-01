package com.example.learnnquiz.Profesor;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.example.learnnquiz.Conturi.Admin;
import com.example.learnnquiz.Conturi.ValidareCont;
import com.example.learnnquiz.R;


public class RegProf extends AppCompatActivity implements View.OnClickListener {
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private final AppCompatActivity activity = RegProf.this;
    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutNume;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutParola;
<<<<<<< HEAD

    private TextInputEditText textInputEditTextNume;
    private TextInputEditText textInputEditTextEmail;

    private TextInputEditText textInputEditTextParola;
    private AppCompatButton appCompatButtonRegister;
    private AppCompatTextView appCompatTextViewLoginProf;

    private ValidareCont validareCont;
    private Profesordb profesordb;
    private Admin admin;

=======
    private TextInputEditText textInputEditTextNume;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextParola;
    private AppCompatButton appCompatButtonRegister;
    private AppCompatTextView appCompatTextViewLoginProf;
    private ValidareCont validareCont;
    private Profesordb profesordb;
    private Admin admin;
>>>>>>> 2c82b41... LNQ
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerprof);
        getSupportActionBar().hide();
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        initViews();
        initListeners();
        initObjects();
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private void initViews(){
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
        textInputLayoutNume = (TextInputLayout) findViewById(R.id.textInputLayoutNume);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutParola = (TextInputLayout) findViewById(R.id.textInputLayoutParola);
        textInputEditTextNume = (TextInputEditText) findViewById(R.id.textInputEditTextNume);
        textInputEditTextEmail = (TextInputEditText) findViewById(R.id.textInputEditTextEmail);
        textInputEditTextParola = (TextInputEditText) findViewById(R.id.textInputEditTextParola);
        appCompatButtonRegister = (AppCompatButton) findViewById(R.id.appCompatButtonRegister);
        appCompatTextViewLoginProf = (AppCompatTextView) findViewById(R.id.appCompatTextViewLoginProf);
    }

    private void initListeners(){
        appCompatButtonRegister.setOnClickListener(this);
        appCompatTextViewLoginProf.setOnClickListener(this);
    }

    private void initObjects(){
        validareCont = new ValidareCont(activity);
        profesordb = new Profesordb(activity);
        admin = new Admin();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.appCompatButtonRegister:
                postDataToSQLite();
                break;
            case R.id.appCompatTextViewLoginProf:
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
<<<<<<< HEAD


        if (!profesordb.checkProfesor(textInputEditTextEmail.getText().toString().trim())) {

            admin.setNume(textInputEditTextNume.getText().toString().trim());
            admin.setEmail(textInputEditTextEmail.getText().toString().trim());

            admin.setParola(textInputEditTextParola.getText().toString().trim());

            profesordb.addProfesor(admin);


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

=======
        if (!profesordb.checkProfesor(textInputEditTextEmail.getText().toString().trim())) {
            admin.setNume(textInputEditTextNume.getText().toString().trim());
            admin.setEmail(textInputEditTextEmail.getText().toString().trim());
            admin.setParola(textInputEditTextParola.getText().toString().trim());
            profesordb.addProfesor(admin);
            Snackbar.make(nestedScrollView, getString(R.string.success_message), Snackbar.LENGTH_LONG).show();
            emptyInputEditText();
        } else {
            Snackbar.make(nestedScrollView, getString(R.string.error_email_exists), Snackbar.LENGTH_LONG).show();
        }
    }
    private void emptyInputEditText(){
        textInputEditTextNume.setText(null);
        textInputEditTextEmail.setText(null);
        textInputEditTextParola.setText(null); }
>>>>>>> 2c82b41... LNQ
}
