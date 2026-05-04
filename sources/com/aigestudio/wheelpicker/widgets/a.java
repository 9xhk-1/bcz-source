package com.aigestudio.wheelpicker.widgets;

import android.widget.TextView;
import com.aigestudio.wheelpicker.widgets.WheelDatePicker;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a {
    Date getCurrentDate();

    int getItemAlignDay();

    int getItemAlignMonth();

    int getItemAlignYear();

    TextView getTextViewDay();

    TextView getTextViewMonth();

    TextView getTextViewYear();

    WheelDayPicker getWheelDayPicker();

    WheelMonthPicker getWheelMonthPicker();

    WheelYearPicker getWheelYearPicker();

    void setItemAlignDay(int align);

    void setItemAlignMonth(int align);

    void setItemAlignYear(int align);

    void setOnDateSelectedListener(WheelDatePicker.a listener);
}
