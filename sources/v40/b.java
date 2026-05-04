package v40;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Pair<l<T, Boolean>, e<T>>> f92964a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k List<? extends Pair<? extends l<? super T, Boolean>, ? extends e<? super T>>> formatters) {
        g0.p(formatters, "formatters");
        this.f92964a = formatters;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        for (Pair<l<T, Boolean>, e<T>> pair : this.f92964a) {
            l<T, Boolean> component1 = pair.component1();
            e<T> component2 = pair.component2();
            if (component1.invoke(t11).booleanValue()) {
                component2.b(t11, builder, z11);
                return;
            }
        }
    }
}
