package com.example.fjj.myapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView applicationName;
    private TextView chosen;
    private TextView module_text;
    private TextView project_text;
    private TextView project_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeFace = Typeface.createFromAsset(getAssets(),"fonts/DS-DIGII.TTF");
        applicationName = (TextView)findViewById(R.id.applicationName);
        chosen = (TextView)findViewById(R.id.chosen);
        module_text = (TextView)findViewById(R.id.moduleText);
        project_text = (TextView)findViewById(R.id.projectText);
        project_text2 = (TextView)findViewById(R.id.projectText2);
// 应用字体
        applicationName.setTypeface(typeFace);
        chosen.setTypeface(typeFace);
        module_text.setTypeface(typeFace);
        project_text.setTypeface(typeFace);
        project_text2.setTypeface(typeFace);

    }
}
