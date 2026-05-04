package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class ImeAction {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m4723constructorimpl(-1);
    private static final int Default = m4723constructorimpl(1);
    private static final int None = m4723constructorimpl(0);
    private static final int Go = m4723constructorimpl(2);
    private static final int Search = m4723constructorimpl(3);
    private static final int Send = m4723constructorimpl(4);
    private static final int Previous = m4723constructorimpl(5);
    private static final int Next = m4723constructorimpl(6);
    private static final int Done = m4723constructorimpl(7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m4738getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m4739getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m4740getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m4741getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m4742getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m4743getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m4744getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m4745getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m4746getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4729getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4730getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4731getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4732getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4733getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4734getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4735getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4736getSendeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4737getUnspecifiedeUduSuo$annotations() {
        }
    }

    private /* synthetic */ ImeAction(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m4722boximpl(int i11) {
        return new ImeAction(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4724equalsimpl(int i11, Object obj) {
        return (obj instanceof ImeAction) && i11 == ((ImeAction) obj).m4728unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4725equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4726hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4727toStringimpl(int i11) {
        return m4725equalsimpl0(i11, Unspecified) ? "Unspecified" : m4725equalsimpl0(i11, None) ? "None" : m4725equalsimpl0(i11, Default) ? "Default" : m4725equalsimpl0(i11, Go) ? "Go" : m4725equalsimpl0(i11, Search) ? "Search" : m4725equalsimpl0(i11, Send) ? "Send" : m4725equalsimpl0(i11, Previous) ? "Previous" : m4725equalsimpl0(i11, Next) ? "Next" : m4725equalsimpl0(i11, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4724equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4726hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4727toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4728unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4723constructorimpl(int i11) {
        return i11;
    }
}
