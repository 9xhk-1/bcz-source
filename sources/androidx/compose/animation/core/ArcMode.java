package androidx.compose.animation.core;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class ArcMode {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int ArcAbove = m141constructorimpl(5);
    private static final int ArcBelow = m141constructorimpl(4);
    private static final int ArcLinear = m141constructorimpl(0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m147getArcAbove9TMq4() {
            return ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m148getArcBelow9TMq4() {
            return ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m149getArcLinear9TMq4() {
            return ArcMode.ArcLinear;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ArcMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArcMode m140boximpl(int i11) {
        return new ArcMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m142equalsimpl(int i11, Object obj) {
        return (obj instanceof ArcMode) && i11 == ((ArcMode) obj).m146unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m143equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m144hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m145toStringimpl(int i11) {
        return "ArcMode(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m142equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m144hashCodeimpl(this.value);
    }

    public String toString() {
        return m145toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m146unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m141constructorimpl(int i11) {
        return i11;
    }
}
