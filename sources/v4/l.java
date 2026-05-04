package v4;

import k3.u2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c
@u0({"SMAP\nSentenceHomeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceHomeStore.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/state/SentenceHomeStore\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,29:1\n116#2,11:30\n*S KotlinDebug\n*F\n+ 1 SentenceHomeStore.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/state/SentenceHomeStore\n*L\n22#1:30,11\n*E\n"})
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f92953a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y<u2> f92954b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m0<u2> f92955c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f92956d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.state.SentenceHomeStore", f = "SentenceHomeStore.kt", i = {0, 0, 0}, l = {35}, m = "dispatch", n = {"action", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92957a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92958b;

        /* renamed from: c, reason: collision with root package name */
        public int f92959c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f92960d;

        /* renamed from: f, reason: collision with root package name */
        public int f92962f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92960d = obj;
            this.f92962f |= Integer.MIN_VALUE;
            return l.this.a(null, this);
        }
    }

    public l(@m80.k c reducer) {
        g0.p(reducer, "reducer");
        this.f92953a = reducer;
        y<u2> a11 = o0.a(new u2.c(0, 1, null));
        this.f92954b = a11;
        this.f92955c = a11;
        this.f92956d = n40.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:11:0x006c, B:13:0x0086, B:14:0x008f), top: B:10:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k v4.a r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof v4.l.a
            if (r0 == 0) goto L13
            r0 = r13
            v4.l$a r0 = (v4.l.a) r0
            int r1 = r0.f92962f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92962f = r1
            goto L18
        L13:
            v4.l$a r0 = new v4.l$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f92960d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92962f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r12 = r0.f92958b
            n40.a r12 = (n40.a) r12
            java.lang.Object r0 = r0.f92957a
            v4.a r0 = (v4.a) r0
            kotlin.e.n(r13)
            r13 = r12
            r12 = r0
            goto L6c
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            kotlin.e.n(r13)
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "dispatch action: "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r7 = r13.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "SentenceHomeStore"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            n40.a r13 = r11.f92956d
            r0.f92957a = r12
            r0.f92958b = r13
            r2 = 0
            r0.f92959c = r2
            r0.f92962f = r3
            java.lang.Object r0 = r13.lock(r4, r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            v4.c r0 = r11.f92953a     // Catch: java.lang.Throwable -> L8c
            kotlinx.coroutines.flow.y<k3.u2> r1 = r11.f92954b     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L8c
            k3.u2 r1 = (k3.u2) r1     // Catch: java.lang.Throwable -> L8c
            k3.u2 r12 = r0.a(r1, r12)     // Catch: java.lang.Throwable -> L8c
            kotlinx.coroutines.flow.y<k3.u2> r0 = r11.f92954b     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8c
            boolean r0 = kotlin.jvm.internal.g0.g(r12, r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L8f
            kotlinx.coroutines.flow.y<k3.u2> r0 = r11.f92954b     // Catch: java.lang.Throwable -> L8c
            r0.setValue(r12)     // Catch: java.lang.Throwable -> L8c
            goto L8f
        L8c:
            r0 = move-exception
            r12 = r0
            goto L95
        L8f:
            yz.g2 r12 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L8c
            r13.unlock(r4)
            return r12
        L95:
            r13.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.l.a(v4.a, j00.c):java.lang.Object");
    }

    @m80.k
    public final m0<u2> b() {
        return this.f92955c;
    }
}
