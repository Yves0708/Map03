package net.cloud95.android.lession.map03;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class Map03Activity extends FragmentActivity {

    private GoogleMap map;
    private Spinner type_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        processViews();
        processControllers();

        // 設定地圖種類為一般地圖
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void setUpMapIfNeeded() {
            // 取得地圖物件
    }

    private void processViews() {

        // 取得目前地圖的種類，並設定好Spinner元件
    }

    private void processControllers() {
        type_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, 
                    View view, int position, long id) {
                    // 不顯示地圖
                    // 一般
                    // 衛星空照
                    // 地形
                    // 衛星空照加道路

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }

        });
    }

}
