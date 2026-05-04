package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
/* loaded from: classes7.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double initialValue) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(initialValue));
    }

    private void readObject(ObjectInputStream s11) throws IOException, ClassNotFoundException {
        s11.defaultReadObject();
        this.value = new AtomicLong();
        set(s11.readDouble());
    }

    private void writeObject(ObjectOutputStream s11) throws IOException {
        s11.defaultWriteObject();
        s11.writeDouble(get());
    }

    @uo.a
    public final double addAndGet(double delta) {
        long j11;
        double longBitsToDouble;
        do {
            j11 = this.value.get();
            longBitsToDouble = Double.longBitsToDouble(j11) + delta;
        } while (!this.value.compareAndSet(j11, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(double expect, double update) {
        return this.value.compareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    @uo.a
    public final double getAndAdd(double delta) {
        long j11;
        double longBitsToDouble;
        do {
            j11 = this.value.get();
            longBitsToDouble = Double.longBitsToDouble(j11);
        } while (!this.value.compareAndSet(j11, Double.doubleToRawLongBits(longBitsToDouble + delta)));
        return longBitsToDouble;
    }

    public final double getAndSet(double newValue) {
        return Double.longBitsToDouble(this.value.getAndSet(Double.doubleToRawLongBits(newValue)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double newValue) {
        this.value.lazySet(Double.doubleToRawLongBits(newValue));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double newValue) {
        this.value.set(Double.doubleToRawLongBits(newValue));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double expect, double update) {
        return this.value.weakCompareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public AtomicDouble() {
        this(0.0d);
    }
}
