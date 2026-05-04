package w;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import cn.hugo.android.scanner.CaptureActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.k;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c extends Handler {

    /* renamed from: e, reason: collision with root package name */
    public static final String f94427e = "CaptureActivityHandler";

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f94428a;

    /* renamed from: b, reason: collision with root package name */
    public final f f94429b;

    /* renamed from: c, reason: collision with root package name */
    public a f94430c;

    /* renamed from: d, reason: collision with root package name */
    public final t.d f94431d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public c(CaptureActivity activity, Collection<BarcodeFormat> decodeFormats, Map<DecodeHintType, ?> baseHints, String characterSet, t.d cameraManager) {
        this.f94428a = activity;
        f fVar = new f(activity, decodeFormats, baseHints, characterSet, new x.a(activity.Z0()));
        this.f94429b = fVar;
        fVar.start();
        this.f94430c = a.SUCCESS;
        this.f94431d = cameraManager;
        cameraManager.l();
        b();
    }

    public void a() {
        this.f94430c = a.DONE;
        this.f94431d.m();
        Message.obtain(this.f94429b.a(), R.id.quit).sendToTarget();
        try {
            this.f94429b.join(500L);
        } catch (InterruptedException unused) {
        }
        removeMessages(R.id.decode_succeeded);
        removeMessages(R.id.decode_failed);
    }

    public final void b() {
        if (this.f94430c == a.SUCCESS) {
            this.f94430c = a.PREVIEW;
            this.f94431d.h(this.f94429b.a(), R.id.decode);
            this.f94428a.W0();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        float f11;
        ActivityInfo activityInfo;
        Bitmap bitmap = null;
        r1 = null;
        String str = null;
        switch (message.what) {
            case R.id.decode_failed /* 2131362356 */:
                this.f94430c = a.PREVIEW;
                this.f94431d.h(this.f94429b.a(), R.id.decode);
                break;
            case R.id.decode_succeeded /* 2131362357 */:
                qb.c.b(f94427e, "Got decode succeeded message", new Object[0]);
                this.f94430c = a.SUCCESS;
                Bundle data = message.getData();
                if (data != null) {
                    byte[] byteArray = data.getByteArray(f.f94445e);
                    bitmap = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
                    f11 = data.getFloat(f.f94446f);
                } else {
                    f11 = 1.0f;
                }
                this.f94428a.a1((k) message.obj, bitmap, f11);
                break;
            case R.id.launch_product_query /* 2131362798 */:
                qb.c.b(f94427e, "Got product query message", new Object[0]);
                String str2 = (String) message.obj;
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.addFlags(524288);
                intent.setData(Uri.parse(str2));
                ResolveInfo resolveActivity = this.f94428a.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                    str = activityInfo.packageName;
                    qb.c.b(f94427e, "Using browser in package " + str, new Object[0]);
                }
                if ("com.android.browser".equals(str) || "com.android.chrome".equals(str)) {
                    intent.setPackage(str);
                    intent.addFlags(268435456);
                    intent.putExtra("com.android.browser.application_id", str);
                }
                try {
                    this.f94428a.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    qb.c.q(f94427e, "Can't find anything to handle VIEW of URI " + str2, new Object[0]);
                    return;
                }
            case R.id.restart_preview /* 2131363470 */:
                qb.c.b(f94427e, "Got restart preview message", new Object[0]);
                b();
                break;
            case R.id.return_scan_result /* 2131363474 */:
                qb.c.b(f94427e, "Got return scan result message", new Object[0]);
                this.f94428a.setResult(-1, (Intent) message.obj);
                this.f94428a.finish();
                break;
        }
    }
}
