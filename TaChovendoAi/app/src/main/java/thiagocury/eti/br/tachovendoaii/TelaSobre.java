package thiagocury.eti.br.tachovendoaii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaSobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        setTitle(getResources().getText(R.string.title_activity_home));
    }
}
