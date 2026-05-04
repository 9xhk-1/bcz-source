package h90;

import com.huawei.hms.framework.common.ContainerUtils;
import g90.h;
import g90.j;
import g90.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TimeZone;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.EnumSelector;
import r90.g;
import r90.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static AnnotatedElement f59056a;

    /* renamed from: b, reason: collision with root package name */
    public static Class<? extends Annotation> f59057b;

    /* renamed from: c, reason: collision with root package name */
    public static Annotation f59058c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<Class> f59059d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final Set<Class> f59060e = new HashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h90.a$a, reason: collision with other inner class name */
    public static class C0668a implements Comparator<e> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            int b11 = eVar.b();
            int b12 = eVar2.b();
            if (b11 < b12) {
                return -1;
            }
            return b11 == b12 ? 0 : 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Annotation {
        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return b.class;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0320  */
    /* JADX WARN: Type inference failed for: r9v21, types: [r90.e] */
    /* JADX WARN: Type inference failed for: r9v22, types: [r90.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r90.g A(java.lang.Class r9, java.lang.reflect.AnnotatedElement r10, java.lang.annotation.Annotation r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h90.a.A(java.lang.Class, java.lang.reflect.AnnotatedElement, java.lang.annotation.Annotation, java.lang.String, java.lang.String):r90.g");
    }

    public static Class<?> B(AnnotatedElement annotatedElement) {
        return annotatedElement instanceof Field ? ((Field) annotatedElement).getDeclaringClass() : ((Method) annotatedElement).getDeclaringClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r90.g C(java.lang.Class r5, java.lang.reflect.AnnotatedElement r6, g90.l r7) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h90.a.C(java.lang.Class, java.lang.reflect.AnnotatedElement, g90.l):r90.g");
    }

    public static g D(AnnotatedElement annotatedElement) {
        return C(M(annotatedElement), annotatedElement, (l) p(annotatedElement, l.class));
    }

    public static final Object E(Class cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        return cls == Short.TYPE ? (short) 0 : null;
    }

    public static List<e> F(Class cls, boolean z11, g90.g gVar, MethodFilter methodFilter) {
        ArrayList arrayList = new ArrayList();
        List<e> G = G(cls, z11, arrayList, gVar, methodFilter);
        Collections.sort(G, new C0668a());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        int i11 = -1;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            i11++;
            if (intValue >= 0 && intValue != i11) {
                while (intValue >= G.size()) {
                    G.add(null);
                }
                Collections.swap(G, intValue, i11);
            }
        }
        return G;
    }

    public static List<e> G(Class cls, boolean z11, List<Integer> list, g90.g gVar, MethodFilter methodFilter) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Field> it = t(cls).keySet().iterator();
        while (it.hasNext()) {
            R(it.next(), z11, list, arrayList, linkedHashMap, gVar, methodFilter);
        }
        Iterator<Method> it2 = x(cls, methodFilter).iterator();
        while (it2.hasNext()) {
            R(it2.next(), z11, list, arrayList, linkedHashMap, gVar, methodFilter);
        }
        if (!linkedHashMap.isEmpty()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                List list2 = (List) linkedHashMap.remove(((e) arrayList.get(size)).d());
                if (list2 != null) {
                    arrayList.remove(size);
                    arrayList.addAll(size, list2);
                    if (linkedHashMap.isEmpty()) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static String H(AnnotatedElement annotatedElement) {
        return annotatedElement instanceof Field ? ((Field) annotatedElement).getName() : ((Method) annotatedElement).getName();
    }

    public static String I(AnnotatedElement annotatedElement, l lVar) {
        if (lVar == null) {
            return null;
        }
        return J((String) h90.b.b(annotatedElement, lVar, "defaultNullRead", lVar.defaultNullRead()));
    }

    public static String J(String str) {
        if ("null".equals(str)) {
            return null;
        }
        return "'null'".equals(str) ? "null" : str;
    }

    public static String K(AnnotatedElement annotatedElement, l lVar) {
        if (lVar == null) {
            return null;
        }
        return J((String) h90.b.b(annotatedElement, lVar, "defaultNullWrite", lVar.defaultNullWrite()));
    }

    public static Integer[] L(Class<?> cls, MethodFilter methodFilter) {
        int b11;
        ArrayList arrayList = new ArrayList();
        for (e eVar : F(cls, true, null, methodFilter)) {
            if (eVar != null && (b11 = eVar.b()) != -1) {
                if (methodFilter == MethodFilter.ONLY_GETTERS && arrayList.contains(Integer.valueOf(b11))) {
                    throw new IllegalArgumentException("Duplicate field index '" + b11 + "' found in attribute '" + eVar.e() + "' of class " + cls.getName());
                }
                arrayList.add(Integer.valueOf(b11));
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    public static Class<?> M(AnnotatedElement annotatedElement) {
        if (annotatedElement instanceof Field) {
            return ((Field) annotatedElement).getType();
        }
        Method method = (Method) annotatedElement;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            return parameterTypes[0];
        }
        if (parameterTypes.length > 1) {
            throw new IllegalArgumentException("Method " + i(annotatedElement) + " cannot have multiple parameters");
        }
        Class<?> returnType = method.getReturnType();
        if (returnType != Void.TYPE) {
            return returnType;
        }
        throw new IllegalArgumentException("Method " + i(annotatedElement) + " must return a value if it has no input parameter");
    }

    public static Object N(Annotation annotation, Method method) {
        try {
            return method.invoke(annotation, null);
        } catch (Exception e11) {
            throw new IllegalStateException("Can't read value from annotation " + annotation, e11);
        }
    }

    public static void O(Object obj, i90.b bVar, String str) {
        Method d11 = bVar.d();
        if (d11 == null) {
            DataProcessingException dataProcessingException = new DataProcessingException("Cannot set property '" + bVar.a() + "' of formatter '" + obj.getClass() + "' to '{value}'. No setter defined");
            dataProcessingException.setValue(str);
            throw dataProcessingException;
        }
        Class<?> cls = d11.getParameterTypes()[0];
        Object valueOf = cls == String.class ? str : (cls == Integer.class || cls == Integer.TYPE) ? Integer.valueOf(Integer.parseInt(str)) : (cls == Character.class || cls == Character.TYPE) ? Character.valueOf(str.charAt(0)) : cls == Currency.class ? Currency.getInstance(str) : (cls == Boolean.class || cls == Boolean.TYPE) ? Boolean.valueOf(str) : cls == TimeZone.class ? TimeZone.getTimeZone(str) : cls == DateFormatSymbols.class ? DateFormatSymbols.getInstance(new Locale(str)) : null;
        if (valueOf == null) {
            DataProcessingException dataProcessingException2 = new DataProcessingException("Cannot set property '" + bVar.a() + "' of formatter '" + obj.getClass() + ". Cannot convert '{value}' to instance of " + cls);
            dataProcessingException2.setValue(str);
            throw dataProcessingException2;
        }
        try {
            d11.invoke(obj, valueOf);
        } catch (Throwable th2) {
            DataProcessingException dataProcessingException3 = new DataProcessingException("Error setting property '" + bVar.a() + "' of formatter '" + obj.getClass() + ", with '{parameterValue}' (converted from '{value}')", th2);
            dataProcessingException3.setValue("parameterValue", valueOf);
            dataProcessingException3.setValue(str);
            throw dataProcessingException3;
        }
    }

    public static boolean P(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Set<Class> set = f59060e;
        if (set.contains(annotationType)) {
            return true;
        }
        Set<Class> set2 = f59059d;
        if (set2.contains(annotationType)) {
            return false;
        }
        if (annotationType.getName().startsWith("java.lang.annotation")) {
            set2.add(annotationType);
            return false;
        }
        set.add(annotationType);
        return true;
    }

    public static <T> T Q(Class cls, Class<T> cls2, String[] strArr) {
        if (!cls.isAssignableFrom(cls2)) {
            throw new DataProcessingException("Not a valid " + cls.getSimpleName() + " class: '" + cls2.getSimpleName() + "' (" + cls2.getName() + ')');
        }
        try {
            return cls2.getConstructor(String[].class).newInstance(strArr);
        } catch (NoSuchMethodException e11) {
            if (strArr.length != 0) {
                throw new DataProcessingException("Could not find a public constructor with a String[] parameter in custom " + cls.getSimpleName() + " class '" + cls2.getSimpleName() + "' (" + cls2.getName() + ')', e11);
            }
            try {
                return cls2.newInstance();
            } catch (Exception unused) {
                throw new DataProcessingException("Unexpected error instantiating custom " + cls.getSimpleName() + " class '" + cls2.getSimpleName() + "' (" + cls2.getName() + ')', e11);
            }
        } catch (Exception e12) {
            throw new DataProcessingException("Unexpected error instantiating custom " + cls.getSimpleName() + " class '" + cls2.getSimpleName() + "' (" + cls2.getName() + ')', e12);
        }
    }

    public static void R(AnnotatedElement annotatedElement, boolean z11, List<Integer> list, List<e> list2, Map<AnnotatedElement, List<e>> map, g90.g gVar, MethodFilter methodFilter) {
        j jVar;
        if (((l) p(annotatedElement, l.class)) != null) {
            e eVar = new e(annotatedElement, gVar);
            if (methodFilter == MethodFilter.ONLY_GETTERS && eVar.b() >= 0 && list.contains(Integer.valueOf(eVar.b()))) {
                throw new IllegalArgumentException("Duplicate field index '" + eVar.b() + "' found in " + i(annotatedElement));
            }
            list2.add(eVar);
            list.add(Integer.valueOf(eVar.b()));
        }
        if (!z11 || (jVar = (j) p(annotatedElement, j.class)) == null) {
            return;
        }
        list2.add(new e(annotatedElement, null));
        Class<?> cls = (Class) h90.b.b(annotatedElement, jVar, "type", jVar.type());
        if (cls == Object.class) {
            cls = M(annotatedElement);
        }
        Class cls2 = (Class) h90.b.b(annotatedElement, jVar, "headerTransformer", jVar.headerTransformer());
        if (cls2 != g90.g.class) {
            map.put(annotatedElement, G(cls, true, list, (g90.g) Q(g90.g.class, cls2, (String[]) h90.b.b(annotatedElement, jVar, "args", jVar.args())), methodFilter));
        } else {
            map.put(annotatedElement, G(cls, true, list, gVar, methodFilter));
        }
    }

    public static boolean a(Class<?> cls) {
        return c(false, cls, MethodFilter.ONLY_SETTERS);
    }

    public static boolean b(Class<?> cls) {
        return c(false, cls, MethodFilter.ONLY_GETTERS);
    }

    public static boolean c(boolean z11, Class<?> cls, MethodFilter methodFilter) {
        boolean z12 = false;
        for (e eVar : F(cls, true, null, methodFilter)) {
            if (eVar != null && eVar.d() != null) {
                AnnotatedElement d11 = eVar.d();
                if (!(d11 instanceof Method) || !methodFilter.reject((Method) d11)) {
                    l lVar = (l) p(d11, l.class);
                    if (lVar == null) {
                        continue;
                    } else {
                        int intValue = ((Integer) h90.b.b(d11, lVar, "index", Integer.valueOf(lVar.index()))).intValue();
                        if ((intValue != -1 && z11) || (intValue == -1 && !z11)) {
                            return false;
                        }
                        z12 = true;
                    }
                }
            }
        }
        return z12;
    }

    public static boolean d(Class<?> cls) {
        return c(true, cls, MethodFilter.ONLY_SETTERS);
    }

    public static boolean e(Class<?> cls) {
        return c(true, cls, MethodFilter.ONLY_GETTERS);
    }

    public static void f(Object obj, String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            if (str != null) {
                String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split.length != 2) {
                    throw new DataProcessingException("Illegal format setting '" + str + "' among: " + Arrays.toString(strArr));
                }
                hashMap.put(split[0], split[1]);
            }
        }
        try {
            for (i90.b bVar : i90.a.d(obj.getClass())) {
                String str2 = (String) hashMap.remove(bVar.a());
                if (str2 != null) {
                    O(obj, bVar, str2);
                }
                if ("decimalFormatSymbols".equals(bVar.a())) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                    try {
                        boolean z11 = false;
                        for (i90.b bVar2 : i90.a.d(decimalFormatSymbols.getClass())) {
                            String str3 = (String) hashMap.remove(bVar2.a());
                            if (str3 != null) {
                                O(decimalFormatSymbols, bVar2, str3);
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Method d11 = bVar.d();
                            if (d11 == null) {
                                throw new IllegalStateException("No write method defined for property " + bVar.a());
                            }
                            d11.invoke(obj, decimalFormatSymbols);
                        } else {
                            continue;
                        }
                    } catch (Throwable th2) {
                        throw new DataProcessingException("Error trying to configure decimal symbols of formatter '" + obj.getClass() + '.', th2);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (hashMap.isEmpty()) {
            return;
        }
        throw new DataProcessingException("Cannot find properties in formatter of type '" + obj.getClass() + "': " + hashMap);
    }

    public static k g(Class cls, String str, String str2) {
        return new k(cls, str == null ? null : Enum.valueOf(cls, str), str2, null, EnumSelector.NAME, EnumSelector.ORDINAL, EnumSelector.STRING);
    }

    public static String[] h(Class<?> cls, MethodFilter methodFilter) {
        List<e> F = F(cls, true, null, methodFilter);
        ArrayList arrayList = new ArrayList(F.size());
        for (e eVar : F) {
            if (eVar == null) {
                return org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78085a;
            }
            arrayList.add(eVar.c());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String i(AnnotatedElement annotatedElement) {
        String str;
        if (annotatedElement instanceof Field) {
            str = "attribute '" + ((Field) annotatedElement).getName() + "'";
        } else {
            str = "method '" + ((Method) annotatedElement).getName() + "'";
        }
        return str + " of class " + B(annotatedElement).getName();
    }

    public static Locale j(String[] strArr) {
        String k11 = k(strArr, "locale=");
        if (k11 == null) {
            return Locale.getDefault();
        }
        int i11 = 0;
        k90.d dVar = new k90.d(100, "", 0);
        while (i11 < k11.length()) {
            char charAt = k11.charAt(i11);
            if (!Character.isLetterOrDigit(charAt)) {
                break;
            }
            i11++;
            dVar.append(charAt);
        }
        String A = dVar.A();
        int i12 = i11 + 1;
        while (i12 < k11.length()) {
            char charAt2 = k11.charAt(i12);
            if (!Character.isLetterOrDigit(charAt2)) {
                break;
            }
            i12++;
            dVar.append(charAt2);
        }
        String A2 = dVar.A();
        int i13 = i12 + 1;
        while (i13 < k11.length()) {
            char charAt3 = k11.charAt(i13);
            if (!Character.isLetterOrDigit(charAt3)) {
                break;
            }
            i13++;
            dVar.append(charAt3);
        }
        return new Locale(A, A2, dVar.A());
    }

    public static String k(String[] strArr, String str) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (str2 != null && str2.trim().toLowerCase().startsWith(str)) {
                String trim = strArr[i11].split(ContainerUtils.KEY_VALUE_DELIMITER)[1].trim();
                strArr[i11] = null;
                return trim;
            }
        }
        return null;
    }

    public static TimeZone l(String[] strArr) {
        String k11 = k(strArr, "timezone=");
        return k11 != null ? TimeZone.getTimeZone(k11) : TimeZone.getDefault();
    }

    public static List<Annotation> m(AnnotatedElement annotatedElement, Package r32) {
        ArrayList arrayList = new ArrayList();
        n(annotatedElement, r32, arrayList, new HashSet());
        return arrayList;
    }

    public static void n(AnnotatedElement annotatedElement, Package r42, ArrayList<? super Annotation> arrayList, Set<Annotation> set) {
        for (Annotation annotation : annotatedElement.getDeclaredAnnotations()) {
            if (r42.equals(annotation.annotationType().getPackage())) {
                arrayList.add(annotation);
            }
            if (P(annotation) && set.add(annotation)) {
                n(annotation.annotationType(), r42, arrayList, set);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [A, java.lang.annotation.Annotation] */
    public static <A> A o(AnnotatedElement annotatedElement, Class<A> cls, Set<Annotation> set, Stack<Annotation> stack) {
        Annotation[] declaredAnnotations = annotatedElement.getDeclaredAnnotations();
        for (Annotation annotation : declaredAnnotations) {
            ?? r22 = (A) annotation;
            if (r22.annotationType() == cls) {
                return r22;
            }
        }
        for (Annotation annotation2 : declaredAnnotations) {
            if (P(annotation2) && set.add(annotation2)) {
                A a11 = (A) o(annotation2.annotationType(), cls, set, stack);
                stack.push(annotation2);
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized <A extends Annotation> A p(AnnotatedElement annotatedElement, Class<A> cls) {
        synchronized (a.class) {
            if (annotatedElement == null || cls == 0) {
                return null;
            }
            if (annotatedElement.equals(f59056a) && cls == f59057b) {
                return (A) f59058c;
            }
            f59056a = annotatedElement;
            f59057b = cls;
            Stack stack = new Stack();
            A a11 = (A) o(annotatedElement, cls, new HashSet(), stack);
            if (a11 != null && !stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    Annotation annotation = (Annotation) stack.pop();
                    Annotation annotation2 = stack.isEmpty() ? a11 : (Annotation) stack.peek();
                    for (Method method : annotation.annotationType().getDeclaredMethods()) {
                        g90.c cVar = (g90.c) method.getAnnotation(g90.c.class);
                        if (cVar != null) {
                            Class cls2 = cVar.to();
                            String property = cVar.property();
                            if (property.trim().isEmpty()) {
                                property = method.getName();
                            }
                            Object a12 = h90.b.a(annotatedElement, annotation2, method.getName());
                            if (a12 == null) {
                                a12 = N(annotation, method);
                            }
                            Class<?> returnType = method.getReturnType();
                            Class<?> r11 = r(cls2, property);
                            if (r11 != null && r11.isArray() && !a12.getClass().isArray()) {
                                Object newInstance = Array.newInstance(returnType, 1);
                                Array.set(newInstance, 0, a12);
                                a12 = newInstance;
                            }
                            if (cls2 == annotation2.annotationType()) {
                                h90.b.d(annotatedElement, a11, property, a12);
                            } else {
                                Annotation annotation3 = (Annotation) o(annotatedElement, cls2, new HashSet(), new Stack());
                                if (annotation3 == null) {
                                    throw new IllegalStateException("Can't process @Copy annotation on '" + method + "'. Annotation '" + cls2.getName() + "' not used in " + annotation.annotationType().getName() + ". Unable to process field " + annotatedElement + "'");
                                }
                                h90.b.d(annotatedElement, annotation3, property, a12);
                            }
                        }
                    }
                }
                f59058c = a11;
                return a11;
            }
            f59058c = a11;
            return a11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Annotation> T q(Class<?> cls, Class<T> cls2) {
        do {
            T t11 = (T) cls.getAnnotation(cls2);
            if (t11 != null) {
                return t11;
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                T t12 = (T) q(cls3, cls2);
                if (t12 != null) {
                    return t12;
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return null;
    }

    public static Class<?> r(Class<? extends Annotation> cls, String str) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                return method.getReturnType();
            }
        }
        return null;
    }

    public static h s(Class<?> cls) {
        return (h) q(cls, h.class);
    }

    public static Map<Field, i90.b> t(Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (i90.b bVar : i90.a.d(cls)) {
                String a11 = bVar.a();
                if (a11 != null) {
                    linkedHashMap.put(a11, bVar);
                }
            }
        } catch (Exception unused) {
        }
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (!hashSet.contains(field.getName())) {
                    hashSet.add(field.getName());
                    linkedHashMap2.put(field, linkedHashMap.get(field.getName()));
                }
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
        } while (cls != Object.class);
        return linkedHashMap2;
    }

    public static List<Method> u(Class<?> cls, MethodFilter methodFilter) {
        return y(cls, methodFilter, b.class);
    }

    public static List<Field> v(Class<?> cls) {
        return w(cls, null);
    }

    public static <A extends Annotation> List<Field> w(Class<?> cls, Class<A> cls2) {
        ArrayList arrayList = new ArrayList();
        do {
            for (Field field : cls.getDeclaredFields()) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    if ((cls2 == null && P(annotation)) || cls2 == annotation.annotationType()) {
                        arrayList.add(field);
                        break;
                    }
                }
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
        } while (cls != Object.class);
        return arrayList;
    }

    public static List<Method> x(Class<?> cls, MethodFilter methodFilter) {
        return y(cls, methodFilter, null);
    }

    public static <A extends Annotation> List<Method> y(Class<?> cls, MethodFilter methodFilter, Class<A> cls2) {
        ArrayList arrayList = new ArrayList();
        do {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isSynthetic() || cls2 != b.class) {
                    for (Annotation annotation : method.getDeclaredAnnotations()) {
                        if ((cls2 == null && P(annotation)) || cls2 == annotation.annotationType()) {
                            if (!methodFilter.reject(method)) {
                                arrayList.add(method);
                            }
                        }
                    }
                } else if (!methodFilter.reject(method)) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
        } while (cls != Object.class);
        return arrayList;
    }

    public static g z(Class cls, Annotation annotation) {
        return A(cls, null, annotation, null, null);
    }
}
