package com.baicizhan.main.activity.daka.imagedaka.share;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.widget.share.SharePickerSheetView;
import com.baicizhan.common.picparser.ParserType;
import com.baicizhan.main.activity.daka.datasource.g;
import com.jiongji.andriod.card.R;
import gs.f2;
import java.io.File;
import java.util.HashMap;
import ma.l;
import ma.t;
import wb0.p;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ShareDialogActivity extends BaseAppCompatActivity implements ShareDelegate.b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f18436h = "ShareDialog_Tag";

    /* renamed from: i, reason: collision with root package name */
    public static final String f18437i = "param_type";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18438j = "content_id";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18439k = "param_x";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18440l = "param_y";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18441m = "param_w";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18442n = "param_h";

    /* renamed from: o, reason: collision with root package name */
    public static final String f18443o = "param_share_url";

    /* renamed from: p, reason: collision with root package name */
    public static final String f18444p = "return_channel";

    /* renamed from: a, reason: collision with root package name */
    public f2 f18445a;

    /* renamed from: b, reason: collision with root package name */
    public SharePickerSheetView f18446b;

    /* renamed from: c, reason: collision with root package name */
    public int f18447c;

    /* renamed from: d, reason: collision with root package name */
    public int f18448d = 200;

    /* renamed from: e, reason: collision with root package name */
    public g.j f18449e;

    /* renamed from: f, reason: collision with root package name */
    public ShareParams f18450f;

    /* renamed from: g, reason: collision with root package name */
    public float f18451g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<String, Bitmap> {
        public a() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call(String s11) {
            try {
                Bitmap bitmap = hc.c.o(new File(s11), ParserType.PICASSO).n(ShareDialogActivity.this.getIntent().getIntExtra("param_w", 0), ShareDialogActivity.this.getIntent().getIntExtra("param_h", 0)).get();
                qb.c.i("ShareDialog_Tag", "bitmap w %d, h %d, size %d k", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(bitmap.getByteCount() / 1024));
                return bitmap;
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements q<g.j, Bitmap, Bitmap> {
        public c() {
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call(g.j dakaInfo, Bitmap bitmap) {
            ShareDialogActivity.this.f18449e = dakaInfo;
            return bitmap;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18457a;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            f18457a = iArr;
            try {
                iArr[ShareChannel.WEIBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18457a[ShareChannel.QQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18457a[ShareChannel.QZONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18457a[ShareChannel.WEIXIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18457a[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        this.f18446b.animate().setDuration(this.f18448d).translationYBy(-this.f18447c).start();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f18445a.f54857b, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, 0, -1728053248);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(this.f18448d).start();
        float y11 = (this.f18445a.f54856a.getY() + (this.f18445a.f54856a.getHeight() * 0.1f)) - 20.0f;
        if (300.0f <= y11) {
            y11 = 300.0f;
        }
        this.f18451g = y11;
        this.f18445a.f54856a.animate().scaleX(0.8f).scaleY(0.8f).setDuration(this.f18448d).translationYBy(-this.f18451g).start();
    }

    private void M0() {
        this.f18446b.animate().setDuration(this.f18448d).translationYBy(this.f18447c + 200).setListener(new d()).start();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f18445a.f54857b, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, -1728053248, 0);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(this.f18448d).start();
        this.f18445a.f54856a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f18448d).translationYBy(this.f18451g).start();
    }

    public static String N0(Intent intent) {
        return intent.getStringExtra(f18444p);
    }

    public static void R0(Activity context, String url, int request, String type, float x11, float y11, int w11, int h11, String contentId) {
        qb.c.i("ShareDialog_Tag", "[x,y,w,h,url][%f,%f,%d,%d,%s]", Float.valueOf(x11), Float.valueOf(y11), Integer.valueOf(w11), Integer.valueOf(h11), url);
        Intent intent = new Intent(context, (Class<?>) ShareDialogActivity.class);
        intent.putExtra(f18443o, url);
        intent.putExtra(f18437i, type);
        intent.putExtra(f18439k, x11);
        intent.putExtra(f18440l, y11);
        intent.putExtra("param_w", w11);
        intent.putExtra("param_h", h11);
        intent.putExtra("content_id", contentId);
        context.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_nothing);
        context.startActivityForResult(intent, request);
    }

    public static void S0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) ShareDialogActivity.class));
    }

    public final void O0() {
        this.f18445a.f54856a.setX(getIntent().getFloatExtra(f18439k, 0.0f));
        this.f18445a.f54856a.setY(getIntent().getFloatExtra(f18440l, 0.0f));
        ViewGroup.LayoutParams layoutParams = this.f18445a.f54856a.getLayoutParams();
        layoutParams.width = getIntent().getIntExtra("param_w", 0);
        layoutParams.height = getIntent().getIntExtra("param_h", 0);
        this.f18445a.f54856a.setLayoutParams(layoutParams);
    }

    public final void P0() {
        ShareParams shareParams = new ShareParams();
        this.f18450f = shareParams;
        shareParams.f16061e = ShareParams.ShareType.IMAGE;
        shareParams.f16060d = getIntent().getStringExtra(f18443o);
        if (this.f18446b == null) {
            this.f18446b = new SharePickerSheetView.a().e(true).d(this.f18450f).b(this).c(true).a(this);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f18445a.f54857b.addView(this.f18446b, layoutParams);
        this.f18446b.measure(0, 0);
        int measuredHeight = this.f18446b.getMeasuredHeight();
        this.f18447c = measuredHeight;
        this.f18446b.setTranslationY(measuredHeight);
    }

    public final void Q0() {
        rx.c.r7(g.n().l(this), rx.c.M2(getIntent().getStringExtra(f18443o)).c3(new a()).w5(bc0.c.e()), new c()).I3(tb0.a.a()).r5(new b());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SharePickerSheetView sharePickerSheetView = this.f18446b;
        if (sharePickerSheetView != null) {
            sharePickerSheetView.h(requestCode, resultCode, data);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        f2 d11 = f2.d(LayoutInflater.from(this));
        this.f18445a = d11;
        setContentView(d11.getRoot());
        P0();
        O0();
        Q0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        SharePickerSheetView sharePickerSheetView = this.f18446b;
        if (sharePickerSheetView != null) {
            sharePickerSheetView.i(requestCode, permissions, grantResults);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareCancel() {
        setResult(0);
        M0();
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareError(ShareChannel media, Throwable throwable) {
        qb.c.c("ShareDialog_Tag", "" + media, throwable);
        va.g.g(R.string.daka_page_daka_failed, 0);
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareStart(ShareChannel media) {
        g.j jVar = this.f18449e;
        if (jVar == null || jVar.f18380b == null) {
            return;
        }
        int i11 = e.f18457a[media.ordinal()];
        if (i11 == 1) {
            this.f18450f.f16058b = this.f18449e.f18380b.getWeibo_share_txt();
        } else if (i11 == 2 || i11 == 3) {
            this.f18450f.f16058b = getString(R.string.daka_share_share_title);
        } else if (i11 == 4 || i11 == 5) {
            this.f18450f.f16058b = this.f18449e.f18380b.getWeixin_share_title();
        }
        this.f18446b.l(this.f18450f);
        String stringExtra = getIntent().getStringExtra(f18437i);
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.X0, stringExtra);
        hashMap.put(ma.b.Y0, getIntent().getStringExtra("content_id"));
        hashMap.put(ma.b.Z0, media.toString());
        l.e(t.f73003b, ma.a.f72815p4, hashMap);
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareSuccess(ShareChannel media) {
        if (ShareChannel.SAVE_PHOTO == media) {
            va.g.g(R.string.daka_share_save_image_success, 0);
        }
        setResult(-1, new Intent().putExtra(f18444p, media.toString()));
        finish();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Bitmap> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            ShareDialogActivity.this.finish();
            qb.c.c("ShareDialog_Tag", "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            ShareDialogActivity.this.f18445a.f54858c.setImageBitmap(bitmap);
            ShareDialogActivity.this.L0();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Animator.AnimatorListener {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareDialogActivity.this.finish();
                ShareDialogActivity.this.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_nothing);
            }
        }

        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ShareDialogActivity.this.f18445a.getRoot().setVisibility(8);
            new Handler().postDelayed(new a(), 100L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareSend(ShareChannel media) {
    }
}
