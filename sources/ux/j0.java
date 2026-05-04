package ux;

import a00.m0;
import io.ktor.network.tls.TLSVersion;
import io.ktor.network.tls.extensions.TLSExtensionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSHandshakeType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSHandshakeType.kt\nio/ktor/network/tls/TLSServerHello\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1#2:91\n1863#3,2:92\n*S KotlinDebug\n*F\n+ 1 TLSHandshakeType.kt\nio/ktor/network/tls/TLSServerHello\n*L\n77#1:92,2\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final TLSVersion f92619a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final byte[] f92620b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final byte[] f92621c;

    /* renamed from: d, reason: collision with root package name */
    public final short f92622d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<xx.c> f92623e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final e f92624f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<io.ktor.network.tls.extensions.a> f92625g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92626a;

        static {
            int[] iArr = new int[TLSExtensionType.values().length];
            try {
                iArr[TLSExtensionType.SIGNATURE_ALGORITHMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f92626a = iArr;
        }
    }

    public j0(@m80.k TLSVersion version, @m80.k byte[] serverSeed, @m80.k byte[] sessionId, short s11, short s12, @m80.k List<xx.c> extensions) {
        Object obj;
        kotlin.jvm.internal.g0.p(version, "version");
        kotlin.jvm.internal.g0.p(serverSeed, "serverSeed");
        kotlin.jvm.internal.g0.p(sessionId, "sessionId");
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        this.f92619a = version;
        this.f92620b = serverSeed;
        this.f92621c = sessionId;
        this.f92622d = s12;
        this.f92623e = extensions;
        Iterator<T> it = ux.a.f92549a.e().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((e) obj).s() == s11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e eVar = (e) obj;
        if (eVar == null) {
            throw new IllegalStateException(("Server cipher suite is not supported: " + ((int) s11)).toString());
        }
        this.f92624f = eVar;
        ArrayList arrayList = new ArrayList();
        for (xx.c cVar : this.f92623e) {
            if (a.f92626a[cVar.c().ordinal()] == 1) {
                m0.s0(arrayList, io.ktor.network.tls.extensions.b.e(cVar.b()));
            }
        }
        this.f92625g = arrayList;
    }

    @m80.k
    public final e a() {
        return this.f92624f;
    }

    public final short b() {
        return this.f92622d;
    }

    @m80.k
    public final List<xx.c> c() {
        return this.f92623e;
    }

    @m80.k
    public final List<io.ktor.network.tls.extensions.a> d() {
        return this.f92625g;
    }

    @m80.k
    public final byte[] e() {
        return this.f92620b;
    }

    @m80.k
    public final byte[] f() {
        return this.f92621c;
    }

    @m80.k
    public final TLSVersion g() {
        return this.f92619a;
    }

    public /* synthetic */ j0(TLSVersion tLSVersion, byte[] bArr, byte[] bArr2, short s11, short s12, List list, int i11, kotlin.jvm.internal.v vVar) {
        this(tLSVersion, bArr, bArr2, s11, s12, (i11 & 32) != 0 ? a00.h0.J() : list);
    }
}
