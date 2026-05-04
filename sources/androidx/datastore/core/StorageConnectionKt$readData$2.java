package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class StorageConnectionKt$readData$2<T> extends SuspendLambda implements q<ReadScope<T>, Boolean, c<? super T>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public StorageConnectionKt$readData$2(c<? super StorageConnectionKt$readData$2> cVar) {
        super(3, cVar);
    }

    @l
    public final Object invoke(@k ReadScope<T> readScope, boolean z11, @l c<? super T> cVar) {
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(cVar);
        storageConnectionKt$readData$2.L$0 = readScope;
        return storageConnectionKt$readData$2.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        ReadScope readScope = (ReadScope) this.L$0;
        this.label = 1;
        Object readData = readScope.readData(this);
        return readData == l11 ? l11 : readData;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
        return invoke((ReadScope) obj, bool.booleanValue(), (c) obj2);
    }
}
