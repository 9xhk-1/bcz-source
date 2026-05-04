package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class ReaderKind {

    @k
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m2080getComposition6f8NoZ8() {
            return ReaderKind.m2071constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m2081getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m2071constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m2082getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m2071constructorimpl(2);
        }

        private Companion() {
        }
    }

    private /* synthetic */ ReaderKind(int i11) {
        this.mask = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m2070boximpl(int i11) {
        return new ReaderKind(i11);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m2072constructorimpl$default(int i11, int i12, v vVar) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return m2071constructorimpl(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2073equalsimpl(int i11, Object obj) {
        return (obj instanceof ReaderKind) && i11 == ((ReaderKind) obj).m2079unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2074equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2075hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m2076isReadInh_f27i8(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2077toStringimpl(int i11) {
        return "ReaderKind(mask=" + i11 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m2078withReadIn3QSx2Dw(int i11, int i12) {
        return m2071constructorimpl(i11 | i12);
    }

    public boolean equals(Object obj) {
        return m2073equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m2075hashCodeimpl(this.mask);
    }

    public String toString() {
        return m2077toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2079unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2071constructorimpl(int i11) {
        return i11;
    }
}
