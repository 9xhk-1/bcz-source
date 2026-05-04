package cz;

import c40.i;
import c40.r0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextUtils.kt\nio/ktor/util/debug/ContextUtilsKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,48:1\n326#2:49\n326#2:50\n326#2:51\n*S KotlinDebug\n*F\n+ 1 ContextUtils.kt\nio/ktor/util/debug/ContextUtilsKt\n*L\n19#1:49\n32#1:50\n46#1:51\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2", f = "ContextUtils.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: cz.a$a, reason: collision with other inner class name */
    public static final class C0543a<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46979a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<j00.c<? super T>, Object> f46980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0543a(l<? super j00.c<? super T>, ? extends Object> lVar, j00.c<? super C0543a> cVar) {
            super(2, cVar);
            this.f46980b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new C0543a(this.f46980b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((C0543a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46979a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                return obj;
            }
            e.n(obj);
            l<j00.c<? super T>, Object> lVar = this.f46980b;
            this.f46979a = 1;
            Object invoke = lVar.invoke(this);
            return invoke == l11 ? l11 : invoke;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2", f = "ContextUtils.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<j00.c<? super T>, Object> f46982b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super j00.c<? super T>, ? extends Object> lVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f46982b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f46982b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46981a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                return obj;
            }
            e.n(obj);
            l<j00.c<? super T>, Object> lVar = this.f46982b;
            this.f46981a = 1;
            Object invoke = lVar.invoke(this);
            return invoke == l11 ? l11 : invoke;
        }
    }

    @m80.l
    public static final <T> Object a(@k String str, @k l<? super j00.c<? super T>, ? extends Object> lVar, @k j00.c<? super T> cVar) {
        return !c.f46983a.b() ? lVar.invoke(cVar) : i.h(cVar.getContext().plus(new dz.a(str)), new C0543a(lVar, null), cVar);
    }

    @m80.l
    public static final <T> Object b(@k l<? super j00.c<? super T>, ? extends Object> lVar, @k j00.c<? super T> cVar) {
        return !c.f46983a.b() ? lVar.invoke(cVar) : i.h(cVar.getContext().plus(new dz.b(null, 1, null)), new b(lVar, null), cVar);
    }

    @m80.l
    public static final <Element extends d.b> Object c(@k d.c<Element> cVar, @k l<? super Element, g2> lVar, @k j00.c<? super g2> cVar2) {
        if (!c.f46983a.b()) {
            return g2.f100423a;
        }
        d.b bVar = cVar2.getContext().get(cVar);
        if (bVar != null) {
            lVar.invoke(bVar);
        }
        return g2.f100423a;
    }
}
