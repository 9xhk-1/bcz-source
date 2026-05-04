package rx.internal.util;

import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements p<Object, Boolean> {
        INSTANCE;

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b implements p<Object, Boolean> {
        INSTANCE;

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }

    public o() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> p<? super T, Boolean> a() {
        return a.INSTANCE;
    }

    public static <T> p<? super T, Boolean> b() {
        return b.INSTANCE;
    }

    public static <T> p<T, T> c() {
        return c.INSTANCE;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements p<Object, Object> {
        INSTANCE;

        @Override // wb0.p
        public Object call(Object obj) {
            return obj;
        }
    }
}
