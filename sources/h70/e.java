package h70;

import java.nio.channels.SocketChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final SocketChannel f58751a;

    /* renamed from: b, reason: collision with root package name */
    public final y f58752b;

    public e(SocketChannel socketChannel, y yVar) {
        e80.a.j(socketChannel, "Socket channel");
        this.f58751a = socketChannel;
        this.f58752b = yVar;
    }

    public Object a() {
        y yVar = this.f58752b;
        if (yVar != null) {
            return yVar.f();
        }
        return null;
    }

    public SocketChannel b() {
        return this.f58751a;
    }

    public y c() {
        return this.f58752b;
    }

    public e(SocketChannel socketChannel) {
        this(socketChannel, null);
    }
}
