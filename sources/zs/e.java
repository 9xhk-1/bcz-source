package zs;

import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface e extends Closeable {
    @l
    Object g(@k j00.c<? super g2> cVar);

    int read(@k byte[] bArr, int i11, int i12) throws IOException;

    default void write(@k byte[] data) throws IOException {
        g0.p(data, "data");
        write(data, 0, data.length);
    }

    void write(@k byte[] bArr, int i11, int i12) throws IOException;
}
