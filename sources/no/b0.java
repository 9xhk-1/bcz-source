package no;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public final class b0 extends no.c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f75225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75226b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75227c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75228d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends no.a {

        /* renamed from: b, reason: collision with root package name */
        public final MessageDigest f75229b;

        /* renamed from: c, reason: collision with root package name */
        public final int f75230c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f75231d;

        private void o() {
            Preconditions.checkState(!this.f75231d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // no.o
        public m h() {
            o();
            this.f75231d = true;
            return this.f75230c == this.f75229b.getDigestLength() ? m.h(this.f75229b.digest()) : m.h(Arrays.copyOf(this.f75229b.digest(), this.f75230c));
        }

        @Override // no.a
        public void k(byte b11) {
            o();
            this.f75229b.update(b11);
        }

        @Override // no.a
        public void l(ByteBuffer bytes) {
            o();
            this.f75229b.update(bytes);
        }

        @Override // no.a
        public void n(byte[] b11, int off, int len) {
            o();
            this.f75229b.update(b11, off, len);
        }

        public b(MessageDigest digest, int bytes) {
            this.f75229b = digest;
            this.f75230c = bytes;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f75232a;

        /* renamed from: b, reason: collision with root package name */
        public final int f75233b;

        /* renamed from: c, reason: collision with root package name */
        public final String f75234c;

        private Object readResolve() {
            return new b0(this.f75232a, this.f75233b, this.f75234c);
        }

        public c(String algorithmName, int bytes, String toString) {
            this.f75232a = algorithmName;
            this.f75233b = bytes;
            this.f75234c = toString;
        }
    }

    public b0(String algorithmName, String toString) {
        MessageDigest l11 = l(algorithmName);
        this.f75225a = l11;
        this.f75226b = l11.getDigestLength();
        this.f75228d = (String) Preconditions.checkNotNull(toString);
        this.f75227c = m(l11);
    }

    public static MessageDigest l(String algorithmName) {
        try {
            return MessageDigest.getInstance(algorithmName);
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError(e11);
        }
    }

    public static boolean m(MessageDigest digest) {
        try {
            digest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // no.n
    public int h() {
        return this.f75226b * 8;
    }

    @Override // no.n
    public o i() {
        if (this.f75227c) {
            try {
                return new b((MessageDigest) this.f75225a.clone(), this.f75226b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f75225a.getAlgorithm()), this.f75226b);
    }

    public String toString() {
        return this.f75228d;
    }

    public Object writeReplace() {
        return new c(this.f75225a.getAlgorithm(), this.f75226b, this.f75228d);
    }

    public b0(String algorithmName, int bytes, String toString) {
        this.f75228d = (String) Preconditions.checkNotNull(toString);
        MessageDigest l11 = l(algorithmName);
        this.f75225a = l11;
        int digestLength = l11.getDigestLength();
        Preconditions.checkArgument(bytes >= 4 && bytes <= digestLength, "bytes (%s) must be >= 4 and < %s", bytes, digestLength);
        this.f75226b = bytes;
        this.f75227c = m(l11);
    }
}
