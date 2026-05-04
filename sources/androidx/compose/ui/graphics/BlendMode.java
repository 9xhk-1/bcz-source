package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m2418constructorimpl(0);
    private static final int Src = m2418constructorimpl(1);
    private static final int Dst = m2418constructorimpl(2);
    private static final int SrcOver = m2418constructorimpl(3);
    private static final int DstOver = m2418constructorimpl(4);
    private static final int SrcIn = m2418constructorimpl(5);
    private static final int DstIn = m2418constructorimpl(6);
    private static final int SrcOut = m2418constructorimpl(7);
    private static final int DstOut = m2418constructorimpl(8);
    private static final int SrcAtop = m2418constructorimpl(9);
    private static final int DstAtop = m2418constructorimpl(10);
    private static final int Xor = m2418constructorimpl(11);
    private static final int Plus = m2418constructorimpl(12);
    private static final int Modulate = m2418constructorimpl(13);
    private static final int Screen = m2418constructorimpl(14);
    private static final int Overlay = m2418constructorimpl(15);
    private static final int Darken = m2418constructorimpl(16);
    private static final int Lighten = m2418constructorimpl(17);
    private static final int ColorDodge = m2418constructorimpl(18);
    private static final int ColorBurn = m2418constructorimpl(19);
    private static final int Hardlight = m2418constructorimpl(20);
    private static final int Softlight = m2418constructorimpl(21);
    private static final int Difference = m2418constructorimpl(22);
    private static final int Exclusion = m2418constructorimpl(23);
    private static final int Multiply = m2418constructorimpl(24);
    private static final int Hue = m2418constructorimpl(25);
    private static final int Saturation = m2418constructorimpl(26);
    private static final int Color = m2418constructorimpl(27);
    private static final int Luminosity = m2418constructorimpl(28);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m2424getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m2425getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m2426getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m2427getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m2428getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m2429getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m2430getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m2431getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m2432getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m2433getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m2434getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m2435getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m2436getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m2437getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m2438getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m2439getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m2440getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m2441getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m2442getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m2443getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m2444getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m2445getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m2446getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m2447getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m2448getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m2449getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m2450getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m2451getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m2452getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlendMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m2417boximpl(int i11) {
        return new BlendMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2419equalsimpl(int i11, Object obj) {
        return (obj instanceof BlendMode) && i11 == ((BlendMode) obj).m2423unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2420equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2421hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2422toStringimpl(int i11) {
        return m2420equalsimpl0(i11, Clear) ? "Clear" : m2420equalsimpl0(i11, Src) ? "Src" : m2420equalsimpl0(i11, Dst) ? "Dst" : m2420equalsimpl0(i11, SrcOver) ? "SrcOver" : m2420equalsimpl0(i11, DstOver) ? "DstOver" : m2420equalsimpl0(i11, SrcIn) ? "SrcIn" : m2420equalsimpl0(i11, DstIn) ? "DstIn" : m2420equalsimpl0(i11, SrcOut) ? "SrcOut" : m2420equalsimpl0(i11, DstOut) ? "DstOut" : m2420equalsimpl0(i11, SrcAtop) ? "SrcAtop" : m2420equalsimpl0(i11, DstAtop) ? "DstAtop" : m2420equalsimpl0(i11, Xor) ? "Xor" : m2420equalsimpl0(i11, Plus) ? "Plus" : m2420equalsimpl0(i11, Modulate) ? "Modulate" : m2420equalsimpl0(i11, Screen) ? "Screen" : m2420equalsimpl0(i11, Overlay) ? "Overlay" : m2420equalsimpl0(i11, Darken) ? "Darken" : m2420equalsimpl0(i11, Lighten) ? "Lighten" : m2420equalsimpl0(i11, ColorDodge) ? "ColorDodge" : m2420equalsimpl0(i11, ColorBurn) ? "ColorBurn" : m2420equalsimpl0(i11, Hardlight) ? "HardLight" : m2420equalsimpl0(i11, Softlight) ? "Softlight" : m2420equalsimpl0(i11, Difference) ? "Difference" : m2420equalsimpl0(i11, Exclusion) ? "Exclusion" : m2420equalsimpl0(i11, Multiply) ? "Multiply" : m2420equalsimpl0(i11, Hue) ? "Hue" : m2420equalsimpl0(i11, Saturation) ? ExifInterface.TAG_SATURATION : m2420equalsimpl0(i11, Color) ? "Color" : m2420equalsimpl0(i11, Luminosity) ? "Luminosity" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2419equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2421hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2422toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2423unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2418constructorimpl(int i11) {
        return i11;
    }
}
