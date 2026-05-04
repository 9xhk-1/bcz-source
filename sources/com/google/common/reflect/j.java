package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aa;
import com.google.common.collect.i4;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public final class j implements AnnotatedElement {

    /* renamed from: a, reason: collision with root package name */
    public final g<?, ?> f34413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34414b;

    /* renamed from: c, reason: collision with root package name */
    public final TypeToken<?> f34415c;

    /* renamed from: d, reason: collision with root package name */
    public final ImmutableList<Annotation> f34416d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f34417e;

    public j(g<?, ?> declaration, int position, TypeToken<?> type, Annotation[] annotations, Object annotatedType) {
        this.f34413a = declaration;
        this.f34414b = position;
        this.f34415c = type;
        this.f34416d = ImmutableList.copyOf(annotations);
        this.f34417e = annotatedType;
    }

    public g<?, ?> a() {
        return this.f34413a;
    }

    public TypeToken<?> b() {
        return this.f34415c;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f34414b == jVar.f34414b && this.f34413a.equals(jVar.f34413a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        Preconditions.checkNotNull(annotationType);
        aa<Annotation> it = this.f34416d.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (annotationType.isInstance(next)) {
                return annotationType.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationType) {
        Preconditions.checkNotNull(annotationType);
        return (A) i4.u(this.f34416d).q(annotationType).r().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f34416d.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) i4.u(this.f34416d).q(cls).E(cls));
    }

    public int hashCode() {
        return this.f34414b;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) {
        return getAnnotation(annotationType) != null;
    }

    public String toString() {
        return this.f34415c + " arg" + this.f34414b;
    }
}
