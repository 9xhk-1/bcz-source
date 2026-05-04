package androidx.compose.ui.text.font;

import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes2.dex */
public final class FontLoadingStrategy {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m4655constructorimpl(0);
    private static final int OptionalLocal = m4655constructorimpl(1);
    private static final int Async = m4655constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m4661getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m4662getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m4663getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m4654boximpl(int i11) {
        return new FontLoadingStrategy(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4656equalsimpl(int i11, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i11 == ((FontLoadingStrategy) obj).m4660unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4657equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4658hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4659toStringimpl(int i11) {
        if (m4657equalsimpl0(i11, Blocking)) {
            return "Blocking";
        }
        if (m4657equalsimpl0(i11, OptionalLocal)) {
            return "Optional";
        }
        if (m4657equalsimpl0(i11, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m4656equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4658hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4659toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4660unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4655constructorimpl(int i11) {
        return i11;
    }
}
