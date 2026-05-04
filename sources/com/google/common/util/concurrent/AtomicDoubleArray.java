package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int length) {
        this.longs = new AtomicLongArray(length);
    }

    private void readObject(ObjectInputStream s11) throws IOException, ClassNotFoundException {
        s11.defaultReadObject();
        int readInt = s11.readInt();
        ImmutableLongArray.c builder = ImmutableLongArray.builder();
        for (int i11 = 0; i11 < readInt; i11++) {
            builder.a(Double.doubleToRawLongBits(s11.readDouble()));
        }
        this.longs = new AtomicLongArray(builder.f().toArray());
    }

    private void writeObject(ObjectOutputStream s11) throws IOException {
        s11.defaultWriteObject();
        int length = length();
        s11.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            s11.writeDouble(get(i11));
        }
    }

    @uo.a
    public double addAndGet(int i11, double delta) {
        while (true) {
            long j11 = this.longs.get(i11);
            double longBitsToDouble = Double.longBitsToDouble(j11) + delta;
            int i12 = i11;
            if (this.longs.compareAndSet(i12, j11, Double.doubleToRawLongBits(longBitsToDouble))) {
                return longBitsToDouble;
            }
            i11 = i12;
        }
    }

    public final boolean compareAndSet(int i11, double expect, double update) {
        return this.longs.compareAndSet(i11, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double get(int i11) {
        return Double.longBitsToDouble(this.longs.get(i11));
    }

    @uo.a
    public final double getAndAdd(int i11, double delta) {
        while (true) {
            long j11 = this.longs.get(i11);
            double longBitsToDouble = Double.longBitsToDouble(j11);
            int i12 = i11;
            if (this.longs.compareAndSet(i12, j11, Double.doubleToRawLongBits(longBitsToDouble + delta))) {
                return longBitsToDouble;
            }
            i11 = i12;
        }
    }

    public final double getAndSet(int i11, double newValue) {
        return Double.longBitsToDouble(this.longs.getAndSet(i11, Double.doubleToRawLongBits(newValue)));
    }

    public final void lazySet(int i11, double newValue) {
        this.longs.lazySet(i11, Double.doubleToRawLongBits(newValue));
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int i11, double newValue) {
        this.longs.set(i11, Double.doubleToRawLongBits(newValue));
    }

    public String toString() {
        int length = length();
        int i11 = length - 1;
        if (i11 == -1) {
            return okhttp3.i.f77289p;
        }
        StringBuilder sb2 = new StringBuilder(length * 19);
        sb2.append('[');
        int i12 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.longs.get(i12)));
            if (i12 == i11) {
                sb2.append(l50.b.f69930l);
                return sb2.toString();
            }
            sb2.append(',');
            sb2.append(' ');
            i12++;
        }
    }

    public final boolean weakCompareAndSet(int i11, double expect, double update) {
        return this.longs.weakCompareAndSet(i11, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public AtomicDoubleArray(double[] array) {
        int length = array.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            jArr[i11] = Double.doubleToRawLongBits(array[i11]);
        }
        this.longs = new AtomicLongArray(jArr);
    }
}
