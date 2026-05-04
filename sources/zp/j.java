package zp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final kp.a f102794a;

    /* renamed from: b, reason: collision with root package name */
    public final s f102795b;

    public j(kp.a aVar) {
        this.f102794a = aVar;
        this.f102795b = new s(aVar);
    }

    public static j a(kp.a aVar) {
        if (aVar.h(1)) {
            return new g(aVar);
        }
        if (!aVar.h(2)) {
            return new k(aVar);
        }
        int g11 = s.g(aVar, 1, 4);
        if (g11 == 4) {
            return new a(aVar);
        }
        if (g11 == 5) {
            return new b(aVar);
        }
        int g12 = s.g(aVar, 1, 5);
        if (g12 == 12) {
            return new c(aVar);
        }
        if (g12 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            case 57:
                return new e(aVar, "320", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 61:
                return new e(aVar, "320", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 62:
                return new e(aVar, "310", Constants.VIA_REPORT_TYPE_START_GROUP);
            case 63:
                return new e(aVar, "320", Constants.VIA_REPORT_TYPE_START_GROUP);
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    public final s b() {
        return this.f102795b;
    }

    public final kp.a c() {
        return this.f102794a;
    }

    public abstract String d() throws NotFoundException, FormatException;
}
