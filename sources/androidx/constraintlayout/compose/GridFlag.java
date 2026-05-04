package androidx.constraintlayout.compose;

import kotlin.jvm.internal.v;
import m80.k;
import m80.o;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class GridFlag {

    @k
    public static final Companion Companion = new Companion(null);
    private static final int None = m5478constructorimpl$default(false, false, 3, null);
    private static final int PlaceLayoutsOnSpansFirst = m5478constructorimpl$default(true, false, 2, null);

    @o
    private static final int SubGridByColRow = m5478constructorimpl$default(false, true, 1, null);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getNone-dTRCCdc, reason: not valid java name */
        public final int m5487getNonedTRCCdc() {
            return GridFlag.None;
        }

        /* renamed from: getPlaceLayoutsOnSpansFirst-dTRCCdc, reason: not valid java name */
        public final int m5488getPlaceLayoutsOnSpansFirstdTRCCdc() {
            return GridFlag.PlaceLayoutsOnSpansFirst;
        }

        /* renamed from: getSubGridByColRow-dTRCCdc$constraintlayout_compose_release, reason: not valid java name */
        public final int m5489getSubGridByColRowdTRCCdc$constraintlayout_compose_release() {
            return GridFlag.SubGridByColRow;
        }

        private Companion() {
        }
    }

    private /* synthetic */ GridFlag(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridFlag m5475boximpl(int i11) {
        return new GridFlag(i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5476constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m5478constructorimpl$default(boolean z11, boolean z12, int i11, v vVar) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return m5477constructorimpl(z11, z12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5479equalsimpl(int i11, Object obj) {
        return (obj instanceof GridFlag) && i11 == ((GridFlag) obj).m5486unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5480equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5481hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: isPlaceLayoutsOnSpansFirst-impl, reason: not valid java name */
    public static final boolean m5482isPlaceLayoutsOnSpansFirstimpl(int i11) {
        return (i11 & 2) == 0;
    }

    /* renamed from: isSubGridByColRow-impl$constraintlayout_compose_release, reason: not valid java name */
    public static final boolean m5483isSubGridByColRowimpl$constraintlayout_compose_release(int i11) {
        return (i11 & 1) > 0;
    }

    /* renamed from: or-90j8xCw, reason: not valid java name */
    public static final int m5484or90j8xCw(int i11, int i12) {
        return m5477constructorimpl(m5482isPlaceLayoutsOnSpansFirstimpl(i11) | m5482isPlaceLayoutsOnSpansFirstimpl(i12), m5483isSubGridByColRowimpl$constraintlayout_compose_release(i11) | m5483isSubGridByColRowimpl$constraintlayout_compose_release(i12));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5485toStringimpl(int i11) {
        return "GridFlag(isPlaceLayoutsOnSpansFirst = " + m5482isPlaceLayoutsOnSpansFirstimpl(i11) + ')';
    }

    public boolean equals(Object obj) {
        return m5479equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5481hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m5485toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5486unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5477constructorimpl(boolean z11, boolean z12) {
        return m5476constructorimpl((z11 ? 0 : 2) | (z12 ? 1 : 0));
    }
}
