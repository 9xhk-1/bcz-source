package rg;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Typeface f84039a;

    public b(@m80.l Typeface typeface) {
        this.f84039a = typeface;
    }

    public final void a(TextPaint textPaint) {
        g0.m(textPaint);
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface(Typeface.create(this.f84039a, typeface != null ? typeface.getStyle() : 0));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@m80.l TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@m80.k TextPaint textPaint) {
        g0.p(textPaint, "textPaint");
        a(textPaint);
    }
}
