package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class StorageConnectionKt {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <T> Object readData(@k StorageConnection<T> storageConnection, @k c<? super T> cVar) {
        return storageConnection.readScope(new StorageConnectionKt$readData$2(null), cVar);
    }

    @l
    public static final <T> Object writeData(@k StorageConnection<T> storageConnection, T t11, @k c<? super g2> cVar) {
        Object writeScope = storageConnection.writeScope(new StorageConnectionKt$writeData$2(t11, null), cVar);
        return writeScope == b.l() ? writeScope : g2.f100423a;
    }
}
