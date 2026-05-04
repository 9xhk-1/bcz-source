package c40;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n37#2:122\n36#2,3:123\n13402#3,2:126\n1863#4,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:122\n36#1:123,3\n47#1:126,2\n58#1:128,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f7843a;

        /* renamed from: b, reason: collision with root package name */
        public int f7844b;

        /* renamed from: c, reason: collision with root package name */
        public int f7845c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f7846d;

        /* renamed from: e, reason: collision with root package name */
        public int f7847e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f7846d = obj;
            this.f7847e |= Integer.MIN_VALUE;
            return f.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f7848a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7849b;

        /* renamed from: c, reason: collision with root package name */
        public int f7850c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f7849b = obj;
            this.f7850c |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @m80.l
    public static final <T> Object a(@m80.k Collection<? extends x0<? extends T>> collection, @m80.k j00.c<? super List<? extends T>> cVar) {
        return collection.isEmpty() ? a00.h0.J() : new e((x0[]) collection.toArray(new x0[0])).c(cVar);
    }

    @m80.l
    public static final <T> Object b(@m80.k x0<? extends T>[] x0VarArr, @m80.k j00.c<? super List<? extends T>> cVar) {
        return x0VarArr.length == 0 ? a00.h0.J() : new e(x0VarArr).c(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k java.util.Collection<? extends c40.l2> r4, @m80.k j00.c<? super yz.g2> r5) {
        /*
            boolean r0 = r5 instanceof c40.f.b
            if (r0 == 0) goto L13
            r0 = r5
            c40.f$b r0 = (c40.f.b) r0
            int r1 = r0.f7850c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7850c = r1
            goto L18
        L13:
            c40.f$b r0 = new c40.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7849b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f7850c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f7848a
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.e.n(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            c40.l2 r5 = (c40.l2) r5
            r0.f7848a = r4
            r0.f7850c = r3
            java.lang.Object r5 = r5.K0(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.f.c(java.util.Collection, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k c40.l2[] r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof c40.f.a
            if (r0 == 0) goto L13
            r0 = r7
            c40.f$a r0 = (c40.f.a) r0
            int r1 = r0.f7847e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7847e = r1
            goto L18
        L13:
            c40.f$a r0 = new c40.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7846d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f7847e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f7845c
            int r2 = r0.f7844b
            java.lang.Object r4 = r0.f7843a
            c40.l2[] r4 = (c40.l2[]) r4
            kotlin.e.n(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.e.n(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f7843a = r7
            r0.f7844b = r2
            r0.f7845c = r6
            r0.f7847e = r3
            java.lang.Object r4 = r4.K0(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.f.d(c40.l2[], j00.c):java.lang.Object");
    }
}
