package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    public static final class a<T, C extends Collection<? super T>> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68320a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68321b;

        /* renamed from: c, reason: collision with root package name */
        public int f68322c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68321b = obj;
            this.f68322c |= Integer.MIN_VALUE;
            return k.Z1(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f68323a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.f68323a = collection;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t11, j00.c<? super g2> cVar) {
            this.f68323a.add(t11);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k C r5, @m80.k j00.c<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.m.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m$a r0 = (kotlinx.coroutines.flow.m.a) r0
            int r1 = r0.f68322c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68322c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$a r0 = new kotlinx.coroutines.flow.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68321b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68322c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f68320a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.e.n(r6)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r6)
            kotlinx.coroutines.flow.m$b r6 = new kotlinx.coroutines.flow.m$b
            r6.<init>(r5)
            r0.f68320a = r5
            r0.f68322c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.a(kotlinx.coroutines.flow.i, java.util.Collection, j00.c):java.lang.Object");
    }

    @m80.l
    public static final <T> Object b(@m80.k i<? extends T> iVar, @m80.k List<T> list, @m80.k j00.c<? super List<? extends T>> cVar) {
        return k.Z1(iVar, list, cVar);
    }

    public static /* synthetic */ Object c(i iVar, List list, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return k.a2(iVar, list, cVar);
    }

    @m80.l
    public static final <T> Object d(@m80.k i<? extends T> iVar, @m80.k Set<T> set, @m80.k j00.c<? super Set<? extends T>> cVar) {
        return k.Z1(iVar, set, cVar);
    }

    public static /* synthetic */ Object e(i iVar, Set set, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return k.c2(iVar, set, cVar);
    }
}
