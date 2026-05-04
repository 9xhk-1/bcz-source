package h10;

import h10.n;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface p<T, V> extends n<V>, x00.l<T, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<T, V> extends n.c<V>, x00.l<T, V> {
    }

    V get(T t11);

    @m80.l
    @y0(version = "1.1")
    Object getDelegate(T t11);

    @Override // h10.n
    @m80.k
    a<T, V> getGetter();
}
