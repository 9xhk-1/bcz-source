package ff;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.media3.ui.DefaultTimeBar;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.BczPermissions;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.networks.upload.RxUploader;
import com.baicizhan.client.business.util.networks.upload.result.CommonResult;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.baicizhan.main.auth.VerificationType;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e0;
import i9.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kc.r;
import kc.u;
import q9.x;
import qb0.h;
import tf.q;
import wb0.p;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends Fragment implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static final String f51839k = "AvatarSettingFragment";

    /* renamed from: l, reason: collision with root package name */
    public static final int f51840l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f51841m = 101;

    /* renamed from: a, reason: collision with root package name */
    public va.f f51842a;

    /* renamed from: b, reason: collision with root package name */
    public h f51843b;

    /* renamed from: c, reason: collision with root package name */
    public h f51844c;

    /* renamed from: d, reason: collision with root package name */
    public h f51845d;

    /* renamed from: e, reason: collision with root package name */
    public View f51846e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f51847f;

    /* renamed from: g, reason: collision with root package name */
    public f f51848g;

    /* renamed from: h, reason: collision with root package name */
    public zf.a f51849h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f51850i = null;

    /* renamed from: j, reason: collision with root package name */
    public sa.h f51851j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends r {
        public a() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            com.baicizhan.main.auth.onekey.a.f19954a.p(g.this.getActivity(), VerificationType.BIND_PHONE_DIRECTLY, null, 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<String, CommonResult> {
        public c() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommonResult call(String rawResult) {
            CommonResult fromJson = !TextUtils.isEmpty(rawResult) ? CommonResult.fromJson(rawResult) : null;
            if (fromJson != null && fromJson.error_code == 0) {
                x.r().p().setImage(m9.c.d(fromJson.data));
                m.f(g.this.getActivity(), x.r().p());
            }
            return fromJson;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends qb0.g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f51856a;

        public d(final File val$target) {
            this.f51856a = val$target;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            if (g.this.getActivity() == null) {
                return;
            }
            qb.c.d(g.f51839k, "save avatar failed: " + e11, new Object[0]);
            va.g.g(R.string.user_center_avatar_save_failed, 0);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (g.this.getActivity() == null) {
                return;
            }
            if (aBoolean == null || !aBoolean.booleanValue()) {
                va.g.g(R.string.user_center_avatar_save_failed, 0);
            } else {
                va.g.i(g.this.getResources().getString(R.string.user_center_avatar_save_to, this.f51856a.getAbsolutePath()), 0);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f51858a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f51859b;

        public e(final File val$target, final Bitmap val$bitmap) {
            this.f51858a = val$target;
            this.f51859b = val$bitmap;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            if (this.f51858a.exists() && !this.f51858a.delete()) {
                return Boolean.FALSE;
            }
            this.f51859b.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(this.f51858a));
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a();

        void b(@IdRes int clickId);
    }

    private void F(Uri source) {
        com.soundcloud.android.crop.a.j(source, Uri.fromFile(new File(getActivity().getCacheDir(), q9.h.f81940d))).G(400, 400).b().x(getActivity(), this);
    }

    private boolean G() {
        return DeviceUtil.IS_REDMI_NOTE_3;
    }

    public static File I(UserRecord userRecord) {
        String simpleName;
        String file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString();
        StringBuilder sb2 = new StringBuilder();
        if (userRecord != null) {
            simpleName = "" + userRecord.getUniqueId();
        } else {
            simpleName = UserRecord.class.getSimpleName();
        }
        sb2.append(xb.f.o(simpleName));
        sb2.append(".jpg");
        return new File(file, sb2.toString());
    }

    private void J(int resultCode, Intent result) {
        if (resultCode == -1) {
            Uri g11 = com.soundcloud.android.crop.a.g(result);
            try {
                c0(g11, getActivity().getContentResolver().openInputStream(g11));
                return;
            } catch (Throwable th2) {
                va.g.g(R.string.crop__take_pic_error, 0);
                qb.c.h(f51839k, "", th2);
                return;
            }
        }
        if (resultCode == 404) {
            if (com.soundcloud.android.crop.a.d(result) instanceof SecurityException) {
                va.g.g(R.string.crop__take_pic_error_permission, 0);
            } else {
                va.g.g(R.string.crop__take_pic_error, 0);
            }
        }
    }

    private void K(View root) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.photo_option_layout, (ViewGroup) null, false);
        this.f51846e = inflate;
        inflate.findViewById(R.id.take).setOnClickListener(this);
        this.f51846e.findViewById(R.id.pick).setOnClickListener(this);
        this.f51846e.findViewById(R.id.cancel).setOnClickListener(this);
        ImageView imageView = (ImageView) root.findViewById(R.id.avatar);
        this.f51847f = imageView;
        imageView.setOnLongClickListener(this);
        int min = Math.min(xb.f.i(getActivity()), xb.f.f(getActivity()));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f51847f.getLayoutParams();
        layoutParams.width = min;
        layoutParams.height = min;
        Q();
        TextView textView = (TextView) root.findViewById(R.id.modify);
        textView.setTextColor(getResources().getColor(R.color.main_color_white));
        lq.c.b(textView, H());
        textView.setOnClickListener(this);
        va.f fVar = new va.f(getActivity());
        this.f51842a = fVar;
        fVar.setCancelable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kc.d, kc.h] */
    private void S() {
        if (BczPermissions.INSTANCE.getPhotoGranted()) {
            com.soundcloud.android.crop.a.o(getActivity(), this);
        } else {
            mc.a.l(this, ((u.a) ((u.a) new u.a(getContext()).L(R.string.permission_request_photo_title).U(R.string.permission_request_photo_content).b0(ButtonType.DOUBLE).E(R.string.permission_request_photo_confirm, null, new l() { // from class: ff.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 L;
                    L = g.this.L((View) obj);
                    return L;
                }
            })).n(R.string.permission_request_photo_no)).d(), "permission");
        }
    }

    private void T() {
        if (!G() || Build.VERSION.SDK_INT > 28 || jt.c.c(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            S();
        } else {
            final sa.h hVar = new sa.h(requireActivity());
            hVar.j("android.permission.WRITE_EXTERNAL_STORAGE");
            jt.c.a(this).b("android.permission.WRITE_EXTERNAL_STORAGE").f(new kt.a() { // from class: ff.e
                @Override // kt.a
                public final void a(mt.c cVar, List list) {
                    cVar.b(list, "请打开存储权限以保证该功能正常使用", "去申请", "取消");
                }
            }).i(new kt.d() { // from class: ff.f
                @Override // kt.d
                public final void a(boolean z11, List list, List list2) {
                    g.this.M(hVar, z11, list, list2);
                }
            });
        }
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
    }

    private void U() {
        h hVar = this.f51845d;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f51845d = AccountBindingMgr.inst().bindInfo().I3(tb0.a.a()).u5(new wb0.b() { // from class: ff.b
            @Override // wb0.b
            public final void call(Object obj) {
                g.this.N((Map) obj);
            }
        }, new wb0.b() { // from class: ff.c
            @Override // wb0.b
            public final void call(Object obj) {
                g.this.O((Throwable) obj);
            }
        });
    }

    private void V() {
        sa.h hVar = new sa.h(requireActivity());
        this.f51851j = hVar;
        hVar.j("android.permission.CAMERA");
        requestPermissions(new String[]{"android.permission.CAMERA"}, 101);
    }

    private void W() {
        final UserRecord p11 = x.r().p();
        if (TextUtils.isEmpty(p11.getImage())) {
            X(BitmapFactory.decodeResource(getResources(), R.drawable.defaultavatarbig_normal_default), I(p11));
        } else {
            hc.c.p(p11.getImage()).l(new l() { // from class: ff.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 P;
                    P = g.this.P(p11, (Bitmap) obj);
                    return P;
                }
            }, null);
        }
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
    }

    private void b0() {
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
        if (ContextCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") != 0) {
            V();
        } else {
            com.soundcloud.android.crop.a.D(getActivity(), this);
        }
    }

    private BottomSheetLayout getBottomSheetLayout() {
        zf.a aVar = this.f51849h;
        if (aVar != null) {
            return aVar.getBottomSheetLayout();
        }
        return null;
    }

    public final Drawable H() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        gradientDrawable.setCornerRadius(xb.f.a(getActivity(), 30.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(436207615);
        gradientDrawable2.setCornerRadius(xb.f.a(getActivity(), 30.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public final /* synthetic */ g2 L(View view) {
        BczPermissions.INSTANCE.setPhotoGranted(true);
        com.soundcloud.android.crop.a.o(getActivity(), this);
        return null;
    }

    public final /* synthetic */ void M(sa.h hVar, boolean z11, List list, List list2) {
        hVar.f();
        if (z11) {
            S();
        } else {
            va.g.i("请打开存储权限以保证该功能正常使用", 0);
        }
    }

    public final /* synthetic */ void N(Map map) {
        AccountBindingMgr.BindInfo bindInfo = (AccountBindingMgr.BindInfo) map.get("phone");
        this.f51850i = Boolean.valueOf((bindInfo == null || TextUtils.isEmpty(bindInfo.unionid)) ? false : true);
        va.f fVar = this.f51842a;
        if (fVar == null || !fVar.isShowing()) {
            return;
        }
        this.f51842a.dismiss();
        Z();
    }

    public final /* synthetic */ void O(Throwable th2) {
        qb.c.c(f51839k, "refreshBindInfo", th2);
        this.f51850i = Boolean.FALSE;
        va.g.j(th2, 0);
        va.f fVar = this.f51842a;
        if (fVar == null || !fVar.isShowing()) {
            return;
        }
        this.f51842a.dismiss();
    }

    public final /* synthetic */ g2 P(UserRecord userRecord, Bitmap bitmap) {
        X(bitmap, I(userRecord));
        return null;
    }

    public final void Q() {
        UserRecord p11 = x.r().p();
        he.e.e(this.f51847f, TextUtils.isEmpty(p11.getImage()) ? "null" : p11.getImage(), true);
    }

    public final void R() {
        Boolean bool = this.f51850i;
        if (bool == null) {
            this.f51842a.show();
        } else if (bool.booleanValue()) {
            a0();
        } else {
            Z();
        }
    }

    public final void X(final Bitmap bitmap, final File target) {
        h hVar = this.f51844c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f51844c.unsubscribe();
        }
        this.f51844c = rx.c.z2(new e(target, bitmap)).w5(bc0.c.e()).I3(tb0.a.a()).r5(new d(target));
    }

    public void Y(boolean bound) {
        if (bound) {
            R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z() {
        mc.a.k(this, ((u) ((u.a) new u.a(requireContext()).L(R.string.tip).U(R.string.user_center_phone_bind_warn).C(R.string.force_auth_dialog_confirm)).d()).f0(new a()));
        q.f90552a.a().f();
    }

    public final void a0() {
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null) {
            bottomSheetLayout.L(this.f51846e);
        }
    }

    public final void c0(final Uri src, final InputStream is2) {
        h hVar = this.f51843b;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f51843b.unsubscribe();
        }
        this.f51842a.show();
        this.f51843b = RxUploader.upload(getResources().getString(R.string.url_avatar_upload), new RxUploader.CommonStringRequestFactory(0, new gf.a(is2))).c3(new c()).I3(tb0.a.a()).r5(new b(src));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent result) {
        if ((requestCode == 9162 || requestCode == 11615) && resultCode == -1) {
            F(requestCode == 9162 ? result.getData() : Uri.fromFile(new File(com.soundcloud.android.crop.a.i())));
            return;
        }
        if (requestCode == 6709) {
            J(resultCode, result);
        } else if (requestCode == 1 && resultCode == -1) {
            this.f51850i = Boolean.TRUE;
            a0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f51848g = (f) activity;
        } catch (ClassCastException unused) {
            qb.c.d("", "AvatarSettingFragment's activity does not implement OnAvatarSettingInteractionListener...", new Object[0]);
        }
        try {
            this.f51849h = (zf.a) activity;
        } catch (ClassCastException unused2) {
            qb.c.d("", "AvatarSettingFragment's activity does not implement IGetBottomSheetLayout...", new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.cancel /* 2131362089 */:
                BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
                if (bottomSheetLayout != null) {
                    bottomSheetLayout.u();
                    break;
                }
                break;
            case R.id.modify /* 2131362962 */:
                R();
                break;
            case R.id.pick /* 2131363294 */:
                T();
                break;
            case R.id.take /* 2131363748 */:
                b0();
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        U();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_avatar_setting, container, false);
        K(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        h hVar = this.f51843b;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f51843b.unsubscribe();
        }
        h hVar2 = this.f51844c;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f51844c.unsubscribe();
        }
        h hVar3 = this.f51845d;
        if (hVar3 != null && !hVar3.isUnsubscribed()) {
            this.f51845d.unsubscribe();
        }
        AccountBindingMgr.inst().clear();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v11) {
        if (v11.getId() != R.id.avatar) {
            return false;
        }
        R();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f51842a.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        sa.h hVar = this.f51851j;
        if (hVar != null) {
            hVar.f();
        }
        if (requestCode == 101) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                va.g.g(R.string.photo_permission, 1);
            } else {
                b0();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<CommonResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f51853a;

        public b(final Uri val$src) {
            this.f51853a = val$src;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            if (g.this.getActivity() == null) {
                return;
            }
            qb.c.c(g.f51839k, "upload avatar error: ", e11);
            g.this.f51842a.dismiss();
            va.g.i(va.g.e(e11, R.string.user_center_avatar_upload_error), 0);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(CommonResult result) {
            if (g.this.getActivity() == null) {
                return;
            }
            g.this.f51842a.dismiss();
            if (result == null) {
                va.g.g(R.string.user_center_avatar_upload_error, 0);
                he.e.f(g.this.f51847f);
                return;
            }
            if (result.error_code != 0) {
                va.g.i(result.data, 0);
                he.e.f(g.this.f51847f);
                return;
            }
            va.g.g(R.string.user_center_avatar_upload_success, 0);
            g.this.f51847f.setImageURI(this.f51853a);
            if (!"file".equalsIgnoreCase(this.f51853a.getScheme()) || this.f51853a.getPath() == null) {
                qb.c.d(g.f51839k, "uploadAvatar: " + this.f51853a, new Object[0]);
            } else {
                FileUtils.copyFile(new File(this.f51853a.getPath()), he.e.c(g.this.getContext()));
            }
            if (g.this.f51848g != null) {
                g.this.f51848g.a();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ff.g$g, reason: collision with other inner class name */
    public static class C0616g implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<g> f51861a;

        /* renamed from: b, reason: collision with root package name */
        public final UserRecord f51862b;

        public C0616g(g fragment, UserRecord userRecord) {
            this.f51861a = new WeakReference<>(fragment);
            this.f51862b = userRecord;
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapFailed(Exception e11, Drawable drawable) {
            g gVar = this.f51861a.get();
            if (gVar == null || gVar.getActivity() == null) {
                return;
            }
            qb.c.c(g.f51839k, "", e11);
            va.g.g(R.string.user_center_avatar_save_failed, 0);
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            g gVar = this.f51861a.get();
            if (gVar == null || gVar.getActivity() == null) {
                return;
            }
            gVar.X(bitmap, g.I(this.f51862b));
        }

        @Override // com.squareup.picasso.e0
        public void onPrepareLoad(Drawable drawable) {
        }
    }
}
