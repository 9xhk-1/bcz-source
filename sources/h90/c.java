package h90;

import g90.g;
import g90.l;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f59064a;

    /* renamed from: b, reason: collision with root package name */
    public final AnnotatedElement f59065b;

    /* renamed from: c, reason: collision with root package name */
    public int f59066c;

    /* renamed from: d, reason: collision with root package name */
    public NormalizedString f59067d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f59068e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f59069f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f59070g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f59071h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f59072i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f59073j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f59074k = null;

    /* renamed from: l, reason: collision with root package name */
    public Class f59075l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f59076m;

    public c(Class<?> cls, AnnotatedElement annotatedElement, i90.b bVar, g gVar, NormalizedString[] normalizedStringArr) {
        Class<?> cls2;
        this.f59068e = cls;
        this.f59065b = annotatedElement;
        if (annotatedElement instanceof Field) {
            this.f59069f = bVar != null ? bVar.c() : null;
            this.f59070g = bVar != null ? bVar.d() : null;
        } else {
            Method method = (Method) annotatedElement;
            this.f59069f = method.getReturnType() != Void.class ? method : null;
            this.f59070g = method.getParameterTypes().length != 0 ? method : null;
        }
        if (annotatedElement != null) {
            cls2 = a.M(annotatedElement);
            this.f59064a = a.B(annotatedElement);
        } else {
            Method method2 = this.f59070g;
            if (method2 == null || method2.getParameterTypes().length != 1) {
                Method method3 = this.f59069f;
                if (method3 != null) {
                    this.f59064a = method3.getDeclaringClass();
                } else {
                    this.f59064a = cls;
                }
                cls2 = Object.class;
            } else {
                cls2 = this.f59070g.getParameterTypes()[0];
                this.f59064a = this.f59070g.getDeclaringClass();
            }
        }
        this.f59072i = cls2.isPrimitive();
        Object E = a.E(cls2);
        this.f59073j = E;
        this.f59076m = E instanceof Number;
        this.f59075l = cls2;
        b(gVar, normalizedStringArr);
    }

    public boolean a(Object obj) {
        if (this.f59072i) {
            return obj instanceof Number ? this.f59076m : obj instanceof Boolean ? this.f59075l == Boolean.TYPE : (obj instanceof Character) && this.f59075l == Character.TYPE;
        }
        if (obj == null) {
            return true;
        }
        return this.f59075l.isAssignableFrom(obj.getClass());
    }

    public final void b(g gVar, NormalizedString[] normalizedStringArr) {
        String str;
        l lVar = (l) a.p(this.f59065b, l.class);
        String str2 = "";
        if (lVar != null) {
            int intValue = ((Integer) b.b(this.f59065b, lVar, "index", Integer.valueOf(lVar.index()))).intValue();
            this.f59066c = intValue;
            if (intValue >= 0) {
                this.f59067d = null;
                if (gVar != null) {
                    this.f59066c = gVar.a(this.f59065b, intValue);
                    return;
                }
                return;
            }
            String[] strArr = (String[]) b.b(this.f59065b, lVar, "field", lVar.field());
            if (strArr.length <= 1 || normalizedStringArr == null) {
                str = "";
            } else {
                str = "";
                for (NormalizedString normalizedString : normalizedStringArr) {
                    if (normalizedString != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < strArr.length) {
                                String str3 = strArr[i11];
                                if (normalizedString.equals(str3)) {
                                    str = str3;
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                }
            }
            if (!str.isEmpty()) {
                str2 = str;
            } else if (strArr.length != 0) {
                str2 = strArr[0];
            }
        }
        if (str2.isEmpty()) {
            str2 = a.H(this.f59065b);
        }
        NormalizedString valueOf = NormalizedString.valueOf(str2);
        this.f59067d = valueOf;
        if (lVar == null || gVar == null) {
            return;
        }
        int i12 = this.f59066c;
        if (i12 >= 0) {
            this.f59066c = gVar.a(this.f59065b, i12);
        } else if (valueOf != null) {
            this.f59067d = NormalizedString.valueOf(gVar.d(this.f59065b, valueOf.toString()));
        }
    }

    public NormalizedString c() {
        return this.f59067d;
    }

    public Class<?> d() {
        return this.f59064a;
    }

    public Class<?> e() {
        return this.f59075l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f59066c != cVar.f59066c || !this.f59065b.equals(cVar.f59065b)) {
            return false;
        }
        NormalizedString normalizedString = this.f59067d;
        if (normalizedString == null ? cVar.f59067d == null : normalizedString.equals(cVar.f59067d)) {
            return this.f59068e.equals(cVar.f59068e);
        }
        return false;
    }

    public int f() {
        return this.f59066c;
    }

    public AnnotatedElement g() {
        return this.f59065b;
    }

    public boolean h() {
        return this.f59066c < 0;
    }

    public int hashCode() {
        int hashCode = ((this.f59065b.hashCode() * 31) + this.f59066c) * 31;
        NormalizedString normalizedString = this.f59067d;
        return ((hashCode + (normalizedString != null ? normalizedString.hashCode() : 0)) * 31) + this.f59068e.hashCode();
    }

    public boolean i() {
        return this.f59066c >= 0;
    }

    public Object j(Object obj) {
        return k(obj, false);
    }

    public final Object k(Object obj, boolean z11) {
        l();
        try {
            Method method = this.f59069f;
            return method != null ? method.invoke(obj, null) : ((Field) this.f59065b).get(obj);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof InvocationTargetException) {
                th = th.getCause();
            }
            if (z11) {
                return null;
            }
            String str = "Unable to get value from field: " + toString();
            if (!(th instanceof DataProcessingException)) {
                throw new DataProcessingException(str, th);
            }
            DataProcessingException dataProcessingException = (DataProcessingException) th;
            dataProcessingException.setDetails(str);
            throw dataProcessingException;
        }
    }

    public final void l() {
        if (this.f59071h) {
            return;
        }
        AnnotatedElement annotatedElement = this.f59065b;
        if (annotatedElement instanceof Field) {
            Field field = (Field) annotatedElement;
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
        } else if (annotatedElement instanceof Method) {
            Method method = (Method) annotatedElement;
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
        }
        this.f59071h = true;
    }

    public void m(String str) {
        this.f59067d = NormalizedString.valueOf(str);
    }

    public void n(NormalizedString normalizedString) {
        this.f59067d = normalizedString;
    }

    public void o(int i11) {
        this.f59066c = i11;
    }

    public void p(Object obj, Object obj2) {
        String str;
        l();
        try {
            if (this.f59072i) {
                if (obj2 == null) {
                    if (this.f59074k == null) {
                        this.f59074k = Boolean.valueOf(this.f59073j.equals(k(obj, true)));
                    }
                    if (this.f59074k != Boolean.TRUE) {
                        return;
                    } else {
                        obj2 = this.f59073j;
                    }
                } else if (this.f59073j.getClass() != obj2.getClass() && (obj2 instanceof Number)) {
                    Number number = (Number) obj2;
                    Class cls = this.f59075l;
                    if (cls == Integer.TYPE) {
                        obj2 = Integer.valueOf(number.intValue());
                    } else if (cls == Long.TYPE) {
                        obj2 = Long.valueOf(number.longValue());
                    } else if (cls == Double.TYPE) {
                        obj2 = Double.valueOf(number.doubleValue());
                    } else if (cls == Float.TYPE) {
                        obj2 = Float.valueOf(number.floatValue());
                    } else if (cls == Byte.TYPE) {
                        obj2 = Byte.valueOf(number.byteValue());
                    } else if (cls == Short.TYPE) {
                        obj2 = Short.valueOf(number.shortValue());
                    }
                }
            }
            Method method = this.f59070g;
            if (method != null) {
                method.invoke(obj, obj2);
            } else {
                ((Field) this.f59065b).set(obj, obj2);
            }
        } catch (Throwable th2) {
            th = th2;
            String str2 = null;
            String name = obj2 == null ? null : obj2.getClass().getName();
            if (name != null) {
                str = "Unable to set value '{value}' of type '" + name + "' to " + toString();
            } else {
                str = "Unable to set value 'null' to " + toString();
            }
            if (th instanceof InvocationTargetException) {
                th = th.getCause();
                str2 = str;
            }
            if (!(th instanceof DataProcessingException)) {
                DataProcessingException dataProcessingException = new DataProcessingException(str, th);
                dataProcessingException.markAsNonFatal();
                dataProcessingException.setValue(obj2);
                throw dataProcessingException;
            }
            DataProcessingException dataProcessingException2 = (DataProcessingException) th;
            dataProcessingException2.markAsNonFatal();
            dataProcessingException2.setValue(obj2);
            dataProcessingException2.setDetails(str2);
            throw dataProcessingException2;
        }
    }

    public String toString() {
        return a.i(this.f59065b);
    }
}
