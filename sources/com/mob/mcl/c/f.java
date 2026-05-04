package com.mob.mcl.c;

import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    a f40504a;

    /* renamed from: b, reason: collision with root package name */
    final d f40505b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicLong f40506c = new AtomicLong();

    public f(d dVar) {
        this.f40505b = dVar;
    }

    public void a() {
        a aVar = this.f40504a;
        if (aVar != null) {
            aVar.a(false);
        }
    }

    public boolean b() {
        a aVar = this.f40504a;
        return aVar != null && aVar.f40486d.get();
    }

    public void a(SocketAddress socketAddress, boolean z11, boolean z12, int i11) throws Throwable {
        a aVar = this.f40504a;
        if (aVar != null) {
            if (!socketAddress.equals(aVar.f40485c)) {
                this.f40504a.a(false);
            } else if (b()) {
                return;
            }
        }
        Socket socket = new Socket();
        socket.setKeepAlive(z11);
        socket.setTcpNoDelay(z12);
        socket.connect(socketAddress, i11);
        a aVar2 = new a(socket, this.f40505b);
        this.f40504a = aVar2;
        aVar2.f40485c = socketAddress;
    }

    public c a(e eVar) {
        if (eVar.f40502c == 0) {
            eVar.f40502c = this.f40506c.incrementAndGet();
        }
        return this.f40504a.a(eVar);
    }
}
