package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.e5;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class u0<E> extends e5<E> {

    /* renamed from: a, reason: collision with root package name */
    public final ho.p0<Boolean> f73591a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<E> f73592b;

    /* renamed from: c, reason: collision with root package name */
    public final ho.p0<String> f73593c;

    public u0(Set<E> delegate, ho.p0<Boolean> validator, ho.p0<String> errorMessage) {
        this.f73592b = delegate;
        this.f73591a = validator;
        this.f73593c = errorMessage;
    }

    public static final <E> u0<E> w(Set<E> delegate, ho.p0<Boolean> validator, ho.p0<String> errorMessage) {
        return new u0<>((Set) Preconditions.checkNotNull(delegate), (ho.p0) Preconditions.checkNotNull(validator), (ho.p0) Preconditions.checkNotNull(errorMessage));
    }

    @Override // com.google.common.collect.e5, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f73592b.hashCode();
    }

    public final void x() {
        if (!this.f73591a.get().booleanValue()) {
            throw new IllegalStateException(this.f73593c.get());
        }
    }

    @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
    public Set<E> delegate() {
        x();
        return this.f73592b;
    }
}
