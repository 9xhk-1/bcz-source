package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class e3<T> extends s7<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator<T> f33402c;

    public e3(Comparator<T> comparator) {
        this.f33402c = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@t7 T a11, @t7 T b11) {
        return this.f33402c.compare(a11, b11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e3) {
            return this.f33402c.equals(((e3) object).f33402c);
        }
        return false;
    }

    public int hashCode() {
        return this.f33402c.hashCode();
    }

    public String toString() {
        return this.f33402c.toString();
    }
}
