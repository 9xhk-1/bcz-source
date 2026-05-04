package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.m;
import l60.r0;
import okhttp3.internal.http2.c;
import okio.ByteString;
import y50.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements Closeable {

    @m80.k
    public static final C0950b D = new C0950b(null);
    public static final int E = 16777216;

    @m80.k
    public static final c60.g F;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 1000000000;

    @m80.k
    public final okhttp3.internal.http2.d A;

    @m80.k
    public final d B;

    @m80.k
    public final Set<Integer> C;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f77344a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c f77345b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<Integer, c60.d> f77346c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f77347d;

    /* renamed from: e, reason: collision with root package name */
    public int f77348e;

    /* renamed from: f, reason: collision with root package name */
    public int f77349f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77350g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final y50.d f77351h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final y50.c f77352i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final y50.c f77353j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final y50.c f77354k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final c60.f f77355l;

    /* renamed from: m, reason: collision with root package name */
    public long f77356m;

    /* renamed from: n, reason: collision with root package name */
    public long f77357n;

    /* renamed from: o, reason: collision with root package name */
    public long f77358o;

    /* renamed from: p, reason: collision with root package name */
    public long f77359p;

    /* renamed from: q, reason: collision with root package name */
    public long f77360q;

    /* renamed from: r, reason: collision with root package name */
    public long f77361r;

    /* renamed from: s, reason: collision with root package name */
    public long f77362s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final c60.g f77363t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public c60.g f77364u;

    /* renamed from: v, reason: collision with root package name */
    public long f77365v;

    /* renamed from: w, reason: collision with root package name */
    public long f77366w;

    /* renamed from: x, reason: collision with root package name */
    public long f77367x;

    /* renamed from: y, reason: collision with root package name */
    public long f77368y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final Socket f77369z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f77370a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final y50.d f77371b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f77372c;

        /* renamed from: d, reason: collision with root package name */
        public String f77373d;

        /* renamed from: e, reason: collision with root package name */
        public m f77374e;

        /* renamed from: f, reason: collision with root package name */
        public l60.l f77375f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public c f77376g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public c60.f f77377h;

        /* renamed from: i, reason: collision with root package name */
        public int f77378i;

        public a(boolean z11, @m80.k y50.d taskRunner) {
            g0.p(taskRunner, "taskRunner");
            this.f77370a = z11;
            this.f77371b = taskRunner;
            this.f77376g = c.f77380b;
            this.f77377h = c60.f.f8216b;
        }

        public static /* synthetic */ a z(a aVar, Socket socket, String str, m mVar, l60.l lVar, int i11, Object obj) throws IOException {
            if ((i11 & 2) != 0) {
                str = u50.f.S(socket);
            }
            if ((i11 & 4) != 0) {
                mVar = r0.e(r0.w(socket));
            }
            if ((i11 & 8) != 0) {
                lVar = r0.d(r0.q(socket));
            }
            return aVar.y(socket, str, mVar, lVar);
        }

        @m80.k
        public final b a() {
            return new b(this);
        }

        public final boolean b() {
            return this.f77370a;
        }

        @m80.k
        public final String c() {
            String str = this.f77373d;
            if (str != null) {
                return str;
            }
            g0.S("connectionName");
            return null;
        }

        @m80.k
        public final c d() {
            return this.f77376g;
        }

        public final int e() {
            return this.f77378i;
        }

        @m80.k
        public final c60.f f() {
            return this.f77377h;
        }

        @m80.k
        public final l60.l g() {
            l60.l lVar = this.f77375f;
            if (lVar != null) {
                return lVar;
            }
            g0.S("sink");
            return null;
        }

        @m80.k
        public final Socket h() {
            Socket socket = this.f77372c;
            if (socket != null) {
                return socket;
            }
            g0.S("socket");
            return null;
        }

        @m80.k
        public final m i() {
            m mVar = this.f77374e;
            if (mVar != null) {
                return mVar;
            }
            g0.S("source");
            return null;
        }

        @m80.k
        public final y50.d j() {
            return this.f77371b;
        }

        @m80.k
        public final a k(@m80.k c listener) {
            g0.p(listener, "listener");
            this.f77376g = listener;
            return this;
        }

        @m80.k
        public final a l(int i11) {
            this.f77378i = i11;
            return this;
        }

        @m80.k
        public final a m(@m80.k c60.f pushObserver) {
            g0.p(pushObserver, "pushObserver");
            this.f77377h = pushObserver;
            return this;
        }

        public final void n(boolean z11) {
            this.f77370a = z11;
        }

        public final void o(@m80.k String str) {
            g0.p(str, "<set-?>");
            this.f77373d = str;
        }

        public final void p(@m80.k c cVar) {
            g0.p(cVar, "<set-?>");
            this.f77376g = cVar;
        }

        public final void q(int i11) {
            this.f77378i = i11;
        }

        public final void r(@m80.k c60.f fVar) {
            g0.p(fVar, "<set-?>");
            this.f77377h = fVar;
        }

        public final void s(@m80.k l60.l lVar) {
            g0.p(lVar, "<set-?>");
            this.f77375f = lVar;
        }

        public final void t(@m80.k Socket socket) {
            g0.p(socket, "<set-?>");
            this.f77372c = socket;
        }

        public final void u(@m80.k m mVar) {
            g0.p(mVar, "<set-?>");
            this.f77374e = mVar;
        }

        @w00.k
        @m80.k
        public final a v(@m80.k Socket socket) throws IOException {
            g0.p(socket, "socket");
            return z(this, socket, null, null, null, 14, null);
        }

        @w00.k
        @m80.k
        public final a w(@m80.k Socket socket, @m80.k String peerName) throws IOException {
            g0.p(socket, "socket");
            g0.p(peerName, "peerName");
            return z(this, socket, peerName, null, null, 12, null);
        }

        @w00.k
        @m80.k
        public final a x(@m80.k Socket socket, @m80.k String peerName, @m80.k m source) throws IOException {
            g0.p(socket, "socket");
            g0.p(peerName, "peerName");
            g0.p(source, "source");
            return z(this, socket, peerName, source, null, 8, null);
        }

        @w00.k
        @m80.k
        public final a y(@m80.k Socket socket, @m80.k String peerName, @m80.k m source, @m80.k l60.l sink) throws IOException {
            String str;
            g0.p(socket, "socket");
            g0.p(peerName, "peerName");
            g0.p(source, "source");
            g0.p(sink, "sink");
            t(socket);
            if (this.f77370a) {
                str = u50.f.f91854i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            o(str);
            u(source);
            s(sink);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: okhttp3.internal.http2.b$b, reason: collision with other inner class name */
    public static final class C0950b {
        public /* synthetic */ C0950b(v vVar) {
            this();
        }

        @m80.k
        public final c60.g a() {
            return b.F;
        }

        public C0950b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C0951b f77379a = new C0951b(null);

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final c f77380b = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.b.c
            public void f(@m80.k c60.d stream) throws IOException {
                g0.p(stream, "stream");
                stream.d(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: okhttp3.internal.http2.b$c$b, reason: collision with other inner class name */
        public static final class C0951b {
            public /* synthetic */ C0951b(v vVar) {
                this();
            }

            public C0951b() {
            }
        }

        public void e(@m80.k b connection, @m80.k c60.g settings) {
            g0.p(connection, "connection");
            g0.p(settings, "settings");
        }

        public abstract void f(@m80.k c60.d dVar) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n939#2:219\n940#2,8:222\n948#2:233\n402#3,2:220\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n939#1:220,2\n939#1:230,3\n*E\n"})
    public static final class e extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77393e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f77394f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l60.k f77395g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f77396h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f77397i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z11, b bVar, int i11, l60.k kVar, int i12, boolean z12) {
            super(str, z11);
            this.f77393e = bVar;
            this.f77394f = i11;
            this.f77395g = kVar;
            this.f77396h = i12;
            this.f77397i = z12;
        }

        @Override // y50.a
        public long f() {
            try {
                boolean c11 = this.f77393e.f77355l.c(this.f77394f, this.f77395g, this.f77396h, this.f77397i);
                if (c11) {
                    this.f77393e.D0().E(this.f77394f, ErrorCode.CANCEL);
                }
                if (!c11 && !this.f77397i) {
                    return -1L;
                }
                synchronized (this.f77393e) {
                    this.f77393e.C.remove(Integer.valueOf(this.f77394f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n912#2,2:219\n914#2,7:223\n921#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n913#1:221,2\n913#1:230,3\n*E\n"})
    public static final class f extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77398e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f77399f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f77400g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f77401h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z11, b bVar, int i11, List list, boolean z12) {
            super(str, z11);
            this.f77398e = bVar;
            this.f77399f = i11;
            this.f77400g = list;
            this.f77401h = z12;
        }

        @Override // y50.a
        public long f() {
            boolean b11 = this.f77398e.f77355l.b(this.f77399f, this.f77400g, this.f77401h);
            if (b11) {
                try {
                    this.f77398e.D0().E(this.f77399f, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!b11 && !this.f77401h) {
                return -1L;
            }
            synchronized (this.f77398e) {
                this.f77398e.C.remove(Integer.valueOf(this.f77399f));
            }
            return -1L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n894#2,2:219\n896#2,7:223\n903#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n895#1:221,2\n895#1:230,3\n*E\n"})
    public static final class g extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77402e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f77403f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f77404g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z11, b bVar, int i11, List list) {
            super(str, z11);
            this.f77402e = bVar;
            this.f77403f = i11;
            this.f77404g = list;
        }

        @Override // y50.a
        public long f() {
            if (!this.f77402e.f77355l.a(this.f77403f, this.f77404g)) {
                return -1L;
            }
            try {
                this.f77402e.D0().E(this.f77403f, ErrorCode.CANCEL);
                synchronized (this.f77402e) {
                    this.f77402e.C.remove(Integer.valueOf(this.f77403f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n953#2,5:219\n*E\n"})
    public static final class h extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77405e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f77406f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f77407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z11, b bVar, int i11, ErrorCode errorCode) {
            super(str, z11);
            this.f77405e = bVar;
            this.f77406f = i11;
            this.f77407g = errorCode;
        }

        @Override // y50.a
        public long f() {
            this.f77405e.f77355l.d(this.f77406f, this.f77407g);
            synchronized (this.f77405e) {
                this.f77405e.C.remove(Integer.valueOf(this.f77406f));
                g2 g2Var = g2.f100423a;
            }
            return -1L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n555#2,2:219\n*E\n"})
    public static final class i extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77408e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z11, b bVar) {
            super(str, z11);
            this.f77408e = bVar;
        }

        @Override // y50.a
        public long f() {
            this.f77408e.o1(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n153#2,14:219\n*E\n"})
    public static final class j extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77409e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f77410f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, b bVar, long j11) {
            super(str, false, 2, null);
            this.f77409e = bVar;
            this.f77410f = j11;
        }

        @Override // y50.a
        public long f() {
            boolean z11;
            synchronized (this.f77409e) {
                if (this.f77409e.f77357n < this.f77409e.f77356m) {
                    z11 = true;
                } else {
                    this.f77409e.f77356m++;
                    z11 = false;
                }
            }
            if (z11) {
                this.f77409e.c0(null);
                return -1L;
            }
            this.f77409e.o1(false, 1, 0);
            return this.f77410f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n341#2,6:219\n*E\n"})
    public static final class k extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77411e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f77412f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f77413g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z11, b bVar, int i11, ErrorCode errorCode) {
            super(str, z11);
            this.f77411e = bVar;
            this.f77412f = i11;
            this.f77413g = errorCode;
        }

        @Override // y50.a
        public long f() {
            try {
                this.f77411e.r1(this.f77412f, this.f77413g);
                return -1L;
            } catch (IOException e11) {
                this.f77411e.c0(e11);
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n362#2,6:219\n*E\n"})
    public static final class l extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77414e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f77415f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f77416g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z11, b bVar, int i11, long j11) {
            super(str, z11);
            this.f77414e = bVar;
            this.f77415f = i11;
            this.f77416g = j11;
        }

        @Override // y50.a
        public long f() {
            try {
                this.f77414e.D0().I(this.f77415f, this.f77416g);
                return -1L;
            } catch (IOException e11) {
                this.f77414e.c0(e11);
                return -1L;
            }
        }
    }

    static {
        c60.g gVar = new c60.g();
        gVar.k(7, 65535);
        gVar.k(5, 16384);
        F = gVar;
    }

    public b(@m80.k a builder) {
        g0.p(builder, "builder");
        boolean b11 = builder.b();
        this.f77344a = b11;
        this.f77345b = builder.d();
        this.f77346c = new LinkedHashMap();
        String c11 = builder.c();
        this.f77347d = c11;
        this.f77349f = builder.b() ? 3 : 2;
        y50.d j11 = builder.j();
        this.f77351h = j11;
        y50.c j12 = j11.j();
        this.f77352i = j12;
        this.f77353j = j11.j();
        this.f77354k = j11.j();
        this.f77355l = builder.f();
        c60.g gVar = new c60.g();
        if (builder.b()) {
            gVar.k(7, 16777216);
        }
        this.f77363t = gVar;
        this.f77364u = F;
        this.f77368y = r2.e();
        this.f77369z = builder.h();
        this.A = new okhttp3.internal.http2.d(builder.g(), b11);
        this.B = new d(this, new okhttp3.internal.http2.c(builder.i(), b11));
        this.C = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            j12.n(new j(c11 + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void j1(b bVar, boolean z11, y50.d dVar, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            dVar = y50.d.f99391i;
        }
        bVar.i1(z11, dVar);
    }

    public final long A0() {
        return this.f77368y;
    }

    public final long C0() {
        return this.f77367x;
    }

    @m80.k
    public final okhttp3.internal.http2.d D0() {
        return this.A;
    }

    public final synchronized boolean E0(long j11) {
        if (this.f77350g) {
            return false;
        }
        if (this.f77359p < this.f77358o) {
            if (j11 >= this.f77362s) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x0027, B:17:0x002c, B:19:0x0034, B:23:0x0047, B:25:0x004d, B:26:0x0056, B:43:0x0082, B:44:0x0087), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:27:0x0058, B:29:0x005b, B:35:0x0064, B:37:0x0068, B:38:0x0076, B:39:0x007d, B:47:0x0088, B:48:0x0089), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:27:0x0058, B:29:0x005b, B:35:0x0064, B:37:0x0068, B:38:0x0076, B:39:0x007d, B:47:0x0088, B:48:0x0089), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c60.d F0(int r10, java.util.List<c60.a> r11, boolean r12) throws java.io.IOException {
        /*
            r9 = this;
            r3 = r12 ^ 1
            okhttp3.internal.http2.d r6 = r9.A
            monitor-enter(r6)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L8a
            int r0 = r9.f77349f     // Catch: java.lang.Throwable -> L7e
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L18
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r9.f1(r0)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L88
        L18:
            boolean r0 = r9.f77350g     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L81
            int r1 = r9.f77349f     // Catch: java.lang.Throwable -> L7e
            int r0 = r1 + 2
            r9.f77349f = r0     // Catch: java.lang.Throwable -> L7e
            c60.d r0 = new c60.d     // Catch: java.lang.Throwable -> L7e
            r5 = 0
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L46
            long r4 = r2.f77367x     // Catch: java.lang.Throwable -> L43
            long r7 = r2.f77368y     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 >= 0) goto L46
            long r4 = r0.t()     // Catch: java.lang.Throwable -> L43
            long r7 = r0.s()     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 < 0) goto L41
            goto L46
        L41:
            r12 = 0
            goto L47
        L43:
            r0 = move-exception
        L44:
            r10 = r0
            goto L88
        L46:
            r12 = 1
        L47:
            boolean r4 = r0.w()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L56
            java.util.Map<java.lang.Integer, c60.d> r4 = r2.f77346c     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L43
        L56:
            yz.g2 r4 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L43
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            if (r10 != 0) goto L64
            okhttp3.internal.http2.d r10 = r2.A     // Catch: java.lang.Throwable -> L61
            r10.q(r3, r1, r11)     // Catch: java.lang.Throwable -> L61
            goto L6d
        L61:
            r0 = move-exception
        L62:
            r10 = r0
            goto L8d
        L64:
            boolean r3 = r2.f77344a     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L76
            okhttp3.internal.http2.d r3 = r2.A     // Catch: java.lang.Throwable -> L61
            r3.C(r10, r1, r11)     // Catch: java.lang.Throwable -> L61
        L6d:
            monitor-exit(r6)
            if (r12 == 0) goto L75
            okhttp3.internal.http2.d r10 = r2.A
            r10.flush()
        L75:
            return r0
        L76:
            java.lang.String r10 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L61
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L61
            throw r11     // Catch: java.lang.Throwable -> L61
        L7e:
            r0 = move-exception
            r2 = r9
            goto L44
        L81:
            r2 = r9
            okhttp3.internal.http2.ConnectionShutdownException r10 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            r10.<init>()     // Catch: java.lang.Throwable -> L43
            throw r10     // Catch: java.lang.Throwable -> L43
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            throw r10     // Catch: java.lang.Throwable -> L61
        L8a:
            r0 = move-exception
            r2 = r9
            goto L62
        L8d:
            monitor-exit(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.b.F0(int, java.util.List, boolean):c60.d");
    }

    @m80.k
    public final c60.d G0(@m80.k List<c60.a> requestHeaders, boolean z11) throws IOException {
        g0.p(requestHeaders, "requestHeaders");
        return F0(0, requestHeaders, z11);
    }

    public final synchronized int H0() {
        return this.f77346c.size();
    }

    public final void K0(int i11, @m80.k m source, int i12, boolean z11) throws IOException {
        g0.p(source, "source");
        l60.k kVar = new l60.k();
        long j11 = i12;
        source.F(j11);
        source.L3(kVar, j11);
        this.f77353j.n(new e(this.f77347d + '[' + i11 + "] onData", true, this, i11, kVar, i12, z11), 0L);
    }

    public final void L0(int i11, @m80.k List<c60.a> requestHeaders, boolean z11) {
        g0.p(requestHeaders, "requestHeaders");
        this.f77353j.n(new f(this.f77347d + '[' + i11 + "] onHeaders", true, this, i11, requestHeaders, z11), 0L);
    }

    public final void N0(int i11, @m80.k List<c60.a> requestHeaders) {
        Throwable th2;
        g0.p(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.C.contains(Integer.valueOf(i11))) {
                    try {
                        s1(i11, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.C.add(Integer.valueOf(i11));
                this.f77353j.n(new g(this.f77347d + '[' + i11 + "] onRequest", true, this, i11, requestHeaders), 0L);
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    public final void P0(int i11, @m80.k ErrorCode errorCode) {
        g0.p(errorCode, "errorCode");
        this.f77353j.n(new h(this.f77347d + '[' + i11 + "] onReset", true, this, i11, errorCode), 0L);
    }

    @m80.k
    public final c60.d Q0(int i11, @m80.k List<c60.a> requestHeaders, boolean z11) throws IOException {
        g0.p(requestHeaders, "requestHeaders");
        if (this.f77344a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return F0(i11, requestHeaders, z11);
    }

    public final boolean R0(int i11) {
        return i11 != 0 && (i11 & 1) == 0;
    }

    @m80.l
    public final synchronized c60.d W0(int i11) {
        c60.d remove;
        remove = this.f77346c.remove(Integer.valueOf(i11));
        g0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return remove;
    }

    public final void Y0() {
        synchronized (this) {
            long j11 = this.f77359p;
            long j12 = this.f77358o;
            if (j11 < j12) {
                return;
            }
            this.f77358o = j12 + 1;
            this.f77362s = System.nanoTime() + 1000000000;
            g2 g2Var = g2.f100423a;
            this.f77352i.n(new i(this.f77347d + " ping", true, this), 0L);
        }
    }

    public final synchronized void Z() throws InterruptedException {
        while (this.f77361r < this.f77360q) {
            g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    public final void Z0(int i11) {
        this.f77348e = i11;
    }

    public final void a0(@m80.k ErrorCode connectionCode, @m80.k ErrorCode streamCode, @m80.l IOException iOException) {
        int i11;
        Object[] objArr;
        g0.p(connectionCode, "connectionCode");
        g0.p(streamCode, "streamCode");
        if (u50.f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            f1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f77346c.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f77346c.values().toArray(new c60.d[0]);
                    this.f77346c.clear();
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c60.d[] dVarArr = (c60.d[]) objArr;
        if (dVarArr != null) {
            for (c60.d dVar : dVarArr) {
                try {
                    dVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f77369z.close();
        } catch (IOException unused4) {
        }
        this.f77352i.u();
        this.f77353j.u();
        this.f77354k.u();
    }

    public final void a1(int i11) {
        this.f77349f = i11;
    }

    public final void c0(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        a0(errorCode, errorCode, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final boolean d0() {
        return this.f77344a;
    }

    public final void d1(@m80.k c60.g gVar) {
        g0.p(gVar, "<set-?>");
        this.f77364u = gVar;
    }

    public final void e1(@m80.k c60.g settings) throws IOException {
        g0.p(settings, "settings");
        synchronized (this.A) {
            synchronized (this) {
                if (this.f77350g) {
                    throw new ConnectionShutdownException();
                }
                this.f77363t.j(settings);
                g2 g2Var = g2.f100423a;
            }
            this.A.H(settings);
        }
    }

    @m80.k
    public final String f0() {
        return this.f77347d;
    }

    public final void f1(@m80.k ErrorCode statusCode) throws IOException {
        g0.p(statusCode, "statusCode");
        synchronized (this.A) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f77350g) {
                    return;
                }
                this.f77350g = true;
                int i11 = this.f77348e;
                intRef.element = i11;
                g2 g2Var = g2.f100423a;
                this.A.k(i11, statusCode, u50.f.f91846a);
            }
        }
    }

    public final void flush() throws IOException {
        this.A.flush();
    }

    @w00.k
    public final void g1() throws IOException {
        j1(this, false, null, 3, null);
    }

    public final int h0() {
        return this.f77348e;
    }

    @w00.k
    public final void h1(boolean z11) throws IOException {
        j1(this, z11, null, 2, null);
    }

    @m80.k
    public final c i0() {
        return this.f77345b;
    }

    @w00.k
    public final void i1(boolean z11, @m80.k y50.d taskRunner) throws IOException {
        g0.p(taskRunner, "taskRunner");
        if (z11) {
            this.A.c();
            this.A.H(this.f77363t);
            if (this.f77363t.e() != 65535) {
                this.A.I(0, r5 - 65535);
            }
        }
        taskRunner.j().n(new c.b(this.f77347d, true, this.B), 0L);
    }

    public final int k0() {
        return this.f77349f;
    }

    public final synchronized void k1(long j11) {
        long j12 = this.f77365v + j11;
        this.f77365v = j12;
        long j13 = j12 - this.f77366w;
        if (j13 >= this.f77363t.e() / 2) {
            t1(0, j13);
            this.f77366w += j13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.A.r());
        r6 = r2;
        r8.f77367x += r6;
        r4 = yz.g2.f100423a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l1(int r9, boolean r10, @m80.l l60.k r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.d r12 = r8.A
            r12.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f77367x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f77368y     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map<java.lang.Integer, c60.d> r2 = r8.f77346c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.http2.d r4 = r8.A     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.r()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f77367x     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f77367x = r4     // Catch: java.lang.Throwable -> L2f
            yz.g2 r4 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.d r4 = r8.A
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.b.l1(int, boolean, l60.k, long):void");
    }

    @m80.k
    public final c60.g m0() {
        return this.f77363t;
    }

    public final void m1(int i11, boolean z11, @m80.k List<c60.a> alternating) throws IOException {
        g0.p(alternating, "alternating");
        this.A.q(z11, i11, alternating);
    }

    public final void n1() throws InterruptedException {
        synchronized (this) {
            this.f77360q++;
        }
        o1(false, 3, 1330343787);
    }

    @m80.k
    public final c60.g o0() {
        return this.f77364u;
    }

    public final void o1(boolean z11, int i11, int i12) {
        try {
            this.A.w(z11, i11, i12);
        } catch (IOException e11) {
            c0(e11);
        }
    }

    public final void q1() throws InterruptedException {
        n1();
        Z();
    }

    public final void r1(int i11, @m80.k ErrorCode statusCode) throws IOException {
        g0.p(statusCode, "statusCode");
        this.A.E(i11, statusCode);
    }

    public final long s0() {
        return this.f77366w;
    }

    public final void s1(int i11, @m80.k ErrorCode errorCode) {
        g0.p(errorCode, "errorCode");
        this.f77352i.n(new k(this.f77347d + '[' + i11 + "] writeSynReset", true, this, i11, errorCode), 0L);
    }

    public final void t1(int i11, long j11) {
        this.f77352i.n(new l(this.f77347d + '[' + i11 + "] windowUpdate", true, this, i11, j11), 0L);
    }

    public final long v0() {
        return this.f77365v;
    }

    @m80.k
    public final d w0() {
        return this.B;
    }

    @m80.k
    public final Socket x0() {
        return this.f77369z;
    }

    @m80.l
    public final synchronized c60.d y0(int i11) {
        return this.f77346c.get(Integer.valueOf(i11));
    }

    @m80.k
    public final Map<Integer, c60.d> z0() {
        return this.f77346c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class d implements c.InterfaceC0954c, x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final okhttp3.internal.http2.c f77381a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f77382b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n759#2,2:219\n*E\n"})
        public static final class a extends y50.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f77383e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f77384f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z11, b bVar, Ref.ObjectRef objectRef) {
                super(str, z11);
                this.f77383e = bVar;
                this.f77384f = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // y50.a
            public long f() {
                this.f77383e.i0().e(this.f77383e, (c60.g) this.f77384f.element);
                return -1L;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n688#2,5:219\n693#2,2:226\n696#2:231\n402#3,2:224\n404#3,3:228\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n692#1:224,2\n692#1:228,3\n*E\n"})
        /* renamed from: okhttp3.internal.http2.b$d$b, reason: collision with other inner class name */
        public static final class C0952b extends y50.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f77385e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c60.d f77386f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0952b(String str, boolean z11, b bVar, c60.d dVar) {
                super(str, z11);
                this.f77385e = bVar;
                this.f77386f = dVar;
            }

            @Override // y50.a
            public long f() {
                try {
                    this.f77385e.i0().f(this.f77386f);
                    return -1L;
                } catch (IOException e11) {
                    e60.j.f49490a.g().m("Http2Connection.Listener failure for " + this.f77385e.f0(), 4, e11);
                    try {
                        this.f77386f.d(ErrorCode.PROTOCOL_ERROR, e11);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n807#2,2:219\n*E\n"})
        public static final class c extends y50.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f77387e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f77388f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f77389g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z11, b bVar, int i11, int i12) {
                super(str, z11);
                this.f77387e = bVar;
                this.f77388f = i11;
                this.f77389g = i12;
            }

            @Override // y50.a
            public long f() {
                this.f77387e.o1(true, this.f77388f, this.f77389g);
                return -1L;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n716#2,2:219\n*E\n"})
        /* renamed from: okhttp3.internal.http2.b$d$d, reason: collision with other inner class name */
        public static final class C0953d extends y50.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f77390e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ boolean f77391f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ c60.g f77392g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0953d(String str, boolean z11, d dVar, boolean z12, c60.g gVar) {
                super(str, z11);
                this.f77390e = dVar;
                this.f77391f = z12;
                this.f77392g = gVar;
            }

            @Override // y50.a
            public long f() {
                this.f77390e.n(this.f77391f, this.f77392g);
                return -1L;
            }
        }

        public d(@m80.k b bVar, okhttp3.internal.http2.c reader) {
            g0.p(reader, "reader");
            this.f77382b = bVar;
            this.f77381a = reader;
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void a(int i11, int i12, @m80.k List<c60.a> requestHeaders) {
            g0.p(requestHeaders, "requestHeaders");
            this.f77382b.N0(i12, requestHeaders);
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void b(boolean z11, int i11, int i12) {
            if (!z11) {
                this.f77382b.f77352i.n(new c(this.f77382b.f0() + " ping", true, this.f77382b, i11, i12), 0L);
                return;
            }
            b bVar = this.f77382b;
            synchronized (bVar) {
                try {
                    if (i11 == 1) {
                        bVar.f77357n++;
                    } else if (i11 != 2) {
                        if (i11 == 3) {
                            bVar.f77361r++;
                            g0.n(bVar, "null cannot be cast to non-null type java.lang.Object");
                            bVar.notifyAll();
                        }
                        g2 g2Var = g2.f100423a;
                    } else {
                        bVar.f77359p++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void c(int i11, @m80.k ErrorCode errorCode) {
            g0.p(errorCode, "errorCode");
            if (this.f77382b.R0(i11)) {
                this.f77382b.P0(i11, errorCode);
                return;
            }
            c60.d W0 = this.f77382b.W0(i11);
            if (W0 != null) {
                W0.A(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void d(int i11, @m80.k ErrorCode errorCode, @m80.k ByteString debugData) {
            int i12;
            Object[] array;
            g0.p(errorCode, "errorCode");
            g0.p(debugData, "debugData");
            debugData.size();
            b bVar = this.f77382b;
            synchronized (bVar) {
                array = bVar.z0().values().toArray(new c60.d[0]);
                bVar.f77350g = true;
                g2 g2Var = g2.f100423a;
            }
            for (c60.d dVar : (c60.d[]) array) {
                if (dVar.k() > i11 && dVar.v()) {
                    dVar.A(ErrorCode.REFUSED_STREAM);
                    this.f77382b.W0(dVar.k());
                }
            }
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void e(boolean z11, int i11, int i12, @m80.k List<c60.a> headerBlock) {
            g0.p(headerBlock, "headerBlock");
            if (this.f77382b.R0(i11)) {
                this.f77382b.L0(i11, headerBlock, z11);
                return;
            }
            b bVar = this.f77382b;
            synchronized (bVar) {
                c60.d y02 = bVar.y0(i11);
                if (y02 != null) {
                    g2 g2Var = g2.f100423a;
                    y02.z(u50.f.c0(headerBlock), z11);
                    return;
                }
                if (bVar.f77350g) {
                    return;
                }
                if (i11 <= bVar.h0()) {
                    return;
                }
                if (i11 % 2 == bVar.k0() % 2) {
                    return;
                }
                c60.d dVar = new c60.d(i11, bVar, false, z11, u50.f.c0(headerBlock));
                bVar.Z0(i11);
                bVar.z0().put(Integer.valueOf(i11), dVar);
                bVar.f77351h.j().n(new C0952b(bVar.f0() + '[' + i11 + "] onStream", true, bVar, dVar), 0L);
            }
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void f(int i11, long j11) {
            if (i11 == 0) {
                b bVar = this.f77382b;
                synchronized (bVar) {
                    bVar.f77368y = bVar.A0() + j11;
                    g0.n(bVar, "null cannot be cast to non-null type java.lang.Object");
                    bVar.notifyAll();
                    g2 g2Var = g2.f100423a;
                }
                return;
            }
            c60.d y02 = this.f77382b.y0(i11);
            if (y02 != null) {
                synchronized (y02) {
                    y02.a(j11);
                    g2 g2Var2 = g2.f100423a;
                }
            }
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void i(int i11, @m80.k String origin, @m80.k ByteString protocol, @m80.k String host, int i12, long j11) {
            g0.p(origin, "origin");
            g0.p(protocol, "protocol");
            g0.p(host, "host");
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            p();
            return g2.f100423a;
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void k(boolean z11, int i11, @m80.k m source, int i12) throws IOException {
            g0.p(source, "source");
            if (this.f77382b.R0(i11)) {
                this.f77382b.K0(i11, source, i12, z11);
                return;
            }
            c60.d y02 = this.f77382b.y0(i11);
            if (y02 == null) {
                this.f77382b.s1(i11, ErrorCode.PROTOCOL_ERROR);
                long j11 = i12;
                this.f77382b.k1(j11);
                source.skip(j11);
                return;
            }
            y02.y(source, i12);
            if (z11) {
                y02.z(u50.f.f91847b, true);
            }
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void l(boolean z11, @m80.k c60.g settings) {
            g0.p(settings, "settings");
            this.f77382b.f77352i.n(new C0953d(this.f77382b.f0() + " applyAndAckSettings", true, this, z11, settings), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, c60.g] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void n(boolean z11, @m80.k c60.g settings) {
            ?? r13;
            long e11;
            int i11;
            c60.d[] dVarArr;
            g0.p(settings, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            okhttp3.internal.http2.d D0 = this.f77382b.D0();
            b bVar = this.f77382b;
            synchronized (D0) {
                synchronized (bVar) {
                    try {
                        c60.g o02 = bVar.o0();
                        if (z11) {
                            r13 = settings;
                        } else {
                            c60.g gVar = new c60.g();
                            gVar.j(o02);
                            gVar.j(settings);
                            r13 = gVar;
                        }
                        objectRef.element = r13;
                        e11 = r13.e() - o02.e();
                        if (e11 != 0 && !bVar.z0().isEmpty()) {
                            dVarArr = (c60.d[]) bVar.z0().values().toArray(new c60.d[0]);
                            bVar.d1((c60.g) objectRef.element);
                            bVar.f77354k.n(new a(bVar.f0() + " onSettings", true, bVar, objectRef), 0L);
                            g2 g2Var = g2.f100423a;
                        }
                        dVarArr = null;
                        bVar.d1((c60.g) objectRef.element);
                        bVar.f77354k.n(new a(bVar.f0() + " onSettings", true, bVar, objectRef), 0L);
                        g2 g2Var2 = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    bVar.D0().a((c60.g) objectRef.element);
                } catch (IOException e12) {
                    bVar.c0(e12);
                }
                g2 g2Var3 = g2.f100423a;
            }
            if (dVarArr != null) {
                for (c60.d dVar : dVarArr) {
                    synchronized (dVar) {
                        dVar.a(e11);
                        g2 g2Var4 = g2.f100423a;
                    }
                }
            }
        }

        @m80.k
        public final okhttp3.internal.http2.c o() {
            return this.f77381a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.c] */
        public void p() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e11 = null;
            try {
                try {
                    this.f77381a.e(this);
                    while (this.f77381a.c(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f77382b.a0(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e12) {
                        e11 = e12;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        b bVar = this.f77382b;
                        bVar.a0(errorCode4, errorCode4, e11);
                        errorCode = bVar;
                        errorCode2 = this.f77381a;
                        u50.f.o(errorCode2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f77382b.a0(errorCode, errorCode2, e11);
                    u50.f.o(this.f77381a);
                    throw th;
                }
            } catch (IOException e13) {
                e11 = e13;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                this.f77382b.a0(errorCode, errorCode2, e11);
                u50.f.o(this.f77381a);
                throw th;
            }
            errorCode2 = this.f77381a;
            u50.f.o(errorCode2);
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void j() {
        }

        @Override // okhttp3.internal.http2.c.InterfaceC0954c
        public void m(int i11, int i12, int i13, boolean z11) {
        }
    }
}
