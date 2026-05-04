package androidx.compose.ui.unit;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class TextUnitType {
    private final long type;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m5335constructorimpl(0);
    private static final long Sp = m5335constructorimpl(IjkMediaMeta.AV_CH_WIDE_RIGHT);
    private static final long Em = m5335constructorimpl(IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m5341getEmUIouoOA() {
            return TextUnitType.Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m5342getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m5343getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextUnitType(long j11) {
        this.type = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m5334boximpl(long j11) {
        return new TextUnitType(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5336equalsimpl(long j11, Object obj) {
        return (obj instanceof TextUnitType) && j11 == ((TextUnitType) obj).m5340unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5337equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5338hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5339toStringimpl(long j11) {
        return m5337equalsimpl0(j11, Unspecified) ? "Unspecified" : m5337equalsimpl0(j11, Sp) ? "Sp" : m5337equalsimpl0(j11, Em) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5336equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m5338hashCodeimpl(this.type);
    }

    @k
    public String toString() {
        return m5339toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5340unboximpl() {
        return this.type;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5335constructorimpl(long j11) {
        return j11;
    }
}
