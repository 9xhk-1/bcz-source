package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aigestudio.wheelpicker.R;
import com.aigestudio.wheelpicker.WheelPicker;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import v0.b;
import w0.c;
import w0.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WheelDatePicker extends LinearLayout implements WheelPicker.a, b, com.aigestudio.wheelpicker.a, com.aigestudio.wheelpicker.widgets.a, d, c, w0.b {

    /* renamed from: k, reason: collision with root package name */
    public static final SimpleDateFormat f9868k = new SimpleDateFormat("yyyy-M-d", Locale.getDefault());

    /* renamed from: a, reason: collision with root package name */
    public WheelYearPicker f9869a;

    /* renamed from: b, reason: collision with root package name */
    public WheelMonthPicker f9870b;

    /* renamed from: c, reason: collision with root package name */
    public WheelDayPicker f9871c;

    /* renamed from: d, reason: collision with root package name */
    public a f9872d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f9873e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f9874f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f9875g;

    /* renamed from: h, reason: collision with root package name */
    public int f9876h;

    /* renamed from: i, reason: collision with root package name */
    public int f9877i;

    /* renamed from: j, reason: collision with root package name */
    public int f9878j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(WheelDatePicker picker, Date date);
    }

    public WheelDatePicker(Context context) {
        this(context, null);
    }

    @Override // com.aigestudio.wheelpicker.WheelPicker.a
    public void W(WheelPicker picker, Object data, int position) {
        if (picker.getId() == R.id.wheel_date_picker_year) {
            int intValue = ((Integer) data).intValue();
            this.f9876h = intValue;
            this.f9871c.setYear(intValue);
        } else if (picker.getId() == R.id.wheel_date_picker_month) {
            int intValue2 = ((Integer) data).intValue();
            this.f9877i = intValue2;
            this.f9871c.setMonth(intValue2);
        }
        this.f9878j = this.f9871c.getCurrentDay();
        String str = this.f9876h + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f9877i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f9878j;
        a aVar = this.f9872d;
        if (aVar != null) {
            try {
                aVar.a(this, f9868k.parse(str));
            } catch (ParseException e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // w0.d
    public void a(int start, int end) {
        this.f9869a.a(start, end);
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean b() {
        return this.f9869a.b() && this.f9870b.b() && this.f9871c.b();
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public boolean c() {
        throw new UnsupportedOperationException("You don't need to set same width forWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean d() {
        return this.f9869a.d() && this.f9870b.d() && this.f9871c.d();
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean e() {
        return this.f9869a.e() && this.f9870b.e() && this.f9871c.e();
    }

    @Override // w0.b
    public void f(int year, int month) {
        this.f9876h = year;
        this.f9877i = month;
        this.f9869a.setSelectedYear(year);
        this.f9870b.setSelectedMonth(month);
        this.f9871c.f(year, month);
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean g() {
        return this.f9869a.g() && this.f9870b.g() && this.f9871c.g();
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public Date getCurrentDate() {
        try {
            return f9868k.parse(this.f9876h + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f9877i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f9878j);
        } catch (ParseException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // w0.b
    public int getCurrentDay() {
        return this.f9871c.getCurrentDay();
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public int getCurrentItemPosition() {
        throw new UnsupportedOperationException("You can not get position of current item fromWheelDatePicker");
    }

    @Override // w0.c
    public int getCurrentMonth() {
        return this.f9870b.getCurrentMonth();
    }

    @Override // w0.d
    public int getCurrentYear() {
        return this.f9869a.getCurrentYear();
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getCurtainColor() {
        if (this.f9869a.getCurtainColor() == this.f9870b.getCurtainColor() && this.f9870b.getCurtainColor() == this.f9871c.getCurtainColor()) {
            return this.f9869a.getCurtainColor();
        }
        throw new RuntimeException("Can not get curtain color correctly from WheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public List getData() {
        throw new UnsupportedOperationException("You can not get data source from WheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getIndicatorColor() {
        if (this.f9869a.getCurtainColor() == this.f9870b.getCurtainColor() && this.f9870b.getCurtainColor() == this.f9871c.getCurtainColor()) {
            return this.f9869a.getCurtainColor();
        }
        throw new RuntimeException("Can not get indicator color correctly from WheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getIndicatorSize() {
        if (this.f9869a.getIndicatorSize() == this.f9870b.getIndicatorSize() && this.f9870b.getIndicatorSize() == this.f9871c.getIndicatorSize()) {
            return this.f9869a.getIndicatorSize();
        }
        throw new RuntimeException("Can not get indicator size correctly from WheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public int getItemAlign() {
        throw new UnsupportedOperationException("You can not get item align from WheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public int getItemAlignDay() {
        return this.f9871c.getItemAlign();
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public int getItemAlignMonth() {
        return this.f9870b.getItemAlign();
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public int getItemAlignYear() {
        return this.f9869a.getItemAlign();
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemSpace() {
        if (this.f9869a.getItemSpace() == this.f9870b.getItemSpace() && this.f9870b.getItemSpace() == this.f9871c.getItemSpace()) {
            return this.f9869a.getItemSpace();
        }
        throw new RuntimeException("Can not get item space correctly from WheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemTextColor() {
        if (this.f9869a.getItemTextColor() == this.f9870b.getItemTextColor() && this.f9870b.getItemTextColor() == this.f9871c.getItemTextColor()) {
            return this.f9869a.getItemTextColor();
        }
        throw new RuntimeException("Can not get color of item text correctly fromWheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemTextSize() {
        if (this.f9869a.getItemTextSize() == this.f9870b.getItemTextSize() && this.f9870b.getItemTextSize() == this.f9871c.getItemTextSize()) {
            return this.f9869a.getItemTextSize();
        }
        throw new RuntimeException("Can not get size of item text correctly fromWheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public String getMaximumWidthText() {
        throw new UnsupportedOperationException("You can not get maximum width text fromWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public int getMaximumWidthTextPosition() {
        throw new UnsupportedOperationException("You can not get maximum width text positionfrom WheelDatePicker");
    }

    @Override // w0.b
    public int getMonth() {
        return getSelectedMonth();
    }

    @Override // w0.b
    public int getSelectedDay() {
        return this.f9871c.getSelectedDay();
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public int getSelectedItemPosition() {
        throw new UnsupportedOperationException("You can not get position of selected item fromWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getSelectedItemTextColor() {
        if (this.f9869a.getSelectedItemTextColor() == this.f9870b.getSelectedItemTextColor() && this.f9870b.getSelectedItemTextColor() == this.f9871c.getSelectedItemTextColor()) {
            return this.f9869a.getSelectedItemTextColor();
        }
        throw new RuntimeException("Can not get color of selected item text correctly fromWheelDatePicker!");
    }

    @Override // w0.c
    public int getSelectedMonth() {
        return this.f9870b.getSelectedMonth();
    }

    @Override // w0.d
    public int getSelectedYear() {
        return this.f9869a.getSelectedYear();
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public TextView getTextViewDay() {
        return this.f9875g;
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public TextView getTextViewMonth() {
        return this.f9874f;
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public TextView getTextViewYear() {
        return this.f9873e;
    }

    @Override // com.aigestudio.wheelpicker.a
    public Typeface getTypeface() {
        if (this.f9869a.getTypeface().equals(this.f9870b.getTypeface()) && this.f9870b.getTypeface().equals(this.f9871c.getTypeface())) {
            return this.f9869a.getTypeface();
        }
        throw new RuntimeException("Can not get typeface correctly from WheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getVisibleItemCount() {
        if (this.f9869a.getVisibleItemCount() == this.f9870b.getVisibleItemCount() && this.f9870b.getVisibleItemCount() == this.f9871c.getVisibleItemCount()) {
            return this.f9869a.getVisibleItemCount();
        }
        throw new ArithmeticException("Can not get visible item count correctly fromWheelDatePicker!");
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public WheelDayPicker getWheelDayPicker() {
        return this.f9871c;
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public WheelMonthPicker getWheelMonthPicker() {
        return this.f9870b;
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public WheelYearPicker getWheelYearPicker() {
        return this.f9869a;
    }

    @Override // w0.b
    public int getYear() {
        return getSelectedYear();
    }

    @Override // w0.d
    public int getYearEnd() {
        return this.f9869a.getYearEnd();
    }

    @Override // w0.d
    public int getYearStart() {
        return this.f9869a.getYearStart();
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean h() {
        return this.f9869a.h() && this.f9870b.h() && this.f9871c.h();
    }

    public final void i() {
        String valueOf = String.valueOf(this.f9869a.getData().get(r0.size() - 1));
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < valueOf.length(); i11++) {
            sb2.append("0");
        }
        this.f9869a.setMaximumWidthText(sb2.toString());
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setAtmospheric(boolean hasAtmospheric) {
        this.f9869a.setAtmospheric(hasAtmospheric);
        this.f9870b.setAtmospheric(hasAtmospheric);
        this.f9871c.setAtmospheric(hasAtmospheric);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCurtain(boolean hasCurtain) {
        this.f9869a.setCurtain(hasCurtain);
        this.f9870b.setCurtain(hasCurtain);
        this.f9871c.setCurtain(hasCurtain);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCurtainColor(int color) {
        this.f9869a.setCurtainColor(color);
        this.f9870b.setCurtainColor(color);
        this.f9871c.setCurtainColor(color);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCurved(boolean isCurved) {
        this.f9869a.setCurved(isCurved);
        this.f9870b.setCurved(isCurved);
        this.f9871c.setCurved(isCurved);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCyclic(boolean isCyclic) {
        this.f9869a.setCyclic(isCyclic);
        this.f9870b.setCyclic(isCyclic);
        this.f9871c.setCyclic(isCyclic);
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setData(List data) {
        throw new UnsupportedOperationException("You don't need to set data source forWheelDatePicker");
    }

    @Override // v0.b
    public void setDebug(boolean isDebug) {
        this.f9869a.setDebug(isDebug);
        this.f9870b.setDebug(isDebug);
        this.f9871c.setDebug(isDebug);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setIndicator(boolean hasIndicator) {
        this.f9869a.setIndicator(hasIndicator);
        this.f9870b.setIndicator(hasIndicator);
        this.f9871c.setIndicator(hasIndicator);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setIndicatorColor(int color) {
        this.f9869a.setIndicatorColor(color);
        this.f9870b.setIndicatorColor(color);
        this.f9871c.setIndicatorColor(color);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setIndicatorSize(int size) {
        this.f9869a.setIndicatorSize(size);
        this.f9870b.setIndicatorSize(size);
        this.f9871c.setIndicatorSize(size);
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setItemAlign(int align) {
        throw new UnsupportedOperationException("You don't need to set item align forWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public void setItemAlignDay(int align) {
        this.f9871c.setItemAlign(align);
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public void setItemAlignMonth(int align) {
        this.f9870b.setItemAlign(align);
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public void setItemAlignYear(int align) {
        this.f9869a.setItemAlign(align);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemSpace(int space) {
        this.f9869a.setItemSpace(space);
        this.f9870b.setItemSpace(space);
        this.f9871c.setItemSpace(space);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemTextColor(int color) {
        this.f9869a.setItemTextColor(color);
        this.f9870b.setItemTextColor(color);
        this.f9871c.setItemTextColor(color);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemTextSize(int size) {
        this.f9869a.setItemTextSize(size);
        this.f9870b.setItemTextSize(size);
        this.f9871c.setItemTextSize(size);
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setMaximumWidthText(String text) {
        throw new UnsupportedOperationException("You don't need to set maximum width text forWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setMaximumWidthTextPosition(int position) {
        throw new UnsupportedOperationException("You don't need to set maximum width textposition for WheelDatePicker");
    }

    @Override // w0.b
    public void setMonth(int month) {
        this.f9877i = month;
        this.f9870b.setSelectedMonth(month);
        this.f9871c.setMonth(month);
    }

    @Override // com.aigestudio.wheelpicker.widgets.a
    public void setOnDateSelectedListener(a listener) {
        this.f9872d = listener;
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setOnItemSelectedListener(WheelPicker.a listener) {
        throw new UnsupportedOperationException("You can not set OnItemSelectedListener forWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setOnWheelChangeListener(WheelPicker.b listener) {
        throw new UnsupportedOperationException("WheelDatePicker unsupport setOnWheelChangeListener");
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setSameWidth(boolean hasSameSize) {
        throw new UnsupportedOperationException("You don't need to set same width forWheelDatePicker");
    }

    @Override // w0.b
    public void setSelectedDay(int day) {
        this.f9878j = day;
        this.f9871c.setSelectedDay(day);
    }

    @Override // com.aigestudio.wheelpicker.a
    @Deprecated
    public void setSelectedItemPosition(int position) {
        throw new UnsupportedOperationException("You can not set position of selected item forWheelDatePicker");
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setSelectedItemTextColor(int color) {
        this.f9869a.setSelectedItemTextColor(color);
        this.f9870b.setSelectedItemTextColor(color);
        this.f9871c.setSelectedItemTextColor(color);
    }

    @Override // w0.c
    public void setSelectedMonth(int month) {
        this.f9877i = month;
        this.f9870b.setSelectedMonth(month);
        this.f9871c.setMonth(month);
    }

    @Override // w0.d
    public void setSelectedYear(int year) {
        this.f9876h = year;
        this.f9869a.setSelectedYear(year);
        this.f9871c.setYear(year);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setTypeface(Typeface tf2) {
        this.f9869a.setTypeface(tf2);
        this.f9870b.setTypeface(tf2);
        this.f9871c.setTypeface(tf2);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setVisibleItemCount(int count) {
        this.f9869a.setVisibleItemCount(count);
        this.f9870b.setVisibleItemCount(count);
        this.f9871c.setVisibleItemCount(count);
    }

    @Override // w0.b
    public void setYear(int year) {
        this.f9876h = year;
        this.f9869a.setSelectedYear(year);
        this.f9871c.setYear(year);
    }

    @Override // w0.d
    public void setYearEnd(int end) {
        this.f9869a.setYearEnd(end);
    }

    @Override // w0.d
    public void setYearStart(int start) {
        this.f9869a.setYearStart(start);
    }

    public WheelDatePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_wheel_date_picker, this);
        this.f9869a = (WheelYearPicker) findViewById(R.id.wheel_date_picker_year);
        this.f9870b = (WheelMonthPicker) findViewById(R.id.wheel_date_picker_month);
        this.f9871c = (WheelDayPicker) findViewById(R.id.wheel_date_picker_day);
        this.f9869a.setOnItemSelectedListener(this);
        this.f9870b.setOnItemSelectedListener(this);
        this.f9871c.setOnItemSelectedListener(this);
        i();
        this.f9870b.setMaximumWidthText(ChipTextInputComboView.b.f32535b);
        this.f9871c.setMaximumWidthText(ChipTextInputComboView.b.f32535b);
        this.f9873e = (TextView) findViewById(R.id.wheel_date_picker_year_tv);
        this.f9874f = (TextView) findViewById(R.id.wheel_date_picker_month_tv);
        this.f9875g = (TextView) findViewById(R.id.wheel_date_picker_day_tv);
        this.f9876h = this.f9869a.getCurrentYear();
        this.f9877i = this.f9870b.getCurrentMonth();
        this.f9878j = this.f9871c.getCurrentDay();
    }
}
