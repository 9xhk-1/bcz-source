package com.google.common.primitives;

import com.google.common.base.Preconditions;
import go.b;
import go.c;
import go.d;
import java.math.BigInteger;
import javax.annotation.CheckForNull;
import ro.f;
import ro.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b(emulated = true)
@f
/* loaded from: classes7.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    private final int value;
    public static final UnsignedInteger ZERO = fromIntBits(0);
    public static final UnsignedInteger ONE = fromIntBits(1);
    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);

    private UnsignedInteger(int value) {
        this.value = value;
    }

    public static UnsignedInteger fromIntBits(int bits) {
        return new UnsignedInteger(bits);
    }

    public static UnsignedInteger valueOf(long value) {
        Preconditions.checkArgument((4294967295L & value) == value, "value (%s) is outside the range for an unsigned integer value", value);
        return fromIntBits((int) value);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    public UnsignedInteger dividedBy(UnsignedInteger val) {
        return fromIntBits(s.d(this.value, ((UnsignedInteger) Preconditions.checkNotNull(val)).value));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof UnsignedInteger) && this.value == ((UnsignedInteger) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.value;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return s.r(this.value);
    }

    public UnsignedInteger minus(UnsignedInteger val) {
        return fromIntBits(this.value - ((UnsignedInteger) Preconditions.checkNotNull(val)).value);
    }

    public UnsignedInteger mod(UnsignedInteger val) {
        return fromIntBits(s.l(this.value, ((UnsignedInteger) Preconditions.checkNotNull(val)).value));
    }

    public UnsignedInteger plus(UnsignedInteger val) {
        return fromIntBits(this.value + ((UnsignedInteger) Preconditions.checkNotNull(val)).value);
    }

    @d
    @c
    public UnsignedInteger times(UnsignedInteger val) {
        return fromIntBits(this.value * ((UnsignedInteger) Preconditions.checkNotNull(val)).value);
    }

    public String toString() {
        return toString(10);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedInteger other) {
        Preconditions.checkNotNull(other);
        return s.b(this.value, other.value);
    }

    public String toString(int radix) {
        return s.t(this.value, radix);
    }

    public static UnsignedInteger valueOf(BigInteger value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value.signum() >= 0 && value.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", value);
        return fromIntBits(value.intValue());
    }

    public static UnsignedInteger valueOf(String string) {
        return valueOf(string, 10);
    }

    public static UnsignedInteger valueOf(String string, int radix) {
        return fromIntBits(s.k(string, radix));
    }
}
