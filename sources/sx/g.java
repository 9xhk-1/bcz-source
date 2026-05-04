package sx;

import c40.r0;
import io.ktor.network.selector.SelectInterest;
import java.io.Closeable;
import java.nio.channels.spi.SelectorProvider;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g extends r0, Closeable {

    @k
    public static final a B0 = a.f89051a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f89051a = new a();
    }

    void B8(@k e eVar);

    @l
    Object N4(@k e eVar, @k SelectInterest selectInterest, @k j00.c<? super g2> cVar);

    @k
    SelectorProvider X();
}
