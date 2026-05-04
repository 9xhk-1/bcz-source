package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class KeyboardCapitalization {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m4759constructorimpl(-1);
    private static final int None = m4759constructorimpl(0);
    private static final int Characters = m4759constructorimpl(1);
    private static final int Words = m4759constructorimpl(2);
    private static final int Sentences = m4759constructorimpl(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m4770getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m4771getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m4772getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m4773getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m4774getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4765getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4766getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4767getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4768getUnspecifiedIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4769getWordsIUNYP9k$annotations() {
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m4758boximpl(int i11) {
        return new KeyboardCapitalization(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4760equalsimpl(int i11, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i11 == ((KeyboardCapitalization) obj).m4764unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4761equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4762hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4763toStringimpl(int i11) {
        return m4761equalsimpl0(i11, Unspecified) ? "Unspecified" : m4761equalsimpl0(i11, None) ? "None" : m4761equalsimpl0(i11, Characters) ? "Characters" : m4761equalsimpl0(i11, Words) ? "Words" : m4761equalsimpl0(i11, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4760equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4762hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4763toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4764unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4759constructorimpl(int i11) {
        return i11;
    }
}
