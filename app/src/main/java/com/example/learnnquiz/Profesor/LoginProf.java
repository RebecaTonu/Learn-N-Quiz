package com.example.learnnquiz.Profesor;
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

import com.example.learnnquiz.Conturi.ValidareCont;
import com.example.learnnquiz.R;

public class LoginProf extends AppCompatActivity implements View.OnClickListener {
    private final AppCompatActivity activity = LoginProf.this;
    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutParola;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextParola;
    private AppCompatButton appCompatButtonLogin;
    private AppCompatTextView textViewLinkInregistrareProf;
    private ValidareCont validareCont;
    private Profesordb profesordb;
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginprof);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        getSupportActionBar().show();
        initViews();
        initListeners();
        initObjects();
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private void initViews() {
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutParola = (TextInputLayout) findViewById(R.id.textInputLayoutParola);
        textInputEditTextEmail = (TextInputEditText) findViewById(R.id.textInputEditTextEmail);
        textInputEditTextParola = (TextInputEditText) findViewById(R.id.textInputEditTextParola);
        appCompatButtonLogin = (AppCompatButton) findViewById(R.id.appCompatButtonLogin);
        textViewLinkInregistrareProf = (AppCompatTextView) findViewById(R.id.textViewLinkInregistrareProf);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private void initListeners() {
        appCompatButtonLogin.setOnClickListener(this);
        textViewLinkInregistrareProf.setOnClickListener(this);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private void initObjects() {
        profesordb = new Profesordb(activity);
        validareCont = new ValidareCont(activity);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.appCompatButtonLogin:
                verifyFromSQLite();
                break;
            case R.id.textViewLinkInregistrareProf:
                Intent intentRegister = new Intent(getApplicationContext(), RegProf.class);
                startActivity(intentRegister);
                break;
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private void verifyFromSQLite() {
        if (!validareCont.isInputEditTextFilled(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!validareCont.isInputEditTextEmail(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!validareCont.isInputEditTextFilled(textInputEditTextParola, textInputLayoutParola, getString(R.string.error_message_password))) {
            return;
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        if (profesordb.checkProfesor(textInputEditTextEmail.getText().toString().trim()
                , textInputEditTextParola.getText().toString().trim())) {
            Intent accountsIntent = new Intent(activity, MainProfesor.class);
            accountsIntent.putExtra("EMAIL", textInputEditTextEmail.getText().toString().trim());
            emptyInputEditText();
            startActivity(accountsIntent);
        } else {
            Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private void emptyInputEditText() {
        textInputEditTextEmail.setText(null);
        textInputEditTextParola.setText(null);
    }
<<<<<<< HEAD

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.log, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menu_id = item.getItemId();

        switch (menu_id){

            case R.id.action_loginadm:

                Intent in = new Intent(LoginProf.this, LoginProf.class);
                startActivity(in);

=======
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menu_id = item.getItemId();
        switch (menu_id){
            case R.id.action_loginadm:
                Intent in = new Intent(LoginProf.this, LoginProf.class);
                startActivity(in);
>>>>>>> 2c82b41... LNQ
                break;
            case R.id.action_register:
                Intent intt=new Intent(LoginProf.this, RegProf.class);
                startActivity(intt);
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        return super.onOptionsItemSelected(item);
    }
}
