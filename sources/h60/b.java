package h60;

import c1.g;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.m;
import l60.v0;
import m80.k;
import m80.l;
import okio.ByteString;
import u50.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nServerSentEventReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEventReader.kt\nokhttp3/internal/sse/ServerSentEventReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C0661b f58567d = new C0661b(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final v0 f58568e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final ByteString f58569f;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f58570a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f58571b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f58572c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(long j11);

        void b(@l String str, @l String str2, @k String str3);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h60.b$b, reason: collision with other inner class name */
    public static final class C0661b {
        public /* synthetic */ C0661b(v vVar) {
            this();
        }

        @k
        public final v0 c() {
            return b.f58568e;
        }

        public final void d(m mVar, l60.k kVar) throws IOException {
            kVar.writeByte(10);
            mVar.T6(kVar, mVar.p0(b.f58569f));
            mVar.X2(c());
        }

        public final long e(m mVar) throws IOException {
            return f.j0(mVar.L5(), -1L);
        }

        public C0661b() {
        }
    }

    static {
        v0.a aVar = v0.f70499c;
        ByteString.a aVar2 = ByteString.Companion;
        f58568e = aVar.d(aVar2.l("\r\n"), aVar2.l(g.f7467d), aVar2.l("\n"), aVar2.l("data: "), aVar2.l("data:"), aVar2.l("data\r\n"), aVar2.l("data\r"), aVar2.l("data\n"), aVar2.l("id: "), aVar2.l("id:"), aVar2.l("id\r\n"), aVar2.l("id\r"), aVar2.l("id\n"), aVar2.l("event: "), aVar2.l("event:"), aVar2.l("event\r\n"), aVar2.l("event\r"), aVar2.l("event\n"), aVar2.l("retry: "), aVar2.l("retry:"));
        f58569f = aVar2.l("\r\n");
    }

    public b(@k m source, @k a callback) {
        g0.p(source, "source");
        g0.p(callback, "callback");
        this.f58570a = source;
        this.f58571b = callback;
    }

    public final void c(String str, String str2, l60.k kVar) throws IOException {
        if (kVar.size() != 0) {
            this.f58572c = str;
            kVar.skip(1L);
            this.f58571b.b(str, str2, kVar.R3());
        }
    }

    public final boolean d() throws IOException {
        String str = this.f58572c;
        l60.k kVar = new l60.k();
        while (true) {
            String str2 = null;
            while (true) {
                m mVar = this.f58570a;
                v0 v0Var = f58568e;
                int X2 = mVar.X2(v0Var);
                if (X2 >= 0 && X2 < 3) {
                    c(str, str2, kVar);
                    return true;
                }
                if (3 <= X2 && X2 < 5) {
                    f58567d.d(this.f58570a, kVar);
                } else if (5 <= X2 && X2 < 8) {
                    kVar.writeByte(10);
                } else if (8 <= X2 && X2 < 10) {
                    str = this.f58570a.L5();
                    if (str.length() <= 0) {
                        str = null;
                    }
                } else if (10 <= X2 && X2 < 13) {
                    str = null;
                } else if (13 <= X2 && X2 < 15) {
                    str2 = this.f58570a.L5();
                    if (str2.length() > 0) {
                    }
                } else if (15 > X2 || X2 >= 18) {
                    if (18 <= X2 && X2 < 20) {
                        long e11 = f58567d.e(this.f58570a);
                        if (e11 != -1) {
                            this.f58571b.a(e11);
                        }
                    } else {
                        if (X2 != -1) {
                            throw new AssertionError();
                        }
                        long p02 = this.f58570a.p0(f58569f);
                        if (p02 == -1) {
                            return false;
                        }
                        this.f58570a.skip(p02);
                        this.f58570a.X2(v0Var);
                    }
                }
            }
        }
    }
}
