package u4;

import c4.o;
import c40.l2;
import c40.r0;
import c40.s0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l3.m;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2 f91739a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f91740b;

        public a(l2 l2Var, String str) {
            this.f91739a = l2Var;
            this.f91740b = str;
        }

        @Override // l3.m
        public void close() {
            l2.a.b(this.f91739a, null, 1, null);
            z6.b.j(z6.b.f101032b, this.f91740b, "iOSObserve: closing", null, 4, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.base.IOSObserveKt$iOSObserve$job$1", f = "IOSObserve.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f91741a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i<T> f91742b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f91743c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<T, g2> f91744d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> implements j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f91745a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<T, g2> f91746b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, l<? super T, g2> lVar) {
                this.f91745a = str;
                this.f91746b = lVar;
            }

            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t11, j00.c<? super g2> cVar) {
                z6.b.j(z6.b.f101032b, this.f91745a, "iOSObserve: collecting " + t11, null, 4, null);
                this.f91746b.invoke(t11);
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, String str, l<? super T, g2> lVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f91742b = iVar;
            this.f91743c = str;
            this.f91744d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f91742b, this.f91743c, this.f91744d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f91741a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i<T> iVar = this.f91742b;
                a aVar = new a(this.f91743c, this.f91744d);
                this.f91741a = 1;
                if (iVar.collect(aVar, this) == l11) {
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

    @k
    public static final <T> m a(@k l<? super T, g2> onValue, @k i<? extends T> flow, @k String tag) {
        l2 f11;
        g0.p(onValue, "onValue");
        g0.p(flow, "flow");
        g0.p(tag, "tag");
        z6.b.j(z6.b.f101032b, tag, "iOSObserve: starting", null, 4, null);
        f11 = c40.k.f(s0.a(o.c()), null, null, new b(flow, tag, onValue, null), 3, null);
        return new a(f11, tag);
    }
}
