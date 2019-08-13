package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private static final HashMap<String, String> usuariosMap = new HashMap<>();

        EditText editTextLogin;
        final EditText editTextPass;
        Button btnLimpar;
        Button btnOk;

        {
            usuariosMap.put("huguinho", "123");
            usuariosMap.put("zezinho", "123");
            usuariosMap.put("luizinho", "123");
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editTextLogin = findViewById(R.id.editTextLogin);
            editTextPass = findViewById(R.id.editTextPassord);
            btnLimpar = findViewById(R.id.btnLimparCampos);
            btnOk = findViewById(R.id.btnOk);

            this.btnOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String nomeDeUsuarioInformado = editTextLogin.getText().toString();
                    String senhaDeUsuarioInformada = editTextPass.getText().toString();

                    Toast.makeText(getApplicationContext(),
                            "editTextLogin.getText()="+editTextLogin.getText(),
                            Toast.LENGTH_LONG).show();

                    Toast.makeText(getApplicationContext(),
                            "editTextPass.getText()="+editTextPass.getText(),
                            Toast.LENGTH_LONG).show();

                    Toast.makeText(getApplicationContext(),
                           "editTextLogin.getText().toString()="+editTextLogin.getText().toString(),
                           Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),
                           "editTextPass.getText().toString()="+editTextPass.getText().String(),
                           Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),
                           "editTextPass.getText().toString()=")+editTextPass.getText().toString(),
                            Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),
                            "senhaDeUsuarioInformada="+senhaDeUsuarioINFORMADA,
                            Toast.LENGTH_LONG).show();

                 //se a chave nomeDeUsuarioInformado existir, o get retorna a senha
                 String passwCadastro = MainActivity.usuarioMap.get(nomeDeUsuarioInformado);

                 if(passwCadastro != null && passwCadastro.equals(senhaDeUsuarioInformada)){
                     Toast.makeText(getApplicationContext(),"Loguin Sucesso!", Toast.LENGTH_LONG).show();
                 }else{
                     Toast.makeText(getApplicationContext(),"Login Falhou!",ToastLENGTH_lONG).show();
                 }
    }
}
