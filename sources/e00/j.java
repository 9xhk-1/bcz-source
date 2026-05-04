package e00;

import java.util.Comparator;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f48274a = new j();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@m80.k Comparable<Object> a11, @m80.k Comparable<Object> b11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        return a11.compareTo(b11);
    }

    @Override // java.util.Comparator
    @m80.k
    public final Comparator<Comparable<? super Object>> reversed() {
        return k.f48275a;
    }
}
