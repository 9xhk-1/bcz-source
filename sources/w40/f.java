package w40;

import w40.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {
    public static final int d(CharSequence charSequence, int i11, int i12) {
        int i13 = 0;
        while (i11 < i12) {
            i13 = (i13 * 10) + t40.h.a(charSequence.charAt(i11));
            i11++;
        }
        return i13;
    }

    public static final Integer e(CharSequence charSequence, int i11, int i12) {
        int i13 = 0;
        while (i11 < i12) {
            i13 = (i13 * 10) + t40.h.a(charSequence.charAt(i11));
            if (i13 < 0) {
                return null;
            }
            i11++;
        }
        return Integer.valueOf(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> g f(a<? super Object, Type> aVar, Object object, Type type) {
        Type d11 = aVar.d(object, type);
        if (d11 == null) {
            return null;
        }
        return new g.a(d11);
    }
}
