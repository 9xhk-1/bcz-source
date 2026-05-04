package com.tencent.open;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IUiListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SocialApi {

    /* renamed from: a, reason: collision with root package name */
    private SocialApiIml f44382a;

    public SocialApi(QQToken qQToken) {
        this.f44382a = new SocialApiIml(qQToken);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (com.tencent.connect.a.a("SocialApi", iUiListener)) {
            return;
        }
        this.f44382a.ask(activity, bundle, iUiListener);
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (com.tencent.connect.a.a("SocialApi", iUiListener)) {
            return;
        }
        this.f44382a.gift(activity, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (com.tencent.connect.a.a("SocialApi", iUiListener)) {
            return;
        }
        this.f44382a.invite(activity, bundle, iUiListener);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (com.tencent.connect.a.a("SocialApi", iUiListener)) {
            return;
        }
        this.f44382a.story(activity, bundle, iUiListener);
    }
}
