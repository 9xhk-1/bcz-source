package rx.exceptions;

import ac0.f;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import vb0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final Set<Class<?>> f85036a = a();

            public static Set<Class<?>> a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th2) {
                    obj = th2.getMessage();
                }
            }
            this.value = obj;
        }

        public static String renderValue(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (a.f85036a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String b11 = f.c().b().b(obj);
            if (b11 != null) {
                return b11;
            }
            return obj.getClass().getName() + ".class";
        }

        public Object getValue() {
            return this.value;
        }
    }

    private OnErrorThrowable(Throwable th2) {
        super(th2);
        this.hasValue = false;
        this.value = null;
    }

    public static Throwable addValueAsLastCause(Throwable th2, Object obj) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        Throwable b11 = a.b(th2);
        if ((b11 instanceof OnNextValue) && ((OnNextValue) b11).getValue() == obj) {
            return th2;
        }
        a.a(th2, new OnNextValue(obj));
        return th2;
    }

    public static OnErrorThrowable from(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        Throwable b11 = a.b(th2);
        return b11 instanceof OnNextValue ? new OnErrorThrowable(th2, ((OnNextValue) b11).getValue()) : new OnErrorThrowable(th2);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isValueNull() {
        return this.hasValue;
    }

    private OnErrorThrowable(Throwable th2, Object obj) {
        super(th2);
        this.hasValue = true;
        if (!(obj instanceof Serializable)) {
            try {
                obj = String.valueOf(obj);
            } catch (Throwable th3) {
                obj = th3.getMessage();
            }
        }
        this.value = obj;
    }
}
