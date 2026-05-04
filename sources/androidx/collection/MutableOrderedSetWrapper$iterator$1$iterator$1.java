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
@d(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0}, l = {1489}, m = "invokeSuspend", n = {"$this$iterator", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$3", "I$0"})
@u0({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n255#2,6:1512\n261#2,4:1519\n1123#3:1518\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n*L\n1487#1:1512,6\n1487#1:1519,4\n1487#1:1518\n*E\n"})
/* loaded from: classes.dex */
public final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements p<o<? super E>, c<? super g2>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$1, c<? super MutableOrderedSetWrapper$iterator$1$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = mutableOrderedSetWrapper$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, cVar);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableOrderedScatterSet mutableOrderedScatterSet;
        MutableOrderedSetWrapper<E> mutableOrderedSetWrapper;
        int i11;
        MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$1;
        long[] jArr;
        o oVar;
        MutableOrderedScatterSet mutableOrderedScatterSet2;
        Object l11 = b.l();
        int i12 = this.label;
        if (i12 == 0) {
            e.n(obj);
            o oVar2 = (o) this.L$0;
            mutableOrderedScatterSet = ((MutableOrderedSetWrapper) this.this$0).parent;
            MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$12 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            long[] jArr2 = mutableOrderedScatterSet.nodes;
            i11 = mutableOrderedScatterSet.tail;
            mutableOrderedSetWrapper$iterator$1 = mutableOrderedSetWrapper$iterator$12;
            jArr = jArr2;
            oVar = oVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            mutableOrderedSetWrapper$iterator$1 = (MutableOrderedSetWrapper$iterator$1) this.L$1;
            oVar = (o) this.L$0;
            e.n(obj);
        }
        while (i11 != Integer.MAX_VALUE) {
            int i13 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            mutableOrderedSetWrapper$iterator$1.setCurrent(i11);
            mutableOrderedScatterSet2 = ((MutableOrderedSetWrapper) mutableOrderedSetWrapper).parent;
            Object obj2 = mutableOrderedScatterSet2.elements[i11];
            this.L$0 = oVar;
            this.L$1 = mutableOrderedSetWrapper$iterator$1;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
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
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
