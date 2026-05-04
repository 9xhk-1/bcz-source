package com.google.common.collect;

import com.google.common.collect.s7;
import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class y3<T> extends s7<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ImmutableMap<T, Integer> f34103c;

    public y3(List<T> valuesInOrder) {
        this(u6.Q(valuesInOrder));
    }

    public final int I(T value) {
        Integer num = this.f34103c.get(value);
        if (num != null) {
            return num.intValue();
        }
        throw new s7.c(value);
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(T left, T right) {
        return I(left) - I(right);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object instanceof y3) {
            return this.f34103c.equals(((y3) object).f34103c);
        }
        return false;
    }

    public int hashCode() {
        return this.f34103c.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f34103c.keySet() + pn.j.f81007d;
    }

    public y3(ImmutableMap<T, Integer> rankMap) {
        this.f34103c = rankMap;
    }
}
