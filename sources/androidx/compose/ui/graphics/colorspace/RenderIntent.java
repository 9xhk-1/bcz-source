package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m2937constructorimpl(0);
    private static final int Relative = m2937constructorimpl(1);
    private static final int Saturation = m2937constructorimpl(2);
    private static final int Absolute = m2937constructorimpl(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m2943getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m2944getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m2945getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m2946getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        private Companion() {
        }
    }

    private /* synthetic */ RenderIntent(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m2936boximpl(int i11) {
        return new RenderIntent(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2938equalsimpl(int i11, Object obj) {
        return (obj instanceof RenderIntent) && i11 == ((RenderIntent) obj).m2942unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2939equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2940hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2941toStringimpl(int i11) {
        return m2939equalsimpl0(i11, Perceptual) ? "Perceptual" : m2939equalsimpl0(i11, Relative) ? "Relative" : m2939equalsimpl0(i11, Saturation) ? ExifInterface.TAG_SATURATION : m2939equalsimpl0(i11, Absolute) ? "Absolute" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2938equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2940hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2941toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2942unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2937constructorimpl(int i11) {
        return i11;
    }
}
