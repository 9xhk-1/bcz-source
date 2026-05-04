package ho;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class s<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r<? super F, ? extends T> f59705a;

    /* renamed from: b, reason: collision with root package name */
    public final Equivalence<T> f59706b;

    public s(r<? super F, ? extends T> function, Equivalence<T> resultEquivalence) {
        this.f59705a = (r) Preconditions.checkNotNull(function);
        this.f59706b = (Equivalence) Preconditions.checkNotNull(resultEquivalence);
    }

    @Override // com.google.common.base.Equivalence
    public boolean a(F f11, F f12) {
        return this.f59706b.d(this.f59705a.apply(f11), this.f59705a.apply(f12));
    }

    @Override // com.google.common.base.Equivalence
    public int b(F f11) {
        return this.f59706b.f(this.f59705a.apply(f11));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f59705a.equals(sVar.f59705a) && this.f59706b.equals(sVar.f59706b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return d0.b(this.f59705a, this.f59706b);
    }

    public String toString() {
        return this.f59706b + ".onResultOf(" + this.f59705a + pn.j.f81007d;
    }
}
