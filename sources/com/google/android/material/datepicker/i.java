package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f31165d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f31166e;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f31167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31169c;

    static {
        f31166e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar x11 = v.x();
        this.f31167a = x11;
        this.f31168b = x11.getMaximum(7);
        this.f31169c = x11.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i11) {
        if (i11 >= this.f31168b) {
            return null;
        }
        return Integer.valueOf(c(i11));
    }

    public final int c(int i11) {
        int i12 = i11 + this.f31169c;
        int i13 = this.f31168b;
        return i12 > i13 ? i12 - i13 : i12;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f31168b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public View getView(int i11, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f31167a.set(7, c(i11));
        textView.setText(this.f31167a.getDisplayName(7, f31166e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f31167a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i11) {
        Calendar x11 = v.x();
        this.f31167a = x11;
        this.f31168b = x11.getMaximum(7);
        this.f31169c = i11;
    }
}
