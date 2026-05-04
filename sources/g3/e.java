package g3;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Field f52664a;

    public e(Field field) {
        this.f52664a = field;
    }

    public Object a(Object obj) throws ReflectionException {
        try {
            return this.f52664a.get(obj);
        } catch (IllegalAccessException e11) {
            throw new ReflectionException("Illegal access to field: " + f(), e11);
        } catch (IllegalArgumentException e12) {
            throw new ReflectionException("Object is not an instance of " + d(), e12);
        }
    }

    public a b(Class<? extends Annotation> cls) {
        Annotation[] declaredAnnotations = this.f52664a.getDeclaredAnnotations();
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

    public a[] c() {
        Annotation[] declaredAnnotations = this.f52664a.getDeclaredAnnotations();
        a[] aVarArr = new a[declaredAnnotations.length];
        for (int i11 = 0; i11 < declaredAnnotations.length; i11++) {
            aVarArr[i11] = new a(declaredAnnotations[i11]);
        }
        return aVarArr;
    }

    public Class d() {
        return this.f52664a.getDeclaringClass();
    }

    public Class e(int i11) {
        Type genericType = this.f52664a.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        if (actualTypeArguments.length - 1 < i11) {
            return null;
        }
        Type type = actualTypeArguments[i11];
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (!(type instanceof GenericArrayType)) {
            return null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof Class) {
            return b.c((Class) genericComponentType, 0).getClass();
        }
        return null;
    }

    public String f() {
        return this.f52664a.getName();
    }

    public Class g() {
        return this.f52664a.getType();
    }

    public boolean h() {
        return this.f52664a.isAccessible();
    }

    public boolean i(Class<? extends Annotation> cls) {
        return this.f52664a.isAnnotationPresent(cls);
    }

    public boolean j() {
        return (l() || m() || n()) ? false : true;
    }

    public boolean k() {
        return Modifier.isFinal(this.f52664a.getModifiers());
    }

    public boolean l() {
        return Modifier.isPrivate(this.f52664a.getModifiers());
    }

    public boolean m() {
        return Modifier.isProtected(this.f52664a.getModifiers());
    }

    public boolean n() {
        return Modifier.isPublic(this.f52664a.getModifiers());
    }

    public boolean o() {
        return Modifier.isStatic(this.f52664a.getModifiers());
    }

    public boolean p() {
        return this.f52664a.isSynthetic();
    }

    public boolean q() {
        return Modifier.isTransient(this.f52664a.getModifiers());
    }

    public boolean r() {
        return Modifier.isVolatile(this.f52664a.getModifiers());
    }

    public void s(Object obj, Object obj2) throws ReflectionException {
        try {
            this.f52664a.set(obj, obj2);
        } catch (IllegalAccessException e11) {
            throw new ReflectionException("Illegal access to field: " + f(), e11);
        } catch (IllegalArgumentException e12) {
            throw new ReflectionException("Argument not valid for field: " + f(), e12);
        }
    }

    public void t(boolean z11) {
        this.f52664a.setAccessible(z11);
    }
}
