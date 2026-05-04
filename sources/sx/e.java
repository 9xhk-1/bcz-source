package sx;

import c40.k1;
import io.ktor.network.selector.SelectInterest;
import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e extends Closeable, k1 {
    @k
    io.ktor.network.selector.a C4();

    void T0(@k SelectInterest selectInterest, boolean z11);

    @k
    SelectableChannel getChannel();

    boolean isClosed();

    int x5();
}
