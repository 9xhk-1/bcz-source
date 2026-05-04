package com.google.common.reflect;

import com.google.common.collect.q8;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final Set<Type> f34432a = q8.u();

    public final void a(Type... types) {
        for (Type type : types) {
            if (type != null && this.f34432a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        c((GenericArrayType) type);
                    }
                } catch (Throwable th2) {
                    this.f34432a.remove(type);
                    throw th2;
                }
            }
        }
    }

    public void b(Class<?> t11) {
    }

    public void c(GenericArrayType t11) {
    }

    public void d(ParameterizedType t11) {
    }

    public void e(TypeVariable<?> t11) {
    }

    public void f(WildcardType t11) {
    }
}
