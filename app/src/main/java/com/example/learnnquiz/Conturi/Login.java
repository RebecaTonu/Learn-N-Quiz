package com.example.learnnquiz.Conturi;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.learnnquiz.Profesor.LoginProf;
import com.example.learnnquiz.Profesor.RegProf;
import com.example.learnnquiz.R;
<<<<<<< HEAD
import com.example.learnnquiz.activitati.Acasa;
=======
import com.example.learnnquiz.Activitati.Acasa;
>>>>>>> 2c82b41... LNQ

public class Login extends AppCompatActivity implements View.OnClickListener {
    private final AppCompatActivity activity = Login.this;
    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutParola;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextParola;
    private AppCompatButton appCompatButtonLogin;
    private AppCompatTextView textViewLinkRegister;
    private ValidareCont validareCont;
    private Participantdb participantdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().show();
        initViews();
        initListeners();
        initObjects();
    }

    private void initViews() {
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutParola = (TextInputLayout) findViewById(R.id.textInputLayoutParola);
        textInputEditTextEmail = (TextInputEditText) findViewById(R.id.textInputEditTextEmail);
        textInputEditTextParola = (TextInputEditText) findViewById(R.id.textInputEditTextParola);
        appCompatButtonLogin = (AppCompatButton) findViewById(R.id.appCompatButtonLogin);
        textViewLinkRegister = (AppCompatTextView) findViewById(R.id.textViewLinkRegister);
    }

    private void initListeners() {
        appCompatButtonLogin.setOnClickListener(this);
        textViewLinkRegister.setOnClickListener(this);
    }

    private void initObjects() {
        participantdb = new Participantdb(activity);
        validareCont = new ValidareCont(activity);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.appCompatButtonLogin:
                verifyFromSQLite();
                break;
            case R.id.textViewLinkRegister:
                Intent intentRegister = new Intent(getApplicationContext(), Inregistrare.class);
                startActivity(intentRegister);
                break;
        }
    }

    private void verifyFromSQLite() {
        if (!validareCont.isInputEditTextFilled(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!validareCont.isInputEditTextEmail(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!validareCont.isInputEditTextFilled(textInputEditTextParola, textInputLayoutParola, getString(R.string.error_message_email))) {
            return;
        }

        if (participantdb.checkUtilizator(textInputEditTextEmail.getText().toString().trim()
                , textInputEditTextParola.getText().toString().trim())) {
            Intent accountsIntent = new Intent(activity, Acasa.class);
            accountsIntent.putExtra("EMAIL", textInputEditTextEmail.getText().toString().trim());
            emptyInputEditText();
            startActivity(accountsIntent);
        } else {
            Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
        }
    }

    private void emptyInputEditText() {
        textInputEditTextEmail.setText(null);
        textInputEditTextParola.setText(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
<<<<<<< HEAD
        inflater.inflate(R.menu.log, menu);
=======
        inflater.inflate(R.menu.log2, menu);
>>>>>>> 2c82b41... LNQ
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menu_id = item.getItemId();


        switch (menu_id){

            case R.id.action_loginadm:

                Intent in = new Intent(Login.this, LoginProf.class);
                startActivity(in);

                break;
            case R.id.action_register:
                Intent intt=new Intent(Login.this, RegProf.class);
                startActivity(intt);
        }

        return super.onOptionsItemSelected(item);
    }
}
