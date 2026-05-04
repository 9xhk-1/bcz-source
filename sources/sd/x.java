package sd;

import com.baicizhan.client.business.util.KotlinExtKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f88364a = "daka_share_earn_bonus";

    public static final boolean a(long j11) {
        return !kotlin.jvm.internal.g0.g(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(j11)), i9.f.g(KotlinExtKt.getGlobalApplicationContext(), f88364a, false));
    }

    public static final void b(long j11) {
        i9.f.n(KotlinExtKt.getGlobalApplicationContext(), f88364a, new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(j11)), false);
    }
}
