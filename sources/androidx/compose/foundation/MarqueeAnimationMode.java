package androidx.compose.foundation;

import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes.dex */
public final class MarqueeAnimationMode {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Immediately = m308constructorimpl(0);
    private static final int WhileFocused = m308constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m314getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m315getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MarqueeAnimationMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m307boximpl(int i11) {
        return new MarqueeAnimationMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m309equalsimpl(int i11, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i11 == ((MarqueeAnimationMode) obj).m313unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m310equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m311hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m312toStringimpl(int i11) {
        if (m310equalsimpl0(i11, Immediately)) {
            return "Immediately";
        }
        if (m310equalsimpl0(i11, WhileFocused)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i11).toString());
    }

    public boolean equals(Object obj) {
        return m309equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m311hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m312toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m313unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m308constructorimpl(int i11) {
        return i11;
    }
}
