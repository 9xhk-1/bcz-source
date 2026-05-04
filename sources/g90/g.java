package g90;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class g {
    public final int a(AnnotatedElement annotatedElement, int i11) {
        return annotatedElement instanceof Field ? b((Field) annotatedElement, i11) : c((Method) annotatedElement, i11);
    }

    public final String d(AnnotatedElement annotatedElement, String str) {
        return annotatedElement instanceof Field ? e((Field) annotatedElement, str) : f((Method) annotatedElement, str);
    }

    public int b(Field field, int i11) {
        return i11;
    }

    public int c(Method method, int i11) {
        return i11;
    }

    public String e(Field field, String str) {
        return str;
    }

    public String f(Method method, String str) {
        return str;
    }
}
