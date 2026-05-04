package no;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public final class c0 extends c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f75235b = new c0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f75236c = new c0(p.f75342a);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f75237a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends f {

        /* renamed from: g, reason: collision with root package name */
        public static final int f75238g = 16;

        /* renamed from: h, reason: collision with root package name */
        public static final long f75239h = -8663945395140668459L;

        /* renamed from: i, reason: collision with root package name */
        public static final long f75240i = 5545529020109919103L;

        /* renamed from: d, reason: collision with root package name */
        public long f75241d;

        /* renamed from: e, reason: collision with root package name */
        public long f75242e;

        /* renamed from: f, reason: collision with root package name */
        public int f75243f;

        public a(int seed) {
            super(16);
            long j11 = seed;
            this.f75241d = j11;
            this.f75242e = j11;
            this.f75243f = 0;
        }

        public static long q(long k11) {
            long j11 = (k11 ^ (k11 >>> 33)) * (-49064778989728563L);
            long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
            return j12 ^ (j12 >>> 33);
        }

        public static long r(long k12) {
            return Long.rotateLeft(k12 * f75239h, 31) * f75240i;
        }

        public static long s(long k22) {
            return Long.rotateLeft(k22 * f75240i, 33) * f75239h;
        }

        @Override // no.f
        public m j() {
            long j11 = this.f75241d;
            int i11 = this.f75243f;
            long j12 = j11 ^ i11;
            long j13 = this.f75242e ^ i11;
            long j14 = j12 + j13;
            this.f75241d = j14;
            this.f75242e = j13 + j14;
            this.f75241d = q(j14);
            long q11 = q(this.f75242e);
            long j15 = this.f75241d + q11;
            this.f75241d = j15;
            this.f75242e = q11 + j15;
            return m.h(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f75241d).putLong(this.f75242e).array());
        }

        @Override // no.f
        public void m(ByteBuffer bb2) {
            p(bb2.getLong(), bb2.getLong());
            this.f75243f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // no.f
        public void n(ByteBuffer bb2) {
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            long p11;
            this.f75243f += bb2.remaining();
            long j17 = 0;
            switch (bb2.remaining()) {
                case 1:
                    j11 = 0;
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 2:
                    j12 = 0;
                    j11 = j12 ^ (ro.r.p(bb2.get(1)) << 8);
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 3:
                    j13 = 0;
                    j12 = (ro.r.p(bb2.get(2)) << 16) ^ j13;
                    j11 = j12 ^ (ro.r.p(bb2.get(1)) << 8);
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 4:
                    j14 = 0;
                    j13 = j14 ^ (ro.r.p(bb2.get(3)) << 24);
                    j12 = (ro.r.p(bb2.get(2)) << 16) ^ j13;
                    j11 = j12 ^ (ro.r.p(bb2.get(1)) << 8);
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 5:
                    j15 = 0;
                    j14 = j15 ^ (ro.r.p(bb2.get(4)) << 32);
                    j13 = j14 ^ (ro.r.p(bb2.get(3)) << 24);
                    j12 = (ro.r.p(bb2.get(2)) << 16) ^ j13;
                    j11 = j12 ^ (ro.r.p(bb2.get(1)) << 8);
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 6:
                    j16 = 0;
                    j15 = (ro.r.p(bb2.get(5)) << 40) ^ j16;
                    j14 = j15 ^ (ro.r.p(bb2.get(4)) << 32);
                    j13 = j14 ^ (ro.r.p(bb2.get(3)) << 24);
                    j12 = (ro.r.p(bb2.get(2)) << 16) ^ j13;
                    j11 = j12 ^ (ro.r.p(bb2.get(1)) << 8);
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 7:
                    j16 = ro.r.p(bb2.get(6)) << 48;
                    j15 = (ro.r.p(bb2.get(5)) << 40) ^ j16;
                    j14 = j15 ^ (ro.r.p(bb2.get(4)) << 32);
                    j13 = j14 ^ (ro.r.p(bb2.get(3)) << 24);
                    j12 = (ro.r.p(bb2.get(2)) << 16) ^ j13;
                    j11 = j12 ^ (ro.r.p(bb2.get(1)) << 8);
                    p11 = j11 ^ ro.r.p(bb2.get(0));
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 8:
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 9:
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 10:
                    j17 ^= ro.r.p(bb2.get(9)) << 8;
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 11:
                    j17 ^= ro.r.p(bb2.get(10)) << 16;
                    j17 ^= ro.r.p(bb2.get(9)) << 8;
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 12:
                    j17 ^= ro.r.p(bb2.get(11)) << 24;
                    j17 ^= ro.r.p(bb2.get(10)) << 16;
                    j17 ^= ro.r.p(bb2.get(9)) << 8;
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 13:
                    j17 ^= ro.r.p(bb2.get(12)) << 32;
                    j17 ^= ro.r.p(bb2.get(11)) << 24;
                    j17 ^= ro.r.p(bb2.get(10)) << 16;
                    j17 ^= ro.r.p(bb2.get(9)) << 8;
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 14:
                    j17 ^= ro.r.p(bb2.get(13)) << 40;
                    j17 ^= ro.r.p(bb2.get(12)) << 32;
                    j17 ^= ro.r.p(bb2.get(11)) << 24;
                    j17 ^= ro.r.p(bb2.get(10)) << 16;
                    j17 ^= ro.r.p(bb2.get(9)) << 8;
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                case 15:
                    j17 = ro.r.p(bb2.get(14)) << 48;
                    j17 ^= ro.r.p(bb2.get(13)) << 40;
                    j17 ^= ro.r.p(bb2.get(12)) << 32;
                    j17 ^= ro.r.p(bb2.get(11)) << 24;
                    j17 ^= ro.r.p(bb2.get(10)) << 16;
                    j17 ^= ro.r.p(bb2.get(9)) << 8;
                    j17 ^= ro.r.p(bb2.get(8));
                    p11 = bb2.getLong();
                    this.f75241d = r(p11) ^ this.f75241d;
                    this.f75242e ^= s(j17);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }

        public final void p(long k12, long k22) {
            long r11 = r(k12) ^ this.f75241d;
            this.f75241d = r11;
            long rotateLeft = Long.rotateLeft(r11, 27);
            long j11 = this.f75242e;
            this.f75241d = ((rotateLeft + j11) * 5) + 1390208809;
            long s11 = s(k22) ^ j11;
            this.f75242e = s11;
            this.f75242e = ((Long.rotateLeft(s11, 31) + this.f75241d) * 5) + 944331445;
        }
    }

    public c0(int seed) {
        this.f75237a = seed;
    }

    public boolean equals(@CheckForNull Object object) {
        return (object instanceof c0) && this.f75237a == ((c0) object).f75237a;
    }

    @Override // no.n
    public int h() {
        return 128;
    }

    public int hashCode() {
        return c0.class.hashCode() ^ this.f75237a;
    }

    @Override // no.n
    public o i() {
        return new a(this.f75237a);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f75237a + pn.j.f81007d;
    }
}
