package o90;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.RowPlacement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class i<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends j<T> {

    /* renamed from: l, reason: collision with root package name */
    public final List<n90.n> f76669l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f76670m;

    public i(RowPlacement rowPlacement, o oVar) {
        super(rowPlacement, oVar);
        this.f76669l = new ArrayList();
    }

    @Override // o90.j
    public void I(n90.n nVar, T t11) {
        this.f76669l.add(nVar);
    }

    public List<n90.n> K() {
        return this.f76669l;
    }

    public String[] a() {
        return this.f76670m;
    }

    @Override // o90.j, o90.p, o90.z
    public void i(T t11) {
        this.f76670m = t11.a();
        super.i(t11);
    }

    public i(o oVar) {
        super(oVar);
        this.f76669l = new ArrayList();
    }
}
