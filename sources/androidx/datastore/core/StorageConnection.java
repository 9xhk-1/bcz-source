package androidx.datastore.core;

import j00.c;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface StorageConnection<T> extends Closeable {
    @k
    InterProcessCoordinator getCoordinator();

    @l
    <R> Object readScope(@k q<? super ReadScope<T>, ? super Boolean, ? super c<? super R>, ? extends Object> qVar, @k c<? super R> cVar);

    @l
    Object writeScope(@k p<? super WriteScope<T>, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar);
}
