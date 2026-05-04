package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class v2 extends m0 {
    @Override // c40.m0
    @m80.k
    public m0 limitedParallelism(int i11, @m80.l String str) {
        h40.y.a(i11);
        return h40.y.b(this, str);
    }

    @m80.k
    public abstract v2 q();

    @Override // c40.m0
    @m80.k
    public String toString() {
        String w11 = w();
        if (w11 != null) {
            return w11;
        }
        return u0.a(this) + '@' + u0.b(this);
    }

    @m80.l
    @g2
    public final String w() {
        v2 v2Var;
        v2 e11 = h1.e();
        if (this == e11) {
            return "Dispatchers.Main";
        }
        try {
            v2Var = e11.q();
        } catch (UnsupportedOperationException unused) {
            v2Var = null;
        }
        if (this == v2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
