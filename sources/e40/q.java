package e40;

import ix.l1;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface q<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {1092}, m = l1.b.f62938h, n = {"$this"}, s = {"L$0"})
        /* renamed from: e40.q$a$a, reason: collision with other inner class name */
        public static final class C0592a<E> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f49158a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f49159b;

            /* renamed from: c, reason: collision with root package name */
            public int f49160c;

            public C0592a(j00.c<? super C0592a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f49159b = obj;
                this.f49160c |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @w00.j(name = ix.l1.b.f62938h)
        @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(e40.q r4, j00.c r5) {
            /*
                boolean r0 = r5 instanceof e40.q.a.C0592a
                if (r0 == 0) goto L13
                r0 = r5
                e40.q$a$a r0 = (e40.q.a.C0592a) r0
                int r1 = r0.f49160c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f49160c = r1
                goto L18
            L13:
                e40.q$a$a r0 = new e40.q$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f49159b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f49160c
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f49158a
                e40.q r4 = (e40.q) r4
                kotlin.e.n(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.e.n(r5)
                r0.f49158a = r4
                r0.f49160c = r3
                java.lang.Object r5 = r4.a(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                kotlinx.coroutines.channels.ClosedReceiveChannelException r4 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e40.q.a.a(e40.q, j00.c):java.lang.Object");
        }
    }

    @m80.l
    Object a(@m80.k j00.c<? super Boolean> cVar);

    @w00.j(name = l1.b.f62938h)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object c(j00.c cVar);

    E next();
}
