package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public abstract class g<T, R> implements AnnotatedElement, Member {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f34405c = k();

    /* renamed from: a, reason: collision with root package name */
    public final AccessibleObject f34406a;

    /* renamed from: b, reason: collision with root package name */
    public final Member f34407b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> extends g<T, T> {

        /* renamed from: d, reason: collision with root package name */
        public final Constructor<?> f34408d;

        public a(Constructor<?> constructor) {
            super(constructor);
            this.f34408d = constructor;
        }

        public final boolean F() {
            Class<?> declaringClass = this.f34408d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            return declaringClass.getEnclosingMethod() != null ? !Modifier.isStatic(r1.getModifiers()) : (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.g
        public Type[] d() {
            return this.f34408d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.g
        public Type[] e() {
            Type[] genericParameterTypes = this.f34408d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !F()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f34408d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.g
        public Type f() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? s.l(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.g
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f34408d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.g
        public final Annotation[][] h() {
            return this.f34408d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.g
        public final Object m(@CheckForNull Object receiver, Object[] args) throws InvocationTargetException, IllegalAccessException {
            try {
                return this.f34408d.newInstance(args);
            } catch (InstantiationException e11) {
                throw new RuntimeException(this.f34408d + " failed.", e11);
            }
        }

        @Override // com.google.common.reflect.g
        public final boolean r() {
            return false;
        }

        @Override // com.google.common.reflect.g
        public final boolean z() {
            return this.f34408d.isVarArgs();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> extends g<T, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final Method f34409d;

        public b(Method method) {
            super(method);
            this.f34409d = method;
        }

        @Override // com.google.common.reflect.g
        public Type[] d() {
            return this.f34409d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.g
        public Type[] e() {
            return this.f34409d.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.g
        public Type f() {
            return this.f34409d.getGenericReturnType();
        }

        @Override // com.google.common.reflect.g
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f34409d.getTypeParameters();
        }

        @Override // com.google.common.reflect.g
        public final Annotation[][] h() {
            return this.f34409d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.g
        @CheckForNull
        public final Object m(@CheckForNull Object receiver, Object[] args) throws InvocationTargetException, IllegalAccessException {
            return this.f34409d.invoke(receiver, args);
        }

        @Override // com.google.common.reflect.g
        public final boolean r() {
            return (p() || t() || w() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.g
        public final boolean z() {
            return this.f34409d.isVarArgs();
        }
    }

    public <M extends AccessibleObject & Member> g(M member) {
        Preconditions.checkNotNull(member);
        this.f34406a = member;
        this.f34407b = member;
    }

    public static <T> g<T, T> a(Constructor<T> constructor) {
        return new a(constructor);
    }

    public static g<?, Object> b(Method method) {
        return new b(method);
    }

    public static boolean k() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final boolean A() {
        return Modifier.isVolatile(getModifiers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> g<T, R1> B(TypeToken<R1> returnType) {
        if (returnType.isSupertypeOf(j())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + j() + ", not " + returnType);
    }

    public final <R1 extends R> g<T, R1> C(Class<R1> returnType) {
        return B(TypeToken.of((Class) returnType));
    }

    public final void D(boolean flag) {
        this.f34406a.setAccessible(flag);
    }

    public final boolean E() {
        try {
            this.f34406a.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final ImmutableList<TypeToken<? extends Throwable>> c() {
        ImmutableList.a builder = ImmutableList.builder();
        for (Type type : d()) {
            builder.g(TypeToken.of(type));
        }
        return builder.e();
    }

    public abstract Type[] d();

    public abstract Type[] e();

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (g().equals(gVar.g()) && this.f34407b.equals(gVar.f34407b)) {
                return true;
            }
        }
        return false;
    }

    public abstract Type f();

    public TypeToken<T> g() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f34406a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f34406a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f34406a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f34407b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f34407b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f34407b.getName();
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public abstract Annotation[][] h();

    public int hashCode() {
        return this.f34407b.hashCode();
    }

    @e
    public final ImmutableList<j> i() {
        Type[] e11 = e();
        Annotation[][] h11 = h();
        Object[] objArr = new Object[e11.length];
        ImmutableList.a builder = ImmutableList.builder();
        for (int i11 = 0; i11 < e11.length; i11++) {
            builder.g(new j(this, i11, TypeToken.of(e11[i11]), h11[i11], objArr[i11]));
        }
        return builder.e();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
        return this.f34406a.isAnnotationPresent(annotationClass);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f34407b.isSynthetic();
    }

    public final TypeToken<? extends R> j() {
        return (TypeToken<? extends R>) TypeToken.of(f());
    }

    @CheckForNull
    @uo.a
    public final R l(@CheckForNull T t11, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return (R) m(t11, (Object[]) Preconditions.checkNotNull(objArr));
    }

    @CheckForNull
    public abstract Object m(@CheckForNull Object receiver, Object[] args) throws InvocationTargetException, IllegalAccessException;

    public final boolean n() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean o() {
        return this.f34406a.isAccessible();
    }

    public final boolean p() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean q() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean r();

    public final boolean s() {
        return (t() || v() || u()) ? false : true;
    }

    public final boolean t() {
        return Modifier.isPrivate(getModifiers());
    }

    public String toString() {
        return this.f34407b.toString();
    }

    public final boolean u() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean v() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean w() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean x() {
        return Modifier.isSynchronized(getModifiers());
    }

    public final boolean y() {
        return Modifier.isTransient(getModifiers());
    }

    public abstract boolean z();
}
