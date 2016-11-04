package ru.a364apps.day3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements OnClickListener{
    private float mTextSize = 20;
    private EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit =(EditText)findViewById(R.id.edit_text);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_r:
                mEdit.setTypeface(null, Typeface.NORMAL);
                break;
            case R.id.button_b:
                mEdit.setTypeface(null, Typeface.BOLD);
                break;
            case R.id.button_i:
                mEdit.setTypeface(null, Typeface.ITALIC);
                break;
            case R.id.button_plus:
                if (mTextSize <= 72)
                    mTextSize+=2;
                mEdit.setTextSize(mTextSize);
                break;
            case R.id.button_minus:
                if (mTextSize >= 20)
                    mTextSize-=2;
                mEdit.setTextSize(mTextSize);
                break;
        }
    }
}

