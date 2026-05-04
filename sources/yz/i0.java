package yz;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i0 {
    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.g0.o(subtract, "subtract(...)");
        return subtract;
    }

    @o00.f
    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigDecimal divide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.g0.o(divide, "divide(...)");
        return divide;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.g0.o(add, "add(...)");
        return add;
    }

    @o00.f
    public static final BigDecimal d(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigDecimal subtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.g0.o(subtract, "subtract(...)");
        return subtract;
    }

    @o00.f
    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigDecimal add = bigDecimal.add(other);
        kotlin.jvm.internal.g0.o(add, "add(...)");
        return add;
    }

    @o00.f
    public static final BigDecimal f(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigDecimal remainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.g0.o(remainder, "remainder(...)");
        return remainder;
    }

    @o00.f
    public static final BigDecimal g(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigDecimal multiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.g0.o(multiply, "multiply(...)");
        return multiply;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal h(double d11) {
        return new BigDecimal(String.valueOf(d11));
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal i(double d11, MathContext mathContext) {
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d11), mathContext);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal j(float f11) {
        return new BigDecimal(String.valueOf(f11));
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal k(float f11, MathContext mathContext) {
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f11), mathContext);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal l(int i11) {
        BigDecimal valueOf = BigDecimal.valueOf(i11);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal m(int i11, MathContext mathContext) {
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(i11, mathContext);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal n(long j11) {
        BigDecimal valueOf = BigDecimal.valueOf(j11);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal o(long j11, MathContext mathContext) {
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(j11, mathContext);
    }

    @o00.f
    public static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.g0.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        kotlin.jvm.internal.g0.o(negate, "negate(...)");
        return negate;
    }
}
