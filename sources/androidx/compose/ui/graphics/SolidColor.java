package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j11, kotlin.jvm.internal.v vVar) {
        this(j11);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo2456applyToPq9zytI(long j11, @m80.k Paint paint, float f11) {
        long m2508copywmQWz5c$default;
        paint.setAlpha(1.0f);
        if (f11 == 1.0f) {
            m2508copywmQWz5c$default = this.value;
        } else {
            long j12 = this.value;
            m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(j12, Color.m2511getAlphaimpl(j12) * f11, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo2388setColor8_81llA(m2508copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m2510equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m2844getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m2516hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m2517toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j11) {
        super(null);
        this.value = j11;
    }
}
