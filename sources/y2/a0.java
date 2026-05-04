package y2;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a0 extends p {

    /* renamed from: f, reason: collision with root package name */
    public int f99138f;

    public a0() {
    }

    @Override // y2.p, x2.a
    public boolean a(float f11) {
        if (this.f99138f >= this.f99191d.f13179b) {
            return true;
        }
        j0 c11 = c();
        g(null);
        try {
            if (this.f99191d.get(this.f99138f).a(f11)) {
                if (this.f97055a == null) {
                    return true;
                }
                int i11 = this.f99138f + 1;
                this.f99138f = i11;
                if (i11 >= this.f99191d.f13179b) {
                    return true;
                }
            }
            g(c11);
            return false;
        } finally {
            g(c11);
        }
    }

    @Override // y2.p, x2.a
    public void e() {
        super.e();
        this.f99138f = 0;
    }

    public a0(x2.a aVar) {
        i(aVar);
    }

    public a0(x2.a aVar, x2.a aVar2) {
        i(aVar);
        i(aVar2);
    }

    public a0(x2.a aVar, x2.a aVar2, x2.a aVar3) {
        i(aVar);
        i(aVar2);
        i(aVar3);
    }

    public a0(x2.a aVar, x2.a aVar2, x2.a aVar3, x2.a aVar4) {
        i(aVar);
        i(aVar2);
        i(aVar3);
        i(aVar4);
    }

    public a0(x2.a aVar, x2.a aVar2, x2.a aVar3, x2.a aVar4, x2.a aVar5) {
        i(aVar);
        i(aVar2);
        i(aVar3);
        i(aVar4);
        i(aVar5);
    }
}
