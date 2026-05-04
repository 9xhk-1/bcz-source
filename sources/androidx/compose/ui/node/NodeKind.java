package androidx.compose.ui.node;

import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i11) {
        this.mask = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m4117boximpl(int i11) {
        return new NodeKind(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4119equalsimpl(int i11, Object obj) {
        return (obj instanceof NodeKind) && i11 == ((NodeKind) obj).m4125unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4120equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4121hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m4122orH91voCI(int i11, int i12) {
        return i11 | i12;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m4123orimpl(int i11, int i12) {
        return i11 | i12;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4124toStringimpl(int i11) {
        return "NodeKind(mask=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m4119equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m4121hashCodeimpl(this.mask);
    }

    public String toString() {
        return m4124toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4125unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m4118constructorimpl(int i11) {
        return i11;
    }
}
