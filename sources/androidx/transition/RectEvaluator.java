package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    public RectEvaluator() {
    }

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f11, Rect rect, Rect rect2) {
        int i11 = rect.left + ((int) ((rect2.left - r0) * f11));
        int i12 = rect.top + ((int) ((rect2.top - r1) * f11));
        int i13 = rect.right + ((int) ((rect2.right - r2) * f11));
        int i14 = rect.bottom + ((int) ((rect2.bottom - r6) * f11));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i11, i12, i13, i14);
        }
        rect3.set(i11, i12, i13, i14);
        return this.mRect;
    }
}
