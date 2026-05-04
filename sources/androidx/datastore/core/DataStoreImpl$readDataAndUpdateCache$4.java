package androidx.datastore.core;

import j00.c;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.h1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {306, 309}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$readDataAndUpdateCache$4<T> extends SuspendLambda implements p<Boolean, c<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
    final /* synthetic */ int $cachedVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl<T> dataStoreImpl, int i11, c<? super DataStoreImpl$readDataAndUpdateCache$4> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.this$0, this.$cachedVersion, cVar);
        dataStoreImpl$readDataAndUpdateCache$4.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
        return invoke(bool.booleanValue(), (c) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Throwable th2;
        int i11;
        boolean z11;
        State state;
        boolean z12;
        Object l11 = b.l();
        boolean z13 = this.label;
        try {
        } catch (Throwable th3) {
            if (z13 != 0) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th3;
                this.Z$0 = z13;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != l11) {
                    z11 = z13;
                    th2 = th3;
                    obj = version;
                }
            } else {
                boolean z14 = z13;
                th2 = th3;
                i11 = this.$cachedVersion;
                z11 = z14;
            }
        }
        if (z13 == 0) {
            e.n(obj);
            boolean z15 = this.Z$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.Z$0 = z15;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(z15, this);
            z13 = z15;
            if (obj == l11) {
                return l11;
            }
        } else {
            if (z13 != 1) {
                if (z13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.Z$0;
                th2 = (Throwable) this.L$0;
                e.n(obj);
                i11 = ((Number) obj).intValue();
                ReadException readException = new ReadException(th2, i11);
                z12 = z11;
                state = readException;
                return h1.a(state, l00.a.a(z12));
            }
            boolean z16 = this.Z$0;
            e.n(obj);
            z13 = z16;
        }
        state = (State) obj;
        z12 = z13;
        return h1.a(state, l00.a.a(z12));
    }

    @l
    public final Object invoke(boolean z11, @l c<? super Pair<? extends State<T>, Boolean>> cVar) {
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
    }
}
