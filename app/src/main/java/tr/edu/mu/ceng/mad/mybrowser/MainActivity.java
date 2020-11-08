package tr.edu.mu.ceng.mad.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnGO;
    WebView webview;
    EditText txtAdress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAdress=findViewById(R.id.txtAddress);
        webview =findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        if (getIntent() != null) && getIntent().getData() != null )) {
            txtAdress.setText(getIntent().getData().toString());
            webview.loadUrl(getIntent().getData().toString());
        }

        btnGO = findViewById(R.id.btnGO):

        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("http://" + txtAdress.getText());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}