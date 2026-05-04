package ku;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f68750a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f68751b;

    public o0(d dVar, s0 s0Var) {
        this.f68750a = dVar;
        this.f68751b = s0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (o0Var.f68750a != this.f68750a) {
                return false;
            }
            s0 s0Var = o0Var.f68751b;
            s0 s0Var2 = this.f68751b;
            if (s0Var == s0Var2) {
                return true;
            }
            if (s0Var != null && s0Var2 != null) {
                return s0Var.equals(s0Var2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int identityHashCode = System.identityHashCode(this.f68750a);
        s0 s0Var = this.f68751b;
        return s0Var != null ? identityHashCode + ((s0Var.hashCode() + 41) * 41) : identityHashCode;
    }

    public final String toString() {
        return "MemoKey(" + this.f68750a + EmailAutoCompleteEditText.f17091d + System.identityHashCode(this.f68750a) + "," + this.f68751b + pn.j.f81007d;
    }
}
