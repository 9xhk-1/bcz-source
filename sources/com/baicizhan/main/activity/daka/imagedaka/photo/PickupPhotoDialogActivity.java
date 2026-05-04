package com.baicizhan.main.activity.daka.imagedaka.photo;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.util.BczPermissions;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.daka.imagedaka.photo.PickupPhotoDialogActivity;
import com.jiongji.andriod.card.R;
import gs.s1;
import java.io.File;
import java.util.List;
import kc.u;
import sa.h;
import td.g;
import x00.l;
import xb.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PickupPhotoDialogActivity extends BaseAppCompatActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final String f18420h = "ShareDialog_Tag";

    /* renamed from: i, reason: collision with root package name */
    public static final String f18421i = "result_uri";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18422j = "param_w";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18423k = "param_h";

    /* renamed from: l, reason: collision with root package name */
    public static final int f18424l = 101;

    /* renamed from: a, reason: collision with root package name */
    public s1 f18425a;

    /* renamed from: b, reason: collision with root package name */
    public g f18426b;

    /* renamed from: c, reason: collision with root package name */
    public int f18427c;

    /* renamed from: e, reason: collision with root package name */
    public int f18429e;

    /* renamed from: f, reason: collision with root package name */
    public int f18430f;

    /* renamed from: d, reason: collision with root package name */
    public int f18428d = 200;

    /* renamed from: g, reason: collision with root package name */
    public h f18431g = new h(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Void> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            PickupPhotoDialogActivity.this.Q0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            PickupPhotoDialogActivity.this.Z0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            PickupPhotoDialogActivity.this.f1();
        }
    }

    private boolean S0() {
        return DeviceUtil.IS_REDMI_NOTE_3;
    }

    private void U0() {
        s1 e11 = s1.e(LayoutInflater.from(this));
        this.f18425a = e11;
        setContentView(e11.getRoot());
        this.f18427c = f.a(this, 208.0f);
    }

    private void V0() {
        this.f18426b = (g) new ViewModelProvider(this).get(g.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kc.d, kc.h] */
    private void Y0() {
        if (BczPermissions.INSTANCE.getPhotoGranted()) {
            com.soundcloud.android.crop.a.k(this);
        } else {
            mc.a.n(this, ((u.a) ((u.a) new u.a(this).L(R.string.permission_request_photo_title).U(R.string.permission_request_photo_content).b0(ButtonType.DOUBLE).E(R.string.permission_request_photo_confirm, null, new l() { // from class: td.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 W0;
                    W0 = PickupPhotoDialogActivity.this.W0((View) obj);
                    return W0;
                }
            })).n(R.string.permission_request_photo_no)).d(), "permission");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0() {
        if (!S0() || Build.VERSION.SDK_INT > 28 || jt.c.c(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Y0();
            return;
        }
        final h hVar = new h(this);
        hVar.j("android.permission.WRITE_EXTERNAL_STORAGE");
        jt.c.b(this).b("android.permission.WRITE_EXTERNAL_STORAGE").f(new kt.a() { // from class: td.e
            @Override // kt.a
            public final void a(mt.c cVar, List list) {
                cVar.b(list, "请打开存储权限以保证该功能正常使用", "去申请", "取消");
            }
        }).i(new kt.d() { // from class: td.f
            @Override // kt.d
            public final void a(boolean z11, List list, List list2) {
                PickupPhotoDialogActivity.this.X0(hVar, z11, list, list2);
            }
        });
    }

    private void a1() {
        this.f18431g.j("android.permission.CAMERA");
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 101);
    }

    public static void b1(Activity context, int requestCode) {
        qb.c.i("ShareDialog_Tag", "", new Object[0]);
        Intent intent = new Intent(context, (Class<?>) PickupPhotoDialogActivity.class);
        context.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_nothing);
        context.startActivityForResult(intent, requestCode);
    }

    public static void c1(Activity context, int w11, int h11, int requestCode) {
        qb.c.i("ShareDialog_Tag", "%d, %d", Integer.valueOf(w11), Integer.valueOf(h11));
        Intent intent = new Intent(context, (Class<?>) PickupPhotoDialogActivity.class);
        intent.putExtra("param_w", w11);
        intent.putExtra("param_h", h11);
        context.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_nothing);
        context.startActivityForResult(intent, requestCode);
    }

    public static void d1(Fragment fragment, int requestCode) {
        qb.c.i("ShareDialog_Tag", "", new Object[0]);
        fragment.startActivityForResult(new Intent(fragment.getContext(), (Class<?>) PickupPhotoDialogActivity.class), requestCode);
    }

    public static void e1(Fragment fragment, int w11, int h11, int requestCode) {
        qb.c.i("ShareDialog_Tag", "%d, %d", Integer.valueOf(w11), Integer.valueOf(h11));
        Intent intent = new Intent(fragment.getContext(), (Class<?>) PickupPhotoDialogActivity.class);
        intent.putExtra("param_w", w11);
        intent.putExtra("param_h", h11);
        fragment.startActivityForResult(intent, requestCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            a1();
        } else {
            com.soundcloud.android.crop.a.z(this);
        }
    }

    private void init() {
        this.f18429e = getIntent().getIntExtra("param_w", pd.a.f80340j);
        this.f18430f = getIntent().getIntExtra("param_h", 1440);
        this.f18425a.j(this.f18426b);
        P0();
        this.f18426b.b().observe(this, new a());
        this.f18426b.c().observe(this, new b());
        this.f18426b.d().observe(this, new c());
    }

    public final void P0() {
        this.f18425a.f56694c.animate().setDuration(this.f18428d).translationYBy(-this.f18427c).start();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f18425a.f56695d, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, 0, -1728053248);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(this.f18428d).start();
    }

    public final void Q0() {
        this.f18425a.f56694c.animate().setDuration(this.f18428d).translationYBy(this.f18427c + 200).setListener(new d()).start();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f18425a.f56695d, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, -1728053248, 0);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(this.f18428d).start();
    }

    public final void R0(Uri source) {
        if (source == null) {
            return;
        }
        com.soundcloud.android.crop.a.j(source, Uri.fromFile(new File(getCacheDir(), "pickup_photo"))).G(this.f18429e, this.f18430f).F(this.f18429e, this.f18430f).t(this);
    }

    public final void T0(int resultCode, Intent result) {
        if (resultCode == -1) {
            Uri g11 = com.soundcloud.android.crop.a.g(result);
            Intent intent = new Intent();
            intent.putExtra(f18421i, g11.toString());
            setResult(-1, intent);
            finish();
            return;
        }
        if (resultCode == 404) {
            if (com.soundcloud.android.crop.a.d(result) instanceof SecurityException) {
                va.g.g(R.string.crop__take_pic_error_permission, 0);
            } else {
                va.g.g(R.string.crop__take_pic_error, 0);
            }
        }
    }

    public final /* synthetic */ g2 W0(View view) {
        BczPermissions.INSTANCE.setPhotoGranted(true);
        com.soundcloud.android.crop.a.k(this);
        return null;
    }

    public final /* synthetic */ void X0(h hVar, boolean z11, List list, List list2) {
        hVar.f();
        if (z11) {
            Y0();
        } else {
            va.g.i("请打开存储权限以保证该功能正常使用", 0);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent result) {
        Uri fromFile;
        super.onActivityResult(requestCode, resultCode, result);
        if ((requestCode != 9162 && requestCode != 11615) || resultCode != -1) {
            if (requestCode == 6709) {
                T0(resultCode, result);
                return;
            }
            return;
        }
        if (requestCode == 9162) {
            fromFile = result.getData();
        } else {
            String i11 = com.soundcloud.android.crop.a.i();
            if (TextUtils.isEmpty(i11)) {
                return;
            } else {
                fromFile = Uri.fromFile(new File(i11));
            }
        }
        R0(fromFile);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        U0();
        V0();
        init();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f18431g.f();
        if (requestCode == 101) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                va.g.g(R.string.photo_permission, 1);
            } else {
                f1();
            }
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            PickupPhotoDialogActivity.this.f18425a.getRoot().setVisibility(8);
            PickupPhotoDialogActivity.this.finish();
            PickupPhotoDialogActivity.this.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_nothing);
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
}
