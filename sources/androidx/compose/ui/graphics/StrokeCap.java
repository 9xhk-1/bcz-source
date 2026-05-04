package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class StrokeCap {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m2856constructorimpl(0);
    private static final int Round = m2856constructorimpl(1);
    private static final int Square = m2856constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m2862getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m2863getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m2864getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeCap(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m2855boximpl(int i11) {
        return new StrokeCap(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2857equalsimpl(int i11, Object obj) {
        return (obj instanceof StrokeCap) && i11 == ((StrokeCap) obj).m2861unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2858equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2859hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2860toStringimpl(int i11) {
        return m2858equalsimpl0(i11, Butt) ? "Butt" : m2858equalsimpl0(i11, Round) ? "Round" : m2858equalsimpl0(i11, Square) ? "Square" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2857equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2859hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2860toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2861unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2856constructorimpl(int i11) {
        return i11;
    }
}
