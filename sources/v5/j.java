package v5;

import c4.o;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import oa0.r;
import okio.f;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {e.class})
/* loaded from: classes3.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c4.k f93015a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final okio.b f93016b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f93017c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.MediaResourceRepoImpl$clean$2", f = "MediaFileRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f93018a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f93018a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            j.this.f93016b.a0(f.a.h(okio.f.f77539b, j.this.g(), false, 1, null));
            return g2.f100423a;
        }
    }

    public j(@m80.k c4.k context, @m80.k okio.b fileSystem) {
        g0.p(context, "context");
        g0.p(fileSystem, "fileSystem");
        this.f93015a = context;
        this.f93016b = fileSystem;
        this.f93017c = e0.c(new x00.a() { // from class: v5.i
            @Override // x00.a
            public final Object invoke() {
                String i11;
                i11 = j.i(j.this);
                return i11;
            }
        });
    }

    public static final String i(j jVar) {
        return jVar.f93015a.n() + okio.f.f77540c + "resource";
    }

    @Override // v5.e
    @m80.l
    public Object a(@m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new a(null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // v5.e
    @m80.l
    public Object b(@m80.k String str, @m80.k j00.c<? super Boolean> cVar) {
        boolean z11 = false;
        okio.f h11 = f.a.h(okio.f.f77539b, h(str), false, 1, null);
        if (this.f93016b.f0(h11) && this.f93016b.v0(h11).k()) {
            z11 = true;
        }
        return l00.a.a(z11);
    }

    @Override // v5.e
    @m80.l
    public Object c(@m80.k String str, @m80.k j00.c<? super String> cVar) {
        return h(str);
    }

    public final String g() {
        return (String) this.f93017c.getValue();
    }

    public final String h(String str) {
        String d11;
        String e11;
        String d12;
        d11 = h.d(str);
        e11 = h.e(d11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g());
        String str2 = okio.f.f77540c;
        sb2.append(str2);
        sb2.append(e11);
        sb2.append(str2);
        d12 = h.d(str);
        sb2.append(d12);
        return sb2.toString();
    }
}
