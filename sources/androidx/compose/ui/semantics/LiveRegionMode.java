package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes2.dex */
public final class LiveRegionMode {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m4308constructorimpl(0);
    private static final int Assertive = m4308constructorimpl(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m4314getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m4315getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        private Companion() {
        }
    }

    private /* synthetic */ LiveRegionMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m4307boximpl(int i11) {
        return new LiveRegionMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4309equalsimpl(int i11, Object obj) {
        return (obj instanceof LiveRegionMode) && i11 == ((LiveRegionMode) obj).m4313unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4310equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4311hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4312toStringimpl(int i11) {
        return m4310equalsimpl0(i11, Polite) ? "Polite" : m4310equalsimpl0(i11, Assertive) ? "Assertive" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m4309equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4311hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4312toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4313unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4308constructorimpl(int i11) {
        return i11;
    }
}
