package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes2.dex */
public final class LineBreak {

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m4895getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m4896getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m4897getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m4898getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4891getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4892getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4893getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4894getUnspecifiedrAG3T2k$annotations() {
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m4908getSimplefcGXIks = companion.m4908getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m4919getNormalusljTpc = companion2.m4919getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m4908getSimplefcGXIks, m4919getNormalusljTpc, companion3.m4929getDefaultjp8hJ3c());
        Simple = m4879constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m4906getBalancedfcGXIks(), companion2.m4918getLooseusljTpc(), companion3.m4930getPhrasejp8hJ3c());
        Heading = m4879constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m4907getHighQualityfcGXIks(), companion2.m4920getStrictusljTpc(), companion3.m4929getDefaultjp8hJ3c());
        Paragraph = m4879constructorimpl(packBytes3);
        Unspecified = m4879constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i11) {
        this.mask = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m4878boximpl(int i11) {
        return new LineBreak(i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4879constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m4881copygijOMQM(int i11, int i12, int i13, int i14) {
        return m4880constructorimpl(i12, i13, i14);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m4882copygijOMQM$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i12 = m4885getStrategyfcGXIks(i11);
        }
        if ((i15 & 2) != 0) {
            i13 = m4886getStrictnessusljTpc(i11);
        }
        if ((i15 & 4) != 0) {
            i14 = m4887getWordBreakjp8hJ3c(i11);
        }
        return m4881copygijOMQM(i11, i12, i13, i14);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4883equalsimpl(int i11, Object obj) {
        return (obj instanceof LineBreak) && i11 == ((LineBreak) obj).m4890unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4884equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m4885getStrategyfcGXIks(int i11) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i11);
        return Strategy.m4900constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m4886getStrictnessusljTpc(int i11) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i11);
        return Strictness.m4911constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m4887getWordBreakjp8hJ3c(int i11) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i11);
        return WordBreak.m4923constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4888hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4889toStringimpl(int i11) {
        return "LineBreak(strategy=" + ((Object) Strategy.m4904toStringimpl(m4885getStrategyfcGXIks(i11))) + ", strictness=" + ((Object) Strictness.m4915toStringimpl(m4886getStrictnessusljTpc(i11))) + ", wordBreak=" + ((Object) WordBreak.m4927toStringimpl(m4887getWordBreakjp8hJ3c(i11))) + ')';
    }

    public boolean equals(Object obj) {
        return m4883equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m4888hashCodeimpl(this.mask);
    }

    @k
    public String toString() {
        return m4889toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4890unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4880constructorimpl(int i11, int i12, int i13) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i11, i12, i13);
        return m4879constructorimpl(packBytes);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class Strategy {
        private final int value;

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m4900constructorimpl(1);
        private static final int HighQuality = m4900constructorimpl(2);
        private static final int Balanced = m4900constructorimpl(3);
        private static final int Unspecified = m4900constructorimpl(0);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m4906getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m4907getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m4908getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m4909getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strategy(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m4899boximpl(int i11) {
            return new Strategy(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4901equalsimpl(int i11, Object obj) {
            return (obj instanceof Strategy) && i11 == ((Strategy) obj).m4905unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4902equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4903hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4904toStringimpl(int i11) {
            return m4902equalsimpl0(i11, Simple) ? "Strategy.Simple" : m4902equalsimpl0(i11, HighQuality) ? "Strategy.HighQuality" : m4902equalsimpl0(i11, Balanced) ? "Strategy.Balanced" : m4902equalsimpl0(i11, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4901equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4903hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m4904toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4905unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4900constructorimpl(int i11) {
            return i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class Strictness {

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Default = m4911constructorimpl(1);
        private static final int Loose = m4911constructorimpl(2);
        private static final int Normal = m4911constructorimpl(3);
        private static final int Strict = m4911constructorimpl(4);
        private static final int Unspecified = m4911constructorimpl(0);
        private final int value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m4917getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m4918getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m4919getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m4920getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m4921getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strictness(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m4910boximpl(int i11) {
            return new Strictness(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4912equalsimpl(int i11, Object obj) {
            return (obj instanceof Strictness) && i11 == ((Strictness) obj).m4916unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4913equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4914hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4915toStringimpl(int i11) {
            return m4913equalsimpl0(i11, Default) ? "Strictness.None" : m4913equalsimpl0(i11, Loose) ? "Strictness.Loose" : m4913equalsimpl0(i11, Normal) ? "Strictness.Normal" : m4913equalsimpl0(i11, Strict) ? "Strictness.Strict" : m4913equalsimpl0(i11, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4912equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4914hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m4915toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4916unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4911constructorimpl(int i11) {
            return i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class WordBreak {

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Default = m4923constructorimpl(1);
        private static final int Phrase = m4923constructorimpl(2);
        private static final int Unspecified = m4923constructorimpl(0);
        private final int value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m4929getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m4930getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m4931getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ WordBreak(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m4922boximpl(int i11) {
            return new WordBreak(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4924equalsimpl(int i11, Object obj) {
            return (obj instanceof WordBreak) && i11 == ((WordBreak) obj).m4928unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4925equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4926hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4927toStringimpl(int i11) {
            return m4925equalsimpl0(i11, Default) ? "WordBreak.None" : m4925equalsimpl0(i11, Phrase) ? "WordBreak.Phrase" : m4925equalsimpl0(i11, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4924equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4926hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m4927toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4928unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4923constructorimpl(int i11) {
            return i11;
        }
    }
}
