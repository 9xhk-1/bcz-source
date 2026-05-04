package h90;

import g90.g;
import g90.l;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedElement f59083a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f59084b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f59085c;

    /* renamed from: d, reason: collision with root package name */
    public final g f59086d;

    /* renamed from: e, reason: collision with root package name */
    public int f59087e = -2;

    public e(AnnotatedElement annotatedElement, g gVar) {
        if (annotatedElement instanceof Field) {
            this.f59084b = (Field) annotatedElement;
            this.f59085c = null;
        } else {
            this.f59085c = (Method) annotatedElement;
            this.f59084b = null;
        }
        this.f59083a = annotatedElement;
        this.f59086d = gVar;
    }

    public String a() {
        return a.i(this.f59083a);
    }

    public int b() {
        g gVar;
        if (this.f59087e == -2) {
            l lVar = (l) a.p(this.f59083a, l.class);
            if (lVar != null) {
                int intValue = ((Integer) b.b(this.f59083a, lVar, "index", Integer.valueOf(lVar.index()))).intValue();
                this.f59087e = intValue;
                if (intValue != -1 && (gVar = this.f59086d) != null) {
                    Field field = this.f59084b;
                    if (field != null) {
                        this.f59087e = gVar.b(field, intValue);
                    } else {
                        this.f59087e = gVar.c(this.f59085c, intValue);
                    }
                }
            } else {
                this.f59087e = -1;
            }
        }
        return this.f59087e;
    }

    public String c() {
        AnnotatedElement annotatedElement = this.f59083a;
        String str = null;
        if (annotatedElement == null) {
            return null;
        }
        l lVar = (l) a.p(annotatedElement, l.class);
        if (lVar != null) {
            String[] strArr = (String[]) b.b(this.f59083a, lVar, "field", lVar.field());
            str = strArr.length == 0 ? e() : strArr[0];
            if (str.length() == 0) {
                str = e();
            }
        }
        g gVar = this.f59086d;
        if (gVar == null) {
            return str;
        }
        Field field = this.f59084b;
        return field != null ? gVar.e(field, str) : gVar.f(this.f59085c, str);
    }

    public AnnotatedElement d() {
        return this.f59083a;
    }

    public String e() {
        if (this.f59083a == null) {
            return null;
        }
        Field field = this.f59084b;
        return field != null ? field.getName() : this.f59085c.getName();
    }

    public boolean f() {
        Method method = this.f59085c;
        return (method == null || method.getParameterTypes().length != 0 || this.f59085c.getReturnType() == Void.TYPE) ? false : true;
    }

    public boolean g() {
        Method method = this.f59085c;
        return (method == null || method.getParameterTypes().length == 0) ? false : true;
    }
}
