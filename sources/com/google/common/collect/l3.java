package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class l3<T> extends s7<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator<? super T>[] f33628c;

    public l3(Comparator<? super T> primary, Comparator<? super T> secondary) {
        this.f33628c = new Comparator[]{primary, secondary};
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@t7 T left, @t7 T right) {
        int i11 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f33628c;
            if (i11 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i11].compare(left, right);
            if (compare != 0) {
                return compare;
            }
            i11++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof l3) {
            return Arrays.equals(this.f33628c, ((l3) object).f33628c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f33628c);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f33628c) + pn.j.f81007d;
    }

    public l3(Iterable<? extends Comparator<? super T>> comparators) {
        this.f33628c = (Comparator[]) k6.R(comparators, new Comparator[0]);
    }
}
