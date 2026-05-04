package androidx.datastore.core.okio;

import j00.c;
import l60.m;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    @l
    Object readFrom(@k m mVar, @k c<? super T> cVar);

    @l
    Object writeTo(T t11, @k l60.l lVar, @k c<? super g2> cVar);
}
