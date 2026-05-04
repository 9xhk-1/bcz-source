package androidx.collection;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import q30.o;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0, 0}, l = {1454}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$1", "L$2", "I$0"})
@u0({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n301#2,7:1512\n308#2,4:1520\n1123#3:1519\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper$iterator$1\n*L\n1454#1:1512,7\n1454#1:1520,4\n1454#1:1519\n*E\n"})
/* loaded from: classes.dex */
public final class OrderedSetWrapper$iterator$1<E> extends RestrictedSuspendLambda implements p<o<? super E>, c<? super g2>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OrderedSetWrapper<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedSetWrapper$iterator$1(OrderedSetWrapper<E> orderedSetWrapper, c<? super OrderedSetWrapper$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = orderedSetWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new OrderedSetWrapper$iterator$1(this.this$0, cVar);
        orderedSetWrapper$iterator$1.L$0 = obj;
        return orderedSetWrapper$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderedScatterSet orderedScatterSet;
        int i11;
        Object[] objArr;
        long[] jArr;
        o oVar;
        Object l11 = b.l();
        int i12 = this.label;
        if (i12 == 0) {
            e.n(obj);
            o oVar2 = (o) this.L$0;
            orderedScatterSet = ((OrderedSetWrapper) this.this$0).parent;
            Object[] objArr2 = orderedScatterSet.elements;
            long[] jArr2 = orderedScatterSet.nodes;
            i11 = orderedScatterSet.tail;
            objArr = objArr2;
            jArr = jArr2;
            oVar = oVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.I$0;
            jArr = (long[]) this.L$2;
            objArr = (Object[]) this.L$1;
            oVar = (o) this.L$0;
            e.n(obj);
        }
        while (i11 != Integer.MAX_VALUE) {
            int i13 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            Object obj2 = objArr[i11];
            this.L$0 = oVar;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = i13;
            this.label = 1;
            if (oVar.b(obj2, this) == l11) {
                return l11;
            }
            i11 = i13;
        }
        return g2.f100423a;
    }

    @Override // x00.p
    public final Object invoke(o<? super E> oVar, c<? super g2> cVar) {
        return ((OrderedSetWrapper$iterator$1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
