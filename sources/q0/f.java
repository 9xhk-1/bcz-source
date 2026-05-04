package q0;

import android.view.View;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f<T extends View> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T f81362a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81363b;

    public f(@m80.k T t11, boolean z11) {
        this.f81362a = t11;
        this.f81363b = z11;
    }

    @Override // q0.j
    public boolean e() {
        return this.f81363b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(getView(), fVar.getView()) && e() == fVar.e();
    }

    @Override // q0.j
    @m80.k
    public T getView() {
        return this.f81362a;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(e());
    }
}
