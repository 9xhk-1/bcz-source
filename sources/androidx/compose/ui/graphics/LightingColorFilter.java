package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j11, long j12, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.v vVar) {
        this(j11, j12, colorFilter);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m2510equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m2510equalsimpl0(this.add, lightingColorFilter.add);
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m2735getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m2736getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return (Color.m2516hashCodeimpl(this.multiply) * 31) + Color.m2516hashCodeimpl(this.add);
    }

    @m80.k
    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m2517toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m2517toStringimpl(this.add)) + ')';
    }

    public /* synthetic */ LightingColorFilter(long j11, long j12, kotlin.jvm.internal.v vVar) {
        this(j11, j12);
    }

    private LightingColorFilter(long j11, long j12, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j11;
        this.add = j12;
    }

    private LightingColorFilter(long j11, long j12) {
        this(j11, j12, AndroidColorFilter_androidKt.m2374actualLightingColorFilterOWjLjI(j11, j12), null);
    }
}
