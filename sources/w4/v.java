package w4;

import a00.i0;
import com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import l3.g2;
import x4.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c
@u0({"SMAP\nUIEffectQueueManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIEffectQueueManager.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/UIEffectQueueManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,249:1\n1563#2:250\n1634#2,3:251\n116#3,11:254\n116#3,11:265\n116#3,11:276\n116#3,11:287\n*S KotlinDebug\n*F\n+ 1 UIEffectQueueManager.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/UIEffectQueueManager\n*L\n38#1:250\n38#1:251,3\n51#1:254,11\n62#1:265,11\n87#1:276,11\n98#1:287,11\n*E\n"})
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x<l3.o> f95180a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0<l3.o> f95181b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a00.m<x4.a> f95182c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f95183d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final g2 f95184e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectQueueManager", f = "UIEffectQueueManager.kt", i = {0, 0}, l = {255}, m = kc.o.N, n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95185a;

        /* renamed from: b, reason: collision with root package name */
        public int f95186b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f95187c;

        /* renamed from: e, reason: collision with root package name */
        public int f95189e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95187c = obj;
            this.f95189e |= Integer.MIN_VALUE;
            return v.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g2 {
        public b() {
        }

        @Override // l3.g2
        public final Object a(j00.c<? super yz.g2> cVar) {
            Object d11 = v.this.d(cVar);
            return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectQueueManager", f = "UIEffectQueueManager.kt", i = {0, 0, 1, 1, 1}, l = {255, 79}, m = "continueNext", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-UIEffectQueueManager$continueNext$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95191a;

        /* renamed from: b, reason: collision with root package name */
        public int f95192b;

        /* renamed from: c, reason: collision with root package name */
        public int f95193c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f95194d;

        /* renamed from: f, reason: collision with root package name */
        public int f95196f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95194d = obj;
            this.f95196f |= Integer.MIN_VALUE;
            return v.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectQueueManager", f = "UIEffectQueueManager.kt", i = {0, 1, 1, 1, 2, 2, 2, 2}, l = {49, 255, 54}, m = "enqueueEffectWrappers$biz_release", n = {"wrappers", "wrappers", "$this$withLock_u24default$iv", "$i$f$withLock", "wrappers", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-UIEffectQueueManager$enqueueEffectWrappers$2"}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95197a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95198b;

        /* renamed from: c, reason: collision with root package name */
        public int f95199c;

        /* renamed from: d, reason: collision with root package name */
        public int f95200d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f95201e;

        /* renamed from: g, reason: collision with root package name */
        public int f95203g;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95201e = obj;
            this.f95203g |= Integer.MIN_VALUE;
            return v.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectQueueManager", f = "UIEffectQueueManager.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {255, 108}, m = "enqueueSingleEffectWrapper$biz_release", n = {"wrapper", "$this$withLock_u24default$iv", "$i$f$withLock", "wrapper", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-UIEffectQueueManager$enqueueSingleEffectWrapper$2", "clearedCount"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95204a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95205b;

        /* renamed from: c, reason: collision with root package name */
        public int f95206c;

        /* renamed from: d, reason: collision with root package name */
        public int f95207d;

        /* renamed from: e, reason: collision with root package name */
        public int f95208e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f95209f;

        /* renamed from: h, reason: collision with root package name */
        public int f95211h;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95209f = obj;
            this.f95211h |= Integer.MIN_VALUE;
            return v.this.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectQueueManager", f = "UIEffectQueueManager.kt", i = {0, 1, 1, 1, 2, 2}, l = {126, 140, 145}, m = "showNext", n = {"wrapper", "wrapper", "effect", "wrappedEffect", "wrapper", "effect"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95212a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95213b;

        /* renamed from: c, reason: collision with root package name */
        public Object f95214c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f95215d;

        /* renamed from: f, reason: collision with root package name */
        public int f95217f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95215d = obj;
            this.f95217f |= Integer.MIN_VALUE;
            return v.this.i(this);
        }
    }

    public v() {
        x<l3.o> b11 = e0.b(0, 0, null, 7, null);
        this.f95180a = b11;
        this.f95181b = kotlinx.coroutines.flow.k.m(b11);
        this.f95182c = new a00.m<>();
        this.f95183d = n40.g.b(false, 1, null);
        this.f95184e = new b();
    }

    public static final boolean j(x4.a aVar, x4.a wrap) {
        g0.p(wrap, "wrap");
        return !g0.g(wrap, aVar) && wrap.a() == EffectType.Dialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof w4.v.a
            if (r0 == 0) goto L13
            r0 = r12
            w4.v$a r0 = (w4.v.a) r0
            int r1 = r0.f95189e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95189e = r1
            goto L18
        L13:
            w4.v$a r0 = new w4.v$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f95187c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f95189e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f95185a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r12)
            r12 = r0
            goto L4a
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            kotlin.e.n(r12)
            n40.a r12 = r11.f95183d
            r0.f95185a = r12
            r2 = 0
            r0.f95186b = r2
            r0.f95189e = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            a00.m<x4.a> r0 = r11.f95182c     // Catch: java.lang.Throwable -> L7b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7b
            a00.m<x4.a> r1 = r11.f95182c     // Catch: java.lang.Throwable -> L7b
            r1.clear()     // Catch: java.lang.Throwable -> L7b
            z6.b r5 = z6.b.f101032b     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = "UIEffectQueueManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r1.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "clear: cleared "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7b
            r1.append(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = " effects"
            r1.append(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r9 = 4
            r10 = 0
            r8 = 0
            z6.b.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7b
            yz.g2 r0 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L7b
            r12.unlock(r4)
            return r0
        L7b:
            r0 = move-exception
            r12.unlock(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:26:0x005f, B:28:0x0067, B:30:0x0075, B:31:0x007c, B:33:0x0082, B:34:0x00a9, B:35:0x00ca), top: B:25:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (c40.a1.b(100, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k java.util.List<? extends x4.a> r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v.e(java.util.List, j00.c):java.lang.Object");
    }

    @m80.l
    public final Object f(@m80.k List<? extends l3.o> list, @m80.k j00.c<? super yz.g2> cVar) {
        if (list.isEmpty()) {
            return yz.g2.f100423a;
        }
        List<? extends l3.o> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new a.b((l3.o) it.next(), null, 2, null));
        }
        Object e11 = e(arrayList, cVar);
        return e11 == kotlin.coroutines.intrinsics.b.l() ? e11 : yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k x4.a r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof w4.v.e
            if (r2 == 0) goto L17
            r2 = r0
            w4.v$e r2 = (w4.v.e) r2
            int r3 = r2.f95211h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f95211h = r3
            goto L1c
        L17:
            w4.v$e r2 = new w4.v$e
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f95209f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r2.f95211h
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L56
            if (r4 == r7) goto L46
            if (r4 != r6) goto L3e
            java.lang.Object r3 = r2.f95205b
            n40.a r3 = (n40.a) r3
            java.lang.Object r2 = r2.f95204a
            x4.a r2 = (x4.a) r2
            kotlin.e.n(r0)     // Catch: java.lang.Throwable -> L3b
            goto Lb7
        L3b:
            r0 = move-exception
            goto Lbf
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L46:
            int r4 = r2.f95206c
            java.lang.Object r7 = r2.f95205b
            n40.a r7 = (n40.a) r7
            java.lang.Object r9 = r2.f95204a
            x4.a r9 = (x4.a) r9
            kotlin.e.n(r0)
            r0 = r4
            r4 = r9
            goto L6e
        L56:
            kotlin.e.n(r0)
            n40.a r0 = r1.f95183d
            r4 = r18
            r2.f95204a = r4
            r2.f95205b = r0
            r2.f95206c = r5
            r2.f95211h = r7
            java.lang.Object r7 = r0.lock(r8, r2)
            if (r7 != r3) goto L6c
            goto Lb5
        L6c:
            r7 = r0
            r0 = r5
        L6e:
            a00.m<x4.a> r9 = r1.f95182c     // Catch: java.lang.Throwable -> Lbd
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lbd
            a00.m<x4.a> r10 = r1.f95182c     // Catch: java.lang.Throwable -> Lbd
            r10.clear()     // Catch: java.lang.Throwable -> Lbd
            z6.b r11 = z6.b.f101032b     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r12 = "UIEffectQueueManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r10.<init>()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r13 = "enqueueSingleEffectWrapper: cleared "
            r10.append(r13)     // Catch: java.lang.Throwable -> Lbd
            r10.append(r9)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r13 = " effects for immediate effect"
            r10.append(r13)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r13 = r10.toString()     // Catch: java.lang.Throwable -> Lbd
            r15 = 4
            r16 = 0
            r14 = 0
            z6.b.d(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lbd
            a00.m<x4.a> r10 = r1.f95182c     // Catch: java.lang.Throwable -> Lbd
            r10.add(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r4 = l00.k.a(r4)     // Catch: java.lang.Throwable -> Lbd
            r2.f95204a = r4     // Catch: java.lang.Throwable -> Lbd
            r2.f95205b = r7     // Catch: java.lang.Throwable -> Lbd
            r2.f95206c = r0     // Catch: java.lang.Throwable -> Lbd
            r2.f95207d = r5     // Catch: java.lang.Throwable -> Lbd
            r2.f95208e = r9     // Catch: java.lang.Throwable -> Lbd
            r2.f95211h = r6     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r1.i(r2)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r3) goto Lb6
        Lb5:
            return r3
        Lb6:
            r3 = r7
        Lb7:
            yz.g2 r0 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L3b
            r3.unlock(r8)
            return r0
        Lbd:
            r0 = move-exception
            r3 = r7
        Lbf:
            r3.unlock(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v.g(x4.a, j00.c):java.lang.Object");
    }

    @m80.k
    public final c0<l3.o> h() {
        return this.f95181b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0171, code lost:
    
        if (r5.emit(r4, r6) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019a, code lost:
    
        if (i(r6) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r1 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v.i(j00.c):java.lang.Object");
    }
}
