package l60;

import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.DeprecationLevel;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 extends w implements g1 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f70367d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final MessageDigest f70368b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Mac f70369c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final b0 a(@m80.k g1 source, @m80.k ByteString key) {
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(key, "key");
            return new b0(source, key, "HmacSHA1");
        }

        @w00.o
        @m80.k
        public final b0 b(@m80.k g1 source, @m80.k ByteString key) {
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(key, "key");
            return new b0(source, key, qr.b.f82657b);
        }

        @w00.o
        @m80.k
        public final b0 c(@m80.k g1 source, @m80.k ByteString key) {
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(key, "key");
            return new b0(source, key, "HmacSHA512");
        }

        @w00.o
        @m80.k
        public final b0 d(@m80.k g1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            return new b0(source, "MD5");
        }

        @w00.o
        @m80.k
        public final b0 e(@m80.k g1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            return new b0(source, "SHA-1");
        }

        @w00.o
        @m80.k
        public final b0 f(@m80.k g1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            return new b0(source, "SHA-256");
        }

        @w00.o
        @m80.k
        public final b0 g(@m80.k g1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            return new b0(source, "SHA-512");
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@m80.k g1 source, @m80.k MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(digest, "digest");
        this.f70368b = digest;
        this.f70369c = null;
    }

    @w00.o
    @m80.k
    public static final b0 C(@m80.k g1 g1Var) {
        return f70367d.g(g1Var);
    }

    @w00.o
    @m80.k
    public static final b0 i(@m80.k g1 g1Var, @m80.k ByteString byteString) {
        return f70367d.a(g1Var, byteString);
    }

    @w00.o
    @m80.k
    public static final b0 j(@m80.k g1 g1Var, @m80.k ByteString byteString) {
        return f70367d.b(g1Var, byteString);
    }

    @w00.o
    @m80.k
    public static final b0 k(@m80.k g1 g1Var, @m80.k ByteString byteString) {
        return f70367d.c(g1Var, byteString);
    }

    @w00.o
    @m80.k
    public static final b0 q(@m80.k g1 g1Var) {
        return f70367d.d(g1Var);
    }

    @w00.o
    @m80.k
    public static final b0 r(@m80.k g1 g1Var) {
        return f70367d.e(g1Var);
    }

    @w00.o
    @m80.k
    public static final b0 w(@m80.k g1 g1Var) {
        return f70367d.f(g1Var);
    }

    @Override // l60.w, l60.g1
    public long L3(@m80.k k sink, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        long L3 = super.L3(sink, j11);
        if (L3 != -1) {
            long size = sink.size() - L3;
            long size2 = sink.size();
            c1 c1Var = sink.f70446a;
            kotlin.jvm.internal.g0.m(c1Var);
            while (size2 > size) {
                c1Var = c1Var.f70389g;
                kotlin.jvm.internal.g0.m(c1Var);
                size2 -= c1Var.f70385c - c1Var.f70384b;
            }
            while (size2 < sink.size()) {
                int i11 = (int) ((c1Var.f70384b + size) - size2);
                MessageDigest messageDigest = this.f70368b;
                if (messageDigest != null) {
                    messageDigest.update(c1Var.f70383a, i11, c1Var.f70385c - i11);
                } else {
                    Mac mac = this.f70369c;
                    kotlin.jvm.internal.g0.m(mac);
                    mac.update(c1Var.f70383a, i11, c1Var.f70385c - i11);
                }
                size2 += c1Var.f70385c - c1Var.f70384b;
                c1Var = c1Var.f70388f;
                kotlin.jvm.internal.g0.m(c1Var);
                size = size2;
            }
        }
        return L3;
    }

    @w00.j(name = "-deprecated_hash")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = "hash", imports = {}))
    @m80.k
    public final ByteString e() {
        return f();
    }

    @w00.j(name = "hash")
    @m80.k
    public final ByteString f() {
        byte[] doFinal;
        MessageDigest messageDigest = this.f70368b;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.f70369c;
            kotlin.jvm.internal.g0.m(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.g0.m(doFinal);
        return new ByteString(doFinal);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(@m80.k l60.g1 r2, @m80.k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.b0.<init>(l60.g1, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@m80.k g1 source, @m80.k Mac mac) {
        super(source);
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(mac, "mac");
        this.f70369c = mac;
        this.f70368b = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(@m80.k l60.g1 r3, @m80.k okio.ByteString r4, @m80.k java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L28
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L28
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L28
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L28
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L28
            yz.g2 r4 = yz.g2.f100423a     // Catch: java.security.InvalidKeyException -> L28
            kotlin.jvm.internal.g0.m(r0)
            r2.<init>(r3, r0)
            return
        L28:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.b0.<init>(l60.g1, okio.ByteString, java.lang.String):void");
    }
}
