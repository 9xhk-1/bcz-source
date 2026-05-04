package androidx.datastore.core;

import j00.c;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface InterProcessCoordinator {
    @k
    i<g2> getUpdateNotifications();

    @l
    Object getVersion(@k c<? super Integer> cVar);

    @l
    Object incrementAndGetVersion(@k c<? super Integer> cVar);

    @l
    <T> Object lock(@k x00.l<? super c<? super T>, ? extends Object> lVar, @k c<? super T> cVar);

    @l
    <T> Object tryLock(@k p<? super Boolean, ? super c<? super T>, ? extends Object> pVar, @k c<? super T> cVar);
}
