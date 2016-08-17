package ggikko.me.ggikkoespressotesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_greeting) TextView txt_greeting;

    @OnClick({R.id.btn_greet})
    void callOnClick(View view){
        switch (view.getId()){
            case R.id.btn_greet:
                txt_greeting.setText("Hello ggikko");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}
