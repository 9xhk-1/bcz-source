package g3;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Method f52665a;

    public f(Method method) {
        this.f52665a = method;
    }

    public a a(Class<? extends Annotation> cls) {
        Annotation[] declaredAnnotations = this.f52665a.getDeclaredAnnotations();
        if (declaredAnnotations == null) {
            return null;
        }
        for (Annotation annotation : declaredAnnotations) {
            if (annotation.annotationType().equals(cls)) {
                return new a(annotation);
            }
        }
        return null;
    }

    public a[] b() {
        Annotation[] declaredAnnotations = this.f52665a.getDeclaredAnnotations();
        a[] aVarArr = new a[declaredAnnotations.length];
        for (int i11 = 0; i11 < declaredAnnotations.length; i11++) {
            aVarArr[i11] = new a(declaredAnnotations[i11]);
        }
        return aVarArr;
    }

    public Class c() {
        return this.f52665a.getDeclaringClass();
    }

    public String d() {
        return this.f52665a.getName();
    }

    public Class[] e() {
        return this.f52665a.getParameterTypes();
    }

    public Class f() {
        return this.f52665a.getReturnType();
    }

    public Object g(Object obj, Object... objArr) throws ReflectionException {
        try {
            return this.f52665a.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new ReflectionException("Illegal access to method: " + d(), e11);
        } catch (IllegalArgumentException e12) {
            throw new ReflectionException("Illegal argument(s) supplied to method: " + d(), e12);
        } catch (InvocationTargetException e13) {
            throw new ReflectionException("Exception occurred in method: " + d(), e13);
        }
    }

    public boolean h() {
        return Modifier.isAbstract(this.f52665a.getModifiers());
    }

    public boolean i() {
        return this.f52665a.isAccessible();
    }

    public boolean j(Class<? extends Annotation> cls) {
        return this.f52665a.isAnnotationPresent(cls);
    }

    public boolean k() {
        return (n() || o() || p()) ? false : true;
    }

    public boolean l() {
        return Modifier.isFinal(this.f52665a.getModifiers());
    }

    public boolean m() {
        return Modifier.isNative(this.f52665a.getModifiers());
    }

    public boolean n() {
        return Modifier.isPrivate(this.f52665a.getModifiers());
    }

    public boolean o() {
        return Modifier.isProtected(this.f52665a.getModifiers());
    }

    public boolean p() {
        return Modifier.isPublic(this.f52665a.getModifiers());
    }

    public boolean q() {
        return Modifier.isStatic(this.f52665a.getModifiers());
    }

    public boolean r() {
        return this.f52665a.isVarArgs();
    }

    public void s(boolean z11) {
        this.f52665a.setAccessible(z11);
    }
}
