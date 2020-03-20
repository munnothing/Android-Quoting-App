package com.example.vailsfiberglass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IDFormFill extends AppCompatActivity {

    public static String Name ;
    public static String Business;
    public static String Telephone;
    public static String Email;
    public static String Boat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idform_fill);
    }

    public void CreateQuote (View view){
        Intent intent = new Intent(this, Quote.class);
        EditText ClientName = (EditText) findViewById(R.id.ClientName);
        EditText ClientBusiness = (EditText) findViewById(R.id.ClientBusiness);
        EditText ClientTelephone = (EditText) findViewById(R.id.Telephone);
        EditText ClientEmail = (EditText) findViewById(R.id.Email);
        EditText ClientBoat = (EditText) findViewById(R.id.Boat);

        Name = ClientName.getText().toString();
        Business = ClientBusiness.getText().toString();
        Telephone = ClientTelephone.getText().toString();
        Email = ClientEmail.getText().toString();
        Boat = ClientBoat.getText().toString();


            File testFile = new File(this.getExternalFilesDir(null), "TestFile.txt");
            if (testFile != null) {
                StringBuilder stringBuilder = new StringBuilder();
                // Reads the data from the file
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(testFile));
                    String line;
                    String textFromFile = "";

                    while ((line = reader.readLine()) != null) {
                        textFromFile += line.toString();
                        textFromFile += "\n";
                    }
                    reader.close();
                } catch (Exception e) {
                    Log.e("ReadWriteFile", "Unable to read the TestFile.txt file.");
                }
            }

        startActivity(intent);

    }
}
