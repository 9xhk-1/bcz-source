package o7;

import c4.o;
import c40.l3;
import c40.r0;
import c40.s0;
import j8.i;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import n7.g;
import oa0.r;
import u30.f0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {c.class})
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f76333a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r0 f76334b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public List<String> f76335c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.userbasicinfo.cdn.CdnDomainRepo$1", f = "CdnDomainRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: o7.a$a, reason: collision with other inner class name */
    public static final class C0931a extends SuspendLambda implements p<i, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f76336a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f76337b;

        public C0931a(j00.c<? super C0931a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C0931a c0931a = a.this.new C0931a(cVar);
            c0931a.f76337b = obj;
            return c0931a;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i iVar, j00.c<? super g2> cVar) {
            return ((C0931a) create(iVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f76337b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f76336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            a.this.f76335c = iVar.f63808a;
            return g2.f100423a;
        }
    }

    public a(@k g check) {
        g0.p(check, "check");
        this.f76333a = check;
        r0 a11 = s0.a(o.b().plus(l3.c(null, 1, null)));
        this.f76334b = a11;
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.v0(check.getState()), new C0931a(null)), a11);
    }

    @Override // o7.c
    @k
    public String a(@k String path) {
        g0.p(path, "path");
        if (!f0.J2(path, "/", false, 2, null)) {
            path = '/' + path;
        }
        List<String> list = this.f76335c;
        if (list == null || list.isEmpty()) {
            return b.f76339a + path;
        }
        StringBuilder sb2 = new StringBuilder();
        List<String> list2 = this.f76335c;
        g0.m(list2);
        sb2.append(list2.get(0));
        sb2.append(path);
        return sb2.toString();
    }
}
