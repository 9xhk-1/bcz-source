package l60;

import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.DeprecationLevel;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,149:1\n85#2:150\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n76#1:150\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 extends v implements e1 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f70359d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final MessageDigest f70360b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Mac f70361c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final a0 a(@m80.k e1 sink, @m80.k ByteString key) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            kotlin.jvm.internal.g0.p(key, "key");
            return new a0(sink, key, "HmacSHA1");
        }

        @w00.o
        @m80.k
        public final a0 b(@m80.k e1 sink, @m80.k ByteString key) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            kotlin.jvm.internal.g0.p(key, "key");
            return new a0(sink, key, qr.b.f82657b);
        }

        @w00.o
        @m80.k
        public final a0 c(@m80.k e1 sink, @m80.k ByteString key) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            kotlin.jvm.internal.g0.p(key, "key");
            return new a0(sink, key, "HmacSHA512");
        }

        @w00.o
        @m80.k
        public final a0 d(@m80.k e1 sink) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return new a0(sink, "MD5");
        }

        @w00.o
        @m80.k
        public final a0 e(@m80.k e1 sink) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return new a0(sink, "SHA-1");
        }

        @w00.o
        @m80.k
        public final a0 f(@m80.k e1 sink) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return new a0(sink, "SHA-256");
        }

        @w00.o
        @m80.k
        public final a0 g(@m80.k e1 sink) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return new a0(sink, "SHA-512");
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k e1 sink, @m80.k MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.g0.p(sink, "sink");
        kotlin.jvm.internal.g0.p(digest, "digest");
        this.f70360b = digest;
        this.f70361c = null;
    }

    @w00.o
    @m80.k
    public static final a0 C(@m80.k e1 e1Var) {
        return f70359d.g(e1Var);
    }

    @w00.o
    @m80.k
    public static final a0 i(@m80.k e1 e1Var, @m80.k ByteString byteString) {
        return f70359d.a(e1Var, byteString);
    }

    @w00.o
    @m80.k
    public static final a0 j(@m80.k e1 e1Var, @m80.k ByteString byteString) {
        return f70359d.b(e1Var, byteString);
    }

    @w00.o
    @m80.k
    public static final a0 k(@m80.k e1 e1Var, @m80.k ByteString byteString) {
        return f70359d.c(e1Var, byteString);
    }

    @w00.o
    @m80.k
    public static final a0 q(@m80.k e1 e1Var) {
        return f70359d.d(e1Var);
    }

    @w00.o
    @m80.k
    public static final a0 r(@m80.k e1 e1Var) {
        return f70359d.e(e1Var);
    }

    @w00.o
    @m80.k
    public static final a0 w(@m80.k e1 e1Var) {
        return f70359d.f(e1Var);
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
        MessageDigest messageDigest = this.f70360b;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.f70361c;
            kotlin.jvm.internal.g0.m(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.g0.m(doFinal);
        return new ByteString(doFinal);
    }

    @Override // l60.v, l60.e1
    public void y8(@m80.k k source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        h.e(source.size(), 0L, j11);
        c1 c1Var = source.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        long j12 = 0;
        while (j12 < j11) {
            int min = (int) Math.min(j11 - j12, c1Var.f70385c - c1Var.f70384b);
            MessageDigest messageDigest = this.f70360b;
            if (messageDigest != null) {
                messageDigest.update(c1Var.f70383a, c1Var.f70384b, min);
            } else {
                Mac mac = this.f70361c;
                kotlin.jvm.internal.g0.m(mac);
                mac.update(c1Var.f70383a, c1Var.f70384b, min);
            }
            j12 += min;
            c1Var = c1Var.f70388f;
            kotlin.jvm.internal.g0.m(c1Var);
        }
        super.y8(source, j11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@m80.k l60.e1 r2, @m80.k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.a0.<init>(l60.e1, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k e1 sink, @m80.k Mac mac) {
        super(sink);
        kotlin.jvm.internal.g0.p(sink, "sink");
        kotlin.jvm.internal.g0.p(mac, "mac");
        this.f70361c = mac;
        this.f70360b = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@m80.k l60.e1 r3, @m80.k okio.ByteString r4, @m80.k java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
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
        throw new UnsupportedOperationException("Method not decompiled: l60.a0.<init>(l60.e1, okio.ByteString, java.lang.String):void");
    }
}
