package com.getui.gtc.dyc;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.http.Call;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dyc.b.b;

/* loaded from: classes6.dex */
public class g {

    /* renamed from: com.getui.gtc.dyc.g$1, reason: invalid class name */
    public class AnonymousClass1 implements Call.Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f30012a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f30013c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f30014d;

        @Override // com.getui.gtc.base.http.Call.Callback
        public void onFailure(Call call, Exception exc) {
            c cVar = this.f30012a;
            if (cVar != null) {
                cVar.a(exc);
            }
        }

        @Override // com.getui.gtc.base.http.Call.Callback
        public void onResponse(Call call, Response response) {
            try {
                h a11 = this.f30013c.a(this.f30014d, response);
                c cVar = this.f30012a;
                if (cVar != null) {
                    cVar.a(a11);
                }
            } catch (Throwable th2) {
                com.getui.gtc.dyc.a.a.a.c(th2);
                c cVar2 = this.f30012a;
                if (cVar2 != null) {
                    cVar2.a(th2);
                }
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f30015a = new g(null);
    }

    public interface c {
        void a(h hVar);

        void a(Throwable th2);
    }

    private g() {
        a(GtcProvider.context());
    }

    public static g a() {
        return a.f30015a;
    }

    public /* synthetic */ g(AnonymousClass1 anonymousClass1) {
        this();
    }

    public h a(b bVar) throws Exception {
        return new d().a(bVar);
    }

    private void a(Context context) {
        try {
            Bundle bundle = CommonUtil.getAppInfoForSelf(context).metaData;
            if (bundle != null) {
                String string = bundle.getString("DYC_P");
                if (!TextUtils.isEmpty(string)) {
                    d.f29999a = string;
                }
                String string2 = bundle.getString("DYC_K");
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                d.f30000c = string2;
            }
        } catch (Throwable th2) {
            com.getui.gtc.dyc.a.a.a.c(th2);
        }
    }
}
