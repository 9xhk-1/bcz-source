package com.zx.a.I8b7;

import com.zx.a.I8b7.n0;
import com.zx.a.I8b7.q1;
import com.zx.a.I8b7.t1;
import com.zx.a.I8b7.u1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e implements n0 {
    @Override // com.zx.a.I8b7.n0
    public t1 a(n0.a aVar) throws IOException {
        boolean z11;
        u1 u1Var;
        j1 j1Var = (j1) aVar;
        q1 q1Var = j1Var.f46552c;
        q1.a aVar2 = new q1.a(q1Var);
        HttpURLConnection httpURLConnection = (HttpURLConnection) q1Var.f46659a.openConnection();
        s1 s1Var = q1Var.f46662d;
        if (s1Var != null) {
            r1 r1Var = (r1) s1Var;
            x0 x0Var = r1Var.f46675a;
            if (x0Var != null) {
                aVar2.f46666c.put("Content-Type", x0Var.f46742a);
            }
            long j11 = r1Var.f46676b;
            if (j11 != -1) {
                aVar2.f46666c.put("Content-Length", Long.toString(j11));
                aVar2.f46666c.remove("Transfer-Encoding");
            } else {
                aVar2.f46666c.put("Transfer-Encoding", c80.f.f8329r);
                aVar2.f46666c.remove("Content-Length");
            }
        }
        if (q1Var.f46661c.get("Host") == null) {
            aVar2.f46666c.put("Host", q1Var.f46659a.getHost());
        }
        if (q1Var.f46661c.get("Connection") == null) {
            aVar2.f46666c.put("Connection", "Keep-Alive");
        }
        if (q1Var.f46661c.get("Accept-Encoding") == null && q1Var.f46661c.get("Range") == null) {
            aVar2.f46666c.put("Accept-Encoding", "gzip");
            z11 = true;
        } else {
            z11 = false;
        }
        t1 a11 = j1Var.a(new q1(aVar2), httpURLConnection);
        t1.a aVar3 = new t1.a(a11);
        aVar3.f46695a = q1Var;
        if (z11 && "gzip".equalsIgnoreCase(a11.a("Content-Encoding")) && (u1Var = a11.f46694e) != null) {
            aVar3.f46699e = u1.a(((u1.a) u1Var).f46711a, -1L, new GZIPInputStream(((u1.a) a11.f46694e).f46713c));
            aVar3.f46698d.remove("Content-Encoding");
            aVar3.f46698d.remove("Content-Length");
        }
        return aVar3.a();
    }
}
