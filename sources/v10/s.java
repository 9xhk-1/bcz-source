package v10;

import a00.i0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import v10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaClassifierType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1#2:65\n1557#3:66\n1628#3,3:67\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n*L\n50#1:66\n50#1:67,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s extends e0 implements f20.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Type f92865b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f20.i f92866c;

    public s(@m80.k Type reflectType) {
        f20.i qVar;
        kotlin.jvm.internal.g0.p(reflectType, "reflectType");
        this.f92865b = reflectType;
        Type O = O();
        if (O instanceof Class) {
            qVar = new q((Class) O);
        } else if (O instanceof TypeVariable) {
            qVar = new f0((TypeVariable) O);
        } else {
            if (!(O instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + O.getClass() + "): " + O);
            }
            Type rawType = ((ParameterizedType) O).getRawType();
            kotlin.jvm.internal.g0.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f92866c = qVar;
    }

    @Override // f20.j
    @m80.k
    public String A() {
        throw new UnsupportedOperationException("Type not found: " + O());
    }

    @Override // f20.j
    public boolean I() {
        Type O = O();
        if (O instanceof Class) {
            TypeVariable[] typeParameters = ((Class) O).getTypeParameters();
            kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // v10.e0
    @m80.k
    public Type O() {
        return this.f92865b;
    }

    @Override // f20.d
    @m80.k
    public Collection<f20.a> getAnnotations() {
        return a00.h0.J();
    }

    @Override // v10.e0, f20.d
    @m80.l
    public f20.a i(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return null;
    }

    @Override // f20.j
    @m80.k
    public f20.i m() {
        return this.f92866c;
    }

    @Override // f20.j
    @m80.k
    public List<f20.x> t() {
        List<Type> h11 = f.h(O());
        e0.a aVar = e0.f92833a;
        ArrayList arrayList = new ArrayList(i0.d0(h11, 10));
        Iterator<T> it = h11.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // f20.d
    public boolean x() {
        return false;
    }

    @Override // f20.j
    @m80.k
    public String y() {
        return O().toString();
    }
}
