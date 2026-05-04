package com.google.common.primitives;

import com.google.common.base.Preconditions;
import go.b;
import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.CheckForNull;
import ro.f;
import ro.k;
import ro.t;
import uo.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b(serializable = true)
@f
/* loaded from: classes7.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    private final long value;
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);

    private UnsignedLong(long value) {
        this.value = value;
    }

    public static UnsignedLong fromLongBits(long bits) {
        return new UnsignedLong(bits);
    }

    @a
    public static UnsignedLong valueOf(long value) {
        Preconditions.checkArgument(value >= 0, "value (%s) is outside the range for an unsigned long value", value);
        return fromLongBits(value);
    }

    public BigInteger bigIntegerValue() {
        BigInteger valueOf = BigInteger.valueOf(this.value & Long.MAX_VALUE);
        return this.value < 0 ? valueOf.setBit(63) : valueOf;
    }

    public UnsignedLong dividedBy(UnsignedLong val) {
        return fromLongBits(t.c(this.value, ((UnsignedLong) Preconditions.checkNotNull(val)).value));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j11 = this.value;
        if (j11 >= 0) {
            return j11;
        }
        return ((j11 & 1) | (j11 >>> 1)) * 2.0d;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof UnsignedLong) && this.value == ((UnsignedLong) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j11 = this.value;
        if (j11 >= 0) {
            return j11;
        }
        return ((j11 & 1) | (j11 >>> 1)) * 2.0f;
    }

    public int hashCode() {
        return k.l(this.value);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public UnsignedLong minus(UnsignedLong val) {
        return fromLongBits(this.value - ((UnsignedLong) Preconditions.checkNotNull(val)).value);
    }

    public UnsignedLong mod(UnsignedLong val) {
        return fromLongBits(t.k(this.value, ((UnsignedLong) Preconditions.checkNotNull(val)).value));
    }

    public UnsignedLong plus(UnsignedLong val) {
        return fromLongBits(this.value + ((UnsignedLong) Preconditions.checkNotNull(val)).value);
    }

    public UnsignedLong times(UnsignedLong val) {
        return fromLongBits(this.value * ((UnsignedLong) Preconditions.checkNotNull(val)).value);
    }

    public String toString() {
        return t.p(this.value);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedLong o11) {
        Preconditions.checkNotNull(o11);
        return t.a(this.value, o11.value);
    }

    public String toString(int radix) {
        return t.q(this.value, radix);
    }

    @a
    public static UnsignedLong valueOf(BigInteger value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value.signum() >= 0 && value.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", value);
        return fromLongBits(value.longValue());
    }

    @a
    public static UnsignedLong valueOf(String string) {
        return valueOf(string, 10);
    }

    @a
    public static UnsignedLong valueOf(String string, int radix) {
        return fromLongBits(t.j(string, radix));
    }
}
