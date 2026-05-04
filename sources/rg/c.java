package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f84040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84041b;

    public c(@m80.k Context context, int i11) {
        g0.p(context, "context");
        this.f84040a = context;
        this.f84041b = i11;
    }

    public final TextPaint a(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        float a11 = xb.f.a(this.f84040a, this.f84041b);
        if (com.baicizhan.base.a.a(this.f84040a)) {
            a11 *= com.baicizhan.base.d.g();
        }
        textPaint.setTextSize(a11);
        return textPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@m80.k Canvas canvas, @m80.k CharSequence text, int i11, int i12, float f11, int i13, int i14, int i15, @m80.k Paint paint) {
        g0.p(canvas, "canvas");
        g0.p(text, "text");
        g0.p(paint, "paint");
        canvas.drawText(text.subSequence(i11, i12).toString(), f11, i14 - xb.f.a(this.f84040a, 2.0f), a(paint));
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@m80.k Paint paint, @m80.k CharSequence text, int i11, int i12, @m80.l Paint.FontMetricsInt fontMetricsInt) {
        g0.p(paint, "paint");
        g0.p(text, "text");
        return (int) a(paint).measureText(text.subSequence(i11, i12).toString());
    }
}
