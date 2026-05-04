package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class v<F, T> extends s7<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ho.r<F, ? extends T> f34020c;

    /* renamed from: d, reason: collision with root package name */
    public final s7<T> f34021d;

    public v(ho.r<F, ? extends T> function, s7<T> ordering) {
        this.f34020c = (ho.r) Preconditions.checkNotNull(function);
        this.f34021d = (s7) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@t7 F f11, @t7 F f12) {
        return this.f34021d.compare(this.f34020c.apply(f11), this.f34020c.apply(f12));
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v) {
            v vVar = (v) object;
            if (this.f34020c.equals(vVar.f34020c) && this.f34021d.equals(vVar.f34021d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ho.d0.b(this.f34020c, this.f34021d);
    }

    public String toString() {
        return this.f34021d + ".onResultOf(" + this.f34020c + pn.j.f81007d;
    }
}
