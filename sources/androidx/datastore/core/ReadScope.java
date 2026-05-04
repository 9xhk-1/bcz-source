package androidx.datastore.core;

import j00.c;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ReadScope<T> extends Closeable {
    @l
    Object readData(@k c<? super T> cVar);
}
