package ys;

import com.microsoft.thrifty.ThriftException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import ws.h;
import ws.i;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f100299a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.microsoft.thrifty.service.server.DefaultErrorHandler$onError$2", f = "ErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ys.a$a, reason: collision with other inner class name */
    public static final class C1371a extends SuspendLambda implements p<i, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100300a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f100301b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f100302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1371a(h hVar, i iVar, j00.c<? super C1371a> cVar) {
            super(2, cVar);
            this.f100301b = hVar;
            this.f100302c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new C1371a(this.f100301b, this.f100302c, cVar);
        }

        @Override // x00.p
        @l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k i iVar, @l j00.c<? super g2> cVar) {
            return ((C1371a) create(iVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f100300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            new ThriftException(ThriftException.Kind.INTERNAL_ERROR, "Internal error processing " + this.f100301b.f96844c).write(this.f100302c);
            return g2.f100423a;
        }
    }

    @Override // ys.b
    @l
    public Object a(@k Throwable th2, @k h hVar, @k i iVar, @k i iVar2, boolean z11, @k j00.c<? super g2> cVar) {
        if (z11) {
            return g2.f100423a;
        }
        Object b11 = e.b(hVar, iVar2, (byte) 3, new C1371a(hVar, iVar2, null), cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
