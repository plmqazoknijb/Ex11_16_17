package kr.hs.emirim.w2033.ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String [] itemArrs = {"귀멸의 칼날:무한열차","명탐정 코난:감청의 권","하이큐!!","약속의 네버랜드","짱구는 못말려:폭풍수면! 꿈꾸는 세계 대돌격","명탐정 코난:화염의 해바라기",
                            "명탐정 코난:제로의 집행인","해변의 에트랑제","기븐 극장판","코드 기아스:반역의 를르슈"};
    int[] posterIds = {R.drawable.i01, R.drawable.i02, R.drawable.i03, R.drawable.i04, R.drawable.i05,
                        R.drawable.i06, R.drawable.i07, R.drawable.i08, R.drawable.i09, R.drawable.i10};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너와 영화포스터");
        Spinner spinner1 = findViewById(R.id.spinner1);
        imgv = findViewById(R.id.imgvLarge);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,itemArrs);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgv.setImageResource(posterIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}