package kelompok2.marketplace.com.kuepenjual.ui.home.statistik;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import kelompok2.marketplace.com.kuepenjual.R;

public class StatistikFragment extends Fragment {

    private BarChart barChart;

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        ArrayList<BarEntry> entries = new ArrayList<>();

        entries.add(new BarEntry(0f, 30f));
        entries.add(new BarEntry(1f, 80f));
        entries.add(new BarEntry(2f, 60f));
        entries.add(new BarEntry(3f, 50f));
        entries.add(new BarEntry(4f, 20f));
        entries.add(new BarEntry(5f, 70f));
        entries.add(new BarEntry(6f, 60f));
        entries.add(new BarEntry(7f, 80f));
        entries.add(new BarEntry(8f, 60f));
        entries.add(new BarEntry(9f, 50f));
        entries.add(new BarEntry(10f, 20f));
        entries.add(new BarEntry(11f, 70f));
        entries.add(new BarEntry(12f, 60f));

        BarDataSet set = new BarDataSet(entries,"Penjualan 2018");
        BarData data = new BarData(set);
        barChart.setData(data);
        set.setColors(ColorTemplate.PASTEL_COLORS);
        //String[] mLabels = new String[] { "Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agt", "Sep", "Okt", "Nov", "Des" };
        barChart.animateXY(1500, 1500);
        barChart.setFitBars(true);
        barChart.invalidate();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_statistik, container, false);
        initView(rootView);
        return rootView;
    }

    private void initView(View view){
        barChart = view.findViewById(R.id.chart);
    }
}