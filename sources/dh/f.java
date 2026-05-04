package dh;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.main.phrasetraining.activity.PhraseGroupActivity;
import com.baicizhan.main.plusreview.activity.DefaultPreloadActivity;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class f extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f47970c = 8;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // dh.a
    public boolean b(@m80.k Uri url, @m80.k Context context) {
        g0.p(url, "url");
        g0.p(context, "context");
        String host = url.getHost();
        if (host != null) {
            switch (host.hashCode()) {
                case -1048773518:
                    if (host.equals(m.f47984i)) {
                        DefaultPreloadActivity.h1(context);
                        return true;
                    }
                    break;
                case -549556082:
                    if (host.equals(m.f47986k)) {
                        DefaultPreloadActivity.j1(context);
                        return true;
                    }
                    break;
                case -315833175:
                    if (host.equals(m.f47982g)) {
                        DefaultPreloadActivity.g1(context);
                        return true;
                    }
                    break;
                case -258574935:
                    if (host.equals(m.f47981f)) {
                        DefaultPreloadActivity.c1(context);
                        return true;
                    }
                    break;
                case 86983827:
                    if (host.equals(m.f47985j)) {
                        DefaultPreloadActivity.a1(context);
                        return true;
                    }
                    break;
                case 990748399:
                    if (host.equals(m.f47988m)) {
                        int l11 = x.r().l();
                        if ((l11 != 16 && l11 != 31 && l11 != 409) || DeviceUtil.isDuoQin() || 0 == i9.f.f(context, i9.f.N)) {
                            va.g.g(R.string.phrase_group_not_support, 1);
                            return false;
                        }
                        PhraseGroupActivity.R0(context);
                        return true;
                    }
                    break;
                case 1331637537:
                    if (host.equals(m.f47983h)) {
                        DefaultPreloadActivity.d1(context);
                        return true;
                    }
                    break;
                case 1452823019:
                    if (host.equals(m.f47987l)) {
                        DefaultPreloadActivity.b1(context);
                        return true;
                    }
                    break;
                case 2128341624:
                    if (host.equals(m.f47979d)) {
                        DefaultPreloadActivity.i1(context);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
