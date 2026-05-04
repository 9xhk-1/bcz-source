package g3;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f52663a;

    public d(Constructor constructor) {
        this.f52663a = constructor;
    }

    public Class a() {
        return this.f52663a.getDeclaringClass();
    }

    public Class[] b() {
        return this.f52663a.getParameterTypes();
    }

    public boolean c() {
        return this.f52663a.isAccessible();
    }

    public Object d(Object... objArr) throws ReflectionException {
        try {
            return this.f52663a.newInstance(objArr);
        } catch (IllegalAccessException e11) {
            throw new ReflectionException("Could not instantiate instance of class: " + a().getName(), e11);
        } catch (IllegalArgumentException e12) {
            throw new ReflectionException("Illegal argument(s) supplied to constructor for class: " + a().getName(), e12);
        } catch (InstantiationException e13) {
            throw new ReflectionException("Could not instantiate instance of class: " + a().getName(), e13);
        } catch (InvocationTargetException e14) {
            throw new ReflectionException("Exception occurred in constructor for class: " + a().getName(), e14);
        }
    }

    public void e(boolean z11) {
        this.f52663a.setAccessible(z11);
    }
}
