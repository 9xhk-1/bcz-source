package androidx.compose.ui.graphics;

import kotlin.text.Regex;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n535#2,38:643\n578#2,12:681\n590#2,17:694\n522#2,4:711\n22#3:693\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n95#1:643,38\n138#1:681,12\n138#1:694,17\n198#1:711,4\n138#1:693\n*E\n"})
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m2617constructorimpl((short) 5120);
    private static final short LowestValue = m2617constructorimpl((short) -1025);
    private static final short MaxValue = m2617constructorimpl((short) 31743);
    private static final short MinNormal = m2617constructorimpl((short) 1024);
    private static final short MinValue = m2617constructorimpl((short) 1);
    private static final short NaN = m2617constructorimpl((short) 32256);
    private static final short NegativeInfinity = m2617constructorimpl((short) -1024);
    private static final short NegativeZero = m2617constructorimpl(kotlin.jvm.internal.s0.f67031b);
    private static final short PositiveInfinity = m2617constructorimpl((short) 31744);
    private static final short PositiveZero = m2617constructorimpl((short) 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m2644getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m2645getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m2646getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m2647getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m2648getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m2649getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m2650getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m2651getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m2652getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m2653getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s11) {
        this.halfValue = s11;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m2611absoluteValueslo4al4(short s11) {
        return m2617constructorimpl((short) (s11 & kotlin.jvm.internal.s0.f67032c));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m2612boximpl(short s11) {
        return new Float16(s11);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m2613ceilslo4al4(short s11) {
        int i11 = 65535 & s11;
        int i12 = s11 & kotlin.jvm.internal.s0.f67032c;
        if (i12 < 15360) {
            i11 = ((-((~(i11 >> 15)) & (i12 == 0 ? 0 : 1))) & 15360) | (s11 & kotlin.jvm.internal.s0.f67031b);
        } else if (i12 < 25600) {
            int i13 = (1 << (25 - (i12 >> 10))) - 1;
            i11 = (i11 + (((i11 >> 15) - 1) & i13)) & (~i13);
        }
        return m2617constructorimpl((short) i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m2617constructorimpl(short s11) {
        return s11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2618equalsimpl(short s11, Object obj) {
        return (obj instanceof Float16) && s11 == ((Float16) obj).m2643unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2619equalsimpl0(short s11, short s12) {
        return s11 == s12;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m2620floorslo4al4(short s11) {
        int i11 = s11 & yz.c2.f100412d;
        int i12 = s11 & kotlin.jvm.internal.s0.f67032c;
        if (i12 < 15360) {
            i11 = (s11 & kotlin.jvm.internal.s0.f67031b) | ((i11 <= 32768 ? 0 : 65535) & 15360);
        } else if (i12 < 25600) {
            int i13 = (1 << (25 - (i12 >> 10))) - 1;
            i11 = (i11 + ((-(i11 >> 15)) & i13)) & (~i13);
        }
        return m2617constructorimpl((short) i11);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m2621getExponentimpl(short s11) {
        return ((s11 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m2622getSignslo4al4(short s11) {
        int i11 = s11 & kotlin.jvm.internal.s0.f67032c;
        if (!((i11 > 31744) | (i11 == 0))) {
            i11 = (s11 & kotlin.jvm.internal.s0.f67031b) | 15360;
        }
        return m2617constructorimpl((short) i11);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m2623getSignificandimpl(short s11) {
        return s11 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2624hashCodeimpl(short s11) {
        return Short.hashCode(s11);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m2625isFiniteimpl(short s11) {
        return (s11 & kotlin.jvm.internal.s0.f67032c) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m2626isInfiniteimpl(short s11) {
        return (s11 & kotlin.jvm.internal.s0.f67032c) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m2627isNaNimpl(short s11) {
        return (s11 & kotlin.jvm.internal.s0.f67032c) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m2628isNormalizedimpl(short s11) {
        int i11 = s11 & 31744;
        return (i11 != 0) & (i11 != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m2629roundslo4al4(short s11) {
        int i11 = s11 & yz.c2.f100412d;
        int i12 = s11 & kotlin.jvm.internal.s0.f67032c;
        if (i12 < 15360) {
            i11 = (s11 & kotlin.jvm.internal.s0.f67031b) | ((i12 < 14336 ? 0 : 65535) & 15360);
        } else if (i12 < 25600) {
            int i13 = i12 >> 10;
            i11 = (i11 + (1 << (24 - i13))) & (~((1 << (25 - i13)) - 1));
        }
        return m2617constructorimpl((short) i11);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m2630toBitsimpl(short s11) {
        if (m2627isNaNimpl(s11)) {
            return 32256;
        }
        return s11 & yz.c2.f100412d;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m2631toByteimpl(short s11) {
        return (byte) m2633toFloatimpl(s11);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m2632toDoubleimpl(short s11) {
        return m2633toFloatimpl(s11);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m2633toFloatimpl(short s11) {
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
                float intBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i14 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    @m80.k
    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m2634toHexStringimpl(short s11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 65535 & s11;
        int i12 = i11 >>> 15;
        int i13 = (i11 >>> 10) & 31;
        int i14 = s11 & 1023;
        if (i13 != 31) {
            if (i12 == 1) {
                sb2.append('-');
            }
            if (i13 != 0) {
                sb2.append("0x1.");
                String num = Integer.toString(i14, kotlin.text.a.a(16));
                kotlin.jvm.internal.g0.o(num, "toString(...)");
                sb2.append(new Regex("0{2,}$").replaceFirst(num, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i13 - 15));
            } else if (i14 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String num2 = Integer.toString(i14, kotlin.text.a.a(16));
                kotlin.jvm.internal.g0.o(num2, "toString(...)");
                sb2.append(new Regex("0{2,}$").replaceFirst(num2, ""));
                sb2.append("p-14");
            }
        } else if (i14 == 0) {
            if (i12 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        return sb2.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m2635toIntimpl(short s11) {
        return (int) m2633toFloatimpl(s11);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m2636toLongimpl(short s11) {
        return (long) m2633toFloatimpl(s11);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m2637toRawBitsimpl(short s11) {
        return s11 & yz.c2.f100412d;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m2638toShortimpl(short s11) {
        return (short) m2633toFloatimpl(s11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2639toStringimpl(short s11) {
        return String.valueOf(m2633toFloatimpl(s11));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m2640truncslo4al4(short s11) {
        int i11 = 65535 & s11;
        int i12 = s11 & kotlin.jvm.internal.s0.f67032c;
        if (i12 < 15360) {
            i11 = 32768 & s11;
        } else if (i12 < 25600) {
            i11 &= ~((1 << (25 - (i12 >> 10))) - 1);
        }
        return m2617constructorimpl((short) i11);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m2641withSignqCeQghg(short s11, short s12) {
        return m2617constructorimpl((short) ((s11 & kotlin.jvm.internal.s0.f67032c) | (s12 & kotlin.jvm.internal.s0.f67031b)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m2642compareTo41bOqos(float16.m2643unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m2642compareTo41bOqos(short s11) {
        return m2614compareTo41bOqos(this.halfValue, s11);
    }

    public boolean equals(Object obj) {
        return m2618equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m2624hashCodeimpl(this.halfValue);
    }

    @m80.k
    public String toString() {
        return m2639toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m2643unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m2614compareTo41bOqos(short s11, short s12) {
        if (m2627isNaNimpl(s11)) {
            return !m2627isNaNimpl(s12) ? 1 : 0;
        }
        if (m2627isNaNimpl(s12)) {
            return -1;
        }
        return kotlin.jvm.internal.g0.t((s11 & kotlin.jvm.internal.s0.f67031b) != 0 ? 32768 - (s11 & yz.c2.f100412d) : s11 & yz.c2.f100412d, (s12 & kotlin.jvm.internal.s0.f67031b) != 0 ? 32768 - (s12 & yz.c2.f100412d) : s12 & yz.c2.f100412d);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m2615constructorimpl(double d11) {
        return m2616constructorimpl((float) d11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m2616constructorimpl(float f11) {
        int i11;
        int floatToRawIntBits = Float.floatToRawIntBits(f11);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & 255;
        int i14 = 8388607 & floatToRawIntBits;
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
                    return m2617constructorimpl((short) i11);
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
        return m2617constructorimpl((short) i11);
    }
}
