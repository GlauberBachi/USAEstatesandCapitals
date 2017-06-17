package com.bachi.android.usaestatesandcapitals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Jogo extends AppCompatActivity {

    int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

    }

    public void next(View v) {
        if (x == 100) {
            Toast toast = Toast.makeText(this, "THIS IS THE LAST STATE!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            x++;
            set(v);
        }
    }

    public void previous(View v) {
        if (x == 1) {
            Toast toast = Toast.makeText(this, "THIS IS THE FIRST STATE!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            x--;
            set(v);
        }

    }

    public void menu(View v) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }


    public void set(View v) {
        TextView txtEstate = (TextView) findViewById(R.id.txtEstate);
        TextView txtCapital = (TextView) findViewById(R.id.txtCapital);
        TextView txtNumber = (TextView) findViewById(R.id.txtNumber);
        Button btnPre = (Button) findViewById(R.id.btnPre);


        switch (x) {
            case 1:
                txtEstate.setText("Alabama");
                txtCapital.setText("");
                txtNumber.setText("1/50");
                break;
            case 2:
                txtEstate.setText("Alabama");
                txtCapital.setText("Montgomery");
                txtNumber.setText("1/50");
                break;

            case 3:
                txtEstate.setText("Alaska");
                txtCapital.setText("");
                txtNumber.setText("2/50");
                break;

            case 4:
                txtEstate.setText("Alaska");
                txtCapital.setText("Juneau");
                txtNumber.setText("2/50");
                break;

            case 5:
                txtEstate.setText("Arizona");
                txtCapital.setText("");
                txtNumber.setText("3/50");
                break;

            case 6:
                txtEstate.setText("Arizona");
                txtCapital.setText("Phoenix");
                txtNumber.setText("3/50");
                break;

            case 7:
                txtEstate.setText("Arkansas");
                txtCapital.setText("");
                txtNumber.setText("4/50");
                break;

            case 8:
                txtEstate.setText("Arkansas");
                txtCapital.setText("Little Rock");
                txtNumber.setText("4/50");
                break;

            case 9:
                txtEstate.setText("California");
                txtCapital.setText("");
                txtNumber.setText("5/50");
                break;

            case 10:
                txtEstate.setText("California");
                txtCapital.setText("Sacramento");
                txtNumber.setText("5/50");
                break;

            case 11:
                txtEstate.setText("Colorado");
                txtCapital.setText("");
                txtNumber.setText("6/50");
                break;

            case 12:
                txtEstate.setText("Colorado");
                txtCapital.setText("Denver");
                txtNumber.setText("6/50");
                break;

            case 13:
                txtEstate.setText("Connecticut");
                txtCapital.setText("");
                txtNumber.setText("7/50");
                break;

            case 14:
                txtEstate.setText("Connecticut");
                txtCapital.setText("Hartford");
                txtNumber.setText("7/50");
                break;

            case 15:
                txtEstate.setText("Delaware");
                txtCapital.setText("");
                txtNumber.setText("8/50");
                break;

            case 16:
                txtEstate.setText("Delaware");
                txtCapital.setText("Dover");
                txtNumber.setText("8/50");
                break;

            case 17:
                txtEstate.setText("Florida");
                txtCapital.setText("");
                txtNumber.setText("9/50");
                break;

            case 18:
                txtEstate.setText("Florida");
                txtCapital.setText("Tallahassee");
                txtNumber.setText("9/50");
                break;

            case 19:
                txtEstate.setText("Georgia");
                txtCapital.setText("");
                txtNumber.setText("10/50");
                break;

            case 20:
                txtEstate.setText("Georgia");
                txtCapital.setText("Atlanta");
                txtNumber.setText("10/50");
                break;

            case 21:
                txtEstate.setText("Hawaii");
                txtCapital.setText("");
                txtNumber.setText("11/50");
                break;

            case 22:
                txtEstate.setText("Hawaii");
                txtCapital.setText("Honolulu");
                txtNumber.setText("11/50");
                break;

            case 23:
                txtEstate.setText("Idaho");
                txtCapital.setText("");
                txtNumber.setText("12/50");
                break;

            case 24:
                txtEstate.setText("Idaho");
                txtCapital.setText("Boise");
                txtNumber.setText("12/50");
                break;

            case 25:
                txtEstate.setText("Illinois");
                txtCapital.setText("");
                txtNumber.setText("13/50");
                break;

            case 26:
                txtEstate.setText("Illinois");
                txtCapital.setText("Springfield");
                txtNumber.setText("13/50");
                break;

            case 27:
                txtEstate.setText("Indiana");
                txtCapital.setText("");
                txtNumber.setText("14/50");
                break;

            case 28:
                txtEstate.setText("Indiana");
                txtCapital.setText("Indianapolis");
                txtNumber.setText("14/50");
                break;

            case 29:
                txtEstate.setText("Iowa");
                txtCapital.setText("");
                txtNumber.setText("15/50");
                break;

            case 30:
                txtEstate.setText("Iowa");
                txtCapital.setText("Des Moines");
                txtNumber.setText("15/50");
                break;

            case 31:
                txtEstate.setText("Kansas");
                txtCapital.setText("");
                txtNumber.setText("16/50");
                break;

            case 32:
                txtEstate.setText("Kansas");
                txtCapital.setText("Topeka");
                txtNumber.setText("16/50");
                break;

            case 33:
                txtEstate.setText("Kentucky");
                txtCapital.setText("");
                txtNumber.setText("17/50");
                break;

            case 34:
                txtEstate.setText("Kentucky");
                txtCapital.setText("Frankfort");
                txtNumber.setText("17/50");
                break;

            case 35:
                txtEstate.setText("Louisiana");
                txtCapital.setText("");
                txtNumber.setText("18/50");
                break;

            case 36:
                txtEstate.setText("Louisiana");
                txtCapital.setText("Baton Rouge");
                txtNumber.setText("18/50");
                break;

            case 37:
                txtEstate.setText("Maine");
                txtCapital.setText("");
                txtNumber.setText("19/50");
                break;

            case 38:
                txtEstate.setText("Maine");
                txtCapital.setText("Augusta");
                txtNumber.setText("19/50");
                break;

            case 39:
                txtEstate.setText("Maryland");
                txtCapital.setText("");
                txtNumber.setText("20/50");
                break;

            case 40:
                txtEstate.setText("Maryland");
                txtCapital.setText("Annapolis");
                txtNumber.setText("20/50");
                break;

            case 41:
                txtEstate.setText("Massachusetts");
                txtCapital.setText("");
                txtNumber.setText("21/50");
                break;

            case 42:
                txtEstate.setText("Massachusetts");
                txtCapital.setText("Boston");
                txtNumber.setText("21/50");
                break;

            case 43:
                txtEstate.setText("Michigan");
                txtCapital.setText("");
                txtNumber.setText("22/50");
                break;

            case 44:
                txtEstate.setText("Michigan");
                txtCapital.setText("Lansing");
                txtNumber.setText("22/50");
                break;

            case 45:
                txtEstate.setText("Minnesota");
                txtCapital.setText("");
                txtNumber.setText("23/50");
                break;

            case 46:
                txtEstate.setText("Minnesota");
                txtCapital.setText("Saint Paul");
                txtNumber.setText("23/50");
                break;

            case 47:
                txtEstate.setText("Mississippi");
                txtCapital.setText("");
                txtNumber.setText("24/50");
                break;

            case 48:
                txtEstate.setText("Mississippi");
                txtCapital.setText("Jackson");
                txtNumber.setText("24/50");
                break;

            case 49:
                txtEstate.setText("Missouri");
                txtCapital.setText("");
                txtNumber.setText("25/50");
                break;

            case 50:
                txtEstate.setText("Missouri");
                txtCapital.setText("Jefferson City");
                txtNumber.setText("25/50");
                break;

            case 51:
                txtEstate.setText("Montana");
                txtCapital.setText("");
                txtNumber.setText("26/50");
                break;

            case 52:
                txtEstate.setText("Montana");
                txtCapital.setText("Helena");
                txtNumber.setText("26/50");
                break;


            case 53:
                txtEstate.setText("Nebraska");
                txtCapital.setText("");
                txtNumber.setText("27/50");
                break;

            case 54:
                txtEstate.setText("Nebraska");
                txtCapital.setText("Lincoln");
                txtNumber.setText("27/50");
                break;

            case 55:
                txtEstate.setText("Nevada");
                txtCapital.setText("");
                txtNumber.setText("28/50");
                break;

            case 56:
                txtEstate.setText("Nevada");
                txtCapital.setText("Carson City");
                txtNumber.setText("28/50");
                break;

            case 57:
                txtEstate.setText("New Hampshire");
                txtCapital.setText("");
                txtNumber.setText("29/50");
                break;

            case 58:
                txtEstate.setText("New Hampshire");
                txtCapital.setText("Concord");
                txtNumber.setText("29/50");
                break;

            case 59:
                txtEstate.setText("New Jersey");
                txtCapital.setText("");
                txtNumber.setText("30/50");
                break;

            case 60:
                txtEstate.setText("New Jersey");
                txtCapital.setText("Treton");
                txtNumber.setText("30/50");
                break;

            case 61:
                txtEstate.setText("New Mexico");
                txtCapital.setText("");
                txtNumber.setText("31/50");
                break;

            case 62:
                txtEstate.setText("New Mexico");
                txtCapital.setText("Santa Fe");
                txtNumber.setText("31/50");
                break;

            case 63:
                txtEstate.setText("New York");
                txtCapital.setText("");
                txtNumber.setText("32/50");
                break;

            case 64:
                txtEstate.setText("New York");
                txtCapital.setText("Albany");
                txtNumber.setText("32/50");
                break;

            case 65:
                txtEstate.setText("North Carolina");
                txtCapital.setText("");
                txtNumber.setText("33/50");
                break;

            case 66:
                txtEstate.setText("North Carolina");
                txtCapital.setText("Raleigh");
                txtNumber.setText("33/50");
                break;

            case 67:
                txtEstate.setText("North Dakota");
                txtCapital.setText("");
                txtNumber.setText("34/50");
                break;

            case 68:
                txtEstate.setText("North Dakota");
                txtCapital.setText("Bismarck");
                txtNumber.setText("34/50");
                break;

            case 69:
                txtEstate.setText("Ohio");
                txtCapital.setText("");
                txtNumber.setText("35/50");
                break;

            case 70:
                txtEstate.setText("Ohio");
                txtCapital.setText("Columbus");
                txtNumber.setText("35/50");
                break;

            case 71:
                txtEstate.setText("Oklahoma");
                txtCapital.setText("");
                txtNumber.setText("36/50");
                break;

            case 72:
                txtEstate.setText("Oklahoma");
                txtCapital.setText("Oklahoma City");
                txtNumber.setText("36/50");
                break;

            case 73:
                txtEstate.setText("Oregon");
                txtCapital.setText("");
                txtNumber.setText("37/50");
                break;

            case 74:
                txtEstate.setText("Oregon");
                txtCapital.setText("Salem");
                txtNumber.setText("37/50");
                break;

            case 75:
                txtEstate.setText("Pennsylvania");
                txtCapital.setText("");
                txtNumber.setText("38/50");
                break;

            case 76:
                txtEstate.setText("Pennsylvania");
                txtCapital.setText("Harrisburg");
                txtNumber.setText("38/50");
                break;

            case 77:
                txtEstate.setText("Rhode Island");
                txtCapital.setText("");
                txtNumber.setText("39/50");
                break;

            case 78:
                txtEstate.setText("Rhode Island");
                txtCapital.setText("Providence");
                txtNumber.setText("39/50");
                break;

            case 79:
                txtEstate.setText("South Carolina");
                txtCapital.setText("");
                txtNumber.setText("40/50");
                break;

            case 80:
                txtEstate.setText("South Carolina");
                txtCapital.setText("Columbia");
                txtNumber.setText("40/50");
                break;

            case 81:
                txtEstate.setText("South Dakota");
                txtCapital.setText("");
                txtNumber.setText("41/50");
                break;

            case 82:
                txtEstate.setText("South Dakota");
                txtCapital.setText("Pierre");
                txtNumber.setText("41/50");
                break;

            case 83:
                txtEstate.setText("Tennessee");
                txtCapital.setText("");
                txtNumber.setText("42/50");
                break;

            case 84:
                txtEstate.setText("Tennessee");
                txtCapital.setText("Nashville");
                txtNumber.setText("42/50");
                break;

            case 85:
                txtEstate.setText("Texas");
                txtCapital.setText("");
                txtNumber.setText("43/50");
                break;

            case 86:
                txtEstate.setText("Texas");
                txtCapital.setText("Austin");
                txtNumber.setText("43/50");
                break;

            case 87:
                txtEstate.setText("Utah");
                txtCapital.setText("");
                txtNumber.setText("44/50");
                break;

            case 88:
                txtEstate.setText("Utah");
                txtCapital.setText("Salt Lake City");
                txtNumber.setText("44/50");
                break;

            case 89:
                txtEstate.setText("Vermont");
                txtCapital.setText("");
                txtNumber.setText("45/50");
                break;

            case 90:
                txtEstate.setText("Vermont");
                txtCapital.setText("Montpelier");
                txtNumber.setText("45/50");
                break;

            case 91:
                txtEstate.setText("Virginia");
                txtCapital.setText("");
                txtNumber.setText("46/50");
                break;

            case 92:
                txtEstate.setText("Virginia");
                txtCapital.setText("Richmond");
                txtNumber.setText("46/50");
                break;

            case 93:
                txtEstate.setText("Washington");
                txtCapital.setText("");
                txtNumber.setText("47/50");
                break;

            case 94:
                txtEstate.setText("Washington");
                txtCapital.setText("Olympia");
                txtNumber.setText("47/50");
                break;

            case 95:
                txtEstate.setText("West Virginia");
                txtCapital.setText("");
                txtNumber.setText("48/50");
                break;

            case 96:
                txtEstate.setText("West Virginia");
                txtCapital.setText("Charleston");
                txtNumber.setText("48/50");
                break;

            case 97:
                txtEstate.setText("Wisconsin");
                txtCapital.setText("");
                txtNumber.setText("49/50");
                break;

            case 98:
                txtEstate.setText("Wisconsin");
                txtCapital.setText("Madison");
                txtNumber.setText("49/50");
                break;

            case 99:
                txtEstate.setText("Wyoming");
                txtCapital.setText("");
                txtNumber.setText("50/50");
                break;

            case 100:
                txtEstate.setText("Wyoming");
                txtCapital.setText("Cheyene");
                txtNumber.setText("50/50");
                break;


        }


    }


}
