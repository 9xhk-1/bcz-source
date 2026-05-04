package no;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public final class g0 extends c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final n f75267e = new g0(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f75268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75269b;

    /* renamed from: c, reason: collision with root package name */
    public final long f75270c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75271d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends f {

        /* renamed from: l, reason: collision with root package name */
        public static final int f75272l = 8;

        /* renamed from: d, reason: collision with root package name */
        public final int f75273d;

        /* renamed from: e, reason: collision with root package name */
        public final int f75274e;

        /* renamed from: f, reason: collision with root package name */
        public long f75275f;

        /* renamed from: g, reason: collision with root package name */
        public long f75276g;

        /* renamed from: h, reason: collision with root package name */
        public long f75277h;

        /* renamed from: i, reason: collision with root package name */
        public long f75278i;

        /* renamed from: j, reason: collision with root package name */
        public long f75279j;

        /* renamed from: k, reason: collision with root package name */
        public long f75280k;

        public a(int c11, int d11, long k02, long k12) {
            super(8);
            this.f75279j = 0L;
            this.f75280k = 0L;
            this.f75273d = c11;
            this.f75274e = d11;
            this.f75275f = 8317987319222330741L ^ k02;
            this.f75276g = 7237128888997146477L ^ k12;
            this.f75277h = 7816392313619706465L ^ k02;
            this.f75278i = 8387220255154660723L ^ k12;
        }

        @Override // no.f
        public m j() {
            long j11 = this.f75280k ^ (this.f75279j << 56);
            this.f75280k = j11;
            p(j11);
            this.f75277h ^= 255;
            q(this.f75274e);
            return m.j(((this.f75275f ^ this.f75276g) ^ this.f75277h) ^ this.f75278i);
        }

        @Override // no.f
        public void m(ByteBuffer buffer) {
            this.f75279j += 8;
            p(buffer.getLong());
        }

        @Override // no.f
        public void n(ByteBuffer buffer) {
            this.f75279j += buffer.remaining();
            int i11 = 0;
            while (buffer.hasRemaining()) {
                this.f75280k ^= (buffer.get() & 255) << i11;
                i11 += 8;
            }
        }

        public final void p(long m11) {
            this.f75278i ^= m11;
            q(this.f75273d);
            this.f75275f = m11 ^ this.f75275f;
        }

        public final void q(int iterations) {
            for (int i11 = 0; i11 < iterations; i11++) {
                long j11 = this.f75275f;
                long j12 = this.f75276g;
                this.f75275f = j11 + j12;
                this.f75277h += this.f75278i;
                this.f75276g = Long.rotateLeft(j12, 13);
                long rotateLeft = Long.rotateLeft(this.f75278i, 16);
                long j13 = this.f75276g;
                long j14 = this.f75275f;
                this.f75276g = j13 ^ j14;
                this.f75278i = rotateLeft ^ this.f75277h;
                long rotateLeft2 = Long.rotateLeft(j14, 32);
                long j15 = this.f75277h;
                long j16 = this.f75276g;
                this.f75277h = j15 + j16;
                this.f75275f = rotateLeft2 + this.f75278i;
                this.f75276g = Long.rotateLeft(j16, 17);
                long rotateLeft3 = Long.rotateLeft(this.f75278i, 21);
                long j17 = this.f75276g;
                long j18 = this.f75277h;
                this.f75276g = j17 ^ j18;
                this.f75278i = rotateLeft3 ^ this.f75275f;
                this.f75277h = Long.rotateLeft(j18, 32);
            }
        }
    }

    public g0(int c11, int d11, long k02, long k12) {
        Preconditions.checkArgument(c11 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c11);
        Preconditions.checkArgument(d11 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d11);
        this.f75268a = c11;
        this.f75269b = d11;
        this.f75270c = k02;
        this.f75271d = k12;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object instanceof g0) {
            g0 g0Var = (g0) object;
            if (this.f75268a == g0Var.f75268a && this.f75269b == g0Var.f75269b && this.f75270c == g0Var.f75270c && this.f75271d == g0Var.f75271d) {
                return true;
            }
        }
        return false;
    }

    @Override // no.n
    public int h() {
        return 64;
    }

    public int hashCode() {
        return (int) ((((g0.class.hashCode() ^ this.f75268a) ^ this.f75269b) ^ this.f75270c) ^ this.f75271d);
    }

    @Override // no.n
    public o i() {
        return new a(this.f75268a, this.f75269b, this.f75270c, this.f75271d);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f75268a + "" + this.f75269b + pn.j.f81006c + this.f75270c + j2.O + this.f75271d + pn.j.f81007d;
    }
}
