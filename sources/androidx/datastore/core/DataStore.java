package androidx.datastore.core;

import j00.c;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface DataStore<T> {
    @k
    i<T> getData();

    @l
    Object updateData(@k p<? super T, ? super c<? super T>, ? extends Object> pVar, @k c<? super T> cVar);
}
