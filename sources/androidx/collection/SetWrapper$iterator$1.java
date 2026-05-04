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
@d(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {1153}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
@u0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1210:1\n231#2,3:1211\n200#2,7:1214\n211#2,3:1222\n214#2,9:1226\n234#2:1235\n1399#3:1221\n1270#3:1225\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/SetWrapper$iterator$1\n*L\n1153#1:1211,3\n1153#1:1214,7\n1153#1:1222,3\n1153#1:1226,9\n1153#1:1235\n1153#1:1221\n1153#1:1225\n*E\n"})
/* loaded from: classes.dex */
public final class SetWrapper$iterator$1<E> extends RestrictedSuspendLambda implements p<o<? super E>, c<? super g2>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SetWrapper<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetWrapper$iterator$1(SetWrapper<E> setWrapper, c<? super SetWrapper$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = setWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SetWrapper$iterator$1 setWrapper$iterator$1 = new SetWrapper$iterator$1(this.this$0, cVar);
        setWrapper$iterator$1.L$0 = obj;
        return setWrapper$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0091 -> B:5:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:15:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:6:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0074 -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            q30.o r13 = (q30.o) r13
            kotlin.e.n(r21)
            goto L94
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            kotlin.e.n(r21)
            java.lang.Object r2 = r0.L$0
            q30.o r2 = (q30.o) r2
            androidx.collection.SetWrapper<E> r6 = r0.this$0
            androidx.collection.ScatterSet r6 = androidx.collection.SetWrapper.access$getParent$p(r6)
            java.lang.Object[] r7 = r6.elements
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            r9 = r3
        L4a:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9d
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L6b:
            if (r2 >= r6) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r14 = r13.b(r14, r0)
            if (r14 != r1) goto L94
            return r1
        L94:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L6b
        L97:
            if (r6 != r4) goto La2
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L9d:
            if (r9 == r8) goto La2
            int r9 = r9 + 1
            goto L4a
        La2:
            yz.g2 r1 = yz.g2.f100423a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    public final Object invoke(o<? super E> oVar, c<? super g2> cVar) {
        return ((SetWrapper$iterator$1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
