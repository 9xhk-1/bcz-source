package y4;

import k3.o4;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c
@u0({"SMAP\nWordsHomeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordsHomeStore.kt\ncom/baicizhan/app/biz/game/impl/home/words/state/WordsHomeStore\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,27:1\n116#2,11:28\n*S KotlinDebug\n*F\n+ 1 WordsHomeStore.kt\ncom/baicizhan/app/biz/game/impl/home/words/state/WordsHomeStore\n*L\n20#1:28,11\n*E\n"})
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f99274a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y<o4> f99275b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m0<o4> f99276c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f99277d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.state.WordsHomeStore", f = "WordsHomeStore.kt", i = {0, 0, 0}, l = {33}, m = "dispatch", n = {"action", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f99278a;

        /* renamed from: b, reason: collision with root package name */
        public Object f99279b;

        /* renamed from: c, reason: collision with root package name */
        public int f99280c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f99281d;

        /* renamed from: f, reason: collision with root package name */
        public int f99283f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f99281d = obj;
            this.f99283f |= Integer.MIN_VALUE;
            return o.this.a(null, this);
        }
    }

    public o(@m80.k c reducer) {
        g0.p(reducer, "reducer");
        this.f99274a = reducer;
        y<o4> a11 = o0.a(new o4.c(0, 1, null));
        this.f99275b = a11;
        this.f99276c = a11;
        this.f99277d = n40.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x0051, B:13:0x006b, B:14:0x0073), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k y4.a r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof y4.o.a
            if (r0 == 0) goto L13
            r0 = r7
            y4.o$a r0 = (y4.o.a) r0
            int r1 = r0.f99283f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99283f = r1
            goto L18
        L13:
            y4.o$a r0 = new y4.o$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f99281d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f99283f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f99279b
            n40.a r6 = (n40.a) r6
            java.lang.Object r0 = r0.f99278a
            y4.a r0 = (y4.a) r0
            kotlin.e.n(r7)
            r7 = r6
            r6 = r0
            goto L51
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.e.n(r7)
            n40.a r7 = r5.f99277d
            r0.f99278a = r6
            r0.f99279b = r7
            r2 = 0
            r0.f99280c = r2
            r0.f99283f = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            y4.c r0 = r5.f99274a     // Catch: java.lang.Throwable -> L71
            kotlinx.coroutines.flow.y<k3.o4> r1 = r5.f99275b     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L71
            k3.o4 r1 = (k3.o4) r1     // Catch: java.lang.Throwable -> L71
            k3.o4 r6 = r0.a(r1, r6)     // Catch: java.lang.Throwable -> L71
            kotlinx.coroutines.flow.y<k3.o4> r0 = r5.f99275b     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            boolean r0 = kotlin.jvm.internal.g0.g(r6, r0)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L73
            kotlinx.coroutines.flow.y<k3.o4> r0 = r5.f99275b     // Catch: java.lang.Throwable -> L71
            r0.setValue(r6)     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r6 = move-exception
            goto L79
        L73:
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L71
            r7.unlock(r4)
            return r6
        L79:
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.o.a(y4.a, j00.c):java.lang.Object");
    }

    @m80.k
    public final m0<o4> b() {
        return this.f99276c;
    }
}
