package r90;

import java.lang.Enum;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.EnumSelector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k<T extends Enum<T>> extends v<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Class<T> f83862c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f83863d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f83864e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumSelector[] f83865f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, T>[] f83866g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83867a;

        static {
            int[] iArr = new int[EnumSelector.values().length];
            f83867a = iArr;
            try {
                iArr[EnumSelector.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83867a[EnumSelector.ORDINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83867a[EnumSelector.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83867a[EnumSelector.CUSTOM_FIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83867a[EnumSelector.CUSTOM_METHOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k(Class<T> cls) {
        this(cls, EnumSelector.NAME, EnumSelector.ORDINAL, EnumSelector.STRING);
    }

    @Override // r90.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public T l(String str) {
        for (Map<String, T> map : this.f83866g) {
            T t11 = map.get(str);
            if (t11 != null) {
                return t11;
            }
        }
        Method method = this.f83864e;
        DataProcessingException dataProcessingException = null;
        if (method != null && method.getParameterTypes().length == 1) {
            try {
                return (T) this.f83864e.invoke(null, str);
            } catch (Exception e11) {
                dataProcessingException = new DataProcessingException("Cannot convert '{value}' to enumeration of type " + this.f83862c.getName() + " using method " + this.f83864e.getName(), e11);
            }
        }
        if (dataProcessingException == null) {
            dataProcessingException = new DataProcessingException("Cannot convert '{value}' to enumeration of type " + this.f83862c.getName());
        }
        dataProcessingException.setValue(str);
        dataProcessingException.markAsNonFatal();
        throw dataProcessingException;
    }

    public final String t(T t11, EnumSelector enumSelector) {
        int i11 = a.f83867a[enumSelector.ordinal()];
        if (i11 == 1) {
            return t11.name();
        }
        if (i11 == 2) {
            return String.valueOf(t11.ordinal());
        }
        if (i11 == 3) {
            return t11.toString();
        }
        if (i11 == 4) {
            try {
                return String.valueOf(this.f83863d.get(t11));
            } catch (Throwable th2) {
                throw new IllegalStateException("Error reading custom field '" + this.f83863d.getName() + "' from enumeration constant '" + t11 + "' of type " + this.f83862c.getName(), th2);
            }
        }
        if (i11 != 5) {
            throw new IllegalStateException("Unsupported enumeration selector type " + enumSelector);
        }
        try {
            if (this.f83864e.getParameterTypes().length == 0) {
                return String.valueOf(this.f83864e.invoke(t11, null));
            }
            return null;
        } catch (Throwable th3) {
            throw new IllegalStateException("Error reading custom method '" + this.f83864e.getName() + "' from enumeration constant '" + t11 + "' of type " + this.f83862c.getName(), th3);
        }
    }

    public final void u(Set<EnumSelector> set) {
        T[] enumConstants = this.f83862c.getEnumConstants();
        int i11 = 0;
        for (EnumSelector enumSelector : set) {
            Map<String, T> hashMap = new HashMap<>(enumConstants.length);
            int i12 = i11 + 1;
            this.f83866g[i11] = hashMap;
            for (T t11 : enumConstants) {
                String t12 = t(t11, enumSelector);
                if (t12 != null) {
                    if (hashMap.containsKey(t12)) {
                        throw new IllegalArgumentException("Enumeration element type " + enumSelector + " does not uniquely identify elements of " + this.f83862c.getName() + ". Got duplicate value '" + t12 + "' from constants '" + t11 + "' and '" + hashMap.get(t12) + "'.");
                    }
                    hashMap.put(t12, t11);
                }
            }
            i11 = i12;
        }
    }

    @Override // r90.v
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public String a(T t11) {
        return t11 == null ? super.a(null) : t(t11, this.f83865f[0]);
    }

    public k(Class<T> cls, EnumSelector... enumSelectorArr) {
        this(cls, null, null, null, enumSelectorArr);
    }

    public k(Class<T> cls, String str, EnumSelector... enumSelectorArr) {
        this(cls, null, null, str, new EnumSelector[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [r90.k, r90.k<T extends java.lang.Enum<T>>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.Class<T> r9, T r10, java.lang.String r11, java.lang.String r12, org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.EnumSelector... r13) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r90.k.<init>(java.lang.Class, java.lang.Enum, java.lang.String, java.lang.String, org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.EnumSelector[]):void");
    }
}
