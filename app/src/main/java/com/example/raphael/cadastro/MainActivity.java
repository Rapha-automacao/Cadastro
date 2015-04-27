package com.example.raphael.cadastro;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final String NOME = "";





    public void salvar(View v){
    Cliente cliente = new Cliente();

        private EditText nomeET;
        private EditText telefoneET;
        private EditText enderecoET;
        private EditText bairroET;
        private EditText cidadeET;
        private EditText ufET;
        private EditText cpfET;
        private EditText rgET;



        EditText nomeET = (EditText)findViewById(R.id.nome);
        EditText telefoneET = (EditText)findViewById(R.id.telefone);
        EditText enderecoET = (EditText)findViewById(R.id.endereco);
        EditText bairroET = (EditText)findViewById(R.id.bairro);
        EditText cidadeET = (EditText)findViewById(R.id.cidade);
        EditText ufET = (EditText)findViewById(R.id.uf);
        EditText cpfET = (EditText)findViewById(R.id.cpf);
        EditText rgET = (EditText)findViewById(R.id.rg);



        cliente.setNome(nomeET.getText().toString());
        cliente.setTelefone(telefoneET.getText().toString());
        cliente.setEndereco(enderecoET.getText().toString());
        cliente.setBairro(bairroET.getText().toString());
        cliente.setCidade(cidadeET.getText().toString());
        cliente.setUf(ufET.getText().toString());
        cliente.setCpf(cpfET.getText().toString());
        cliente.setRg(rgET.getText().toString());


    Intent i = new Intent(this,MostrarCliente.class);
    i.putExtra("cliente",cliente);
        startActivity(i);

}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
