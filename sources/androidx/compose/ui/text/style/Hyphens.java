package androidx.compose.ui.text.style;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class Hyphens {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int None = m4869constructorimpl(1);
    private static final int Auto = m4869constructorimpl(2);
    private static final int Unspecified = m4869constructorimpl(Integer.MIN_VALUE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m4875getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m4876getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m4877getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Hyphens(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m4868boximpl(int i11) {
        return new Hyphens(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4870equalsimpl(int i11, Object obj) {
        return (obj instanceof Hyphens) && i11 == ((Hyphens) obj).m4874unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4871equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4872hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4873toStringimpl(int i11) {
        return m4871equalsimpl0(i11, None) ? "Hyphens.None" : m4871equalsimpl0(i11, Auto) ? "Hyphens.Auto" : m4871equalsimpl0(i11, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4870equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4872hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4873toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4874unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4869constructorimpl(int i11) {
        return i11;
    }
}
