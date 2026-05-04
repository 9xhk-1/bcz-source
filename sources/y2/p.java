package y2;

import a3.j0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<x2.a> f99191d = new com.badlogic.gdx.utils.a<>(4);

    /* renamed from: e, reason: collision with root package name */
    public boolean f99192e;

    public p() {
    }

    @Override // x2.a
    public boolean a(float f11) {
        if (this.f99192e) {
            return true;
        }
        this.f99192e = true;
        j0 c11 = c();
        g(null);
        try {
            com.badlogic.gdx.utils.a<x2.a> aVar = this.f99191d;
            int i11 = aVar.f13179b;
            for (int i12 = 0; i12 < i11 && this.f97055a != null; i12++) {
                x2.a aVar2 = aVar.get(i12);
                if (aVar2.b() != null && !aVar2.a(f11)) {
                    this.f99192e = false;
                }
                if (this.f97055a == null) {
                    g(c11);
                    return true;
                }
            }
            boolean z11 = this.f99192e;
            g(c11);
            return z11;
        } catch (Throwable th2) {
            g(c11);
            throw th2;
        }
    }

    @Override // x2.a
    public void e() {
        this.f99192e = false;
        com.badlogic.gdx.utils.a<x2.a> aVar = this.f99191d;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            aVar.get(i12).e();
        }
    }

    @Override // x2.a
    public void f(com.badlogic.gdx.scenes.scene2d.a aVar) {
        com.badlogic.gdx.utils.a<x2.a> aVar2 = this.f99191d;
        int i11 = aVar2.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            aVar2.get(i12).f(aVar);
        }
        super.f(aVar);
    }

    public void i(x2.a aVar) {
        this.f99191d.a(aVar);
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.f97055a;
        if (aVar2 != null) {
            aVar.f(aVar2);
        }
    }

    public com.badlogic.gdx.utils.a<x2.a> j() {
        return this.f99191d;
    }

    @Override // x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99191d.clear();
    }

    @Override // x2.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(super.toString());
        sb2.append('(');
        com.badlogic.gdx.utils.a<x2.a> aVar = this.f99191d;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(aVar.get(i12));
        }
        sb2.append(')');
        return sb2.toString();
    }

    public p(x2.a aVar) {
        i(aVar);
    }

    public p(x2.a aVar, x2.a aVar2) {
        i(aVar);
        i(aVar2);
    }

    public p(x2.a aVar, x2.a aVar2, x2.a aVar3) {
        i(aVar);
        i(aVar2);
        i(aVar3);
    }

    public p(x2.a aVar, x2.a aVar2, x2.a aVar3, x2.a aVar4) {
        i(aVar);
        i(aVar2);
        i(aVar3);
        i(aVar4);
    }

    public p(x2.a aVar, x2.a aVar2, x2.a aVar3, x2.a aVar4, x2.a aVar5) {
        i(aVar);
        i(aVar2);
        i(aVar3);
        i(aVar4);
        i(aVar5);
    }
}
