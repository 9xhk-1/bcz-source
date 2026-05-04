package h4;

import f4.v;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.e;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {c.class})
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final v3.b f58180a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.base.db.BczDbProvider$getBczDb$2", f = "BczDbProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: h4.a$a, reason: collision with other inner class name */
    public static final class C0657a extends SuspendLambda implements p<e, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f58181a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f58182b;

        public C0657a(j00.c<? super C0657a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C0657a c0657a = new C0657a(cVar);
            c0657a.f58182b = obj;
            return c0657a;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, j00.c<? super v> cVar) {
            return ((C0657a) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e eVar = (e) this.f58182b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f58181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return v.f50838c.b(eVar);
        }
    }

    public a(@k v3.b dbPoll) {
        g0.p(dbPoll, "dbPoll");
        this.f58180a = dbPoll;
    }

    @Override // h4.c
    @l
    public Object a(@k j00.c<? super v> cVar) {
        return this.f58180a.a(v.f50838c.a(), b.f58183a, true, new C0657a(null), cVar);
    }
}
