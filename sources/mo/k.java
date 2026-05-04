package mo;

import com.google.common.base.Optional;
import com.google.common.graph.ElementOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class k<N> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73533a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f73534b = false;

    /* renamed from: c, reason: collision with root package name */
    public ElementOrder<N> f73535c = ElementOrder.d();

    /* renamed from: d, reason: collision with root package name */
    public ElementOrder<N> f73536d = ElementOrder.i();

    /* renamed from: e, reason: collision with root package name */
    public Optional<Integer> f73537e = Optional.absent();

    public k(boolean directed) {
        this.f73533a = directed;
    }
}
