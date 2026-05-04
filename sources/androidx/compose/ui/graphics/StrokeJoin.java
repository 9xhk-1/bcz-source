package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class StrokeJoin {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m2866constructorimpl(0);
    private static final int Round = m2866constructorimpl(1);
    private static final int Bevel = m2866constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m2872getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m2873getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m2874getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeJoin(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m2865boximpl(int i11) {
        return new StrokeJoin(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2867equalsimpl(int i11, Object obj) {
        return (obj instanceof StrokeJoin) && i11 == ((StrokeJoin) obj).m2871unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2868equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2869hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2870toStringimpl(int i11) {
        return m2868equalsimpl0(i11, Miter) ? "Miter" : m2868equalsimpl0(i11, Round) ? "Round" : m2868equalsimpl0(i11, Bevel) ? "Bevel" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2867equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2869hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2870toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2871unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2866constructorimpl(int i11) {
        return i11;
    }
}
