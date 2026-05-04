package com.aigestudio.wheelpicker;

import android.graphics.Typeface;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a {
    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean g();

    int getCurrentItemPosition();

    int getCurtainColor();

    List getData();

    int getIndicatorColor();

    int getIndicatorSize();

    int getItemAlign();

    int getItemSpace();

    int getItemTextColor();

    int getItemTextSize();

    String getMaximumWidthText();

    int getMaximumWidthTextPosition();

    int getSelectedItemPosition();

    int getSelectedItemTextColor();

    Typeface getTypeface();

    int getVisibleItemCount();

    boolean h();

    void setAtmospheric(boolean hasAtmospheric);

    void setCurtain(boolean hasCurtain);

    void setCurtainColor(int color);

    void setCurved(boolean isCurved);

    void setCyclic(boolean isCyclic);

    void setData(List data);

    void setIndicator(boolean hasIndicator);

    void setIndicatorColor(int color);

    void setIndicatorSize(int size);

    void setItemAlign(int align);

    void setItemSpace(int space);

    void setItemTextColor(int color);

    void setItemTextSize(int size);

    void setMaximumWidthText(String text);

    void setMaximumWidthTextPosition(int position);

    void setOnItemSelectedListener(WheelPicker.a listener);

    void setOnWheelChangeListener(WheelPicker.b listener);

    void setSameWidth(boolean hasSameSize);

    void setSelectedItemPosition(int position);

    void setSelectedItemTextColor(int color);

    void setTypeface(Typeface tf2);

    void setVisibleItemCount(int count);
}
