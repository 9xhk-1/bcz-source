package no;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f75338a = u30.h.f91619a.toCharArray();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends m implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f75339b;

        public a(byte[] bytes) {
            this.f75339b = (byte[]) Preconditions.checkNotNull(bytes);
        }

        @Override // no.m
        public byte[] a() {
            return (byte[]) this.f75339b.clone();
        }

        @Override // no.m
        public int b() {
            byte[] bArr = this.f75339b;
            Preconditions.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f75339b;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // no.m
        public long c() {
            byte[] bArr = this.f75339b;
            Preconditions.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return m();
        }

        @Override // no.m
        public int d() {
            return this.f75339b.length * 8;
        }

        @Override // no.m
        public boolean f(m that) {
            if (this.f75339b.length != that.l().length) {
                return false;
            }
            boolean z11 = true;
            int i11 = 0;
            while (true) {
                byte[] bArr = this.f75339b;
                if (i11 >= bArr.length) {
                    return z11;
                }
                z11 &= bArr[i11] == that.l()[i11];
                i11++;
            }
        }

        @Override // no.m
        public byte[] l() {
            return this.f75339b;
        }

        @Override // no.m
        public long m() {
            long j11 = this.f75339b[0] & 255;
            for (int i11 = 1; i11 < Math.min(this.f75339b.length, 8); i11++) {
                j11 |= (this.f75339b[i11] & 255) << (i11 * 8);
            }
            return j11;
        }

        @Override // no.m
        public void o(byte[] dest, int offset, int maxLength) {
            System.arraycopy(this.f75339b, 0, dest, offset, maxLength);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends m implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f75340b;

        public b(int hash) {
            this.f75340b = hash;
        }

        @Override // no.m
        public byte[] a() {
            int i11 = this.f75340b;
            return new byte[]{(byte) i11, (byte) (i11 >> 8), (byte) (i11 >> 16), (byte) (i11 >> 24)};
        }

        @Override // no.m
        public int b() {
            return this.f75340b;
        }

        @Override // no.m
        public long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // no.m
        public int d() {
            return 32;
        }

        @Override // no.m
        public boolean f(m that) {
            return this.f75340b == that.b();
        }

        @Override // no.m
        public long m() {
            return ro.s.r(this.f75340b);
        }

        @Override // no.m
        public void o(byte[] dest, int offset, int maxLength) {
            for (int i11 = 0; i11 < maxLength; i11++) {
                dest[offset + i11] = (byte) (this.f75340b >> (i11 * 8));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends m implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final long f75341b;

        public c(long hash) {
            this.f75341b = hash;
        }

        @Override // no.m
        public byte[] a() {
            return new byte[]{(byte) this.f75341b, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
        }

        @Override // no.m
        public int b() {
            return (int) this.f75341b;
        }

        @Override // no.m
        public long c() {
            return this.f75341b;
        }

        @Override // no.m
        public int d() {
            return 64;
        }

        @Override // no.m
        public boolean f(m that) {
            return this.f75341b == that.c();
        }

        @Override // no.m
        public long m() {
            return this.f75341b;
        }

        @Override // no.m
        public void o(byte[] dest, int offset, int maxLength) {
            for (int i11 = 0; i11 < maxLength; i11++) {
                dest[offset + i11] = (byte) (this.f75341b >> (i11 * 8));
            }
        }
    }

    public static int e(char ch2) {
        if (ch2 >= '0' && ch2 <= '9') {
            return ch2 - '0';
        }
        if (ch2 >= 'a' && ch2 <= 'f') {
            return ch2 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + ch2);
    }

    public static m g(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
        return h((byte[]) bytes.clone());
    }

    public static m h(byte[] bytes) {
        return new a(bytes);
    }

    public static m i(int hash) {
        return new b(hash);
    }

    public static m j(long hash) {
        return new c(hash);
    }

    public static m k(String string) {
        Preconditions.checkArgument(string.length() >= 2, "input string (%s) must have at least 2 characters", string);
        Preconditions.checkArgument(string.length() % 2 == 0, "input string (%s) must have an even number of characters", string);
        byte[] bArr = new byte[string.length() / 2];
        for (int i11 = 0; i11 < string.length(); i11 += 2) {
            bArr[i11 / 2] = (byte) ((e(string.charAt(i11)) << 4) + e(string.charAt(i11 + 1)));
        }
        return h(bArr);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public final boolean equals(@CheckForNull Object object) {
        if (object instanceof m) {
            m mVar = (m) object;
            if (d() == mVar.d() && f(mVar)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean f(m that);

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] l11 = l();
        int i11 = l11[0] & 255;
        for (int i12 = 1; i12 < l11.length; i12++) {
            i11 |= (l11[i12] & 255) << (i12 * 8);
        }
        return i11;
    }

    public byte[] l() {
        return a();
    }

    public abstract long m();

    @uo.a
    public int n(byte[] dest, int offset, int maxLength) {
        int v11 = ro.i.v(maxLength, d() / 8);
        Preconditions.checkPositionIndexes(offset, offset + v11, dest.length);
        o(dest, offset, v11);
        return v11;
    }

    public abstract void o(byte[] dest, int offset, int maxLength);

    public final String toString() {
        byte[] l11 = l();
        StringBuilder sb2 = new StringBuilder(l11.length * 2);
        for (byte b11 : l11) {
            char[] cArr = f75338a;
            sb2.append(cArr[(b11 >> 4) & 15]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }
}
