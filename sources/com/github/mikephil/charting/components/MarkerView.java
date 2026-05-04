package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import em.d;
import java.lang.ref.WeakReference;
import rm.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class MarkerView extends RelativeLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public g f30231a;

    /* renamed from: b, reason: collision with root package name */
    public g f30232b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<Chart> f30233c;

    public MarkerView(Context context, int i11) {
        super(context);
        this.f30231a = new g();
        this.f30232b = new g();
        setupLayoutResource(i11);
    }

    private void setupLayoutResource(int i11) {
        View inflate = LayoutInflater.from(getContext()).inflate(i11, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    @Override // em.d
    public void a(Canvas canvas, float f11, float f12) {
        g c11 = c(f11, f12);
        int save = canvas.save();
        canvas.translate(f11 + c11.f84265c, f12 + c11.f84266d);
        draw(canvas);
        canvas.restoreToCount(save);
    }

    public void b(Entry entry, im.d dVar) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // em.d
    public g c(float f11, float f12) {
        g offset = getOffset();
        g gVar = this.f30232b;
        gVar.f84265c = offset.f84265c;
        gVar.f84266d = offset.f84266d;
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        g gVar2 = this.f30232b;
        float f13 = gVar2.f84265c;
        if (f11 + f13 < 0.0f) {
            gVar2.f84265c = -f11;
        } else if (chartView != null && f11 + width + f13 > chartView.getWidth()) {
            this.f30232b.f84265c = (chartView.getWidth() - f11) - width;
        }
        g gVar3 = this.f30232b;
        float f14 = gVar3.f84266d;
        if (f12 + f14 < 0.0f) {
            gVar3.f84266d = -f12;
        } else if (chartView != null && f12 + height + f14 > chartView.getHeight()) {
            this.f30232b.f84266d = (chartView.getHeight() - f12) - height;
        }
        return this.f30232b;
    }

    public void d(float f11, float f12) {
        g gVar = this.f30231a;
        gVar.f84265c = f11;
        gVar.f84266d = f12;
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.f30233c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public g getOffset() {
        return this.f30231a;
    }

    public void setChartView(Chart chart) {
        this.f30233c = new WeakReference<>(chart);
    }

    public void setOffset(g gVar) {
        this.f30231a = gVar;
        if (gVar == null) {
            this.f30231a = new g();
        }
    }
}
