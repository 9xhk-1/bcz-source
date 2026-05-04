package com.mob.mcl.c;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final Socket f40483a;

    /* renamed from: b, reason: collision with root package name */
    public final d f40484b;

    /* renamed from: c, reason: collision with root package name */
    public SocketAddress f40485c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f40486d;

    /* renamed from: e, reason: collision with root package name */
    final Map<c, Long> f40487e;

    /* renamed from: com.mob.mcl.c.a$a, reason: collision with other inner class name */
    public class C0486a extends Thread {
        public C0486a(String str) {
            super(str);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public a(Socket socket, d dVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f40486d = atomicBoolean;
        this.f40487e = new WeakHashMap();
        this.f40483a = socket;
        this.f40484b = dVar;
        atomicBoolean.getAndSet(true);
        dVar.a(this);
        new C0486a("mlp-worker").start();
    }

    public c a(e eVar) {
        c cVar = new c();
        synchronized (this.f40487e) {
            this.f40487e.put(cVar, Long.valueOf(eVar.f40502c));
        }
        try {
            OutputStream outputStream = this.f40483a.getOutputStream();
            outputStream.write(eVar.a());
            outputStream.flush();
            return cVar;
        } catch (Throwable th2) {
            this.f40484b.a(this, th2);
            return null;
        }
    }

    public void a() {
        try {
            InputStream inputStream = this.f40483a.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8096];
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    return;
                }
                int i11 = 0;
                byteArrayOutputStream.write(bArr, 0, read);
                if (read < 8096) {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ByteBuffer wrap = ByteBuffer.wrap(byteArray);
                    while (wrap.hasRemaining() && wrap.get() != 1) {
                        i11++;
                    }
                    wrap.position(i11);
                    List<e> a11 = e.a(wrap);
                    Iterator<e> it = a11.iterator();
                    while (it.hasNext()) {
                        i11 += it.next().b();
                    }
                    a(a11);
                    byteArrayOutputStream.reset();
                    if (byteArray.length - i11 > 0) {
                        byteArrayOutputStream.write(byteArray, i11, byteArray.length - i11);
                    }
                }
            }
        } catch (Throwable th2) {
            this.f40484b.a(this, th2);
            a(true);
        }
    }

    public void a(List<e> list) {
        for (e eVar : list) {
            d dVar = this.f40484b;
            if (dVar != null && eVar.f40501b >= 9001) {
                dVar.a(this, eVar);
            }
            if (eVar.f40501b < 9001) {
                Iterator<Map.Entry<c, Long>> it = this.f40487e.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<c, Long> next = it.next();
                        if (next.getValue().equals(Long.valueOf(eVar.f40502c))) {
                            next.getKey().a(eVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void a(boolean z11) {
        if (this.f40486d.getAndSet(false)) {
            try {
                this.f40483a.close();
                this.f40484b.a(this, z11);
            } catch (Throwable unused) {
            }
            this.f40486d.getAndSet(false);
            this.f40487e.clear();
        }
    }
}
