package xw;

import c40.b2;
import c40.h1;
import io.ktor.utils.io.m0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.ObservingUtilsKt", f = "ObservingUtils.kt", i = {0, 0, 1, 3}, l = {14, 15, 31, 33}, m = "observe", n = {"$this$observe", "log", "$this$observe", "$this$observe"}, s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98456a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98457b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98458c;

        /* renamed from: d, reason: collision with root package name */
        public int f98459d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98458c = obj;
            this.f98459d |= Integer.MIN_VALUE;
            return p.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", f = "ObservingUtils.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98460a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98461b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v.f f98462c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v.f fVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f98462c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f98462c, cVar);
            bVar.f98461b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((b) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98460a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m0 m0Var = (m0) this.f98461b;
                v.f fVar = this.f98462c;
                io.ktor.utils.io.m a11 = m0Var.a();
                this.f98460a = 1;
                if (fVar.m(a11, this) == l11) {
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if (r12 == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k mx.v r10, @m80.k io.ktor.utils.io.m r11, @m80.k j00.c<? super mx.v> r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw.p.a(mx.v, io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    public static final io.ktor.utils.io.g b(v.f fVar) {
        return io.ktor.utils.io.q.E(b2.f7824a, h1.a(), false, new b(fVar, null), 2, null).b();
    }
}
