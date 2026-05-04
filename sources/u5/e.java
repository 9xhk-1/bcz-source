package u5;

import c4.o;
import c40.m0;
import com.baicizhan.app.biz.platform.DeviceType;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f91826a = "PluginRepo";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91827a;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.Android.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f91827a = iArr;
        }
    }

    public static final m0 b(c7.e eVar) {
        return a.f91827a[eVar.f().ordinal()] == 1 ? o.b() : o.c();
    }
}
