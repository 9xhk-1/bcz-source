package org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers;

import h90.d;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum MethodFilter {
    ONLY_GETTERS(new c() { // from class: org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter.a
        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter.c
        public boolean a(Method method) {
            return method.getReturnType() == Void.TYPE || method.getParameterTypes().length != 0;
        }
    }),
    ONLY_SETTERS(new c() { // from class: org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter.b
        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter.c
        public boolean a(Method method) {
            return method.getParameterTypes().length != 1;
        }
    });

    private c filter;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        boolean a(Method method);
    }

    MethodFilter(c cVar) {
        this.filter = cVar;
    }

    public boolean reject(Method method) {
        return this.filter.a(method);
    }

    public d toDescriptor(String str, Method method) {
        if (reject(method)) {
            return null;
        }
        return this == ONLY_SETTERS ? d.j(str, method) : d.h(str, method);
    }
}
