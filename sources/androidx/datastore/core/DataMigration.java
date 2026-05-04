package androidx.datastore.core;

import j00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface DataMigration<T> {
    @l
    Object cleanUp(@k c<? super g2> cVar);

    @l
    Object migrate(T t11, @k c<? super T> cVar);

    @l
    Object shouldMigrate(T t11, @k c<? super Boolean> cVar);
}
