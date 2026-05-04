package t20;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@k a other) {
        g0.p(other, "other");
        int compareTo = b().compareTo(other.b());
        if (compareTo == 0 && !c() && other.c()) {
            return 1;
        }
        return compareTo;
    }

    @k
    public abstract DeprecationLevelValue b();

    public abstract boolean c();
}
