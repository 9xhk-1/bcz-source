package ts;

import java.io.IOException;
import m80.k;
import ts.f;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface a<T, B extends f<T>> {
    T read(@k i iVar) throws IOException;

    T read(@k i iVar, @k B b11) throws IOException;

    void write(@k i iVar, T t11) throws IOException;
}
