package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m2876constructorimpl(0);
    private static final int Repeated = m2876constructorimpl(1);
    private static final int Mirror = m2876constructorimpl(2);
    private static final int Decal = m2876constructorimpl(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m2882getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m2883getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m2884getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m2885getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TileMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m2875boximpl(int i11) {
        return new TileMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2877equalsimpl(int i11, Object obj) {
        return (obj instanceof TileMode) && i11 == ((TileMode) obj).m2881unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2878equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2879hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2880toStringimpl(int i11) {
        return m2878equalsimpl0(i11, Clamp) ? "Clamp" : m2878equalsimpl0(i11, Repeated) ? "Repeated" : m2878equalsimpl0(i11, Mirror) ? "Mirror" : m2878equalsimpl0(i11, Decal) ? "Decal" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2877equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2879hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2880toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2881unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2876constructorimpl(int i11) {
        return i11;
    }
}
