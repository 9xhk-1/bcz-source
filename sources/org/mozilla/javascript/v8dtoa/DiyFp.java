package org.mozilla.javascript.v8dtoa;

import com.tencent.ijk.media.player.IjkMediaMeta;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class DiyFp {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int kSignificandSize = 64;
    static final long kUint64MSB = Long.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f78415e;

    /* renamed from: f, reason: collision with root package name */
    private long f78416f;

    public DiyFp() {
        this.f78416f = 0L;
        this.f78415e = 0;
    }

    public static DiyFp minus(DiyFp diyFp, DiyFp diyFp2) {
        DiyFp diyFp3 = new DiyFp(diyFp.f78416f, diyFp.f78415e);
        diyFp3.subtract(diyFp2);
        return diyFp3;
    }

    public static DiyFp times(DiyFp diyFp, DiyFp diyFp2) {
        DiyFp diyFp3 = new DiyFp(diyFp.f78416f, diyFp.f78415e);
        diyFp3.multiply(diyFp2);
        return diyFp3;
    }

    private static boolean uint64_gte(long j11, long j12) {
        if (j11 != j12) {
            if (!(((j11 < 0) ^ (j11 > j12)) ^ (j12 < 0))) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f78415e;
    }

    public long f() {
        return this.f78416f;
    }

    public void multiply(DiyFp diyFp) {
        long j11 = this.f78416f;
        long j12 = j11 >>> 32;
        long j13 = j11 & 4294967295L;
        long j14 = diyFp.f78416f;
        long j15 = j14 >>> 32;
        long j16 = j14 & 4294967295L;
        long j17 = j12 * j15;
        long j18 = j15 * j13;
        long j19 = j12 * j16;
        long j21 = j17 + (j19 >>> 32) + (j18 >>> 32) + ((((((j13 * j16) >>> 32) + (j19 & 4294967295L)) + (4294967295L & j18)) + IjkMediaMeta.AV_CH_WIDE_LEFT) >>> 32);
        this.f78415e += diyFp.f78415e + 64;
        this.f78416f = j21;
    }

    public void normalize() {
        long j11 = this.f78416f;
        int i11 = this.f78415e;
        while (((-18014398509481984L) & j11) == 0) {
            j11 <<= 10;
            i11 -= 10;
        }
        while ((Long.MIN_VALUE & j11) == 0) {
            j11 <<= 1;
            i11--;
        }
        this.f78416f = j11;
        this.f78415e = i11;
    }

    public void setE(int i11) {
        this.f78415e = i11;
    }

    public void setF(long j11) {
        this.f78416f = j11;
    }

    public void subtract(DiyFp diyFp) {
        this.f78416f -= diyFp.f78416f;
    }

    public String toString() {
        return "[DiyFp f:" + this.f78416f + ", e:" + this.f78415e + "]";
    }

    public DiyFp(long j11, int i11) {
        this.f78416f = j11;
        this.f78415e = i11;
    }

    public static DiyFp normalize(DiyFp diyFp) {
        DiyFp diyFp2 = new DiyFp(diyFp.f78416f, diyFp.f78415e);
        diyFp2.normalize();
        return diyFp2;
    }
}
