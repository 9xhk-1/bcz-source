package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m2591constructorimpl(0);
    private static final int Offscreen = m2591constructorimpl(1);
    private static final int ModulateAlpha = m2591constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getAuto--NrFUSI, reason: not valid java name */
        public final int m2597getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha--NrFUSI, reason: not valid java name */
        public final int m2598getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen--NrFUSI, reason: not valid java name */
        public final int m2599getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CompositingStrategy(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m2590boximpl(int i11) {
        return new CompositingStrategy(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2592equalsimpl(int i11, Object obj) {
        return (obj instanceof CompositingStrategy) && i11 == ((CompositingStrategy) obj).m2596unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2593equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2594hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2595toStringimpl(int i11) {
        return "CompositingStrategy(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m2592equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2594hashCodeimpl(this.value);
    }

    public String toString() {
        return m2595toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2596unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2591constructorimpl(int i11) {
        return i11;
    }
}
