package com.ofal.ihsan.petemuanpertama;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CapcinActivity extends AppCompatActivity {

    String rasa = "";
    int jumlah = 1;
    @BindView(R.id.et_nama)
    EditText etNama;
    @BindView(R.id.txt_jumlah)
    TextView txtJumlah;
    @BindView(R.id.cb_jeruk)
    CheckBox cbJeruk;
    @BindView(R.id.cb_melon)
    CheckBox cbMelon;
    @BindView(R.id.cb_manggo)
    CheckBox cbManggo;
    @BindView(R.id.txt_hasil)
    TextView txtHasil;
    @BindView(R.id.btn_clear)
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capcin);
        ButterKnife.bind(this);


    }

    public void getCheck() {
        if (cbJeruk.isChecked()) {
            rasa += " Orange Flavor";
        }
        if (cbMelon.isChecked()) {
            rasa += " Melon Flavor";
        }
        if (cbManggo.isChecked()) {
            rasa += " Manggo Flavor";
        }

    }

    @OnClick({R.id.btn_plus, R.id.btn_min, R.id.btn_order, R.id.btn_clear})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                jumlah = jumlah + 1;
                txtJumlah.setText("" + jumlah);
                break;
            case R.id.btn_min:
                if (jumlah == 1) {
                    Toast.makeText(getApplicationContext(),
                            "Jumlah Tidak Boleh Nol ",
                            Toast.LENGTH_SHORT).show();
                } else
                    jumlah = jumlah - 1;
                txtJumlah.setText("" + jumlah);
                break;
            case R.id.btn_order:
                getCheck();
                txtHasil.setText("Name : " +
                        etNama.getText().toString() +
                        "\nOrder Amount : " + jumlah + "\nTaste : "
                        + rasa + "\nThank You");
                txtHasil.setVisibility(View.VISIBLE);
                btnClear.setVisibility(View.VISIBLE);
                break;
            case R.id.btn_clear:
                txtHasil.setText("");
                rasa = "";
                txtHasil.setVisibility(View.GONE);
                btnClear.setVisibility(View.GONE);
                break;
        }
    }
}
