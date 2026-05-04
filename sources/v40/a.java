package v40;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<e<T>> f92963a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.k List<? extends e<? super T>> formatters) {
        g0.p(formatters, "formatters");
        this.f92963a = formatters;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        Iterator<e<T>> it = this.f92963a.iterator();
        while (it.hasNext()) {
            it.next().b(t11, builder, z11);
        }
    }
}
