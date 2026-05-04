package com.baicizhan.main.activity.myevaluationd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import com.baicizhan.client.business.util.Fonts;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.jiongji.andriod.card.R;
import im.d;
import rm.g;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public class MyMarkerView extends MarkerView {

    /* renamed from: d, reason: collision with root package name */
    public final TextView f18583d;

    public MyMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);
        TextView textView = (TextView) findViewById(R.id.tvContent);
        this.f18583d = textView;
        Fonts.setSafeFace(textView, R.font.din_black_italic);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, em.d
    public void b(Entry e11, d highlight) {
        if (e11 instanceof CandleEntry) {
            this.f18583d.setText(k.p(((CandleEntry) e11).o(), 0, true, ','));
        } else {
            this.f18583d.setText(k.p(e11.c(), 0, true, ','));
        }
        super.b(e11, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, em.d
    public g getOffset() {
        return new g(-(getWidth() / 2), -getHeight());
    }
}
