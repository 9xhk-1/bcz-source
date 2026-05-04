package ja;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public int f63933a;

    public a(int bgColor) {
        this.f63933a = bgColor;
    }

    public final void a(TextPaint tp2) {
        tp2.setFakeBoldText(true);
        tp2.bgColor = this.f63933a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp2) {
        a(tp2);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint tp2) {
        a(tp2);
    }
}
