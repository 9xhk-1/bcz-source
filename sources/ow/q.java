package ow;

import io.ktor.client.engine.ProxyType;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78462a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78462a = iArr;
        }
    }

    @m80.k
    public static final ProxyType a(@m80.k Proxy proxy) {
        g0.p(proxy, "<this>");
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : a.f78462a[type.ordinal()];
        return i11 != 1 ? i11 != 2 ? ProxyType.UNKNOWN : ProxyType.HTTP : ProxyType.SOCKS;
    }

    @m80.k
    public static final SocketAddress b(@m80.k Proxy proxy) {
        g0.p(proxy, "<this>");
        SocketAddress address = proxy.address();
        g0.o(address, "address(...)");
        return address;
    }
}
