package dh;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.JumpUtils;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nnavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 navigator.kt\ncom/baicizhan/main/navigator/NavToSysBrowser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
/* loaded from: classes4.dex */
public final class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f47972c = 8;

    @Override // dh.a
    public boolean b(@m80.k Uri url, @m80.k Context context) {
        g0.p(url, "url");
        g0.p(context, "context");
        if (!g0.g(url.getHost(), m.f47990o)) {
            return false;
        }
        String queryParameter = url.getQueryParameter("url");
        if (queryParameter == null) {
            return true;
        }
        JumpUtils.redirectToBrowser(context, queryParameter);
        return true;
    }
}
