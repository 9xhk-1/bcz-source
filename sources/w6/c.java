package w6;

import com.baicizhan.app.biz.platform.DeviceType;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f95400a = "alipay_mob_client";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f95401b = "ohos_app";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f95402c = "Pay-Support-H5";

    public static final String b(c7.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f95400a);
        if (eVar.f() == DeviceType.OHOS) {
            sb2.append(":ohos_app");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
