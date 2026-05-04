package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class StorageConnectionKt$writeData$2<T> extends SuspendLambda implements p<WriteScope<T>, c<? super g2>, Object> {
    final /* synthetic */ T $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageConnectionKt$writeData$2(T t11, c<? super StorageConnectionKt$writeData$2> cVar) {
        super(2, cVar);
        this.$value = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        StorageConnectionKt$writeData$2 storageConnectionKt$writeData$2 = new StorageConnectionKt$writeData$2(this.$value, cVar);
        storageConnectionKt$writeData$2.L$0 = obj;
        return storageConnectionKt$writeData$2;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k WriteScope<T> writeScope, @l c<? super g2> cVar) {
        return ((StorageConnectionKt$writeData$2) create(writeScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            WriteScope writeScope = (WriteScope) this.L$0;
            T t11 = this.$value;
            this.label = 1;
            if (writeScope.writeData(t11, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
