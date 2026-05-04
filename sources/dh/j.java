package dh;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.wordlist.activity.WordListActivity;
import com.baicizhan.main.wordlistv2.WordListV2Activity;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f47974c = 8;

    @Override // dh.a
    public boolean b(@m80.k Uri url, @m80.k Context context) {
        g0.p(url, "url");
        g0.p(context, "context");
        if (!g0.g(url.getHost(), "wordlist")) {
            return false;
        }
        if (g0.g(ch.m.f8648a.a(), e.a.f19304d)) {
            WordListV2Activity.f27829j.a(context);
            return true;
        }
        WordListActivity.q1(context);
        return true;
    }
}
