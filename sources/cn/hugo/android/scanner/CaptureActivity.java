package cn.hugo.android.scanner;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import cn.hugo.android.scanner.CaptureActivity;
import cn.hugo.android.scanner.view.ViewfinderView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.BczPermissions;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.JumpUtils;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.client.fm.activity.ExamAudioPlayActivity;
import com.baicizhan.client.fm.activity.ReadingPlanPlayActivity;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.ScanLoginConfirmActivity;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.vld.bonding.DeviceBondingActivity;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.baicizhan.online.bcz_system_api.QRCodeResp;
import com.baicizhan.online.thrift.basic.LogicException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.jiongji.andriod.card.R;
import gs.h5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jp.t;
import kc.h;
import kc.r;
import kc.u;
import org.apache.thrift.transport.TTransportException;
import s.k;
import s.m;
import x00.l;
import yg.i2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class CaptureActivity extends BaseAppCompatActivity implements SurfaceHolder.Callback {
    public static final int A = 5;
    public static final int B = 6;
    public static final int C = 7;
    public static final int D = 8;
    public static final int E = 9;
    public static final String F = "bcz://login";
    public static final int G = 100;
    public static final int H = 105;
    public static final int I = 300;
    public static final int J = 200;
    public static final int K = 101;

    /* renamed from: v, reason: collision with root package name */
    public static final String f9298v = "CaptureActivity";

    /* renamed from: w, reason: collision with root package name */
    public static final int f9299w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f9300x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f9301y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f9302z = 4;

    /* renamed from: a, reason: collision with root package name */
    public h f9303a;

    /* renamed from: b, reason: collision with root package name */
    public h5 f9304b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9305c;

    /* renamed from: d, reason: collision with root package name */
    public k f9306d;

    /* renamed from: e, reason: collision with root package name */
    public s.b f9307e;

    /* renamed from: f, reason: collision with root package name */
    public s.a f9308f;

    /* renamed from: g, reason: collision with root package name */
    public t.d f9309g;

    /* renamed from: h, reason: collision with root package name */
    public ViewfinderView f9310h;

    /* renamed from: i, reason: collision with root package name */
    public w.c f9311i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.zxing.k f9312j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9313k;

    /* renamed from: l, reason: collision with root package name */
    public Collection<BarcodeFormat> f9314l;

    /* renamed from: m, reason: collision with root package name */
    public Map<DecodeHintType, ?> f9315m;

    /* renamed from: n, reason: collision with root package name */
    public String f9316n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.zxing.k f9317o;

    /* renamed from: p, reason: collision with root package name */
    public m f9318p;

    /* renamed from: q, reason: collision with root package name */
    public String f9319q;

    /* renamed from: s, reason: collision with root package name */
    public ActivityResultLauncher<Intent> f9321s;

    /* renamed from: r, reason: collision with root package name */
    public Handler f9320r = new g(this);

    /* renamed from: t, reason: collision with root package name */
    public boolean f9322t = false;

    /* renamed from: u, reason: collision with root package name */
    public sa.h f9323u = new sa.h(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CaptureActivity.this.m1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThriftRequest<BczSystemApiService.Client, QRCodeResp> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String domain, final String val$qrcode) {
            super(domain);
            this.f9325a = val$qrcode;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public QRCodeResp doInBackground(BczSystemApiService.Client client) throws Exception {
            return client.qrcode_scan(this.f9325a);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(QRCodeResp resp) {
            CaptureActivity.this.h1(resp);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            if (exception instanceof TTransportException) {
                CaptureActivity.this.g1("网络不畅，请稍后重试");
            } else if (exception instanceof LogicException) {
                CaptureActivity.this.g1(exception.getMessage());
            } else {
                qb.c.c(CaptureActivity.f9298v, "", exception);
                CaptureActivity.this.g1("扫描出错啦~");
            }
            qb.c.c(CaptureActivity.f9298v, "", exception);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ QRCodeResp f9327a;

        public c(final QRCodeResp val$resp) {
            this.f9327a = val$resp;
        }

        @Override // kc.r, kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            CaptureActivity.this.p1(0L);
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            BookListManager.getInstance().setForceRefresh();
            EditScheduleActivity.f18908j.b(CaptureActivity.this, this.f9327a.getRedirect_info().getWord_level_id());
            CaptureActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends r {
        public d() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            CaptureActivity.this.p1(0L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends r {
        public e() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            CaptureActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f9331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f9332b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                va.g.i("图片太大啦", 0);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f9332b.dismiss();
            }
        }

        public f(final Bitmap val$img, final ProgressDialog val$progressDialog) {
            this.f9331a = val$img;
            this.f9332b = val$progressDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            CaptureActivity captureActivity;
            b bVar;
            try {
                try {
                    com.google.zxing.k a11 = new w.a(CaptureActivity.this).a(this.f9331a);
                    if (a11 != null) {
                        Message obtainMessage = CaptureActivity.this.f9320r.obtainMessage();
                        obtainMessage.what = 200;
                        obtainMessage.obj = t.n(a11).toString();
                        CaptureActivity.this.f9320r.sendMessage(obtainMessage);
                    } else {
                        Message obtainMessage2 = CaptureActivity.this.f9320r.obtainMessage();
                        obtainMessage2.what = 300;
                        CaptureActivity.this.f9320r.sendMessage(obtainMessage2);
                    }
                    captureActivity = CaptureActivity.this;
                    bVar = new b();
                } catch (OutOfMemoryError unused) {
                    CaptureActivity.this.runOnUiThread(new a());
                    captureActivity = CaptureActivity.this;
                    bVar = new b();
                }
                captureActivity.runOnUiThread(bVar);
            } catch (Throwable th2) {
                CaptureActivity.this.runOnUiThread(new b());
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<Activity> f9336a;

        public g(Activity activity) {
            this.f9336a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i11 = msg.what;
            if (i11 == 200) {
                ((CaptureActivity) this.f9336a.get()).a1(new com.google.zxing.k((String) msg.obj, null, null, null), null, 1.0f);
            } else if (i11 == 300) {
                va.g.i("解析图片失败", 0);
            }
            super.handleMessage(msg);
        }
    }

    public static /* synthetic */ g2 I0(View view) {
        return null;
    }

    private void back() {
        finish();
    }

    private void init() {
        this.f9309g = new t.d(getApplication());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.capture_viewfinder_view);
        this.f9310h = viewfinderView;
        viewfinderView.setCameraManager(this.f9309g);
        this.f9311i = null;
        this.f9312j = null;
        SurfaceHolder holder = ((SurfaceView) findViewById(R.id.capture_preview_view)).getHolder();
        if (this.f9305c) {
            c1(holder);
        }
        this.f9307e.e();
        this.f9308f.a(this.f9309g);
        this.f9306d.f();
        this.f9318p = m.NONE;
        this.f9314l = null;
        this.f9316n = null;
    }

    public final boolean T0() {
        return DeviceUtil.IS_REDMI_NOTE_3;
    }

    public final void U0(Bitmap bitmap, com.google.zxing.k result) {
        w.c cVar = this.f9311i;
        if (cVar == null) {
            this.f9317o = result;
            return;
        }
        if (result != null) {
            this.f9317o = result;
        }
        com.google.zxing.k kVar = this.f9317o;
        if (kVar != null) {
            this.f9311i.sendMessage(Message.obtain(cVar, R.id.decode_succeeded, kVar));
        }
        this.f9317o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0() {
        kc.d f02 = ((u) new u.a(this).L(R.string.app_name).U(R.string.msg_camera_framework_bug).b0(ButtonType.SINGLE_POSITIVE).d()).f0(new e());
        this.f9303a = f02;
        mc.a.n(this, f02, "exit");
    }

    public void W0() {
        this.f9310h.g();
    }

    public t.d X0() {
        return this.f9309g;
    }

    public Handler Y0() {
        return this.f9311i;
    }

    public ViewfinderView Z0() {
        return this.f9310h;
    }

    public void a1(com.google.zxing.k rawResult, Bitmap barcode, float scaleFactor) {
        this.f9306d.d();
        this.f9312j = rawResult;
        this.f9307e.c();
        String trim = t.n(rawResult).toString().trim();
        qb.c.b(f9298v, "识别结果:" + trim, new Object[0]);
        if (trim.startsWith(F)) {
            ScanLoginConfirmActivity.K0(this, 105, trim);
        } else {
            n1(trim);
        }
    }

    public final void b1(String url) {
        ActivityResultLauncher<Intent> activityResultLauncher = this.f9321s;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(DeviceBondingActivity.r1(this, url));
        }
    }

    public final void c1(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.f9309g.f()) {
            qb.c.q(f9298v, "initCamera() while already open -- late SurfaceView callback?", new Object[0]);
            return;
        }
        try {
            this.f9309g.g(surfaceHolder);
            if (this.f9311i == null) {
                try {
                    this.f9311i = new w.c(this, this.f9314l, this.f9315m, this.f9316n, this.f9309g);
                } catch (IOException e11) {
                    e = e11;
                    qb.c.p(f9298v, "", e);
                    V0();
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    qb.c.p(f9298v, "Unexpected error initializing camera", e);
                    V0();
                    return;
                }
            }
            U0(null, null);
        } catch (IOException e13) {
            e = e13;
        } catch (RuntimeException e14) {
            e = e14;
        }
    }

    public final /* synthetic */ void d1(Intent intent) {
        setResult(-1, intent);
        finish();
    }

    public final /* synthetic */ g2 e1(View view) {
        BczPermissions.INSTANCE.setPhotoGranted(true);
        i1();
        return null;
    }

    public final /* synthetic */ void f1(sa.h hVar, boolean z11, List list, List list2) {
        hVar.f();
        if (z11) {
            j1();
        } else {
            va.g.i("请打开存储权限以保证该功能正常使用", 0);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(String message) {
        l1();
        kc.d f02 = ((u) ((u.a) new u.a(this).L(R.string.tip).V(message).b0(ButtonType.SINGLE_POSITIVE).F("好的")).d()).f0(new d());
        this.f9303a = f02;
        mc.a.n(this, f02, "qr_error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h1(final QRCodeResp resp) {
        qb.c.b(f9298v, "onQRCodeResponse " + resp, new Object[0]);
        l1();
        int action = resp.getAction();
        switch (action) {
            case 1:
                kc.d f02 = ((u) ((u.a) ((u.a) new u.a(this).L(R.string.tip).V(resp.getMessage()).p("扫错了")).F("好的")).d()).f0(new c(resp));
                this.f9303a = f02;
                mc.a.n(this, f02, "qr_response");
                break;
            case 2:
                ReadingPlanPlayActivity.w1(this, resp.getRedirect_info().getReading_plan_id());
                break;
            case 3:
                ExamAudioPlayActivity.w1(this, resp.getRedirect_info().getExam_id(), resp.getRedirect_info().getExam_category_id());
                break;
            case 4:
                BczWebExecutorKt.startNormalWeb(this, resp.getRedirect_info().getUrl());
                break;
            case 5:
                JumpUtils.redirectToBrowser(this, resp.getRedirect_info().getUrl());
                break;
            case 6:
                JumpUtils.redirectToAppWithScheme(this, resp.getRedirect_info().getUrl());
                break;
            case 7:
            case 8:
                b1(resp.getRedirect_info().getUrl());
                break;
            case 9:
                if (!TextUtils.isEmpty(resp.getMessage())) {
                    va.g.i(resp.getMessage(), 1);
                    qb.c.i(f9298v, "%s", resp.getMessage());
                }
                NavigatorMgr.INSTANCE.navToWebOrNaive(this, resp.getRedirect_info().getUrl(), 1);
                finish();
                break;
            default:
                qb.c.d(f9298v, "unexpected action %d", Integer.valueOf(action));
                break;
        }
    }

    public final void i1() {
        try {
            try {
                startActivityForResult(new Intent("android.intent.action.PICK").setType("image/*"), 100);
            } catch (Throwable unused) {
                va.g.i("未找到可用的相册应用", 0);
            }
        } catch (Throwable unused2) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            startActivityForResult(intent, 100);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kc.d, kc.h] */
    public final void j1() {
        if (BczPermissions.INSTANCE.getPhotoGranted()) {
            i1();
        } else {
            mc.a.n(this, ((u.a) ((u.a) new u.a(this).L(R.string.permission_request_photo_title).U(R.string.permission_request_photo_content).b0(ButtonType.DOUBLE).E(R.string.permission_request_photo_confirm, null, new l() { // from class: s.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 e12;
                    e12 = CaptureActivity.this.e1((View) obj);
                    return e12;
                }
            })).o(R.string.permission_request_photo_no, new l() { // from class: s.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    return CaptureActivity.I0((View) obj);
                }
            })).d(), "permission");
        }
    }

    public final void k1() {
        if (!T0() || Build.VERSION.SDK_INT > 28 || jt.c.c(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            j1();
            return;
        }
        final sa.h hVar = new sa.h(this);
        hVar.j("android.permission.WRITE_EXTERNAL_STORAGE");
        jt.c.b(this).b("android.permission.WRITE_EXTERNAL_STORAGE").f(new kt.a() { // from class: s.e
            @Override // kt.a
            public final void a(mt.c cVar, List list) {
                cVar.b(list, "请打开存储权限以保证该功能正常使用", "去申请", "取消");
            }
        }).i(new kt.d() { // from class: s.f
            @Override // kt.d
            public final void a(boolean z11, List list, List list2) {
                CaptureActivity.this.f1(hVar, z11, list, list2);
            }
        });
    }

    public final void l1() {
        h hVar = this.f9303a;
        if (hVar == null || !hVar.isVisible()) {
            return;
        }
        this.f9303a.dismiss();
        this.f9303a = null;
    }

    public final /* synthetic */ void lambda$onCreate$0(View view) {
        back();
    }

    public final /* synthetic */ void lambda$onCreate$1(View view) {
        k1();
    }

    public final void m1() {
        if (this.f9322t) {
            return;
        }
        this.f9322t = true;
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 101);
        this.f9323u.j("android.permission.CAMERA");
    }

    public final void n1(final String qrcode) {
        b bVar = new b("/rpc/bcz_system", qrcode);
        bVar.setTag(f9298v);
        com.baicizhan.client.business.thrift.c.b().a(bVar);
    }

    public final void o1() {
        this.f9310h.setVisibility(0);
        this.f9312j = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 105) {
            finish();
            return;
        }
        if (resultCode == -1 && requestCode == 100) {
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), intent.getData());
                ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage("正在扫描...");
                progressDialog.setCancelable(false);
                progressDialog.show();
                new Thread(new f(bitmap, progressDialog)).start();
            } catch (FileNotFoundException e11) {
                va.g.i("致命错误，文件不存在: " + e11.getMessage(), 0);
            } catch (IOException e12) {
                va.g.i("致命错误，读写失败: " + e12.getMessage(), 0);
            }
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        h5 h5Var = (h5) DataBindingUtil.setContentView(this, R.layout.capture);
        this.f9304b = h5Var;
        h5Var.f55138a.D(new View.OnClickListener() { // from class: s.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureActivity.this.lambda$onCreate$0(view);
            }
        });
        this.f9304b.f55138a.L(new View.OnClickListener() { // from class: s.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureActivity.this.lambda$onCreate$1(view);
            }
        });
        SurfaceHolder holder = this.f9304b.f55139b.getHolder();
        holder.setType(3);
        holder.addCallback(this);
        this.f9305c = false;
        this.f9306d = new k(this);
        this.f9307e = new s.b(this);
        this.f9308f = new s.a(this);
        this.f9321s = i2.w(this, new hj.a() { // from class: s.i
            @Override // hj.a
            public final void onResult(Object obj) {
                CaptureActivity.this.d1((Intent) obj);
            }
        });
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f9306d.g();
        l1();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 24) {
            this.f9309g.n();
            return true;
        }
        if (keyCode == 25) {
            this.f9309g.o();
            return true;
        }
        if (keyCode == 27 || keyCode == 80) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        w.c cVar = this.f9311i;
        if (cVar != null) {
            cVar.a();
            this.f9311i = null;
        }
        this.f9306d.e();
        this.f9308f.b();
        this.f9307e.b();
        t.d dVar = this.f9309g;
        if (dVar != null) {
            dVar.b();
        }
        if (!this.f9305c) {
            ((SurfaceView) findViewById(R.id.capture_preview_view)).getHolder().removeCallback(this);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f9323u.f();
        if (requestCode == 101) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                V0();
            } else {
                init();
            }
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            init();
        } else if (DeviceUtil.isMeizu()) {
            new Handler().postDelayed(new a(), 300L);
        } else {
            m1();
        }
    }

    public void p1(long delayMS) {
        w.c cVar = this.f9311i;
        if (cVar != null) {
            cVar.sendEmptyMessageDelayed(R.id.restart_preview, delayMS);
        }
        o1();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        if (holder == null) {
            qb.c.d(f9298v, "*** WARNING *** surfaceCreated() gave us a null surface!", new Object[0]);
        }
        if (this.f9305c) {
            return;
        }
        this.f9305c = true;
        qb.c.b(f9298v, "state on surface created: " + getLifecycle().getCurrentState(), new Object[0]);
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0 && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            c1(holder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        this.f9305c = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }
}
