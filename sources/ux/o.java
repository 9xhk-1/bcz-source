package ux;

import io.ktor.network.tls.TLSException;
import io.ktor.network.tls.TLSHandshakeType;
import io.ktor.network.tls.TLSVersion;
import io.ktor.network.tls.extensions.NamedCurve;
import io.ktor.network.tls.extensions.PointFormat;
import io.ktor.network.tls.extensions.TLSExtensionType;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Render.kt\nio/ktor/network/tls/RenderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,209:1\n1#2:210\n15#3,3:211\n15#3,3:214\n15#3,3:217\n15#3,2:220\n17#3:224\n15#3,3:225\n15#3,2:228\n17#3:232\n15#3,2:233\n17#3:237\n1863#4,2:222\n1863#4,2:230\n1863#4,2:235\n1694#5,6:238\n*S KotlinDebug\n*F\n+ 1 Render.kt\nio/ktor/network/tls/RenderKt\n*L\n75#1:211,3\n104#1:214,3\n122#1:217,3\n134#1:220,2\n134#1:224\n149#1:225,3\n164#1:228,2\n164#1:232\n182#1:233,2\n182#1:237\n141#1:222,2\n175#1:230,2\n189#1:235,2\n196#1:238,6\n*E\n"})
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f92680a = 32762;

    /* renamed from: b, reason: collision with root package name */
    public static final int f92681b = 16382;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.RenderKt", f = "Render.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4}, l = {18, 19, 20, 21, 22, 23}, m = "writeRecord", n = {"$this$writeRecord", "$this$writeRecord_u24lambda_u240", "$this$writeRecord", "$this$writeRecord_u24lambda_u240", "$this$writeRecord", "$this$writeRecord_u24lambda_u240", "$this$writeRecord", "$this$writeRecord_u24lambda_u240", "$this$writeRecord"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92682a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92683b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f92684c;

        /* renamed from: d, reason: collision with root package name */
        public int f92685d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92684c = obj;
            this.f92685d |= Integer.MIN_VALUE;
            return o.o(null, null, this);
        }
    }

    public static final y40.c0 a(List<? extends NamedCurve> list) {
        y40.b bVar = new y40.b();
        if (list.size() > 16382) {
            throw new IllegalArgumentException("Too many named curves provided: at most 16382 could be provided");
        }
        bVar.writeShort(TLSExtensionType.ELLIPTIC_CURVES.getCode());
        int size = list.size() * 2;
        bVar.writeShort((short) (size + 2));
        bVar.writeShort((short) size);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bVar.writeShort(((NamedCurve) it.next()).getCode());
        }
        return bVar;
    }

    public static /* synthetic */ y40.c0 b(List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = xx.a.a();
        }
        return a(list);
    }

    public static final y40.c0 c(List<? extends PointFormat> list) {
        y40.b bVar = new y40.b();
        bVar.writeShort(TLSExtensionType.EC_POINT_FORMAT.getCode());
        int size = list.size();
        bVar.writeShort((short) (size + 1));
        bVar.u((byte) size);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bVar.u(((PointFormat) it.next()).getCode());
        }
        return bVar;
    }

    public static /* synthetic */ y40.c0 d(List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = xx.b.a();
        }
        return c(list);
    }

    public static final y40.c0 e(String str) {
        y40.b bVar = new y40.b();
        if (str.length() >= 32762) {
            throw new IllegalArgumentException("Server name length limit exceeded: at most 32762 characters allowed");
        }
        bVar.writeShort(TLSExtensionType.SERVER_NAME.getCode());
        bVar.writeShort((short) (str.length() + 5));
        bVar.writeShort((short) (str.length() + 3));
        bVar.u((byte) 0);
        bVar.writeShort((short) str.length());
        jz.s.p(bVar, str, 0, 0, null, 14, null);
        return bVar;
    }

    public static final y40.c0 f(List<io.ktor.network.tls.extensions.a> list) {
        y40.b bVar = new y40.b();
        bVar.writeShort(TLSExtensionType.SIGNATURE_ALGORITHMS.getCode());
        int size = list.size() * 2;
        bVar.writeShort((short) (size + 2));
        bVar.writeShort((short) size);
        for (io.ktor.network.tls.extensions.a aVar : list) {
            bVar.u(aVar.f().getCode());
            bVar.u(aVar.i().getCode());
        }
        return bVar;
    }

    public static /* synthetic */ y40.c0 g(List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = io.ktor.network.tls.extensions.b.d();
        }
        return f(list);
    }

    @m80.k
    public static final y40.c0 h(@m80.k byte[] digest, @m80.k SecretKey secretKey) {
        kotlin.jvm.internal.g0.p(digest, "digest");
        kotlin.jvm.internal.g0.p(secretKey, "secretKey");
        y40.b bVar = new y40.b();
        jz.h.i(bVar, j.a(secretKey, l.d(), digest, 12), 0, 0, 6, null);
        return bVar;
    }

    @m80.k
    public static final byte[] i(@m80.k byte[] handshakeHash, @m80.k SecretKey secretKey, int i11) {
        kotlin.jvm.internal.g0.p(handshakeHash, "handshakeHash");
        kotlin.jvm.internal.g0.p(secretKey, "secretKey");
        return j.a(secretKey, l.e(), handshakeHash, i11);
    }

    public static /* synthetic */ byte[] j(byte[] bArr, SecretKey secretKey, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 12;
        }
        return i(bArr, secretKey, i11);
    }

    public static final void k(y40.x xVar, byte[] bArr, int i11) {
        y40.x xVar2;
        int i12 = (i11 + 7) >>> 3;
        int length = bArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i13 = -1;
                break;
            } else if (bArr[i13] != 0) {
                break;
            } else {
                i13++;
            }
        }
        int length2 = i12 - (bArr.length - i13);
        if (length2 > 0) {
            xVar2 = xVar;
            jz.h.i(xVar2, new byte[length2], 0, 0, 6, null);
        } else {
            xVar2 = xVar;
        }
        jz.h.h(xVar2, bArr, i13, bArr.length - i13);
    }

    public static final void l(@m80.k y40.x xVar, @m80.k ECPoint point, int i11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(point, "point");
        y40.b bVar = new y40.b();
        bVar.u((byte) 4);
        byte[] byteArray = point.getAffineX().toByteArray();
        kotlin.jvm.internal.g0.o(byteArray, "toByteArray(...)");
        k(bVar, byteArray, i11);
        byte[] byteArray2 = point.getAffineY().toByteArray();
        kotlin.jvm.internal.g0.o(byteArray2, "toByteArray(...)");
        k(bVar, byteArray2, i11);
        xVar.u((byte) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final void m(@m80.k y40.x xVar, @m80.k byte[] preSecret, @m80.k PublicKey publicKey, @m80.k SecureRandom random) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(preSecret, "preSecret");
        kotlin.jvm.internal.g0.p(publicKey, "publicKey");
        kotlin.jvm.internal.g0.p(random, "random");
        if (preSecret.length != 48) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        kotlin.jvm.internal.g0.m(cipher);
        cipher.init(1, publicKey, random);
        byte[] doFinal = cipher.doFinal(preSecret);
        if (doFinal.length > 65535) {
            throw new TLSException("Encrypted premaster secret is too long", null, 2, null);
        }
        xVar.writeShort((short) doFinal.length);
        kotlin.jvm.internal.g0.m(doFinal);
        jz.h.i(xVar, doFinal, 0, 0, 6, null);
    }

    public static final void n(@m80.k y40.x xVar, @m80.k PublicKey key) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        if (!(key instanceof ECPublicKey)) {
            throw new TLSException("Unsupported public key type: " + key, null, 2, null);
        }
        ECPublicKey eCPublicKey = (ECPublicKey) key;
        int fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
        ECPoint w11 = eCPublicKey.getW();
        kotlin.jvm.internal.g0.o(w11, "getW(...)");
        l(xVar, w11, fieldSize);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ef, code lost:
    
        if (r7.g(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        if (io.ktor.utils.io.q.w(r7, r8, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (io.ktor.utils.io.q.x(r8, r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (io.ktor.utils.io.q.p(r8, r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (io.ktor.utils.io.q.p(r7, r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(@m80.k io.ktor.utils.io.m r7, @m80.k ux.i0 r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux.o.o(io.ktor.utils.io.m, ux.i0, j00.c):java.lang.Object");
    }

    public static final void p(@m80.k y40.x xVar, @m80.k X509Certificate[] certificates) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(certificates, "certificates");
        y40.b bVar = new y40.b();
        for (X509Certificate x509Certificate : certificates) {
            byte[] encoded = x509Certificate.getEncoded();
            kotlin.jvm.internal.g0.m(encoded);
            t(bVar, encoded.length);
            jz.h.i(bVar, encoded, 0, 0, 6, null);
        }
        t(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final void q(@m80.k y40.x xVar, @m80.k TLSVersion version, @m80.k List<e> suites, @m80.k byte[] random, @m80.k byte[] sessionId, @m80.l String str) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(version, "version");
        kotlin.jvm.internal.g0.p(suites, "suites");
        kotlin.jvm.internal.g0.p(random, "random");
        kotlin.jvm.internal.g0.p(sessionId, "sessionId");
        xVar.writeShort((short) version.getCode());
        jz.h.i(xVar, random, 0, 0, 6, null);
        int length = sessionId.length;
        if (length < 0 || length > 255 || length > sessionId.length) {
            throw new TLSException("Illegal sessionIdLength", null, 2, null);
        }
        xVar.u((byte) length);
        int i11 = 0;
        jz.h.h(xVar, sessionId, 0, length);
        xVar.writeShort((short) (suites.size() * 2));
        Iterator<e> it = suites.iterator();
        while (it.hasNext()) {
            xVar.writeShort(it.next().s());
        }
        xVar.u((byte) 1);
        xVar.u((byte) 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(g(null, 1, null));
        arrayList.add(b(null, 1, null));
        arrayList.add(d(null, 1, null));
        if (str != null) {
            arrayList.add(e(str));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i11 += (int) jz.j.j((y40.c0) it2.next());
        }
        xVar.writeShort((short) i11);
        Iterator it3 = arrayList.iterator();
        kotlin.jvm.internal.g0.o(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next = it3.next();
            kotlin.jvm.internal.g0.o(next, "next(...)");
            jz.h.j(xVar, (y40.c0) next);
        }
    }

    public static /* synthetic */ void r(y40.x xVar, TLSVersion tLSVersion, List list, byte[] bArr, byte[] bArr2, String str, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str = null;
        }
        q(xVar, tLSVersion, list, bArr, bArr2, str);
    }

    public static final void s(@m80.k y40.x xVar, @m80.k TLSHandshakeType type, int i11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        if (i11 <= 16777215) {
            xVar.writeInt((type.getCode() << 24) | i11);
            return;
        }
        throw new TLSException("TLS handshake size limit exceeded: " + i11, null, 2, null);
    }

    public static final void t(y40.x xVar, int i11) {
        xVar.u((byte) ((i11 >>> 16) & 255));
        xVar.writeShort((short) (i11 & 65535));
    }
}
