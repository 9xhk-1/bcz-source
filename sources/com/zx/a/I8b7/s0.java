package com.zx.a.I8b7;

import androidx.collection.SieveCacheKt;
import com.zx.a.I8b7.n0;
import com.zx.a.I8b7.q1;
import com.zx.a.I8b7.t1;
import com.zx.a.I8b7.u1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public r0 f46683a;

    public s0(r0 r0Var, int i11) {
        this.f46683a = r0Var;
    }

    @Override // com.zx.a.I8b7.n0
    public t1 a(n0.a aVar) throws IOException {
        j1 j1Var = (j1) aVar;
        q1 q1Var = j1Var.f46552c;
        q1.a aVar2 = new q1.a(q1Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q1Var.f46660b + " " + q1Var.f46659a.toString() + " " + q1Var.f46663e + "\n");
        s1 s1Var = q1Var.f46662d;
        if (s1Var != null && ((r1) s1Var).f46675a.a() != null) {
            if (((r1) q1Var.f46662d).f46676b > SieveCacheKt.NodeLinkMask) {
                StringBuilder a11 = f3.a("request body content length: ");
                a11.append(((r1) q1Var.f46662d).f46676b);
                a11.append("\n");
                sb2.append(a11.toString());
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                r1 r1Var = (r1) q1Var.f46662d;
                byteArrayOutputStream.write(r1Var.f46677c, r1Var.f46678d, r1Var.f46676b);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                sb2.append(new String(byteArray, StandardCharsets.UTF_8) + "\n");
                aVar2.f46667d = s1.a(((r1) q1Var.f46662d).f46675a, byteArray);
            }
        }
        this.f46683a.a(sb2.toString());
        t1 a12 = j1Var.a(new q1(aVar2), j1Var.f46553d);
        t1.a aVar3 = new t1.a(a12);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a12.f46691b + " " + a12.f46692c + " " + q1Var.f46659a.toString() + " " + q1Var.f46663e + "\n");
        u1 u1Var = a12.f46694e;
        if (u1Var != null && ((u1.a) u1Var).f46711a.a() != null) {
            u1 u1Var2 = a12.f46694e;
            if (((u1.a) u1Var2).f46712b > SieveCacheKt.NodeLinkMask) {
                StringBuilder a13 = f3.a("response body content length: ");
                a13.append(((u1.a) a12.f46694e).f46712b);
                a13.append("\n");
                sb3.append(a13.toString());
            } else {
                byte[] a14 = u1Var2.a();
                sb3.append("response body size: ");
                sb3.append(a14.length);
                sb3.append(org.junit.jupiter.api.j2.O);
                sb3.append(new String(a14, StandardCharsets.UTF_8) + "\n");
                aVar3.f46699e = u1.a(((u1.a) a12.f46694e).f46711a, (long) a14.length, new ByteArrayInputStream(a14));
            }
        }
        this.f46683a.a(sb3.toString());
        return aVar3.a();
    }
}
