package androidx.constraintlayout.compose;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class DebugFlags {
    private static final int BOUNDS_FLAG = 1;
    private static final int KEY_POSITIONS_FLAG = 4;
    private static final int PATHS_FLAG = 2;
    private final int flags;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int None = m5459constructorimpl(0);
    private static final int All = m5459constructorimpl(-1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAll-bfy_xzQ, reason: not valid java name */
        public final int m5470getAllbfy_xzQ() {
            return DebugFlags.All;
        }

        /* renamed from: getNone-bfy_xzQ, reason: not valid java name */
        public final int m5471getNonebfy_xzQ() {
            return DebugFlags.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DebugFlags(int i11) {
        this.flags = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DebugFlags m5458boximpl(int i11) {
        return new DebugFlags(i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5459constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m5461constructorimpl$default(boolean z11, boolean z12, boolean z13, int i11, v vVar) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            z13 = false;
        }
        return m5460constructorimpl(z11, z12, z13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5462equalsimpl(int i11, Object obj) {
        return (obj instanceof DebugFlags) && i11 == ((DebugFlags) obj).m5469unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5463equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: getShowBounds-impl, reason: not valid java name */
    public static final boolean m5464getShowBoundsimpl(int i11) {
        return (i11 & 1) > 0;
    }

    /* renamed from: getShowKeyPositions-impl, reason: not valid java name */
    public static final boolean m5465getShowKeyPositionsimpl(int i11) {
        return (i11 & 4) > 0;
    }

    /* renamed from: getShowPaths-impl, reason: not valid java name */
    public static final boolean m5466getShowPathsimpl(int i11) {
        return (i11 & 2) > 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5467hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5468toStringimpl(int i11) {
        return "DebugFlags(showBounds = " + m5464getShowBoundsimpl(i11) + ", showPaths = " + m5466getShowPathsimpl(i11) + ", showKeyPositions = " + m5465getShowKeyPositionsimpl(i11) + ')';
    }

    public boolean equals(Object obj) {
        return m5462equalsimpl(this.flags, obj);
    }

    public int hashCode() {
        return m5467hashCodeimpl(this.flags);
    }

    @k
    public String toString() {
        return m5468toStringimpl(this.flags);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5469unboximpl() {
        return this.flags;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5460constructorimpl(boolean z11, boolean z12, boolean z13) {
        return m5459constructorimpl((z11 ? 1 : 0) | (z12 ? 2 : 0) | (z13 ? 4 : 0));
    }
}
