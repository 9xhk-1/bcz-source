package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int None = m2601constructorimpl(0);
    private static final int Low = m2601constructorimpl(1);
    private static final int Medium = m2601constructorimpl(2);
    private static final int High = m2601constructorimpl(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m2607getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m2608getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m2609getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m2610getNonefv9h1I() {
            return FilterQuality.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FilterQuality(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m2600boximpl(int i11) {
        return new FilterQuality(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2602equalsimpl(int i11, Object obj) {
        return (obj instanceof FilterQuality) && i11 == ((FilterQuality) obj).m2606unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2603equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2604hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2605toStringimpl(int i11) {
        return m2603equalsimpl0(i11, None) ? "None" : m2603equalsimpl0(i11, Low) ? "Low" : m2603equalsimpl0(i11, Medium) ? "Medium" : m2603equalsimpl0(i11, High) ? "High" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2602equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2604hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2605toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2606unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2601constructorimpl(int i11) {
        return i11;
    }
}
