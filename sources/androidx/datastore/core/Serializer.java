package androidx.datastore.core;

import j00.c;
import java.io.InputStream;
import java.io.OutputStream;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface Serializer<T> {
    T getDefaultValue();

    @l
    Object readFrom(@k InputStream inputStream, @k c<? super T> cVar);

    @l
    Object writeTo(T t11, @k OutputStream outputStream, @k c<? super g2> cVar);
}
