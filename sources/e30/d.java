package e30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d extends c1 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f48559e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f30.r f48560b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48561c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x20.k f48562d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public d(@m80.k f30.r originalTypeVariable, boolean z11) {
        kotlin.jvm.internal.g0.p(originalTypeVariable, "originalTypeVariable");
        this.f48560b = originalTypeVariable;
        this.f48561c = z11;
        this.f48562d = g30.i.b(ErrorScopeKind.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // e30.r0
    @m80.k
    public List<a2> G0() {
        return a00.h0.J();
    }

    @Override // e30.r0
    @m80.k
    public r1 H0() {
        return r1.f48652b.j();
    }

    @Override // e30.r0
    public boolean J0() {
        return this.f48561c;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: P0 */
    public c1 M0(boolean z11) {
        return z11 == J0() ? this : S0(z11);
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return this;
    }

    @m80.k
    public final f30.r R0() {
        return this.f48560b;
    }

    @m80.k
    public abstract d S0(boolean z11);

    @Override // e30.k2
    @m80.k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public d S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // e30.r0
    @m80.k
    public x20.k r() {
        return this.f48562d;
    }
}
