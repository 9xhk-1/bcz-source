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
public final class a<T> extends Optional<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a<Object> f59511a = new a<>();
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> a() {
        return f59511a;
    }

    private Object readResolve() {
        return f59511a;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@CheckForNull Object object) {
        return object == this;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public T or(T t11) {
        return (T) Preconditions.checkNotNull(t11, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    @CheckForNull
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(r<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> secondChoice) {
        return (Optional) Preconditions.checkNotNull(secondChoice);
    }

    @Override // com.google.common.base.Optional
    public T or(p0<? extends T> p0Var) {
        return (T) Preconditions.checkNotNull(p0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
