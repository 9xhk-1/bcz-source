package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m2722constructorimpl(0);
    private static final int Alpha8 = m2722constructorimpl(1);
    private static final int Rgb565 = m2722constructorimpl(2);
    private static final int F16 = m2722constructorimpl(3);
    private static final int Gpu = m2722constructorimpl(4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m2728getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m2729getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m2730getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m2731getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m2732getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m2721boximpl(int i11) {
        return new ImageBitmapConfig(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2723equalsimpl(int i11, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i11 == ((ImageBitmapConfig) obj).m2727unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2724equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2725hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2726toStringimpl(int i11) {
        return m2724equalsimpl0(i11, Argb8888) ? "Argb8888" : m2724equalsimpl0(i11, Alpha8) ? "Alpha8" : m2724equalsimpl0(i11, Rgb565) ? "Rgb565" : m2724equalsimpl0(i11, F16) ? "F16" : m2724equalsimpl0(i11, Gpu) ? "Gpu" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2723equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2725hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2726toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2727unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2722constructorimpl(int i11) {
        return i11;
    }
}
