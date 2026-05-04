package com.zx.a.I8b7;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.zx.sdk.api.PermissionCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f46556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionCallback f46557b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f46558a;

        public a(l3 l3Var) {
            this.f46558a = l3Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46558a.dismiss();
            j3.this.f46557b.onAuthorized();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f46560a;

        public b(l3 l3Var) {
            this.f46560a = l3Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46560a.dismiss();
            j3.this.f46557b.onUnauthorized();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f46562a;

        public c(l3 l3Var) {
            this.f46562a = l3Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46562a.dismiss();
            r2.a("用户点击了解更多");
            j3.this.f46556a.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://aid.mobileservice.cn/")));
        }
    }

    public j3(k3 k3Var, Activity activity, PermissionCallback permissionCallback) {
        this.f46556a = activity;
        this.f46557b = permissionCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l3 l3Var = new l3(this.f46556a);
            l3Var.f46575b = new a(l3Var);
            l3Var.f46574a = new b(l3Var);
            l3Var.f46576c = new c(l3Var);
            l3Var.show();
        } catch (Throwable th2) {
            g3.a(th2, f3.a("卓信ID授权弹窗异常: "));
        }
    }
}
