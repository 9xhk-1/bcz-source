package androidx.compose.foundation.gestures.snapping;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class FinalSnappingItem {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int ClosestItem = m538constructorimpl(0);
    private static final int NextItem = m538constructorimpl(1);
    private static final int PreviousItem = m538constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m544getClosestItembbeMdSM() {
            return FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m545getNextItembbeMdSM() {
            return FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m546getPreviousItembbeMdSM() {
            return FinalSnappingItem.PreviousItem;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FinalSnappingItem(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FinalSnappingItem m537boximpl(int i11) {
        return new FinalSnappingItem(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m539equalsimpl(int i11, Object obj) {
        return (obj instanceof FinalSnappingItem) && i11 == ((FinalSnappingItem) obj).m543unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m540equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m541hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m542toStringimpl(int i11) {
        return "FinalSnappingItem(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m539equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m541hashCodeimpl(this.value);
    }

    public String toString() {
        return m542toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m543unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m538constructorimpl(int i11) {
        return i11;
    }
}
