package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Field f34920a;

    public b(Field field) {
        com.google.gson.internal.a.b(field);
        this.f34920a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.f34920a.getAnnotation(cls);
    }

    public Collection<Annotation> b() {
        return Arrays.asList(this.f34920a.getAnnotations());
    }

    public Class<?> c() {
        return this.f34920a.getType();
    }

    public Type d() {
        return this.f34920a.getGenericType();
    }

    public Class<?> e() {
        return this.f34920a.getDeclaringClass();
    }

    public String f() {
        return this.f34920a.getName();
    }

    public boolean g(int i11) {
        return (i11 & this.f34920a.getModifiers()) != 0;
    }

    public String toString() {
        return this.f34920a.toString();
    }
}
