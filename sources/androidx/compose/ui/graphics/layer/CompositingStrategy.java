package androidx.compose.ui.graphics.layer;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m3134constructorimpl(0);
    private static final int Offscreen = m3134constructorimpl(1);
    private static final int ModulateAlpha = m3134constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m3140getAutoke2Ky5w() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m3141getModulateAlphake2Ky5w() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m3142getOffscreenke2Ky5w() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CompositingStrategy(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m3133boximpl(int i11) {
        return new CompositingStrategy(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3135equalsimpl(int i11, Object obj) {
        return (obj instanceof CompositingStrategy) && i11 == ((CompositingStrategy) obj).m3139unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3136equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3137hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3138toStringimpl(int i11) {
        return "CompositingStrategy(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m3135equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3137hashCodeimpl(this.value);
    }

    public String toString() {
        return m3138toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3139unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3134constructorimpl(int i11) {
        return i11;
    }
}
