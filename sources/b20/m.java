package b20;

import c20.b1;
import f20.y;
import f20.z;
import java.util.Map;
import kotlin.jvm.internal.g0;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k f5741a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.h f5742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5743c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<y, Integer> f5744d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.h<y, b1> f5745e;

    public m(@m80.k k c11, @m80.k p10.h containingDeclaration, @m80.k z typeParameterOwner, int i11) {
        g0.p(c11, "c");
        g0.p(containingDeclaration, "containingDeclaration");
        g0.p(typeParameterOwner, "typeParameterOwner");
        this.f5741a = c11;
        this.f5742b = containingDeclaration;
        this.f5743c = i11;
        this.f5744d = o30.a.d(typeParameterOwner.getTypeParameters());
        this.f5745e = c11.e().h(new l(this));
    }

    public static final b1 c(m mVar, y typeParameter) {
        g0.p(typeParameter, "typeParameter");
        Integer num = mVar.f5744d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new b1(c.k(c.c(mVar.f5741a, mVar), mVar.f5742b.getAnnotations()), typeParameter, mVar.f5743c + num.intValue(), mVar.f5742b);
    }

    @Override // b20.p
    @m80.l
    public c1 a(@m80.k y javaTypeParameter) {
        g0.p(javaTypeParameter, "javaTypeParameter");
        b1 invoke = this.f5745e.invoke(javaTypeParameter);
        return invoke != null ? invoke : this.f5741a.f().a(javaTypeParameter);
    }
}
