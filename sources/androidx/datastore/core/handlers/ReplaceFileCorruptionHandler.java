package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import j00.c;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {

    @k
    private final l<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceFileCorruptionHandler(@k l<? super CorruptionException, ? extends T> produceNewData) {
        g0.p(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    @m80.l
    public Object handleCorruption(@k CorruptionException corruptionException, @k c<? super T> cVar) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
