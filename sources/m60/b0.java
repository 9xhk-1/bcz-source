package m60;

import java.util.GregorianCalendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f72406a = -1;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final byte[] f72407b = new byte[0];

    public static final long a(int i11, int i12, int i13, int i14, int i15, int i16) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i11, i12 - 1, i13, i14, i15, i16);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return f72406a;
    }

    @m80.k
    public static final byte[] c() {
        return f72407b;
    }
}
