package no;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public final class a0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Mac f75214a;

    /* renamed from: b, reason: collision with root package name */
    public final Key f75215b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75216c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75217d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75218e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends no.a {

        /* renamed from: b, reason: collision with root package name */
        public final Mac f75219b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f75220c;

        @Override // no.o
        public m h() {
            o();
            this.f75220c = true;
            return m.h(this.f75219b.doFinal());
        }

        @Override // no.a
        public void k(byte b11) {
            o();
            this.f75219b.update(b11);
        }

        @Override // no.a
        public void l(ByteBuffer bytes) {
            o();
            Preconditions.checkNotNull(bytes);
            this.f75219b.update(bytes);
        }

        @Override // no.a
        public void m(byte[] b11) {
            o();
            this.f75219b.update(b11);
        }

        @Override // no.a
        public void n(byte[] b11, int off, int len) {
            o();
            this.f75219b.update(b11, off, len);
        }

        public final void o() {
            Preconditions.checkState(!this.f75220c, "Cannot re-use a Hasher after calling hash() on it");
        }

        public b(Mac mac) {
            this.f75219b = mac;
        }
    }

    public a0(String algorithmName, Key key, String toString) {
        Mac l11 = l(algorithmName, key);
        this.f75214a = l11;
        this.f75215b = (Key) Preconditions.checkNotNull(key);
        this.f75216c = (String) Preconditions.checkNotNull(toString);
        this.f75217d = l11.getMacLength() * 8;
        this.f75218e = m(l11);
    }

    public static Mac l(String algorithmName, Key key) {
        try {
            Mac mac = Mac.getInstance(algorithmName);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e11) {
            throw new IllegalArgumentException(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static boolean m(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // no.n
    public int h() {
        return this.f75217d;
    }

    @Override // no.n
    public o i() {
        if (this.f75218e) {
            try {
                return new b((Mac) this.f75214a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f75214a.getAlgorithm(), this.f75215b));
    }

    public String toString() {
        return this.f75216c;
    }
}
