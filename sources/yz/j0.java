package yz;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j0 extends i0 {
    @y0(version = "1.2")
    @o00.f
    public static final BigInteger A(BigInteger bigInteger, int i11) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i11);
        kotlin.jvm.internal.g0.o(shiftRight, "shiftRight(...)");
        return shiftRight;
    }

    @o00.f
    public static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger multiply = bigInteger.multiply(other);
        kotlin.jvm.internal.g0.o(multiply, "multiply(...)");
        return multiply;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal D(BigInteger bigInteger, int i11, MathContext mathContext) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i11, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i11, MathContext mathContext, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.g0.o(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i11, mathContext);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger F(int i11) {
        BigInteger valueOf = BigInteger.valueOf(i11);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger G(long j11) {
        BigInteger valueOf = BigInteger.valueOf(j11);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @o00.f
    public static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.g0.o(negate, "negate(...)");
        return negate;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger xor = bigInteger.xor(other);
        kotlin.jvm.internal.g0.o(xor, "xor(...)");
        return xor;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger and = bigInteger.and(other);
        kotlin.jvm.internal.g0.o(and, "and(...)");
        return and;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.g0.o(subtract, "subtract(...)");
        return subtract;
    }

    @o00.f
    public static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger divide = bigInteger.divide(other);
        kotlin.jvm.internal.g0.o(divide, "divide(...)");
        return divide;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.g0.o(add, "add(...)");
        return add;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        kotlin.jvm.internal.g0.o(not, "not(...)");
        return not;
    }

    @o00.f
    public static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger subtract = bigInteger.subtract(other);
        kotlin.jvm.internal.g0.o(subtract, "subtract(...)");
        return subtract;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger or2 = bigInteger.or(other);
        kotlin.jvm.internal.g0.o(or2, "or(...)");
        return or2;
    }

    @o00.f
    public static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger add = bigInteger.add(other);
        kotlin.jvm.internal.g0.o(add, "add(...)");
        return add;
    }

    @y0(version = "1.1")
    @o00.f
    public static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        BigInteger remainder = bigInteger.remainder(other);
        kotlin.jvm.internal.g0.o(remainder, "remainder(...)");
        return remainder;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger z(BigInteger bigInteger, int i11) {
        kotlin.jvm.internal.g0.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i11);
        kotlin.jvm.internal.g0.o(shiftLeft, "shiftLeft(...)");
        return shiftLeft;
    }
}
