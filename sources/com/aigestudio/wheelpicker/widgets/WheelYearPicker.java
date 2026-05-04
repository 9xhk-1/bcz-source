package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import w0.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WheelYearPicker extends WheelPicker implements d {
    public int A1;
    public int B1;
    public int C1;

    public WheelYearPicker(Context context) {
        this(context, null);
    }

    private void v() {
        setSelectedItemPosition(this.C1 - this.A1);
    }

    @Override // w0.d
    public void a(int start, int end) {
        this.A1 = start;
        this.B1 = end;
        this.C1 = getCurrentYear();
        w();
        v();
    }

    @Override // w0.d
    public int getCurrentYear() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    @Override // w0.d
    public int getSelectedYear() {
        return this.C1;
    }

    @Override // w0.d
    public int getYearEnd() {
        return this.B1;
    }

    @Override // w0.d
    public int getYearStart() {
        return this.A1;
    }

    @Override // com.aigestudio.wheelpicker.WheelPicker, com.aigestudio.wheelpicker.a
    public void setData(List data) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelYearPicker");
    }

    @Override // w0.d
    public void setSelectedYear(int year) {
        this.C1 = year;
        v();
    }

    @Override // w0.d
    public void setYearEnd(int end) {
        this.B1 = end;
        w();
    }

    @Override // w0.d
    public void setYearStart(int start) {
        this.A1 = start;
        this.C1 = getCurrentYear();
        w();
        v();
    }

    public final void w() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = this.A1; i11 <= this.B1; i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
        super.setData(arrayList);
    }

    public WheelYearPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.A1 = 1000;
        this.B1 = 3000;
        w();
        this.C1 = Calendar.getInstance().get(1);
        v();
    }
}
