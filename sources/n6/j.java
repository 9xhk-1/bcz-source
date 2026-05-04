package n6;

import com.baicizhan.app.biz.base.BizInternalException;
import k3.t0;
import k3.u0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {
    public static final void b(String str, String str2) {
        switch (str.hashCode()) {
            case 62314030:
                if (!str.equals(t0.f65610b)) {
                    return;
                }
                break;
            case 1133892335:
                if (!str.equals(t0.f65612d)) {
                    return;
                }
                break;
            case 1650891807:
                if (!str.equals(t0.f65611c)) {
                    return;
                }
                break;
            case 1745276863:
                if (!str.equals(t0.f65613e) || g0.g(str2, u0.f65630d) || g0.g(str2, u0.f65631e)) {
                    return;
                }
                throw new BizInternalException("Invalid furigana type value: " + str + '=' + str2, null, 0, 6, null);
            default:
                return;
        }
        if (g0.g(str2, u0.f65628b) || g0.g(str2, "disable")) {
            return;
        }
        throw new BizInternalException("Invalid toggle setting value: " + str + '=' + str2, null, 0, 6, null);
    }
}
