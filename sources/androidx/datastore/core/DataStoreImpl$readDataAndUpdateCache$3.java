package androidx.datastore.core;

import j00.c;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;
import yz.h1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {298, 300}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$readDataAndUpdateCache$3<T> extends SuspendLambda implements l<c<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$3(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$readDataAndUpdateCache$3> cVar) {
        super(1, cVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@k c<?> cVar) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.this$0, cVar);
    }

    @Override // x00.l
    @m80.l
    public final Object invoke(@m80.l c<? super Pair<? extends State<T>, Boolean>> cVar) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@k Object obj) {
        Throwable th2;
        State state;
        Object l11 = b.l();
        int i11 = this.label;
        try {
        } catch (Throwable th3) {
            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
            this.L$0 = th3;
            this.label = 2;
            Object version = coordinator.getVersion(this);
            if (version != l11) {
                th2 = th3;
                obj = version;
            }
        }
        if (i11 == 0) {
            e.n(obj);
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) this.L$0;
                e.n(obj);
                state = new ReadException(th2, ((Number) obj).intValue());
                return h1.a(state, l00.a.a(true));
            }
            e.n(obj);
        }
        state = (State) obj;
        return h1.a(state, l00.a.a(true));
    }
}
