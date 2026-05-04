package h10;

import a00.i0;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.c
@u0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1563#2:231\n1634#2,3:232\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n*E\n"})
/* loaded from: classes8.dex */
public final class x implements TypeVariable<GenericDeclaration>, v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f57963a;

    public x(@m80.k s typeParameter) {
        g0.p(typeParameter, "typeParameter");
        this.f57963a = typeParameter;
    }

    @m80.l
    public final <T extends Annotation> T a(@m80.k Class<T> annotationClass) {
        g0.p(annotationClass, "annotationClass");
        return null;
    }

    @m80.k
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @m80.k
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return g0.g(getName(), typeVariable.getName()) && g0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    @m80.k
    public Type[] getBounds() {
        Type c11;
        List<r> upperBounds = this.f57963a.getUpperBounds();
        ArrayList arrayList = new ArrayList(i0.d0(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            c11 = y.c((r) it.next(), true);
            arrayList.add(c11);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @m80.k
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f57963a));
    }

    @Override // java.lang.reflect.TypeVariable
    @m80.k
    public String getName() {
        return this.f57963a.getName();
    }

    @Override // java.lang.reflect.Type, h10.v
    @m80.k
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @m80.k
    public String toString() {
        return getTypeName();
    }
}
