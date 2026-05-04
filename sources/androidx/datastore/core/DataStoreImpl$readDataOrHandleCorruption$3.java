package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {387, 388, 390}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements l<c<? super g2>, Object> {
    final /* synthetic */ Ref.ObjectRef<T> $newData;
    final /* synthetic */ Ref.IntRef $version;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$3(Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl, Ref.IntRef intRef, c<? super DataStoreImpl$readDataOrHandleCorruption$3> cVar) {
        super(1, cVar);
        this.$newData = objectRef;
        this.this$0 = dataStoreImpl;
        this.$version = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@k c<?> cVar) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.$newData, this.this$0, this.$version, cVar);
    }

    @Override // x00.l
    @m80.l
    public final Object invoke(@m80.l c<? super g2> cVar) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create(cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@k Object obj) {
        Ref.IntRef intRef;
        Object obj2;
        Ref.ObjectRef objectRef;
        Object readDataFromFileOrDefault;
        T t11;
        Ref.IntRef intRef2;
        Object obj3;
        Object l11 = b.l();
        int i11 = this.label;
        try {
        } catch (CorruptionException unused) {
            Ref.IntRef intRef3 = this.$version;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            T t12 = this.$newData.element;
            this.L$0 = intRef3;
            this.label = 3;
            Object writeData$datastore_core_release = dataStoreImpl.writeData$datastore_core_release(t12, true, this);
            if (writeData$datastore_core_release != l11) {
                intRef = intRef3;
                obj2 = writeData$datastore_core_release;
            }
        }
        if (i11 == 0) {
            e.n(obj);
            objectRef = this.$newData;
            DataStoreImpl<T> dataStoreImpl2 = this.this$0;
            this.L$0 = objectRef;
            this.label = 1;
            readDataFromFileOrDefault = dataStoreImpl2.readDataFromFileOrDefault(this);
            t11 = readDataFromFileOrDefault;
            if (readDataFromFileOrDefault == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    intRef2 = (Ref.IntRef) this.L$0;
                    e.n(obj);
                    obj3 = obj;
                    intRef2.element = ((Number) obj3).intValue();
                    return g2.f100423a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef = (Ref.IntRef) this.L$0;
                e.n(obj);
                obj2 = obj;
                intRef.element = ((Number) obj2).intValue();
                return g2.f100423a;
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            e.n(obj);
            t11 = obj;
        }
        objectRef.element = t11;
        intRef2 = this.$version;
        InterProcessCoordinator coordinator = this.this$0.getCoordinator();
        this.L$0 = intRef2;
        this.label = 2;
        Object version = coordinator.getVersion(this);
        obj3 = version;
        if (version == l11) {
            return l11;
        }
        intRef2.element = ((Number) obj3).intValue();
        return g2.f100423a;
    }
}
