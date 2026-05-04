package ho;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class k0<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final T f59642a;

    public k0(T reference) {
        this.f59642a = reference;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f59642a);
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@CheckForNull Object object) {
        if (object instanceof k0) {
            return this.f59642a.equals(((k0) object).f59642a);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.f59642a;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.f59642a.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public T or(T defaultValue) {
        Preconditions.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.f59642a;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.f59642a;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.f59642a + pn.j.f81007d;
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(r<? super T, V> rVar) {
        return new k0(Preconditions.checkNotNull(rVar.apply(this.f59642a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> secondChoice) {
        Preconditions.checkNotNull(secondChoice);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T or(p0<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f59642a;
    }
}
