package e40;

import c40.c1;
import c40.y1;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface k0<E> {
    @m80.l
    Object H(@m80.k j00.c<? super E> cVar);

    @m80.l
    @o00.i
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @w0(expression = "receiveCatching().getOrNull()", imports = {}))
    Object J(@m80.k j00.c<? super E> cVar);

    @m80.k
    k40.h<s<E>> K();

    @m80.k
    k40.h<E> M();

    @m80.l
    Object N(@m80.k j00.c<? super s<? extends E>> cVar);

    @m80.k
    Object O();

    boolean P();

    @m80.k
    k40.h<E> Q();

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th2);

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@m80.l CancellationException cancellationException);

    boolean isEmpty();

    @m80.k
    q<E> iterator();

    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @w0(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {com.badlogic.gdx.graphics.f.f11653r}, m = "receiveOrNull", n = {}, s = {})
        /* renamed from: e40.k0$a$a, reason: collision with other inner class name */
        public static final class C0590a<E> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f49058a;

            /* renamed from: b, reason: collision with root package name */
            public int f49059b;

            public C0590a(j00.c<? super C0590a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f49058a = obj;
                this.f49059b |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(k0 k0Var, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            k0Var.cancel(cancellationException);
        }

        public static /* synthetic */ boolean c(k0 k0Var, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return k0Var.a(th2);
        }

        @m80.k
        public static <E> k40.h<E> d(@m80.k k0<? extends E> k0Var) {
            kotlin.jvm.internal.g0.n(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((m) k0Var).M();
        }

        @m80.l
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @w0(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E h(@m80.k k0<? extends E> k0Var) {
            Object O = k0Var.O();
            if (s.m(O)) {
                return (E) s.i(O);
            }
            Throwable f11 = s.f(O);
            if (f11 == null) {
                return null;
            }
            throw h40.w0.m(f11);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @m80.l
        @o00.i
        @yz.n(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @yz.w0(expression = "receiveCatching().getOrNull()", imports = {}))
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object i(@m80.k e40.k0<? extends E> r4, @m80.k j00.c<? super E> r5) {
            /*
                boolean r0 = r5 instanceof e40.k0.a.C0590a
                if (r0 == 0) goto L13
                r0 = r5
                e40.k0$a$a r0 = (e40.k0.a.C0590a) r0
                int r1 = r0.f49059b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f49059b = r1
                goto L18
            L13:
                e40.k0$a$a r0 = new e40.k0$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f49058a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f49059b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlin.e.n(r5)
                e40.s r5 = (e40.s) r5
                java.lang.Object r4 = r5.o()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.e.n(r5)
                r0.f49059b = r3
                java.lang.Object r4 = r4.N(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = e40.s.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e40.k0.a.i(e40.k0, j00.c):java.lang.Object");
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @w0(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @c1
        public static /* synthetic */ void f() {
        }

        @y1
        public static /* synthetic */ void g() {
        }
    }
}
