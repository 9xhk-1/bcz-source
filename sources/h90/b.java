package h90;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<AnnotatedElement, c> f59061a = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h90.b$b, reason: collision with other inner class name */
    public static class C0669b {

        /* renamed from: a, reason: collision with root package name */
        public Map<String, Object> f59062a;

        public C0669b() {
            this.f59062a = new HashMap();
        }

        public final Object c(String str) {
            return this.f59062a.get(str);
        }

        public final void d(String str, Object obj) {
            Class<?> cls;
            Class<?> cls2;
            if (!this.f59062a.containsKey(str)) {
                this.f59062a.put(str, obj);
                return;
            }
            Object obj2 = this.f59062a.get(str);
            if (obj2 == null || obj == null || (cls = obj2.getClass()) == (cls2 = obj.getClass()) || !cls2.isArray() || cls2.getComponentType() != obj2.getClass()) {
                return;
            }
            Object newInstance = Array.newInstance(cls, 1);
            Array.set(newInstance, 0, obj2);
            this.f59062a.put(str, newInstance);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Map<Annotation, C0669b> f59063a;

        public c() {
            this.f59063a = new HashMap();
        }

        public final Object c(Annotation annotation, String str) {
            C0669b c0669b = this.f59063a.get(annotation);
            if (c0669b == null) {
                return null;
            }
            return c0669b.c(str);
        }

        public final void d(Annotation annotation, String str, Object obj) {
            C0669b c0669b = this.f59063a.get(annotation);
            if (c0669b == null) {
                c0669b = new C0669b();
                this.f59063a.put(annotation, c0669b);
            }
            c0669b.d(str, obj);
        }
    }

    public static final synchronized Object a(AnnotatedElement annotatedElement, Annotation annotation, String str) {
        synchronized (b.class) {
            c cVar = f59061a.get(annotatedElement);
            if (cVar == null) {
                return null;
            }
            return cVar.c(annotation, str);
        }
    }

    public static final synchronized <T> T b(AnnotatedElement annotatedElement, Annotation annotation, String str, T t11) {
        synchronized (b.class) {
            if (annotatedElement == null) {
                return t11;
            }
            T t12 = (T) a(annotatedElement, annotation, str);
            return t12 == null ? t11 : t12;
        }
    }

    public static final void c() {
        f59061a.clear();
    }

    public static final synchronized void d(AnnotatedElement annotatedElement, Annotation annotation, String str, Object obj) {
        synchronized (b.class) {
            try {
                Map<AnnotatedElement, c> map = f59061a;
                c cVar = map.get(annotatedElement);
                if (cVar == null) {
                    cVar = new c();
                    map.put(annotatedElement, cVar);
                }
                cVar.d(annotation, str, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
