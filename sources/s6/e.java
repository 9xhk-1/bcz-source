package s6;

import c40.r0;
import c40.s0;
import c40.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i f87918a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c f87919b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.ReconcileCurBookUC$invoke$2", f = "ReconcileCurBookUC.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {23}, m = "invokeSuspend", n = {"$this$coroutineScope", p5.r.f79134i, "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-ReconcileCurBookUC$invoke$2$3"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nReconcileCurBookUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReconcileCurBookUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/ReconcileCurBookUC$invoke$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1869#2,2:33\n*S KotlinDebug\n*F\n+ 1 ReconcileCurBookUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/ReconcileCurBookUC$invoke$2\n*L\n23#1:33,2\n*E\n"})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f87920a;

        /* renamed from: b, reason: collision with root package name */
        public Object f87921b;

        /* renamed from: c, reason: collision with root package name */
        public Object f87922c;

        /* renamed from: d, reason: collision with root package name */
        public Object f87923d;

        /* renamed from: e, reason: collision with root package name */
        public Object f87924e;

        /* renamed from: f, reason: collision with root package name */
        public int f87925f;

        /* renamed from: g, reason: collision with root package name */
        public int f87926g;

        /* renamed from: h, reason: collision with root package name */
        public int f87927h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f87928i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f87929j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f87930k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f87931l;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.ReconcileCurBookUC$invoke$2$1", f = "ReconcileCurBookUC.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: s6.e$a$a, reason: collision with other inner class name */
        public static final class C1147a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f87932a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f87933b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f87934c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1147a(e eVar, long j11, j00.c<? super C1147a> cVar) {
                super(2, cVar);
                this.f87933b = eVar;
                this.f87934c = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C1147a(this.f87933b, this.f87934c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C1147a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87932a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    i iVar = this.f87933b.f87918a;
                    long j11 = this.f87934c;
                    this.f87932a = 1;
                    if (iVar.d(j11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.ReconcileCurBookUC$invoke$2$2", f = "ReconcileCurBookUC.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f87935a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f87936b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f87937c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, long j11, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f87936b = eVar;
                this.f87937c = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f87936b, this.f87937c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87935a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c cVar = this.f87936b.f87919b;
                    long j11 = this.f87937c;
                    this.f87935a = 1;
                    if (cVar.c(j11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, long j12, e eVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f87929j = j11;
            this.f87930k = j12;
            this.f87931l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f87929j, this.f87930k, this.f87931l, cVar);
            aVar.f87928i = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            Iterator it;
            int i11;
            Iterable iterable;
            Iterable iterable2;
            x0 b12;
            r0 r0Var = (r0) this.f87928i;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f87927h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                z6.b.j(z6.b.f101032b, f.f87938a, "ReconcileCurBookUC: localBookId=" + this.f87929j + ", remoteBookId=" + this.f87930k, null, 4, null);
                ArrayList arrayList = new ArrayList();
                long j11 = this.f87929j;
                if (j11 != -1) {
                    b12 = c40.k.b(r0Var, null, null, new C1147a(this.f87931l, j11, null), 3, null);
                    arrayList.add(b12);
                }
                b11 = c40.k.b(r0Var, null, null, new b(this.f87931l, this.f87930k, null), 3, null);
                arrayList.add(b11);
                it = arrayList.iterator();
                i11 = 0;
                iterable = arrayList;
                iterable2 = iterable;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f87925f;
                it = (Iterator) this.f87922c;
                iterable = (Iterable) this.f87921b;
                iterable2 = (List) this.f87920a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                x0 x0Var = (x0) next;
                this.f87928i = l00.k.a(r0Var);
                this.f87920a = l00.k.a(iterable2);
                this.f87921b = l00.k.a(iterable);
                this.f87922c = it;
                this.f87923d = l00.k.a(next);
                this.f87924e = l00.k.a(x0Var);
                this.f87925f = i11;
                this.f87926g = 0;
                this.f87927h = 1;
                if (x0Var.i(this) == l11) {
                    return l11;
                }
            }
            z6.b.j(z6.b.f101032b, f.f87938a, "ReconcileCurBookUC: success localBookId=" + this.f87929j + ", remoteBookId=" + this.f87930k, null, 4, null);
            return g2.f100423a;
        }
    }

    public e(@m80.k i syncWordsDataUC, @m80.k c checkUpdateWordsDataUC) {
        g0.p(syncWordsDataUC, "syncWordsDataUC");
        g0.p(checkUpdateWordsDataUC, "checkUpdateWordsDataUC");
        this.f87918a = syncWordsDataUC;
        this.f87919b = checkUpdateWordsDataUC;
    }

    @m80.l
    public final Object c(long j11, long j12, @m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new a(j11, j12, this, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
