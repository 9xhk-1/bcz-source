package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@u0({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,87:1\n85#2:88\n80#2:89\n80#2:90\n80#2:91\n80#2:92\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:88\n57#1:89\n63#1:90\n69#1:91\n75#1:92\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class ColorModel {
    private static final long Cmyk;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m2921getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m2922getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m2923getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m2924getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        private Companion() {
        }
    }

    static {
        long j11 = 3;
        long j12 = j11 << 32;
        Rgb = m2914constructorimpl((0 & 4294967295L) | j12);
        Xyz = m2914constructorimpl((1 & 4294967295L) | j12);
        Lab = m2914constructorimpl(j12 | (2 & 4294967295L));
        Cmyk = m2914constructorimpl((j11 & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m2913boximpl(long j11) {
        return new ColorModel(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2915equalsimpl(long j11, Object obj) {
        return (obj instanceof ColorModel) && j11 == ((ColorModel) obj).m2920unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2916equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    @IntRange(from = 1, to = 4)
    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m2917getComponentCountimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2918hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2919toStringimpl(long j11) {
        return m2916equalsimpl0(j11, Rgb) ? "Rgb" : m2916equalsimpl0(j11, Xyz) ? "Xyz" : m2916equalsimpl0(j11, Lab) ? "Lab" : m2916equalsimpl0(j11, Cmyk) ? "Cmyk" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2915equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2918hashCodeimpl(this.packedValue);
    }

    @m80.k
    public String toString() {
        return m2919toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2920unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2914constructorimpl(long j11) {
        return j11;
    }
}
