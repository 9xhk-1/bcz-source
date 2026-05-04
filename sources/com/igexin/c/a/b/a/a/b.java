package com.igexin.c.a.b.a.a;

import android.text.TextUtils;
import com.igexin.c.a.b.a.a.a;
import com.igexin.push.config.SDKUrlConfig;
import java.net.InetSocketAddress;
import java.net.Socket;

/* loaded from: classes7.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f37087a = -2037;

    /* renamed from: j, reason: collision with root package name */
    private static final String f37088j = "GS-C";

    /* renamed from: k, reason: collision with root package name */
    private static final int f37089k = 10000;
    private Socket P;

    /* renamed from: l, reason: collision with root package name */
    private com.igexin.c.a.b.a.a.a.d f37090l;

    public b(com.igexin.c.a.b.a.a.a.d dVar) {
        super(-2037, null);
        this.f37090l = dVar;
    }

    @Override // com.igexin.c.a.b.f, com.igexin.c.a.d.f, com.igexin.c.a.d.a.a
    public final void a() {
        Socket socket;
        super.a();
        com.igexin.c.a.c.a.a("GS-C|sc dispose", new Object[0]);
        if (this.f37090l != null) {
            if (this.f37080g == a.EnumC0460a.f37085c) {
                this.f37090l.a();
            } else if (this.f37080g == a.EnumC0460a.f37084b) {
                if (!TextUtils.isEmpty(this.f37081h)) {
                    this.f37090l.a(new Exception(this.f37081h));
                }
            } else if (this.f37080g == a.EnumC0460a.f37083a && (socket = this.P) != null) {
                this.f37090l.a(socket);
            }
        }
        this.f37090l = null;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        super.b_();
        com.igexin.push.c.c.a().d().a();
        String connectAddress = SDKUrlConfig.getConnectAddress();
        try {
            String[] a11 = com.igexin.c.a.b.g.a(connectAddress);
            String str = a11[1];
            int parseInt = Integer.parseInt(a11[2]);
            com.igexin.c.a.c.a.a("GS-C|start connect :  " + connectAddress + " *********", new Object[0]);
            com.igexin.c.a.b.a.a.a.d dVar = this.f37090l;
            if (dVar != null) {
                dVar.b();
            }
            Socket socket = new Socket();
            this.P = socket;
            try {
                socket.connect(new InetSocketAddress(str, parseInt), 10000);
                com.igexin.c.a.c.a.a("GS-C|connected :  " + connectAddress + " #########", new Object[0]);
                com.igexin.c.a.c.a.a("GS-C|local-" + connectAddress + " port:" + parseInt, new Object[0]);
                if (this.f37080g != a.EnumC0460a.f37085c) {
                    this.f37080g = a.EnumC0460a.f37083a;
                }
            } catch (Exception e11) {
                if (this.f37080g != a.EnumC0460a.f37085c) {
                    this.f37080g = a.EnumC0460a.f37084b;
                    this.f37081h = e11.toString();
                }
            }
            this.f37079f = true;
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
            com.igexin.c.a.c.a.a("GS-C|ips invalid, " + e12.toString(), new Object[0]);
            throw e12;
        }
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return -2037;
    }

    @Override // com.igexin.c.a.b.a.a.a
    public final void c_() {
        this.f37080g = a.EnumC0460a.f37085c;
    }
}
