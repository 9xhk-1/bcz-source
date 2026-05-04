package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnitType;
import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,366:1\n22#2:367\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n236#1:367\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class TextUnit {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m5320getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5319getUnspecifiedXSAIIZE$annotations() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m5334boximpl(companion.m5343getUnspecifiedUIouoOA()), TextUnitType.m5334boximpl(companion.m5342getSpUIouoOA()), TextUnitType.m5334boximpl(companion.m5341getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m5299boximpl(long j11) {
        return new TextUnit(j11);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m5300compareToR2X_6o(long j11, long j12) {
        TextUnitKt.m5323checkArithmeticNB67dxo(j11, j12);
        return Float.compare(m5309getValueimpl(j11), m5309getValueimpl(j12));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5303divkPz2Gy4(long j11, float f11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), m5309getValueimpl(j11) / f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5305equalsimpl(long j11, Object obj) {
        return (obj instanceof TextUnit) && j11 == ((TextUnit) obj).m5318unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5306equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m5307getRawTypeimpl(long j11) {
        return j11 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m5308getTypeUIouoOA(long j11) {
        return TextUnitTypes[(int) (m5307getRawTypeimpl(j11) >>> 32)].m5340unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m5309getValueimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5310hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m5311isEmimpl(long j11) {
        return m5307getRawTypeimpl(j11) == IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m5312isSpimpl(long j11) {
        return m5307getRawTypeimpl(j11) == IjkMediaMeta.AV_CH_WIDE_RIGHT;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5314timeskPz2Gy4(long j11, float f11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), m5309getValueimpl(j11) * f11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5316toStringimpl(long j11) {
        long m5308getTypeUIouoOA = m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5343getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            return m5309getValueimpl(j11) + ".sp";
        }
        if (!TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
            return "Invalid";
        }
        return m5309getValueimpl(j11) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m5317unaryMinusXSAIIZE(long j11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), -m5309getValueimpl(j11));
    }

    public boolean equals(Object obj) {
        return m5305equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5310hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m5316toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5318unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5302divkPz2Gy4(long j11, double d11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), (float) (m5309getValueimpl(j11) / d11));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5313timeskPz2Gy4(long j11, double d11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), (float) (m5309getValueimpl(j11) * d11));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5304divkPz2Gy4(long j11, int i11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), m5309getValueimpl(j11) / i11);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5315timeskPz2Gy4(long j11, int i11) {
        TextUnitKt.m5322checkArithmeticR2X_6o(j11);
        return TextUnitKt.pack(m5307getRawTypeimpl(j11), m5309getValueimpl(j11) * i11);
    }

    @v0
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5301constructorimpl(long j11) {
        return j11;
    }
}
