package com.example.a20190505_pizzaex;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.a20190505_pizzaex.databinding.ActivityMainBinding;
import com.example.a20190505_pizzaex.datas.Stores;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {

    ActivityMainBinding act;
    List<Stores> stores =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();

        filldata();

    }

    public void bindViews(){
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void setupEvents(){

    }

    public void setValues(){

    }

    void filldata(){
        stores.add(new Stores("파파존스","09:00~21:00","02-111-1111","https://www.pji.co.kr/resources/images/papajohns/img_papajohns_k.png"));
        stores.add(new Stores("피자헛","05:00~24:00","02-222-1221","https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/Pizza_Hut_logo.svg/220px-Pizza_Hut_logo.svg.png"));
        stores.add(new Stores("도미노피자","17:00~23:00","02-333-1111","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/120px-Domino%27s_pizza_logo.svg.png"));
        stores.add(new Stores("미스터피자","07:00~21:00","02-444-1111","https://upload.wikimedia.org/wikipedia/commons/2/2f/Mr.Pizza_logo.JPG"));
        stores.add(new Stores("피자에땅","15:00~20:00","02-555-1111","https://mblogthumb-phinf.pstatic.net/20160530_214/ppanppane_1464617804922knKn4_PNG/%C7%C7%C0%DA%BF%A1%B6%A5_%B7%CE%B0%ED_%282%29.png?type=w800"));
        stores.add(new Stores("피자스쿨","16:00~21:00","02-666-1111","https://modo-phinf.pstatic.net/20150501_269/1430484184544WKwLF_JPEG/mosa7NPaR2.jpeg?type=f320_320"));
        stores.add(new Stores("피자나라 치킨공주","09:00~21:00","02-777-1111","https://3.bp.blogspot.com/-ZG3xHq33WYk/VEjqAmCdjSI/AAAAAAAAj2s/TVJ727tK1Bw/s1600/59%EC%8C%80%ED%94%BC%EC%9E%90-%EB%A1%9C%EA%B3%A0.png"));
        stores.add(new Stores("7번가피자","08:00~21:00","02-888-1111","https://1.bp.blogspot.com/-BRvTIwQrxIg/VEhBZ77V_oI/AAAAAAAAjx0/ZFGs4svOq7s/s1600/7%EB%B2%88%EA%B0%80%ED%94%BC%EC%9E%90-%EB%A1%9C%EA%B3%A0.png"));
    }
}


