package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w0.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WheelDayPicker extends WheelPicker implements b {
    public static final Map<Integer, List<Integer>> E1 = new HashMap();
    public Calendar A1;
    public int B1;
    public int C1;
    public int D1;

    public WheelDayPicker(Context context) {
        this(context, null);
    }

    @Override // w0.b
    public void f(int year, int month) {
        this.B1 = year;
        this.C1 = month - 1;
        v();
    }

    @Override // w0.b
    public int getCurrentDay() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    @Override // w0.b
    public int getMonth() {
        return this.C1;
    }

    @Override // w0.b
    public int getSelectedDay() {
        return this.D1;
    }

    @Override // w0.b
    public int getYear() {
        return this.B1;
    }

    @Override // com.aigestudio.wheelpicker.WheelPicker, com.aigestudio.wheelpicker.a
    public void setData(List data) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelDayPicker");
    }

    @Override // w0.b
    public void setMonth(int month) {
        this.C1 = month - 1;
        v();
    }

    @Override // w0.b
    public void setSelectedDay(int day) {
        this.D1 = day;
        w();
    }

    @Override // w0.b
    public void setYear(int year) {
        this.B1 = year;
        v();
    }

    public final void v() {
        this.A1.set(1, this.B1);
        this.A1.set(2, this.C1);
        int actualMaximum = this.A1.getActualMaximum(5);
        List<Integer> list = E1.get(Integer.valueOf(actualMaximum));
        if (list == null) {
            list = new ArrayList<>();
            for (int i11 = 1; i11 <= actualMaximum; i11++) {
                list.add(Integer.valueOf(i11));
            }
            E1.put(Integer.valueOf(actualMaximum), list);
        }
        super.setData(list);
    }

    public final void w() {
        setSelectedItemPosition(this.D1 - 1);
    }

    public WheelDayPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        Calendar calendar = Calendar.getInstance();
        this.A1 = calendar;
        this.B1 = calendar.get(1);
        this.C1 = this.A1.get(2);
        v();
        this.D1 = this.A1.get(5);
        w();
    }
}
