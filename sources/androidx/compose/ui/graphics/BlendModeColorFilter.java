package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long j11, int i11, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.v vVar) {
        this(j11, i11, colorFilter);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m2510equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m2420equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m2453getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2454getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return (Color.m2516hashCodeimpl(this.color) * 31) + BlendMode.m2421hashCodeimpl(this.blendMode);
    }

    @m80.k
    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m2517toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m2422toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j11, int i11, kotlin.jvm.internal.v vVar) {
        this(j11, i11);
    }

    private BlendModeColorFilter(long j11, int i11, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j11;
        this.blendMode = i11;
    }

    private BlendModeColorFilter(long j11, int i11) {
        this(j11, i11, AndroidColorFilter_androidKt.m2375actualTintColorFilterxETnrds(j11, i11), null);
    }
}
