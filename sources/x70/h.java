package x70;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface h extends d {
    void a() throws IOException;

    g c(SocketAddress socketAddress);

    Set<g> d();

    void pause() throws IOException;
}
