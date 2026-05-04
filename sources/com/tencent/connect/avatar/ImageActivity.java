package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.e;
import com.tencent.open.b.h;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.open.utils.m;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ImageActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    RelativeLayout f42798a;

    /* renamed from: b, reason: collision with root package name */
    private QQToken f42799b;

    /* renamed from: c, reason: collision with root package name */
    private String f42800c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f42801d;

    /* renamed from: e, reason: collision with root package name */
    private c f42802e;

    /* renamed from: f, reason: collision with root package name */
    private Button f42803f;

    /* renamed from: g, reason: collision with root package name */
    private Button f42804g;

    /* renamed from: h, reason: collision with root package name */
    private b f42805h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f42806i;

    /* renamed from: j, reason: collision with root package name */
    private ProgressBar f42807j;

    /* renamed from: r, reason: collision with root package name */
    private String f42815r;

    /* renamed from: s, reason: collision with root package name */
    private Bitmap f42816s;

    /* renamed from: k, reason: collision with root package name */
    private int f42808k = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42809l = false;

    /* renamed from: m, reason: collision with root package name */
    private long f42810m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f42811n = 0;

    /* renamed from: o, reason: collision with root package name */
    private final int f42812o = 640;

    /* renamed from: p, reason: collision with root package name */
    private final int f42813p = 640;

    /* renamed from: q, reason: collision with root package name */
    private Rect f42814q = new Rect();

    /* renamed from: t, reason: collision with root package name */
    private final View.OnClickListener f42817t = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.f42807j.setVisibility(0);
            ImageActivity.this.f42804g.setEnabled(false);
            ImageActivity.this.f42804g.setTextColor(Color.rgb(21, 21, 21));
            ImageActivity.this.f42803f.setEnabled(false);
            ImageActivity.this.f42803f.setTextColor(Color.rgb(36, 94, 134));
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageActivity.this.c();
                }
            }).start();
            if (ImageActivity.this.f42809l) {
                ImageActivity.this.a("10657", 0L);
                return;
            }
            ImageActivity.this.a("10655", System.currentTimeMillis() - ImageActivity.this.f42810m);
            if (ImageActivity.this.f42802e.f42838b) {
                ImageActivity.this.a("10654", 0L);
            }
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final View.OnClickListener f42818u = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.a("10656", System.currentTimeMillis() - ImageActivity.this.f42810m);
            ImageActivity.this.setResult(0);
            ImageActivity.this.d();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final IUiListener f42819v = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.5
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            ImageActivity.this.f42804g.setEnabled(true);
            int i11 = -1;
            ImageActivity.this.f42804g.setTextColor(-1);
            ImageActivity.this.f42803f.setEnabled(true);
            ImageActivity.this.f42803f.setTextColor(-1);
            ImageActivity.this.f42807j.setVisibility(8);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                i11 = jSONObject.getInt("ret");
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            if (i11 != 0) {
                ImageActivity.this.a("设置出错了，请重新登录再尝试下呢：）", 1);
                e.a().a(ImageActivity.this.f42799b.getOpenId(), ImageActivity.this.f42799b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_ACT_TYPE_NINETEEN, "1");
                return;
            }
            ImageActivity.this.a("设置成功", 0);
            ImageActivity.this.a("10658", 0L);
            e.a().a(ImageActivity.this.f42799b.getOpenId(), ImageActivity.this.f42799b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, "3", "0");
            ImageActivity imageActivity = ImageActivity.this;
            if (imageActivity.f42800c != null && !"".equals(ImageActivity.this.f42800c)) {
                Intent intent = new Intent();
                intent.setClassName(imageActivity, ImageActivity.this.f42800c);
                if (imageActivity.getPackageManager().resolveActivity(intent, 0) != null) {
                    imageActivity.startActivity(intent);
                }
            }
            ImageActivity.this.a(0, jSONObject.toString(), null, null);
            ImageActivity.this.d();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ImageActivity.this.f42804g.setEnabled(true);
            ImageActivity.this.f42804g.setTextColor(-1);
            ImageActivity.this.f42803f.setEnabled(true);
            ImageActivity.this.f42803f.setTextColor(-1);
            ImageActivity.this.f42803f.setText("重试");
            ImageActivity.this.f42807j.setVisibility(8);
            ImageActivity.this.f42809l = true;
            ImageActivity.this.a(uiError.errorMessage, 1);
            ImageActivity.this.a("10660", 0L);
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private final IUiListener f42820w = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.6
        private void a(int i11) {
            if (ImageActivity.this.f42808k < 2) {
                ImageActivity.this.e();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            int i11 = -1;
            try {
                i11 = jSONObject.getInt("ret");
                if (i11 == 0) {
                    final String string = jSONObject.getString("nickname");
                    ImageActivity.this.f42801d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageActivity.this.c(string);
                        }
                    });
                    ImageActivity.this.a("10659", 0L);
                } else {
                    ImageActivity.this.a("10661", 0L);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            if (i11 != 0) {
                a(i11);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            a(0);
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class QQAvatarImp extends BaseApi {
        public QQAvatarImp(QQToken qQToken) {
            super(qQToken);
        }

        public void setAvator(Bitmap bitmap, IUiListener iUiListener) {
            Bundle a11 = a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            BaseApi.TempRequestListener tempRequestListener = new BaseApi.TempRequestListener(iUiListener);
            a11.putByteArray("picture", byteArray);
            HttpUtils.requestAsync(this.f42865c, g.a(), "user/set_user_face", a11, "POST", tempRequestListener);
            e.a().a(this.f42865c.getOpenId(), this.f42865c.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_ACT_TYPE_NINETEEN, "0");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends View {
        public a(Context context) {
            super(context);
        }

        public void a(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable b11 = ImageActivity.this.b("com.tencent.plus.blue_normal.png");
            Drawable b12 = ImageActivity.this.b("com.tencent.plus.blue_down.png");
            Drawable b13 = ImageActivity.this.b("com.tencent.plus.blue_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, b12);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, b11);
            stateListDrawable.addState(View.ENABLED_STATE_SET, b11);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, b11);
            stateListDrawable.addState(View.EMPTY_STATE_SET, b13);
            button.setBackgroundDrawable(stateListDrawable);
        }

        public void b(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable b11 = ImageActivity.this.b("com.tencent.plus.gray_normal.png");
            Drawable b12 = ImageActivity.this.b("com.tencent.plus.gray_down.png");
            Drawable b13 = ImageActivity.this.b("com.tencent.plus.gray_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, b12);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, b11);
            stateListDrawable.addState(View.ENABLED_STATE_SET, b11);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, b11);
            stateListDrawable.addState(View.EMPTY_STATE_SET, b13);
            button.setBackgroundDrawable(stateListDrawable);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        d();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView(a());
        this.f42801d = new Handler();
        Bundle bundleExtra = getIntent().getBundleExtra(Constants.KEY_PARAMS);
        this.f42815r = bundleExtra.getString("picture");
        this.f42800c = bundleExtra.getString("return_activity");
        String string = bundleExtra.getString("appid");
        String string2 = bundleExtra.getString("access_token");
        long j11 = bundleExtra.getLong("expires_in");
        String string3 = bundleExtra.getString("openid");
        this.f42811n = bundleExtra.getInt("exitAnim");
        QQToken qQToken = new QQToken(string);
        this.f42799b = qQToken;
        qQToken.setAccessToken(string2, ((j11 - System.currentTimeMillis()) / 1000) + "");
        this.f42799b.setOpenId(string3);
        b();
        e();
        this.f42810m = System.currentTimeMillis();
        a("10653", 0L);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f42802e.setImageBitmap(null);
        Bitmap bitmap = this.f42816s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f42816s.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        float width = this.f42814q.width();
        Matrix imageMatrix = this.f42802e.getImageMatrix();
        float[] fArr = new float[9];
        imageMatrix.getValues(fArr);
        float f11 = fArr[2];
        float f12 = fArr[5];
        float f13 = fArr[0];
        float f14 = 640.0f / width;
        Rect rect = this.f42814q;
        int i11 = (int) ((rect.left - f11) / f13);
        int i12 = i11 < 0 ? 0 : i11;
        int i13 = (int) ((rect.top - f12) / f13);
        int i14 = i13 < 0 ? 0 : i13;
        Matrix matrix = new Matrix();
        matrix.set(imageMatrix);
        matrix.postScale(f14, f14);
        int i15 = (int) (650.0f / f13);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.f42816s, i12, i14, Math.min(this.f42816s.getWidth() - i12, i15), Math.min(this.f42816s.getHeight() - i14, i15), matrix, true);
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, 640, 640);
            createBitmap.recycle();
            a(createBitmap2);
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            a(Constants.MSG_IMAGE_ERROR, 1);
            a(-5, null, Constants.MSG_IMAGE_ERROR, e11.getMessage());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        finish();
        int i11 = this.f42811n;
        if (i11 != 0) {
            overridePendingTransition(0, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f42808k++;
        new UserInfo(this, this.f42799b).getUserInfo(this.f42820w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable b(String str) {
        return m.a(str, this);
    }

    private void b() {
        Bitmap a11;
        try {
            a11 = a(this.f42815r);
            this.f42816s = a11;
        } catch (IOException e11) {
            e11.printStackTrace();
            a(Constants.MSG_IMAGE_ERROR, 1);
            a(-5, null, Constants.MSG_IMAGE_ERROR, e11.getMessage());
            d();
        }
        if (a11 != null) {
            this.f42802e.setImageBitmap(a11);
            this.f42803f.setOnClickListener(this.f42817t);
            this.f42804g.setOnClickListener(this.f42818u);
            this.f42798a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tencent.connect.avatar.ImageActivity.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ImageActivity.this.f42798a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    ImageActivity imageActivity = ImageActivity.this;
                    imageActivity.f42814q = imageActivity.f42805h.a();
                    ImageActivity.this.f42802e.a(ImageActivity.this.f42814q);
                }
            });
            return;
        }
        throw new IOException("cannot read picture: '" + this.f42815r + "'!");
    }

    private String d(String str) {
        return str.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("&quot;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "&");
    }

    private Bitmap a(String str) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i11 = 1;
        options.inJustDecodeBounds = true;
        Uri parse = Uri.parse(str);
        InputStream openInputStream = getContentResolver().openInputStream(parse);
        if (openInputStream == null) {
            return null;
        }
        try {
            BitmapFactory.decodeStream(openInputStream, null, options);
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
        openInputStream.close();
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        while (i12 * i13 > 4194304) {
            i12 /= 2;
            i13 /= 2;
            i11 *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i11;
        try {
            return BitmapFactory.decodeStream(getContentResolver().openInputStream(parse), null, options);
        } catch (OutOfMemoryError e12) {
            e12.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i11) {
        Toast makeText = Toast.makeText(this, str, 1);
        LinearLayout linearLayout = (LinearLayout) makeText.getView();
        ((TextView) linearLayout.getChildAt(0)).setPadding(8, 0, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 16.0f), com.tencent.connect.avatar.a.a(this, 16.0f)));
        if (i11 == 0) {
            imageView.setImageDrawable(b("com.tencent.plus.ic_success.png"));
        } else {
            imageView.setImageDrawable(b("com.tencent.plus.ic_error.png"));
        }
        linearLayout.addView(imageView, 0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        makeText.setView(linearLayout);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    private View a() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f42798a = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f42798a.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(layoutParams3);
        this.f42798a.addView(relativeLayout2);
        c cVar = new c(this);
        this.f42802e = cVar;
        cVar.setLayoutParams(layoutParams2);
        this.f42802e.setScaleType(ImageView.ScaleType.MATRIX);
        relativeLayout2.addView(this.f42802e);
        this.f42805h = new b(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(layoutParams2);
        layoutParams4.addRule(14, -1);
        layoutParams4.addRule(15, -1);
        this.f42805h.setLayoutParams(layoutParams4);
        relativeLayout2.addView(this.f42805h);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, com.tencent.connect.avatar.a.a(this, 80.0f));
        layoutParams5.addRule(14, -1);
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f42798a.addView(linearLayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 24.0f), com.tencent.connect.avatar.a.a(this, 24.0f)));
        imageView.setImageDrawable(b("com.tencent.plus.logo.png"));
        linearLayout.addView(imageView);
        this.f42806i = new TextView(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(layoutParams3);
        layoutParams6.leftMargin = com.tencent.connect.avatar.a.a(this, 7.0f);
        this.f42806i.setLayoutParams(layoutParams6);
        this.f42806i.setEllipsize(TextUtils.TruncateAt.END);
        this.f42806i.setSingleLine();
        this.f42806i.setTextColor(-1);
        this.f42806i.setTextSize(24.0f);
        this.f42806i.setVisibility(8);
        linearLayout.addView(this.f42806i);
        RelativeLayout relativeLayout3 = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, com.tencent.connect.avatar.a.a(this, 60.0f));
        layoutParams7.addRule(12, -1);
        layoutParams7.addRule(9, -1);
        relativeLayout3.setLayoutParams(layoutParams7);
        relativeLayout3.setBackgroundDrawable(b("com.tencent.plus.bar.png"));
        int a11 = com.tencent.connect.avatar.a.a(this, 10.0f);
        relativeLayout3.setPadding(a11, a11, a11, 0);
        this.f42798a.addView(relativeLayout3);
        a aVar = new a(this);
        int a12 = com.tencent.connect.avatar.a.a(this, 14.0f);
        int a13 = com.tencent.connect.avatar.a.a(this, 7.0f);
        this.f42804g = new Button(this);
        this.f42804g.setLayoutParams(new RelativeLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 78.0f), com.tencent.connect.avatar.a.a(this, 45.0f)));
        this.f42804g.setText("取消");
        this.f42804g.setTextColor(-1);
        this.f42804g.setTextSize(18.0f);
        this.f42804g.setPadding(a12, a13, a12, a13);
        aVar.b(this.f42804g);
        relativeLayout3.addView(this.f42804g);
        this.f42803f = new Button(this);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 78.0f), com.tencent.connect.avatar.a.a(this, 45.0f));
        layoutParams8.addRule(11, -1);
        this.f42803f.setLayoutParams(layoutParams8);
        this.f42803f.setTextColor(-1);
        this.f42803f.setTextSize(18.0f);
        this.f42803f.setPadding(a12, a13, a12, a13);
        this.f42803f.setText("选取");
        aVar.a(this.f42803f);
        relativeLayout3.addView(this.f42803f);
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams9.addRule(13, -1);
        textView.setLayoutParams(layoutParams9);
        textView.setText("移动和缩放");
        textView.setPadding(0, com.tencent.connect.avatar.a.a(this, 3.0f), 0, 0);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        relativeLayout3.addView(textView);
        this.f42807j = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams10.addRule(14, -1);
        layoutParams10.addRule(15, -1);
        this.f42807j.setLayoutParams(layoutParams10);
        this.f42807j.setVisibility(8);
        this.f42798a.addView(this.f42807j);
        return this.f42798a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        String d11 = d(str);
        if ("".equals(d11)) {
            return;
        }
        this.f42806i.setText(d11);
        this.f42806i.setVisibility(0);
    }

    private void a(Bitmap bitmap) {
        new QQAvatarImp(this.f42799b).setAvator(bitmap, this.f42819v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final int i11) {
        this.f42801d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.b(str, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_ERROR_CODE, i11);
        intent.putExtra(Constants.KEY_ERROR_MSG, str2);
        intent.putExtra(Constants.KEY_ERROR_DETAIL, str3);
        intent.putExtra(Constants.KEY_RESPONSE, str);
        setResult(-1, intent);
    }

    public void a(String str, long j11) {
        a(str, j11, this.f42799b.getAppId());
    }

    public static void a(String str, long j11, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("strValue", str2);
        hashMap.put("nValue", str);
        hashMap.put("qver", Constants.SDK_VERSION);
        if (j11 != 0) {
            hashMap.put("elt", String.valueOf(j11));
        }
        h.a().a("https://cgi.qplus.com/report/report", hashMap);
    }
}
