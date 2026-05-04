package dh;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class e extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f47969c = 8;

    @Override // dh.a
    public boolean b(@m80.k Uri url, @m80.k Context context) {
        g0.p(url, "url");
        g0.p(context, "context");
        if (!g0.g(url.getHost(), m.f47978c)) {
            return false;
        }
        AudioCenterActivity.N0(context);
        return true;
    }
}
