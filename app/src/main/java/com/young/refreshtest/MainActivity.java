package com.young.refreshtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.scwang.smartrefresh.header.BezierCircleHeader;
import com.scwang.smartrefresh.header.DeliveryHeader;
import com.scwang.smartrefresh.header.DropBoxHeader;
import com.scwang.smartrefresh.header.FunGameBattleCityHeader;
import com.scwang.smartrefresh.header.FunGameHitBlockHeader;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.header.PhoenixHeader;
import com.scwang.smartrefresh.header.StoreHouseHeader;
import com.scwang.smartrefresh.header.TaurusHeader;
import com.scwang.smartrefresh.header.WaterDropHeader;
import com.scwang.smartrefresh.header.WaveSwipeHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.header.TwoLevelHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

public class MainActivity extends AppCompatActivity {

    YoungRefreshLayout smartRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smartRefresh = findViewById(R.id.smartRefresh);

        //smartRefresh.setRefreshHeader(new DeliveryHeader(this)); 飞行气球
        //smartRefresh.setRefreshHeader(new DropBoxHeader(this));  礼品盒子
        //smartRefresh.setRefreshHeader(new MaterialHeader(this)); SwipeRefreshLayout样式
        //smartRefresh.setRefreshHeader(new WaterDropHeader(this));
        //smartRefresh.setRefreshHeader(new ClassicsHeader(this)); 经典样式
        //smartRefresh.setRefreshHeader(new StoreHouseHeader(this)); StoreHouse文字样式
        //smartRefresh.setRefreshHeader(new BezierCircleHeader(this)); 弹出圆圈样式
        //smartRefresh.setRefreshHeader(new BezierRadarHeader(this));
        //smartRefresh.setRefreshHeader(new WaveSwipeHeader(this));
        //smartRefresh.setRefreshHeader(new TwoLevelHeader(this)); 淘宝二楼
        //smartRefresh.setRefreshHeader(new FunGameBattleCityHeader(this)); 坦克世界
        //smartRefresh.setRefreshHeader(new FunGameHitBlockHeader(this));
        //smartRefresh.setRefreshHeader(new PhoenixHeader(this)); 城市
        //smartRefresh.setRefreshHeader(new TaurusHeader(this)); 飞机

        //smartRefresh.setRefreshHeader(new YoungRefreshHeader(this));


        //smartRefresh.setRefreshFooter(new BallPulseFooter(this));
        //smartRefresh.setRefreshFooter(new ClassicsFooter(this));


        //smartRefresh.setEnableRefresh(true);
        smartRefresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            smartRefresh.finishRefresh();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    smartRefresh.setBackgroundColor(Color.RED);
                                }
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });



    }
}
