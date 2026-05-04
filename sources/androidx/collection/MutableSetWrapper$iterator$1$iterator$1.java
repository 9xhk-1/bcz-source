package androidx.collection;

import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import q30.o;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1188}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
@u0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1210:1\n200#2,7:1211\n211#2,3:1219\n214#2,9:1223\n1399#3:1218\n1270#3:1222\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableSetWrapper$iterator$1$iterator$1\n*L\n1186#1:1211,7\n1186#1:1219,3\n1186#1:1223,9\n1186#1:1218\n1186#1:1222\n*E\n"})
/* loaded from: classes.dex */
public final class MutableSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements p<o<? super E>, c<? super g2>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableSetWrapper<E> this$0;
    final /* synthetic */ MutableSetWrapper$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper<E> mutableSetWrapper, MutableSetWrapper$iterator$1 mutableSetWrapper$iterator$1, c<? super MutableSetWrapper$iterator$1$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = mutableSetWrapper;
        this.this$1 = mutableSetWrapper$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, cVar);
        mutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a4 -> B:5:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:15:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:6:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x007c -> B:5:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    public final Object invoke(o<? super E> oVar, c<? super g2> cVar) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
