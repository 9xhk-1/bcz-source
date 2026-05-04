package com.sina.weibo.sdk.share;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import cw.e;
import gw.a;
import gw.c;
import gw.d;
import gw.f;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ShareTransActivity extends BaseActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f41583f = 0;

    /* renamed from: a, reason: collision with root package name */
    public Intent f41584a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f41585b;

    /* renamed from: c, reason: collision with root package name */
    public e f41586c;

    /* renamed from: d, reason: collision with root package name */
    public String f41587d;

    /* renamed from: e, reason: collision with root package name */
    public a f41588e = new a(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Object obj = message.obj;
                if (obj instanceof Intent) {
                    int i11 = ShareTransActivity.f41583f;
                    ShareTransActivity.this.a((Intent) obj);
                    return;
                }
            }
            ShareTransActivity shareTransActivity = ShareTransActivity.this;
            int i12 = ShareTransActivity.f41583f;
            shareTransActivity.b();
        }
    }

    public final void a(WeiboMultiMessage weiboMultiMessage) {
        String str;
        c.a("WBShareTag", "start wb composer");
        try {
            this.f41584a.putExtra("start_flag", 1002);
            String str2 = null;
            try {
                str = d.a(String.valueOf((Math.random() * 10000.0d) + System.currentTimeMillis()).getBytes());
            } catch (Exception e11) {
                e11.printStackTrace();
                str = null;
            }
            this.f41587d = str;
            this.f41584a.putExtra("share_back_flag", str);
            this.f41584a.putExtra("share_flag_for_new_version", 1);
            Bundle extras = this.f41584a.getExtras();
            Intent intent = new Intent("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY");
            a.C0646a a11 = gw.a.a(this);
            if (a11 != null) {
                intent.setPackage(a11.f57825a);
            }
            intent.putExtras(weiboMultiMessage.writeToBundle(extras));
            intent.putExtra("_weibo_sdkVersion", "0041005000");
            intent.putExtra("_weibo_appPackage", getPackageName());
            if (!a.a.f1056a) {
                throw new RuntimeException("please init sdk before use it. Wb.install()");
            }
            intent.putExtra("_weibo_appKey", a.a.f1057b.getAppKey());
            intent.putExtra("_weibo_flag", 538116905);
            try {
                str2 = d.a(f.c(this, getPackageName()).getBytes());
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            intent.putExtra("_weibo_sign", str2);
            String stringExtra = this.f41584a.getStringExtra("start_web_activity");
            if (!TextUtils.isEmpty(stringExtra) && "com.sina.weibo.sdk.web.WebActivity".equals(stringExtra)) {
                intent.setClassName(this, stringExtra);
                startActivityForResult(intent, 10001);
            } else {
                if (!a.a.b(this)) {
                    a("Start weibo client's composer fail. And Weibo client is not installed.");
                    return;
                }
                if (a11 != null) {
                    intent.setPackage(a11.f57825a);
                }
                startActivityForResult(intent, 10001);
            }
        } catch (Throwable th2) {
            c.b("WBShareTag", "start wb composer fail," + th2.getMessage());
            a("Start weibo client's composer fail. " + th2.getMessage());
        }
    }

    public final void b() {
        FrameLayout frameLayout = this.f41585b;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        a aVar = this.f41588e;
        if (aVar != null) {
            aVar.removeMessages(0);
            this.f41588e = null;
        }
        try {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("_weibo_resp_errcode", 1);
            intent.putExtras(bundle);
            setResult(-1, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        c.a("WBShareTag", "onActivityResult. Means share result coming!");
        a aVar = this.f41588e;
        if (aVar != null) {
            if (i12 != -1) {
                aVar.sendEmptyMessageDelayed(0, 100L);
                return;
            }
            Message obtain = Message.obtain(aVar, 1);
            obtain.obj = intent;
            this.f41588e.sendMessageDelayed(obtain, 100L);
        }
    }

    @Override // com.sina.weibo.sdk.share.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.a("WBShareTag", "start share activity.");
        Intent intent = getIntent();
        this.f41584a = intent;
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getIntExtra("start_flag", -1) != 1001) {
            finish();
            return;
        }
        this.f41585b = new FrameLayout(this);
        int intExtra = getIntent().getIntExtra("progress_id", -1);
        View inflate = intExtra != -1 ? ((LayoutInflater) getSystemService("layout_inflater")).inflate(intExtra, (ViewGroup) null) : new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f41585b.addView(inflate, layoutParams);
        this.f41585b.setBackgroundColor(855638016);
        setContentView(this.f41585b);
        c.a("WBShareTag", "prepare wb resource.");
        Bundle extras = this.f41584a.getExtras();
        if (extras == null) {
            finish();
            return;
        }
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        weiboMultiMessage.readFromBundle(extras);
        if (weiboMultiMessage.multiImageObject == null && weiboMultiMessage.videoSourceObject == null) {
            a(weiboMultiMessage);
            return;
        }
        e eVar = this.f41586c;
        if (eVar != null) {
            eVar.cancel(true);
        }
        e eVar2 = new e(this, new cw.a(this));
        this.f41586c = eVar2;
        eVar2.execute(weiboMultiMessage);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        c.a("WBShareTag", "start share activity again. Means share result coming!");
        int intExtra = intent.getIntExtra("start_flag", -1);
        if (intExtra == 1001) {
            return;
        }
        if (intExtra == 1002) {
            a(intent);
        } else {
            b();
        }
    }

    public final void a(Intent intent) {
        FrameLayout frameLayout = this.f41585b;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        a aVar = this.f41588e;
        if (aVar != null) {
            aVar.removeMessages(0);
            this.f41588e = null;
        }
        if (!TextUtils.isEmpty(this.f41587d) && intent != null && intent.getExtras().containsKey("share_back_flag")) {
            if (TextUtils.equals(this.f41587d, intent.getStringExtra("share_back_flag"))) {
                if (intent != null && intent.getFlags() != 0) {
                    int flags = intent.getFlags();
                    String binaryString = Integer.toBinaryString(flags);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(64);
                    arrayList.add(128);
                    arrayList.add(1);
                    arrayList.add(2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        flags &= ~((Integer) it.next()).intValue();
                    }
                    c.a("WBShareTag", "clear flags: " + binaryString + "->" + Integer.toBinaryString(flags));
                    intent.setFlags(flags);
                }
                setResult(-1, intent);
                finish();
                return;
            }
        }
        b();
    }

    public final void a(String str) {
        FrameLayout frameLayout = this.f41585b;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        a aVar = this.f41588e;
        if (aVar != null) {
            aVar.removeMessages(0);
            this.f41588e = null;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("_weibo_resp_errcode", 2);
        bundle.putString("_weibo_resp_errstr", str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
