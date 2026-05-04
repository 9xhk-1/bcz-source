package x9;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bun.miitmdid.core.InfoCode;
import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f97910b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f97909a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final int f97911c = 8;

    public static final void c(CountDownLatch countDownLatch, IdSupplier idSupplier) {
        qb.c.i(c.f97912a, String.valueOf(idSupplier), new Object[0]);
        if (!TextUtils.isEmpty(idSupplier.getOAID())) {
            nc.b.b().p(c.f97916e, idSupplier.getOAID());
        }
        countDownLatch.countDown();
    }

    @k
    public final String b(@k Context context) {
        int i11;
        g0.p(context, "context");
        String string = nc.b.b().getString(c.f97916e, null);
        if (string != null) {
            return string;
        }
        if (!f97910b) {
            f97910b = MdidSdkHelper.InitCert(context, c.f97917f);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            MdidSdkHelper.setGlobalTimeout(5000L);
            i11 = MdidSdkHelper.InitSdk(context, true, true, false, false, new IIdentifierListener() { // from class: x9.a
                @Override // com.bun.miitmdid.interfaces.IIdentifierListener
                public final void onSupport(IdSupplier idSupplier) {
                    b.c(countDownLatch, idSupplier);
                }
            });
        } catch (Error e11) {
            qb.c.c(c.f97912a, "", e11);
            i11 = 0;
        }
        e(i11);
        if (i11 == 1008610 || i11 == 1008614) {
            countDownLatch.await();
        }
        String string2 = nc.b.b().getString(c.f97916e, null);
        return string2 == null ? "unknown" : string2;
    }

    public final void d() {
        try {
            System.loadLibrary(c.f97913b);
            qb.c.i(c.f97912a, "LIB LOADED", new Object[0]);
        } catch (Exception e11) {
            qb.c.c(c.f97912a, "", e11);
        }
    }

    public final void e(int i11) {
        switch (i11) {
            case 1008610:
                qb.c.i(c.f97912a, "result ok (sync)", new Object[0]);
                break;
            case 1008611:
                qb.c.q(c.f97912a, "manufacturer not supported", new Object[0]);
                break;
            case 1008612:
                qb.c.q(c.f97912a, "device not supported", new Object[0]);
                break;
            case 1008613:
                qb.c.q(c.f97912a, "failed to load config file", new Object[0]);
                break;
            case 1008614:
                qb.c.i(c.f97912a, "result delay (async)", new Object[0]);
                break;
            case 1008615:
                qb.c.q(c.f97912a, "sdk call error", new Object[0]);
                break;
            case InfoCode.INIT_ERROR_CERT_ERROR /* 1008616 */:
                qb.c.q(c.f97912a, "cert not init or check not pass", new Object[0]);
                break;
            default:
                qb.c.q(c.f97912a, "getDeviceIds: unknown code: " + i11, new Object[0]);
                break;
        }
    }
}
