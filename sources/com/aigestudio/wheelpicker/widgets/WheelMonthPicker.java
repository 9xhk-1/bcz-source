package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import w0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WheelMonthPicker extends WheelPicker implements c {
    public int A1;

    public WheelMonthPicker(Context context) {
        this(context, null);
    }

    @Override // w0.c
    public int getCurrentMonth() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    @Override // w0.c
    public int getSelectedMonth() {
        return this.A1;
    }

    @Override // com.aigestudio.wheelpicker.WheelPicker, com.aigestudio.wheelpicker.a
    public void setData(List data) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelMonthPicker");
    }

    @Override // w0.c
    public void setSelectedMonth(int month) {
        this.A1 = month;
        v();
    }

    public final void v() {
        setSelectedItemPosition(this.A1 - 1);
    }

    public WheelMonthPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 <= 12; i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
        super.setData(arrayList);
        this.A1 = Calendar.getInstance().get(2) + 1;
        v();
    }
}
