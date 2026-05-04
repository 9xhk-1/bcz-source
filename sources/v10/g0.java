package v10;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaValueParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaValueParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaValueParameter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes8.dex */
public final class g0 extends u implements f20.b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e0 f92840a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Annotation[] f92841b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f92842c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92843d;

    public g0(@m80.k e0 type, @m80.k Annotation[] reflectAnnotations, @m80.l String str, boolean z11) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(reflectAnnotations, "reflectAnnotations");
        this.f92840a = type;
        this.f92841b = reflectAnnotations;
        this.f92842c = str;
        this.f92843d = z11;
    }

    @Override // f20.b0
    @m80.k
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public e0 getType() {
        return this.f92840a;
    }

    @Override // f20.b0
    public boolean b() {
        return this.f92843d;
    }

    @Override // f20.b0
    @m80.l
    public n20.f getName() {
        String str = this.f92842c;
        if (str != null) {
            return n20.f.e(str);
        }
        return null;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g0.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // f20.d
    public boolean x() {
        return false;
    }

    @Override // f20.d
    @m80.k
    public List<g> getAnnotations() {
        return k.b(this.f92841b);
    }

    @Override // f20.d
    @m80.l
    public g i(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return k.a(this.f92841b, fqName);
    }
}
