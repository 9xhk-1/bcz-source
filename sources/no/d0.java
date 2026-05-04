package no;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public final class d0 extends c implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final n f75244c = new d0(0, false);

    /* renamed from: d, reason: collision with root package name */
    public static final n f75245d = new d0(0, true);

    /* renamed from: e, reason: collision with root package name */
    public static final n f75246e = new d0(p.f75342a, true);

    /* renamed from: f, reason: collision with root package name */
    public static final int f75247f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f75248g = -862048943;

    /* renamed from: h, reason: collision with root package name */
    public static final int f75249h = 461845907;
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f75250a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75251b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public int f75252a;

        /* renamed from: b, reason: collision with root package name */
        public long f75253b;

        /* renamed from: c, reason: collision with root package name */
        public int f75254c;

        /* renamed from: d, reason: collision with root package name */
        public int f75255d = 0;

        /* renamed from: e, reason: collision with root package name */
        public boolean f75256e = false;

        public a(int seed) {
            this.f75252a = seed;
        }

        @Override // no.o
        public m h() {
            Preconditions.checkState(!this.f75256e);
            this.f75256e = true;
            int y11 = this.f75252a ^ d0.y((int) this.f75253b);
            this.f75252a = y11;
            return d0.v(y11, this.f75255d);
        }

        public final void j(int nBytes, long update) {
            long j11 = this.f75253b;
            int i11 = this.f75254c;
            long j12 = ((update & 4294967295L) << i11) | j11;
            this.f75253b = j12;
            int i12 = i11 + (nBytes * 8);
            this.f75254c = i12;
            this.f75255d += nBytes;
            if (i12 >= 32) {
                this.f75252a = d0.x(this.f75252a, d0.y((int) j12));
                this.f75253b >>>= 32;
                this.f75254c -= 32;
            }
        }

        @Override // no.o, no.f0
        @uo.a
        public o a(byte b11) {
            j(1, b11 & 255);
            return this;
        }

        @Override // no.d, no.o, no.f0
        @uo.a
        public o c(char c11) {
            j(2, c11);
            return this;
        }

        @Override // no.d, no.o, no.f0
        @uo.a
        public o e(byte[] bytes, int off, int len) {
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i11 = 0;
            while (true) {
                int i12 = i11 + 4;
                if (i12 > len) {
                    break;
                }
                j(4, d0.w(bytes, i11 + off));
                i11 = i12;
            }
            while (i11 < len) {
                a(bytes[off + i11]);
                i11++;
            }
            return this;
        }

        @Override // no.d, no.o, no.f0
        @uo.a
        public o f(ByteBuffer buffer) {
            ByteOrder order = buffer.order();
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            while (buffer.remaining() >= 4) {
                putInt(buffer.getInt());
            }
            while (buffer.hasRemaining()) {
                a(buffer.get());
            }
            buffer.order(order);
            return this;
        }

        @Override // no.d, no.o, no.f0
        @uo.a
        public o g(CharSequence input, Charset charset) {
            if (!StandardCharsets.UTF_8.equals(charset)) {
                return super.g(input, charset);
            }
            int length = input.length();
            int i11 = 0;
            while (true) {
                int i12 = i11 + 4;
                if (i12 > length) {
                    break;
                }
                char charAt = input.charAt(i11);
                char charAt2 = input.charAt(i11 + 1);
                char charAt3 = input.charAt(i11 + 2);
                char charAt4 = input.charAt(i11 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                j(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                i11 = i12;
            }
            while (i11 < length) {
                char charAt5 = input.charAt(i11);
                if (charAt5 < 128) {
                    j(1, charAt5);
                } else if (charAt5 < 2048) {
                    j(2, d0.t(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    j(3, d0.s(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(input, i11);
                    if (codePointAt == charAt5) {
                        b(input.subSequence(i11, length).toString().getBytes(charset));
                        return this;
                    }
                    i11++;
                    j(4, d0.u(codePointAt));
                }
                i11++;
            }
            return this;
        }

        @Override // no.d, no.o, no.f0
        @uo.a
        public o putInt(int i11) {
            j(4, i11);
            return this;
        }

        @Override // no.d, no.o, no.f0
        @uo.a
        public o putLong(long l11) {
            j(4, (int) l11);
            j(4, l11 >>> 32);
            return this;
        }
    }

    public d0(int seed, boolean supplementaryPlaneFix) {
        this.f75250a = seed;
        this.f75251b = supplementaryPlaneFix;
    }

    public static long s(char c11) {
        return (c11 >>> '\f') | 224 | ((((c11 >>> 6) & 63) | 128) << 8) | (((c11 & s60.d.f88057a) | 128) << 16);
    }

    public static long t(char c11) {
        return (c11 >>> 6) | 192 | (((c11 & s60.d.f88057a) | 128) << 8);
    }

    public static long u(int codePoint) {
        return (codePoint >>> 18) | 240 | ((((codePoint >>> 12) & 63) | 128) << 8) | ((((codePoint >>> 6) & 63) | 128) << 16) | (((codePoint & 63) | 128) << 24);
    }

    public static m v(int h12, int length) {
        int i11 = h12 ^ length;
        int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
        return m.i(i13 ^ (i13 >>> 16));
    }

    public static int w(byte[] input, int offset) {
        return ro.i.l(input[offset + 3], input[offset + 2], input[offset + 1], input[offset]);
    }

    public static int x(int h12, int k12) {
        return (Integer.rotateLeft(h12 ^ k12, 13) * 5) - 430675100;
    }

    public static int y(int k12) {
        return Integer.rotateLeft(k12 * (-862048943), 15) * 461845907;
    }

    @Override // no.c, no.n
    public m c(int input) {
        return v(x(this.f75250a, y(input)), 4);
    }

    @Override // no.c, no.n
    public m e(long input) {
        return v(x(x(this.f75250a, y((int) input)), y((int) (input >>> 32))), 8);
    }

    public boolean equals(@CheckForNull Object object) {
        if (object instanceof d0) {
            d0 d0Var = (d0) object;
            if (this.f75250a == d0Var.f75250a && this.f75251b == d0Var.f75251b) {
                return true;
            }
        }
        return false;
    }

    @Override // no.c, no.n
    public m f(CharSequence input, Charset charset) {
        if (!StandardCharsets.UTF_8.equals(charset)) {
            return b(input.toString().getBytes(charset));
        }
        int length = input.length();
        int i11 = this.f75250a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i13 + 4;
            if (i15 > length) {
                break;
            }
            char charAt = input.charAt(i13);
            char charAt2 = input.charAt(i13 + 1);
            char charAt3 = input.charAt(i13 + 2);
            char charAt4 = input.charAt(i13 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i11 = x(i11, y((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i14 += 4;
            i13 = i15;
        }
        long j11 = 0;
        while (i13 < length) {
            char charAt5 = input.charAt(i13);
            if (charAt5 < 128) {
                j11 |= charAt5 << i12;
                i12 += 8;
                i14++;
            } else if (charAt5 < 2048) {
                j11 |= t(charAt5) << i12;
                i12 += 16;
                i14 += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j11 |= s(charAt5) << i12;
                i12 += 24;
                i14 += 3;
            } else {
                int codePointAt = Character.codePointAt(input, i13);
                if (codePointAt == charAt5) {
                    return b(input.toString().getBytes(charset));
                }
                i13++;
                j11 |= u(codePointAt) << i12;
                if (this.f75251b) {
                    i12 += 32;
                }
                i14 += 4;
            }
            if (i12 >= 32) {
                i11 = x(i11, y((int) j11));
                j11 >>>= 32;
                i12 -= 32;
            }
            i13++;
        }
        return v(y((int) j11) ^ i11, i14);
    }

    @Override // no.c, no.n
    public m g(CharSequence input) {
        int i11 = this.f75250a;
        for (int i12 = 1; i12 < input.length(); i12 += 2) {
            i11 = x(i11, y(input.charAt(i12 - 1) | (input.charAt(i12) << 16)));
        }
        if ((input.length() & 1) == 1) {
            i11 ^= y(input.charAt(input.length() - 1));
        }
        return v(i11, input.length() * 2);
    }

    @Override // no.n
    public int h() {
        return 32;
    }

    public int hashCode() {
        return d0.class.hashCode() ^ this.f75250a;
    }

    @Override // no.n
    public o i() {
        return new a(this.f75250a);
    }

    @Override // no.c, no.n
    public m k(byte[] input, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, input.length);
        int i11 = this.f75250a;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13 + 4;
            if (i14 > len) {
                break;
            }
            i11 = x(i11, y(w(input, i13 + off)));
            i13 = i14;
        }
        int i15 = i13;
        int i16 = 0;
        while (i15 < len) {
            i12 ^= ro.r.p(input[off + i15]) << i16;
            i15++;
            i16 += 8;
        }
        return v(y(i12) ^ i11, len);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.f75250a + pn.j.f81007d;
    }
}
