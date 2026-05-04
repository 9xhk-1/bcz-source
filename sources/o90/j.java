package o90;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.RowPlacement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class j<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends p<T> {

    /* renamed from: i, reason: collision with root package name */
    public final o f76671i;

    /* renamed from: j, reason: collision with root package name */
    public n90.n f76672j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f76673k;

    public j(RowPlacement rowPlacement, o oVar) {
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Row processor for reading detail rows", oVar);
        this.f76671i = oVar;
        this.f76673k = rowPlacement == RowPlacement.TOP;
    }

    @Override // o90.p
    public final void G(Object[] objArr, T t11) {
        if (this.f76672j == null) {
            n90.n nVar = new n90.n();
            this.f76672j = nVar;
            nVar.f(objArr);
            if (this.f76673k) {
                return;
            }
        }
        J(objArr, t11);
    }

    public abstract boolean H(String[] strArr, T t11);

    public abstract void I(n90.n nVar, T t11);

    public final void J(Object[] objArr, T t11) {
        List<Object[]> H = this.f76671i.H();
        this.f76672j.e(new ArrayList(H));
        if (!this.f76673k) {
            this.f76672j.f(objArr);
        }
        if (this.f76672j.d() != null) {
            I(this.f76672j.clone(), t11);
            this.f76672j.a();
        }
        H.clear();
        if (this.f76673k) {
            this.f76672j.f(objArr);
        }
    }

    @Override // o90.p, o90.z
    public void h(T t11) {
        this.f76671i.h(t11);
    }

    @Override // o90.p, o90.z
    public void i(T t11) {
        super.i(t11);
        this.f76671i.i(t11);
        if (this.f76673k) {
            J(null, t11);
        }
    }

    @Override // o90.p, o90.z
    public final void q(String[] strArr, T t11) {
        if (H(strArr, t11)) {
            super.q(strArr, t11);
        } else {
            if (this.f76673k && this.f76672j == null) {
                return;
            }
            this.f76671i.q(strArr, t11);
        }
    }

    public j(o oVar) {
        this(RowPlacement.TOP, oVar);
    }
}
