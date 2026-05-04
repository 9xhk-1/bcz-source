package io.ktor.network.tls;

import io.ktor.network.tls.extensions.NamedCurve;
import io.ktor.network.tls.extensions.TLSExtensionType;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.List;
import jz.h;
import jz.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import ux.f0;
import ux.j0;
import y40.c0;
import yz.c2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parser.kt\nio/ktor/network/tls/ParserKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,153:1\n15#2,3:154\n15#2,3:157\n*S KotlinDebug\n*F\n+ 1 Parser.kt\nio/ktor/network/tls/ParserKt\n*L\n33#1:154,3\n78#1:157,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f61030a = 18432;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: io.ktor.network.tls.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0704a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61031a;

        static {
            int[] iArr = new int[ServerKeyExchangeType.values().length];
            try {
                iArr[ServerKeyExchangeType.NamedCurve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServerKeyExchangeType.ExplicitPrime.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServerKeyExchangeType.ExplicitChar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61031a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", i = {0, 1}, l = {148, 149}, m = "readShortCompatible", n = {"$this$readShortCompatible", "first"}, s = {"L$0", "I$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61032a;

        /* renamed from: b, reason: collision with root package name */
        public int f61033b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61034c;

        /* renamed from: d, reason: collision with root package name */
        public int f61035d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61034c = obj;
            this.f61035d |= Integer.MIN_VALUE;
            return a.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", i = {0, 1, 1, 2, 2, 2, 3, 3}, l = {19, 20, 22, 25}, m = "readTLSRecord", n = {"$this$readTLSRecord", "$this$readTLSRecord", "type", "$this$readTLSRecord", "type", "version", "type", "version"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61036a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61037b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61038c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61039d;

        /* renamed from: e, reason: collision with root package name */
        public int f61040e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61039d = obj;
            this.f61040e |= Integer.MIN_VALUE;
            return a.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", i = {}, l = {139}, m = "readTLSVersion", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61041a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61042b;

        /* renamed from: c, reason: collision with root package name */
        public int f61043c;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61042b = obj;
            this.f61043c |= Integer.MIN_VALUE;
            return a.j(null, this);
        }
    }

    @k
    public static final NamedCurve b(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        int i11 = C0704a.f61031a[ServerKeyExchangeType.Companion.a(c0Var.readByte() & 255).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                throw new IllegalStateException("ExplicitPrime server key exchange type is not yet supported");
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ExplicitChar server key exchange type is not yet supported");
        }
        NamedCurve a11 = NamedCurve.Companion.a(c0Var.readShort());
        if (a11 != null) {
            return a11;
        }
        throw new TLSException("Unknown EC id", null, 2, null);
    }

    @k
    public static final ECPoint c(@k c0 c0Var, int i11) {
        g0.p(c0Var, "<this>");
        int readByte = c0Var.readByte() & 255;
        if (c0Var.readByte() != 4) {
            throw new TLSException("Point should be uncompressed", null, 2, null);
        }
        int i12 = (readByte - 1) / 2;
        if (((i11 + 7) >>> 3) == i12) {
            return new ECPoint(new BigInteger(1, y40.g0.d(c0Var, i12)), new BigInteger(1, y40.g0.d(c0Var, i12)));
        }
        throw new TLSException("Invalid point component length", null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k io.ktor.utils.io.g r6, @m80.k j00.c<? super java.lang.Integer> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.network.tls.a.b
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.network.tls.a$b r0 = (io.ktor.network.tls.a.b) r0
            int r1 = r0.f61035d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61035d = r1
            goto L18
        L13:
            io.ktor.network.tls.a$b r0 = new io.ktor.network.tls.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f61034c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61035d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r6 = r0.f61033b
            kotlin.e.n(r7)
            goto L65
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f61032a
            io.ktor.utils.io.g r6 = (io.ktor.utils.io.g) r6
            kotlin.e.n(r7)
            goto L4c
        L3e:
            kotlin.e.n(r7)
            r0.f61032a = r6
            r0.f61035d = r4
            java.lang.Object r7 = io.ktor.utils.io.j.y(r6, r0)
            if (r7 != r1) goto L4c
            goto L61
        L4c:
            java.lang.Number r7 = (java.lang.Number) r7
            byte r7 = r7.byteValue()
            r7 = r7 & 255(0xff, float:3.57E-43)
            r2 = 0
            r0.f61032a = r2
            r0.f61033b = r7
            r0.f61035d = r3
            java.lang.Object r6 = io.ktor.utils.io.j.y(r6, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            r5 = r7
            r7 = r6
            r6 = r5
        L65:
            java.lang.Number r7 = (java.lang.Number) r7
            byte r7 = r7.byteValue()
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r6 = r6 + r7
            java.lang.Integer r6 = l00.a.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.a.d(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    @k
    public static final List<Certificate> e(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        int k11 = k(c0Var);
        ArrayList arrayList = new ArrayList();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        g0.m(certificateFactory);
        int i11 = 0;
        while (i11 < k11) {
            int k12 = k(c0Var);
            if (k12 > k11 - i11) {
                throw new TLSException("Certificate length is too big", null, 2, null);
            }
            if (k12 > j.j(c0Var)) {
                throw new TLSException("Certificate length is too big", null, 2, null);
            }
            byte[] bArr = new byte[k12];
            c0 c0Var2 = c0Var;
            j.p(c0Var2, bArr, 0, 0, 6, null);
            i11 += k12 + 3;
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)));
            c0Var = c0Var2;
        }
        return arrayList;
    }

    @k
    public static final f0 f(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        f0 f0Var = new f0();
        int readInt = c0Var.readInt();
        f0Var.d(TLSHandshakeType.Companion.a(readInt >>> 24));
        y40.b bVar = new y40.b();
        h.i(bVar, y40.g0.d(c0Var, readInt & 16777215), 0, 0, 6, null);
        f0Var.c(bVar);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@m80.k io.ktor.utils.io.g r9, @m80.k j00.c<? super ux.i0> r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.a.g(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    @k
    public static final j0 h(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        TLSVersion i11 = i(c0Var);
        byte[] bArr = new byte[32];
        j.p(c0Var, bArr, 0, 0, 6, null);
        int readByte = c0Var.readByte() & 255;
        if (readByte > 32) {
            throw new TLSException("sessionId length limit of 32 bytes exceeded: " + readByte + " specified", null, 2, null);
        }
        byte[] bArr2 = new byte[32];
        j.o(c0Var, bArr2, 0, readByte);
        short readShort = c0Var.readShort();
        short readByte2 = (short) (c0Var.readByte() & 255);
        if (readByte2 != 0) {
            throw new TLSException("Unsupported TLS compression method " + ((int) readByte2) + " (only null 0 compression method is supported)", null, 2, null);
        }
        if (((int) j.j(c0Var)) == 0) {
            return new j0(i11, bArr, bArr2, readShort, readByte2, null, 32, null);
        }
        int readShort2 = c0Var.readShort() & c2.f100412d;
        if (((int) j.j(c0Var)) != readShort2) {
            throw new TLSException("Invalid extensions size: requested " + readShort2 + ", available " + j.j(c0Var), null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        while (j.j(c0Var) > 0) {
            int readShort3 = c0Var.readShort() & c2.f100412d;
            int readShort4 = c0Var.readShort() & c2.f100412d;
            TLSExtensionType a11 = TLSExtensionType.Companion.a(readShort3);
            y40.b bVar = new y40.b();
            h.i(bVar, y40.g0.d(c0Var, readShort4), 0, 0, 6, null);
            g2 g2Var = g2.f100423a;
            arrayList.add(new xx.c(a11, readShort4, bVar));
        }
        return new j0(i11, bArr, bArr2, readShort, readByte2, arrayList);
    }

    public static final TLSVersion i(c0 c0Var) {
        return TLSVersion.Companion.a(c0Var.readShort() & c2.f100412d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(io.ktor.utils.io.g r5, j00.c<? super io.ktor.network.tls.TLSVersion> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.network.tls.a.d
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.network.tls.a$d r0 = (io.ktor.network.tls.a.d) r0
            int r1 = r0.f61043c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61043c = r1
            goto L18
        L13:
            io.ktor.network.tls.a$d r0 = new io.ktor.network.tls.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f61042b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61043c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f61041a
            io.ktor.network.tls.TLSVersion$a r5 = (io.ktor.network.tls.TLSVersion.a) r5
            kotlin.e.n(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            io.ktor.network.tls.TLSVersion$a r6 = io.ktor.network.tls.TLSVersion.Companion
            r0.f61041a = r6
            r0.f61043c = r3
            java.lang.Object r5 = d(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r4 = r6
            r6 = r5
            r5 = r4
        L48:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            io.ktor.network.tls.TLSVersion r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.a.j(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public static final int k(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return (c0Var.readShort() & c2.f100412d) | ((c0Var.readByte() & 255) << 16);
    }
}
