package q1;

import a3.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public u0<k> f81401a;

    public j() {
        this.f81401a = new u0<>(4);
    }

    @Override // q1.k
    public boolean D(float f11, float f12) {
        k[] U = this.f81401a.U();
        try {
            int i11 = this.f81401a.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (U[i12].D(f11, f12)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    @Override // q1.k
    public boolean I(int i11, int i12, int i13) {
        k[] U = this.f81401a.U();
        try {
            int i14 = this.f81401a.f13179b;
            for (int i15 = 0; i15 < i14; i15++) {
                if (U[i15].I(i11, i12, i13)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    @Override // q1.k
    public boolean R(int i11, int i12) {
        k[] U = this.f81401a.U();
        try {
            int i13 = this.f81401a.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (U[i14].R(i11, i12)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    @Override // q1.k
    public boolean X(int i11) {
        k[] U = this.f81401a.U();
        try {
            int i12 = this.f81401a.f13179b;
            for (int i13 = 0; i13 < i12; i13++) {
                if (U[i13].X(i11)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    @Override // q1.k
    public boolean Z(int i11) {
        k[] U = this.f81401a.U();
        try {
            int i12 = this.f81401a.f13179b;
            for (int i13 = 0; i13 < i12; i13++) {
                if (U[i13].Z(i11)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    public void a(int i11, k kVar) {
        if (kVar == null) {
            throw new NullPointerException("processor cannot be null");
        }
        this.f81401a.r(i11, kVar);
    }

    @Override // q1.k
    public boolean b(int i11, int i12, int i13, int i14) {
        k[] U = this.f81401a.U();
        try {
            int i15 = this.f81401a.f13179b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (U[i16].b(i11, i12, i13, i14)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    public void c(k kVar) {
        if (kVar == null) {
            throw new NullPointerException("processor cannot be null");
        }
        this.f81401a.a(kVar);
    }

    public void d() {
        this.f81401a.clear();
    }

    public u0<k> e() {
        return this.f81401a;
    }

    public void f(int i11) {
        this.f81401a.A(i11);
    }

    public void g(k kVar) {
        this.f81401a.C(kVar, true);
    }

    public void h(com.badlogic.gdx.utils.a<k> aVar) {
        this.f81401a.clear();
        this.f81401a.g(aVar);
    }

    public void i(k... kVarArr) {
        this.f81401a.clear();
        this.f81401a.j(kVarArr);
    }

    @Override // q1.k
    public boolean i0(char c11) {
        k[] U = this.f81401a.U();
        try {
            int i11 = this.f81401a.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (U[i12].i0(c11)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    public int j() {
        return this.f81401a.f13179b;
    }

    @Override // q1.k
    public boolean o(int i11, int i12, int i13, int i14) {
        k[] U = this.f81401a.U();
        try {
            int i15 = this.f81401a.f13179b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (U[i16].o(i11, i12, i13, i14)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    @Override // q1.k
    public boolean z(int i11, int i12, int i13, int i14) {
        k[] U = this.f81401a.U();
        try {
            int i15 = this.f81401a.f13179b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (U[i16].z(i11, i12, i13, i14)) {
                    this.f81401a.V();
                    return true;
                }
            }
            return false;
        } finally {
            this.f81401a.V();
        }
    }

    public j(k... kVarArr) {
        u0<k> u0Var = new u0<>(4);
        this.f81401a = u0Var;
        u0Var.j(kVarArr);
    }
}
