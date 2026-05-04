package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {

    @k
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m2862getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m2873getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;

    @l
    private final PathEffect pathEffect;
    private final float width;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m3131getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m3132getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Stroke(float f11, float f12, int i11, int i12, PathEffect pathEffect, v vVar) {
        this(f11, f12, i11, i12, pathEffect);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m2858equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m2868equalsimpl0(this.join, stroke.join) && g0.g(this.pathEffect, stroke.pathEffect);
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m3129getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m3130getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    @l
    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + StrokeCap.m2859hashCodeimpl(this.cap)) * 31) + StrokeJoin.m2869hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect = this.pathEffect;
        return hashCode + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m2860toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m2870toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ Stroke(float f11, float f12, int i11, int i12, PathEffect pathEffect, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0.0f : f11, (i13 & 2) != 0 ? 4.0f : f12, (i13 & 4) != 0 ? DefaultCap : i11, (i13 & 8) != 0 ? DefaultJoin : i12, (i13 & 16) != 0 ? null : pathEffect, null);
    }

    private Stroke(float f11, float f12, int i11, int i12, PathEffect pathEffect) {
        super(null);
        this.width = f11;
        this.miter = f12;
        this.cap = i11;
        this.join = i12;
        this.pathEffect = pathEffect;
    }
}
