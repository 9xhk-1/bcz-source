package com.google.common.math;

import com.baicizhan.main.wikiv2.studyv2.data.t;
import com.google.common.base.Preconditions;
import ho.b0;
import ho.d0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.d
@go.c
/* loaded from: classes7.dex */
public final class Stats implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long count, double mean, double sumOfSquaresOfDeltas, double min, double max) {
        this.count = count;
        this.mean = mean;
        this.sumOfSquaresOfDeltas = sumOfSquaresOfDeltas;
        this.min = min;
        this.max = max;
    }

    public static Stats fromByteArray(byte[] byteArray) {
        Preconditions.checkNotNull(byteArray);
        Preconditions.checkArgument(byteArray.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, byteArray.length);
        return readFrom(ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> values) {
        return meanOf(values.iterator());
    }

    public static Stats of(Iterable<? extends Number> values) {
        m mVar = new m();
        mVar.d(values);
        return mVar.s();
    }

    public static Stats readFrom(ByteBuffer buffer) {
        Preconditions.checkNotNull(buffer);
        Preconditions.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        return new Stats(buffer.getLong(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble());
    }

    public long count() {
        return this.count;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
    }

    public int hashCode() {
        return d0.b(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        Preconditions.checkState(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return d.b(this.sumOfSquaresOfDeltas) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return d.b(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    public String toString() {
        return count() > 0 ? b0.c(this).e("count", this.count).b(t.f26099a, this.mean).b("populationStandardDeviation", populationStandardDeviation()).b("min", this.min).b("max", this.max).toString() : b0.c(this).e("count", this.count).toString();
    }

    public void writeTo(ByteBuffer buffer) {
        Preconditions.checkNotNull(buffer);
        Preconditions.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        buffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static double meanOf(Iterator<? extends Number> values) {
        Preconditions.checkArgument(values.hasNext());
        double doubleValue = values.next().doubleValue();
        long j11 = 1;
        while (values.hasNext()) {
            double doubleValue2 = values.next().doubleValue();
            j11++;
            doubleValue = (ro.d.o(doubleValue2) && ro.d.o(doubleValue)) ? doubleValue + ((doubleValue2 - doubleValue) / j11) : m.i(doubleValue, doubleValue2);
        }
        return doubleValue;
    }

    public static Stats of(Iterator<? extends Number> values) {
        m mVar = new m();
        mVar.e(values);
        return mVar.s();
    }

    public static Stats of(double... values) {
        m mVar = new m();
        mVar.f(values);
        return mVar.s();
    }

    public static double meanOf(double... values) {
        Preconditions.checkArgument(values.length > 0);
        double d11 = values[0];
        for (int i11 = 1; i11 < values.length; i11++) {
            double d12 = values[i11];
            d11 = (ro.d.o(d12) && ro.d.o(d11)) ? d11 + ((d12 - d11) / (i11 + 1)) : m.i(d11, d12);
        }
        return d11;
    }

    public static Stats of(int... values) {
        m mVar = new m();
        mVar.g(values);
        return mVar.s();
    }

    public static Stats of(long... values) {
        m mVar = new m();
        mVar.h(values);
        return mVar.s();
    }

    public static double meanOf(int... values) {
        Preconditions.checkArgument(values.length > 0);
        double d11 = values[0];
        for (int i11 = 1; i11 < values.length; i11++) {
            double d12 = values[i11];
            d11 = (ro.d.o(d12) && ro.d.o(d11)) ? d11 + ((d12 - d11) / (i11 + 1)) : m.i(d11, d12);
        }
        return d11;
    }

    public static double meanOf(long... values) {
        Preconditions.checkArgument(values.length > 0);
        double d11 = values[0];
        for (int i11 = 1; i11 < values.length; i11++) {
            double d12 = values[i11];
            d11 = (ro.d.o(d12) && ro.d.o(d11)) ? d11 + ((d12 - d11) / (i11 + 1)) : m.i(d11, d12);
        }
        return d11;
    }
}
