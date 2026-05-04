package u4;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.base.LogFlowExtKt$log$1", f = "LogFlowExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a<T> extends SuspendLambda implements p<T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f91747a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91748b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f91749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f91749c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f91749c, cVar);
            aVar.f91748b = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t11, j00.c<? super g2> cVar) {
            return ((a) create(t11, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f91748b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f91747a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            z6.b.d(z6.b.f101032b, "LogFlow", '[' + this.f91749c + "]: " + obj2, null, 4, null);
            return g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, j00.c<? super g2> cVar) {
            return invoke2((a<T>) obj, cVar);
        }
    }

    @k
    public static final <T> i<T> a(@k i<? extends T> iVar, @k String tag) {
        g0.p(iVar, "<this>");
        g0.p(tag, "tag");
        return kotlinx.coroutines.flow.k.h1(iVar, new a(tag, null));
    }
}
