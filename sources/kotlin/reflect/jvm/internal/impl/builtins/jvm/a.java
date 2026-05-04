package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import a00.h0;
import d30.n;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import m80.k;
import p10.o;
import p10.x0;
import q10.g;
import s10.o0;
import x20.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C0790a f67221e = new C0790a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final n20.f f67222f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a, reason: collision with other inner class name */
    public static final class C0790a {
        public /* synthetic */ C0790a(v vVar) {
            this();
        }

        @k
        public final n20.f a() {
            return a.f67222f;
        }

        public C0790a() {
        }
    }

    static {
        n20.f f11 = n20.f.f("clone");
        g0.o(f11, "identifier(...)");
        f67222f = f11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k n storageManager, @k p10.b containingClass) {
        super(storageManager, containingClass);
        g0.p(storageManager, "storageManager");
        g0.p(containingClass, "containingClass");
    }

    @Override // x20.f
    @k
    public List<e> k() {
        o0 g12 = o0.g1(n(), g.A0.b(), f67222f, CallableMemberDescriptor.Kind.DECLARATION, x0.f78622a);
        g12.M0(null, n().W(), h0.J(), h0.J(), h0.J(), u20.e.m(n()).i(), Modality.OPEN, o.f78588c);
        return a00.g0.l(g12);
    }
}
