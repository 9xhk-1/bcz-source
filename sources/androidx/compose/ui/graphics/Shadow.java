package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class Shadow {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final Shadow getNone() {
            return Shadow.None;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }

    public /* synthetic */ Shadow(long j11, long j12, float f11, kotlin.jvm.internal.v vVar) {
        this(j11, j12, f11);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m2830copyqcb84PM$default(Shadow shadow, long j11, long j12, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = shadow.color;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = shadow.offset;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            f11 = shadow.blurRadius;
        }
        return shadow.m2833copyqcb84PM(j13, j14, f11);
    }

    @m80.k
    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m2833copyqcb84PM(long j11, long j12, float f11) {
        return new Shadow(j11, j12, f11, null);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m2510equalsimpl0(this.color, shadow.color) && Offset.m2265equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2834getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m2835getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m2516hashCodeimpl(this.color) * 31) + Offset.m2270hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    @m80.k
    public String toString() {
        return "Shadow(color=" + ((Object) Color.m2517toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m2276toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j11, long j12, float f11) {
        this.color = j11;
        this.offset = j12;
        this.blurRadius = f11;
    }

    public /* synthetic */ Shadow(long j11, long j12, float f11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? ColorKt.Color(4278190080L) : j11, (i11 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j12, (i11 & 4) != 0 ? 0.0f : f11, null);
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m2831getColor0d7_KjU$annotations() {
    }

    @Stable
    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m2832getOffsetF1C5BW0$annotations() {
    }
}
