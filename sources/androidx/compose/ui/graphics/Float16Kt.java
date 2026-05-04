package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n22#2:643\n22#2:644\n22#2:645\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n589#1:643\n606#1:644\n518#1:645\n*E\n"})
/* loaded from: classes.dex */
public final class Float16Kt {
    private static final int Fp16Combined = 32767;
    private static final int Fp16ExponentBias = 15;
    private static final int Fp16ExponentMask = 31;
    private static final int Fp16ExponentMax = 31744;
    private static final int Fp16ExponentShift = 10;
    private static final int Fp16One = 15360;
    private static final int Fp16SignMask = 32768;
    private static final int Fp16SignShift = 15;
    private static final int Fp16SignificandMask = 1023;
    private static final int Fp16TheNaN = 32256;
    private static final int Fp32ExponentBias = 127;
    private static final int Fp32ExponentMask = 255;
    private static final int Fp32ExponentShift = 23;
    private static final int Fp32QNaNMask = 4194304;
    private static final int Fp32SignShift = 31;
    private static final int Fp32SignificandMask = 8388607;
    private static final int Fp32DenormalMagic = 1056964608;
    private static final float Fp32DenormalFloat = Float.intBitsToFloat(Fp32DenormalMagic);

    public static final short floatToHalf(float f11) {
        int i11;
        int floatToRawIntBits = Float.floatToRawIntBits(f11);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & 255;
        int i14 = Fp32SignificandMask & floatToRawIntBits;
        int i15 = 31;
        int i16 = 0;
        if (i13 != 255) {
            int i17 = i13 - 112;
            if (i17 >= 31) {
                i15 = 49;
            } else if (i17 > 0) {
                i16 = i14 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i11 = (((i17 << 10) | i16) + 1) | (i12 << 15);
                    return (short) i11;
                }
                i15 = i17;
            } else if (i17 >= -10) {
                int i18 = (8388608 | i14) >> (1 - i17);
                if ((i18 & 4096) != 0) {
                    i18 += 8192;
                }
                i15 = 0;
                i16 = i18 >> 13;
            } else {
                i15 = 0;
            }
        } else if (i14 != 0) {
            i16 = 512;
        }
        i11 = (i12 << 15) | (i15 << 10) | i16;
        return (short) i11;
    }

    public static final float halfToFloat(short s11) {
        int i11;
        int i12;
        int i13;
        int i14 = 32768 & s11;
        int i15 = ((65535 & s11) >>> 10) & 31;
        int i16 = s11 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i16 + Fp32DenormalMagic) - Fp32DenormalFloat;
                return i14 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m2654maxAoSsdG0(short s11, short s12) {
        return (Float16.m2627isNaNimpl(s11) || Float16.m2627isNaNimpl(s12)) ? Float16.Companion.m2649getNaNslo4al4() : Float16.m2614compareTo41bOqos(s11, s12) >= 0 ? s11 : s12;
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m2655minAoSsdG0(short s11, short s12) {
        return (Float16.m2627isNaNimpl(s11) || Float16.m2627isNaNimpl(s12)) ? Float16.Companion.m2649getNaNslo4al4() : Float16.m2614compareTo41bOqos(s11, s12) <= 0 ? s11 : s12;
    }

    private static final int toCompareValue(short s11) {
        return (s11 & kotlin.jvm.internal.s0.f67031b) != 0 ? 32768 - (s11 & yz.c2.f100412d) : s11 & yz.c2.f100412d;
    }
}
