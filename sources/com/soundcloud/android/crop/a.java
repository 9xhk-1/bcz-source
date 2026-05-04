package com.soundcloud.android.crop;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f41663b = 6709;

    /* renamed from: c, reason: collision with root package name */
    public static final int f41664c = 9162;

    /* renamed from: d, reason: collision with root package name */
    public static final int f41665d = 11615;

    /* renamed from: e, reason: collision with root package name */
    public static final int f41666e = 404;

    /* renamed from: f, reason: collision with root package name */
    public static String f41667f;

    /* renamed from: a, reason: collision with root package name */
    public Intent f41668a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.soundcloud.android.crop.a$a, reason: collision with other inner class name */
    public interface InterfaceC0497a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f41669a = "aspect_x";

        /* renamed from: b, reason: collision with root package name */
        public static final String f41670b = "aspect_y";

        /* renamed from: c, reason: collision with root package name */
        public static final String f41671c = "max_x";

        /* renamed from: d, reason: collision with root package name */
        public static final String f41672d = "max_y";

        /* renamed from: e, reason: collision with root package name */
        public static final String f41673e = "as_png";

        /* renamed from: f, reason: collision with root package name */
        public static final String f41674f = "error";
    }

    public a(Uri source, Uri destination) {
        Intent intent = new Intent();
        this.f41668a = intent;
        intent.setData(source);
        this.f41668a.putExtra("output", destination);
    }

    public static void A(Activity activity, int requestCode) {
        try {
            activity.startActivityForResult(h(activity), requestCode);
        } catch (ActivityNotFoundException unused) {
            r(activity);
        } catch (IOException unused2) {
            s(activity);
        } catch (Throwable unused3) {
            r(activity);
        }
    }

    public static void B(Context context, Fragment fragment) {
        C(context, fragment, 11615);
    }

    @TargetApi(11)
    public static void C(Context context, Fragment fragment, int requestCode) {
        try {
            fragment.startActivityForResult(h(context), requestCode);
        } catch (ActivityNotFoundException unused) {
            r(context);
        } catch (IOException unused2) {
            s(context);
        } catch (Throwable unused3) {
            r(context);
        }
    }

    public static void D(Context context, androidx.fragment.app.Fragment fragment) {
        E(context, fragment, 11615);
    }

    public static void E(Context context, androidx.fragment.app.Fragment fragment, int requestCode) {
        try {
            fragment.startActivityForResult(h(context), requestCode);
        } catch (ActivityNotFoundException unused) {
            r(context);
        } catch (IOException unused2) {
            s(context);
        } catch (Throwable unused3) {
            r(context);
        }
    }

    public static File c(Context context) throws IOException {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "take.jpg");
        if (TextUtils.isEmpty(f41667f)) {
            f41667f = file.getAbsolutePath();
        }
        return file;
    }

    public static Throwable d(Intent result) {
        return (Throwable) result.getSerializableExtra("error");
    }

    public static Intent e() {
        return new Intent("android.intent.action.PICK").setType("image/*");
    }

    public static Uri g(Intent result) {
        return (Uri) result.getParcelableExtra("output");
    }

    public static Intent h(Context context) throws IOException {
        Uri uriForFile = FileProvider.getUriForFile(context, "com.jiongji.andriod.card.fileprovider", c(context));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uriForFile);
        intent.addFlags(3);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        return intent;
    }

    public static String i() {
        return f41667f;
    }

    public static a j(Uri source, Uri destination) {
        return new a(source, destination);
    }

    public static void k(Activity activity) {
        l(activity, 9162);
    }

    public static void l(Activity activity, int requestCode) {
        try {
            activity.startActivityForResult(e(), requestCode);
        } catch (ActivityNotFoundException unused) {
            q(activity);
        }
    }

    public static void m(Context context, Fragment fragment) {
        n(context, fragment, 9162);
    }

    @TargetApi(11)
    public static void n(Context context, Fragment fragment, int requestCode) {
        try {
            fragment.startActivityForResult(e(), requestCode);
        } catch (ActivityNotFoundException unused) {
            q(context);
        }
    }

    public static void o(Context context, androidx.fragment.app.Fragment fragment) {
        p(context, fragment, 9162);
    }

    public static void p(Context context, androidx.fragment.app.Fragment fragment, int requestCode) {
        try {
            fragment.startActivityForResult(e(), requestCode);
        } catch (ActivityNotFoundException unused) {
            q(context);
        }
    }

    public static void q(Context context) {
        va.g.g(R.string.crop__pick_error, 0);
    }

    public static void r(Context context) {
        va.g.g(R.string.crop__take_error, 0);
    }

    public static void s(Context context) {
        va.g.g(R.string.crop__take_io_error, 0);
    }

    public static void z(Activity activity) {
        A(activity, 11615);
    }

    public a F(int x11, int y11) {
        this.f41668a.putExtra(InterfaceC0497a.f41669a, x11);
        this.f41668a.putExtra(InterfaceC0497a.f41670b, y11);
        return this;
    }

    public a G(int width, int height) {
        this.f41668a.putExtra(InterfaceC0497a.f41671c, width);
        this.f41668a.putExtra(InterfaceC0497a.f41672d, height);
        return this;
    }

    public a a(boolean asPng) {
        this.f41668a.putExtra(InterfaceC0497a.f41673e, asPng);
        return this;
    }

    public a b() {
        this.f41668a.putExtra(InterfaceC0497a.f41669a, 1);
        this.f41668a.putExtra(InterfaceC0497a.f41670b, 1);
        return this;
    }

    public Intent f(Context context) {
        this.f41668a.setClass(context, CropImageActivity.class);
        return this.f41668a;
    }

    public void t(Activity activity) {
        u(activity, f41663b);
    }

    public void u(Activity activity, int requestCode) {
        activity.startActivityForResult(f(activity), requestCode);
    }

    public void v(Context context, Fragment fragment) {
        w(context, fragment, f41663b);
    }

    @TargetApi(11)
    public void w(Context context, Fragment fragment, int requestCode) {
        fragment.startActivityForResult(f(context), requestCode);
    }

    public void x(Context context, androidx.fragment.app.Fragment fragment) {
        y(context, fragment, f41663b);
    }

    public void y(Context context, androidx.fragment.app.Fragment fragment, int requestCode) {
        fragment.startActivityForResult(f(context), requestCode);
    }
}
