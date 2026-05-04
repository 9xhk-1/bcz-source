package androidx.compose.material;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Start = m1672constructorimpl(0);
    private static final int Center = m1672constructorimpl(1);
    private static final int End = m1672constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getCenter-5ygKITE, reason: not valid java name */
        public final int m1678getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE, reason: not valid java name */
        public final int m1679getEnd5ygKITE() {
            return FabPosition.End;
        }

        /* renamed from: getStart-5ygKITE, reason: not valid java name */
        public final int m1680getStart5ygKITE() {
            return FabPosition.Start;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FabPosition(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m1671boximpl(int i11) {
        return new FabPosition(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1673equalsimpl(int i11, Object obj) {
        return (obj instanceof FabPosition) && i11 == ((FabPosition) obj).m1677unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1674equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1675hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1676toStringimpl(int i11) {
        return m1674equalsimpl0(i11, Start) ? "FabPosition.Start" : m1674equalsimpl0(i11, Center) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m1673equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1675hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m1676toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1677unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1672constructorimpl(int i11) {
        return i11;
    }
}
