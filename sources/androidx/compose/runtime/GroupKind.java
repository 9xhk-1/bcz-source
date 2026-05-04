package androidx.compose.runtime;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
final class GroupKind {

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Group = m1897constructorimpl(0);
    private static final int Node = m1897constructorimpl(1);
    private static final int ReusableNode = m1897constructorimpl(2);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m1905getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m1906getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m1907getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }

        private Companion() {
        }
    }

    private /* synthetic */ GroupKind(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m1896boximpl(int i11) {
        return new GroupKind(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1898equalsimpl(int i11, Object obj) {
        return (obj instanceof GroupKind) && i11 == ((GroupKind) obj).m1904unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1899equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1900hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m1901isNodeimpl(int i11) {
        return i11 != Companion.m1905getGroupULZAiWs();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m1902isReusableimpl(int i11) {
        return i11 != Companion.m1906getNodeULZAiWs();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1903toStringimpl(int i11) {
        return "GroupKind(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m1898equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1900hashCodeimpl(this.value);
    }

    public String toString() {
        return m1903toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1904unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1897constructorimpl(int i11) {
        return i11;
    }
}
