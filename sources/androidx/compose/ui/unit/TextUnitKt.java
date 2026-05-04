package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,366:1\n247#1:367\n242#1,6:368\n247#1:374\n247#1:380\n247#1:391\n37#2,5:375\n37#2,5:381\n37#2,5:386\n37#2,5:392\n37#2,5:397\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n242#1:367\n253#1:368,6\n327#1:374\n332#1:380\n340#1:391\n327#1:375,5\n332#1:381,5\n335#1:386,5\n340#1:392,5\n343#1:397,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m5321TextUnitanM5pPY(float f11, long j11) {
        return pack(j11, f11);
    }

    @v0
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m5322checkArithmeticR2X_6o(long j11) {
        if (TextUnit.m5307getRawTypeimpl(j11) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @v0
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m5323checkArithmeticNB67dxo(long j11, long j12) {
        if (!((TextUnit.m5307getRawTypeimpl(j11) == 0 || TextUnit.m5307getRawTypeimpl(j12) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnit.m5308getTypeUIouoOA(j12))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m5339toStringimpl(TextUnit.m5308getTypeUIouoOA(j11))) + " and " + ((Object) TextUnitType.m5339toStringimpl(TextUnit.m5308getTypeUIouoOA(j12))));
    }

    @v0
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m5324checkArithmeticvU0ePk(long j11, long j12, long j13) {
        boolean z11 = false;
        if (!((TextUnit.m5307getRawTypeimpl(j11) == 0 || TextUnit.m5307getRawTypeimpl(j12) == 0 || TextUnit.m5307getRawTypeimpl(j13) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnit.m5308getTypeUIouoOA(j12)) && TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j12), TextUnit.m5308getTypeUIouoOA(j13))) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m5339toStringimpl(TextUnit.m5308getTypeUIouoOA(j11))) + " and " + ((Object) TextUnitType.m5339toStringimpl(TextUnit.m5308getTypeUIouoOA(j12))));
    }

    public static final long getEm(float f11) {
        return pack(8589934592L, f11);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d11) {
    }

    public static final long getSp(float f11) {
        return pack(4294967296L, f11);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d11) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m5325isSpecifiedR2X_6o(long j11) {
        return !(TextUnit.m5307getRawTypeimpl(j11) == 0);
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m5327isUnspecifiedR2X_6o(long j11) {
        return TextUnit.m5307getRawTypeimpl(j11) == 0;
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m5329lerpC3pnCVY(long j11, long j12, float f11) {
        m5323checkArithmeticNB67dxo(j11, j12);
        return pack(TextUnit.m5307getRawTypeimpl(j11), MathHelpersKt.lerp(TextUnit.m5309getValueimpl(j11), TextUnit.m5309getValueimpl(j12), f11));
    }

    @v0
    public static final long pack(long j11, float f11) {
        return TextUnit.m5301constructorimpl(j11 | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m5330takeOrElseeAf_CNQ(long j11, @k a<TextUnit> aVar) {
        return !((TextUnit.m5307getRawTypeimpl(j11) > 0L ? 1 : (TextUnit.m5307getRawTypeimpl(j11) == 0L ? 0 : -1)) == 0) ? j11 : aVar.invoke().m5318unboximpl();
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5332timesmpE4wyQ(float f11, long j11) {
        m5322checkArithmeticR2X_6o(j11);
        return pack(TextUnit.m5307getRawTypeimpl(j11), f11 * TextUnit.m5309getValueimpl(j11));
    }

    public static final long getEm(double d11) {
        return pack(8589934592L, (float) d11);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f11) {
    }

    public static final long getSp(double d11) {
        return pack(4294967296L, (float) d11);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f11) {
    }

    public static final long getEm(int i11) {
        return pack(8589934592L, i11);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i11) {
    }

    public static final long getSp(int i11) {
        return pack(4294967296L, i11);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i11) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5331timesmpE4wyQ(double d11, long j11) {
        m5322checkArithmeticR2X_6o(j11);
        return pack(TextUnit.m5307getRawTypeimpl(j11), ((float) d11) * TextUnit.m5309getValueimpl(j11));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5333timesmpE4wyQ(int i11, long j11) {
        m5322checkArithmeticR2X_6o(j11);
        return pack(TextUnit.m5307getRawTypeimpl(j11), i11 * TextUnit.m5309getValueimpl(j11));
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m5326isSpecifiedR2X_6o$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m5328isUnspecifiedR2X_6o$annotations(long j11) {
    }
}
