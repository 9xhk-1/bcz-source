package com.baicizhan.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.jiongji.andriod.card.R;
import gs.z1;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ScanLoginConfirmActivity extends BaseActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18159a = "ScanLoginConfirmTAG";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18160b = "param_qrcode";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18161c = "token";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            String stringExtra = ScanLoginConfirmActivity.this.getIntent().getStringExtra(ScanLoginConfirmActivity.f18160b);
            if (TextUtils.isEmpty(stringExtra)) {
                ScanLoginConfirmActivity.this.finish();
            } else {
                ScanLoginConfirmActivity.this.J0(stringExtra);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            g.g(R.string.scan_watch_login_toast_cancel, 0);
            ScanLoginConfirmActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThriftRequest<UnifiedUserService.Client, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18164a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String domain, final String val$token) {
            super(domain);
            this.f18164a = val$token;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object doInBackground(UnifiedUserService.Client client) throws Exception {
            client.scan_for_watch_login(this.f18164a);
            return null;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            qb.c.c(ScanLoginConfirmActivity.f18159a, "", exception);
            g.g(R.string.scan_watch_login_toast_failed, 0);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onResult(Object o11) {
            g.g(R.string.scan_watch_login_toast_success, 0);
            ScanLoginConfirmActivity.this.finish();
        }
    }

    public static void K0(Activity activity, int request, String qrcode) {
        Intent intent = new Intent(activity, (Class<?>) ScanLoginConfirmActivity.class);
        intent.putExtra(f18160b, qrcode);
        activity.startActivityForResult(intent, request);
        activity.overridePendingTransition(R.anim.business_push_up_in, R.anim.business_no_fade);
    }

    public final void J0(String qrcode) {
        String queryParameter = Uri.parse(qrcode).getQueryParameter("token");
        if (TextUtils.isEmpty(queryParameter)) {
            qb.c.i(f18159a, "empty token %s", qrcode);
            finish();
        } else {
            c cVar = new c("/rpc/unified_user_service", queryParameter);
            cVar.setTag(f18159a);
            com.baicizhan.client.business.thrift.c.b().a(cVar);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_no_fade, R.anim.business_push_down_out_fast);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        z1 z1Var = (z1) DataBindingUtil.setContentView(this, R.layout.activity_scan_login_confirm);
        z1Var.l(new a());
        z1Var.k(new b());
    }
}
