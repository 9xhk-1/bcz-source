package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n65#2,2:109\n*E\n"})
    public static final class a<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a f67818a;

        public a(x00.a aVar) {
            this.f67818a = aVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, j00.c<? super g2> cVar) {
            Object emit = jVar.emit((Object) this.f67818a.invoke(), cVar);
            return emit == kotlin.coroutines.intrinsics.b.l() ? emit : g2.f100423a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n132#2,2:109\n*E\n"})
    public static final class b<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f67819a;

        public b(Object obj) {
            this.f67819a = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, j00.c<? super g2> cVar) {
            Object emit = jVar.emit((Object) this.f67819a, cVar);
            return emit == kotlin.coroutines.intrinsics.b.l() ? emit : g2.f100423a;
        }
    }

    @m80.k
    public static final i<Integer> a(@m80.k g10.l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(lVar);
    }

    @m80.k
    public static final i<Long> b(@m80.k g10.o oVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(oVar);
    }

    @m80.k
    public static final <T> i<T> c(@m80.k Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @m80.k
    public static final <T> i<T> d(@m80.k Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    @m80.k
    public static final <T> i<T> e(@m80.k q30.m<? extends T> mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(mVar);
    }

    @m80.k
    public static final <T> i<T> f(@m80.k x00.a<? extends T> aVar) {
        return new a(aVar);
    }

    @m80.k
    public static final <T> i<T> g(@m80.k x00.l<? super j00.c<? super T>, ? extends Object> lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    @m80.k
    public static final i<Integer> h(@m80.k int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    @m80.k
    public static final i<Long> i(@m80.k long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    @m80.k
    public static final <T> i<T> j(@m80.k T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    @m80.k
    public static final <T> i<T> k(@yz.b @m80.k x00.p<? super e40.i0<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.b(pVar, null, 0, null, 14, null);
    }

    @m80.k
    public static final <T> i<T> l(@yz.b @m80.k x00.p<? super e40.i0<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new f(pVar, null, 0, null, 14, null);
    }

    @m80.k
    public static final <T> i<T> m() {
        return h.f68147a;
    }

    @m80.k
    public static final <T> i<T> n(@yz.b @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return new b0(pVar);
    }

    @m80.k
    public static final <T> i<T> o(T t11) {
        return new b(t11);
    }

    @m80.k
    public static final <T> i<T> p(@m80.k T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }
}
