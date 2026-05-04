package ch;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.module.SignatureException;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e0 f8632a = new e0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f8633b = "EE:D0:BD:D1:C0:25:EC:84:5C:F4:5C:19:C0:FC:FF:F5";

    /* renamed from: c, reason: collision with root package name */
    public static final int f8634c = 0;

    public final void a(@m80.k Context context) {
        g0.p(context, "context");
        String a11 = xb.p.a(context);
        String z22 = f0.z2(f8633b, ":", "", false, 4, null);
        Locale locale = Locale.ROOT;
        String lowerCase = z22.toLowerCase(locale);
        g0.o(lowerCase, "toLowerCase(...)");
        g0.m(a11);
        String lowerCase2 = a11.toLowerCase(locale);
        g0.o(lowerCase2, "toLowerCase(...)");
        if (!g0.g(lowerCase, lowerCase2)) {
            throw new SignatureException(a11);
        }
    }
}
