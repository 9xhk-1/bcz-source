package ga;

import com.baicizhan.client.business.okhttp.DnsMgr;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.u0;
import m80.k;
import rb.e;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkhttpconfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Okhttpconfig.kt\ncom/baicizhan/client/business/okhttp/OkhttpconfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final t50.k f53517a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final e.b f53518b;

    static {
        t50.k kVar = new t50.k(new ThreadPoolExecutor(0, 20, 60L, TimeUnit.SECONDS, new SynchronousQueue(), u50.f.Y("okhttp Dispatcher", false)));
        kVar.s(10);
        f53517a = kVar;
        f53518b = new e.b() { // from class: ga.c
            @Override // rb.e.b
            public final q.a create() {
                q.a d11;
                d11 = d.d();
                return d11;
            }
        };
    }

    @k
    public static final t50.k b() {
        return f53517a;
    }

    @k
    public static final e.b c() {
        return f53518b;
    }

    public static final q.a d() {
        q.a aVar = new q.a();
        aVar.r(la.f.f70832a.e());
        aVar.p(f53517a);
        e.f53519a.b(aVar);
        aVar.q(DnsMgr.f16538a.c());
        return aVar;
    }
}
