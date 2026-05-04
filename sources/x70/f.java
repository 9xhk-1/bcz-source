package x70;

import java.net.SocketAddress;
import java.nio.channels.ByteChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface f {

    /* renamed from: c1, reason: collision with root package name */
    public static final String f97672c1 = "http.session.attachment";

    /* renamed from: d1, reason: collision with root package name */
    public static final int f97673d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f97674e1 = 1;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f97675g1 = Integer.MAX_VALUE;

    boolean a();

    void b(String str, Object obj);

    boolean c();

    void close();

    int d();

    void e(i iVar);

    void f(int i11);

    ByteChannel g();

    Object getAttribute(String str);

    SocketAddress getLocalAddress();

    int getStatus();

    void h(int i11);

    void i(int i11);

    boolean isClosed();

    SocketAddress l();

    Object removeAttribute(String str);

    void setSocketTimeout(int i11);

    void shutdown();

    int x();
}
