package kh;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kh.c;
import kotlin.jvm.internal.g0;
import lb0.z;
import m80.k;
import mb0.h;
import okhttp3.j;
import okhttp3.k;
import okhttp3.m;
import retrofit2.HttpException;
import rf.j;
import rx.c;
import t50.i;
import t50.q;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f66526a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f66527b = "https://asr.baicizhan.com/";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static f f66528c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static e f66529d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static d f66530e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f66531f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 2)
    public static final class a<R> implements c.InterfaceC1074c<R, R> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f66532a = 0;

        public static final g2 j(Throwable th2) {
            return th2 instanceof HttpException ? g2.f100423a : g2.f100423a;
        }

        public static final void l(l lVar, Object obj) {
            lVar.invoke(obj);
        }

        @Override // wb0.p
        @m80.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public rx.c<R> call(@m80.l rx.c<R> cVar) {
            rx.c<R> w52;
            rx.c<R> K6;
            rx.c<R> I3;
            if (cVar == null || (w52 = cVar.w5(bc0.c.e())) == null || (K6 = w52.K6(bc0.c.e())) == null || (I3 = K6.I3(tb0.a.a())) == null) {
                return null;
            }
            final l lVar = new l() { // from class: kh.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 j11;
                    j11 = c.a.j((Throwable) obj);
                    return j11;
                }
            };
            return I3.K1(new wb0.b() { // from class: kh.b
                @Override // wb0.b
                public final void call(Object obj) {
                    c.a.l(l.this, obj);
                }
            });
        }
    }

    static {
        q.a aVar = new q.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        q f11 = aVar.k(10L, timeUnit).j0(10L, timeUnit).R0(10L, timeUnit).o(i.f89616b).p(ga.d.b()).f();
        Object g11 = new z.b().j(f11).c(f66527b).b(nb0.a.f()).a(h.d()).f().g(f.class);
        g0.o(g11, "create(...)");
        f66528c = (f) g11;
        Object g12 = new z.b().j(f11).c(f66527b).b(nb0.a.f()).a(h.d()).f().g(e.class);
        g0.o(g12, "create(...)");
        f66529d = (e) g12;
        Object g13 = new z.b().c(f66527b).j(f11).b(nb0.a.f()).a(h.d()).f().g(d.class);
        g0.o(g13, "create(...)");
        f66530e = (d) g13;
        f66531f = 8;
    }

    @k
    public final rx.c<j> a(@k String queryId) {
        g0.p(queryId, "queryId");
        rx.c s02 = f66530e.a(queryId).s0(new a());
        g0.o(s02, "compose(...)");
        return s02;
    }

    @k
    public final rx.c<j> b(@k String token, @k String logicId, @k String transcript, @k File audio) {
        g0.p(token, "token");
        g0.p(logicId, "logicId");
        g0.p(transcript, "transcript");
        g0.p(audio, "audio");
        m.a aVar = m.f77487a;
        j.a aVar2 = okhttp3.j.f77447e;
        rx.c s02 = f66529d.a(aVar.b(token, aVar2.d("multipart/form-data")), aVar.b(logicId, aVar2.d("multipart/form-data")), aVar.b(transcript, aVar2.d("multipart/form-data")), k.c.f77473c.d("audio", audio.getName(), aVar.a(audio, aVar2.d("audio/aac")))).s0(new a());
        g0.o(s02, "compose(...)");
        return s02;
    }

    @m80.k
    public final rx.c<rf.l> c(@m80.k String deviceId, int i11) {
        g0.p(deviceId, "deviceId");
        rx.c s02 = f66528c.a(deviceId, i11).s0(new a());
        g0.o(s02, "compose(...)");
        return s02;
    }
}
