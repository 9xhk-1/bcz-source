package fd;

import android.content.Intent;
import android.net.Uri;
import com.baicizhan.main.activity.LoadingPageActivity;
import com.baicizhan.main.activity.StartupNavigationType;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "StartupHelper")
/* loaded from: classes4.dex */
public final class i3 {
    public static final boolean a(@m80.k StartupNavigationType startupNavigationType) {
        kotlin.jvm.internal.g0.p(startupNavigationType, "<this>");
        return startupNavigationType.compareTo(StartupNavigationType.OPEN_INSTALL) < 0;
    }

    @m80.k
    public static final StartupNavigationType b(@m80.k LoadingPageActivity loadingPageActivity) {
        Uri data;
        String path;
        kotlin.jvm.internal.g0.p(loadingPageActivity, "<this>");
        Intent intent = loadingPageActivity.getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            StartupNavigationType startupNavigationType = (kotlin.jvm.internal.g0.g(data.getScheme(), "bcz") && kotlin.jvm.internal.g0.g(data.getHost(), "com.baicizhan") && (path = data.getPath()) != null && u30.f0.J2(path, "/launch", false, 2, null)) ? kotlin.jvm.internal.g0.g(data.getPath(), "/launch/wechat") ? StartupNavigationType.WE_CHAT : (kotlin.jvm.internal.g0.g(data.getPath(), "/launch") && data.getQueryParameterNames().contains(gi.e0.f53758c)) ? StartupNavigationType.PUSHER : StartupNavigationType.OTHERS : kotlin.jvm.internal.g0.g(data.getScheme(), "omfqmq") ? StartupNavigationType.OPEN_INSTALL : StartupNavigationType.OTHERS;
            if (startupNavigationType != null) {
                return startupNavigationType;
            }
        }
        return StartupNavigationType.OTHERS;
    }

    @m80.l
    public static final String c(@m80.l Uri uri) {
        Set<String> queryParameterNames;
        String encodedQuery;
        u30.o find$default;
        u30.m c11;
        String f11;
        String str = null;
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
            try {
                if (queryParameterNames.contains(gi.e0.f53758c)) {
                    str = uri.getQueryParameter(gi.e0.f53758c);
                } else if (queryParameterNames.contains("intent") && (encodedQuery = uri.getEncodedQuery()) != null && (find$default = Regex.find$default(new Regex("intent=(\\{.*\\})"), encodedQuery, 0, 2, null)) != null && (c11 = find$default.c()) != null) {
                    if (c11.size() >= 2) {
                        u30.l lVar = c11.get(1);
                        if (lVar != null) {
                            str = lVar.f();
                        }
                    } else {
                        u30.l lVar2 = c11.get(0);
                        if (lVar2 != null && (f11 = lVar2.f()) != null) {
                            str = u30.f0.D2(f11, "intent=", "", false, 4, null);
                        }
                    }
                }
            } catch (Exception e11) {
                qb.c.c("retrieveStartupIntent", "", e11);
            }
        }
        return str;
    }
}
