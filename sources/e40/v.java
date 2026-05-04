package e40;

import c40.r0;
import e40.s;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n1009#2,2:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,2\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class v {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f49168a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0<Object> f49169b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f49170c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0<Object> l0Var, Object obj, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f49169b = l0Var;
            this.f49170c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f49169b, this.f49170c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f49168a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l0<Object> l0Var = this.f49169b;
                Object obj2 = this.f49170c;
                this.f49168a = 1;
                if (l0Var.b(obj2, this) == l11) {
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
    @l00.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super s<? extends g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f49171a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49172b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0<E> f49173c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ E f49174d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l0<? super E> l0Var, E e11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f49173c = l0Var;
            this.f49174d = e11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f49173c, this.f49174d, cVar);
            bVar.f49172b = obj;
            return bVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super s<g2>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f49171a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    l0<E> l0Var = this.f49173c;
                    E e11 = this.f49174d;
                    Result.a aVar = Result.Companion;
                    this.f49171a = 1;
                    if (l0Var.b(e11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            return s.b(Result.m6315isSuccessimpl(m6308constructorimpl) ? s.f49161b.c(g2.f100423a) : s.f49161b.a(Result.m6311exceptionOrNullimpl(m6308constructorimpl)));
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super s<? extends g2>> cVar) {
            return invoke2(r0Var, (j00.c<? super s<g2>>) cVar);
        }
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @w0(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void a(l0 l0Var, Object obj) {
        if (s.m(l0Var.m(obj))) {
            return;
        }
        c40.j.b(null, new a(l0Var, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <E> Object b(@m80.k l0<? super E> l0Var, E e11) {
        Object b11;
        Object m11 = l0Var.m(e11);
        if (m11 instanceof s.c) {
            b11 = c40.j.b(null, new b(l0Var, e11, null), 1, null);
            return ((s) b11).o();
        }
        return s.f49161b.c(g2.f100423a);
    }
}
