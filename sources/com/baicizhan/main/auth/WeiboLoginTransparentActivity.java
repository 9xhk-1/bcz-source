package com.baicizhan.main.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import b9.j;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.main.activity.ThirdPartyWrapperActivity;
import com.baicizhan.main.auth.WeiboLoginTransparentActivity;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class WeiboLoginTransparentActivity extends ThirdPartyWrapperActivity {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f19936k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f19937l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final String f19938m = WeiboLoginTransparentActivity.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final void a(@k Activity activity, int i11) {
            g0.p(activity, "activity");
            activity.startActivityForResult(new Intent(activity, (Class<?>) WeiboLoginTransparentActivity.class), i11);
        }

        public a() {
        }
    }

    public static final void c1(WeiboLoginTransparentActivity weiboLoginTransparentActivity) {
        try {
            c9.a.i(weiboLoginTransparentActivity, weiboLoginTransparentActivity.P0(1));
        } catch (Throwable th2) {
            weiboLoginTransparentActivity.finish();
            c.c(f19938m, "wb init failed retry", th2);
        }
    }

    @Override // com.baicizhan.main.activity.ThirdPartyWrapperActivity
    public void U0() {
        finish();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        c.b(f19938m, "onCreate", new Object[0]);
        LoadingDialogActivity.setLoading$default(this, true, 0L, null, 6, null);
        j.h().j(this);
        this.mHandler.postDelayed(new Runnable() { // from class: sf.e0
            @Override // java.lang.Runnable
            public final void run() {
                WeiboLoginTransparentActivity.c1(WeiboLoginTransparentActivity.this);
            }
        }, 500L);
    }
}
