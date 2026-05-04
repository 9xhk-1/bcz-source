package com.baicizhan.client.business.webview;

import android.app.Activity;
import android.content.Intent;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.client.business.widget.share.SharePickerSheetView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class WebShareManager implements LifecycleObserver {

    @k
    public static final String TAG = "WebShareManager";
    private ShareDelegate mShareDelegate;
    private SharePickerSheetView mSharePickerSheetView;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    private final String shareFile(String str) throws IOException {
        byte[] decode = Base64.decode(WebImageHelperKt.getBase64Data(str), 0);
        File file = new File(pb.a.a().getExternalCacheDir(), "web_share_image");
        if (file.exists()) {
            file.delete();
        }
        new FileOutputStream(file).write(decode);
        return file.getAbsolutePath();
    }

    public static /* synthetic */ void showShareSheet$default(WebShareManager webShareManager, ShareParams shareParams, ShareDelegate.b bVar, Activity activity, BottomSheetLayout bottomSheetLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        webShareManager.showShareSheet(shareParams, bVar, activity, bottomSheetLayout, z11);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ShareDelegate shareDelegate = this.mShareDelegate;
        if (shareDelegate != null) {
            if (shareDelegate == null) {
                g0.S("mShareDelegate");
                shareDelegate = null;
            }
            shareDelegate.s();
        }
    }

    public final void onRequestPermissionsResult(int i11, @k String[] permissions, @k int[] grantResults) {
        g0.p(permissions, "permissions");
        g0.p(grantResults, "grantResults");
        SharePickerSheetView sharePickerSheetView = this.mSharePickerSheetView;
        if (sharePickerSheetView != null) {
            if (sharePickerSheetView == null) {
                g0.S("mSharePickerSheetView");
                sharePickerSheetView = null;
            }
            sharePickerSheetView.i(i11, permissions, grantResults);
        }
    }

    public final void resolveActivityResult(@k Activity activity, int i11, int i12, @l Intent intent) {
        g0.p(activity, "activity");
        SharePickerSheetView sharePickerSheetView = this.mSharePickerSheetView;
        ShareDelegate shareDelegate = null;
        if (sharePickerSheetView != null) {
            if (sharePickerSheetView == null) {
                g0.S("mSharePickerSheetView");
                sharePickerSheetView = null;
            }
            sharePickerSheetView.h(i11, i12, intent);
        }
        ShareDelegate shareDelegate2 = this.mShareDelegate;
        if (shareDelegate2 != null) {
            if (shareDelegate2 == null) {
                g0.S("mShareDelegate");
            } else {
                shareDelegate = shareDelegate2;
            }
            shareDelegate.r(activity, i11, i12, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void share(@m80.k com.baicizhan.client.business.webview.JsonParams.ShareParamI r8, @m80.k androidx.fragment.app.FragmentActivity r9, @m80.k com.flipboard.bottomsheet.BottomSheetLayout r10, @m80.k com.baicizhan.client.business.auth.share.ShareDelegate.b r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.webview.WebShareManager.share(com.baicizhan.client.business.webview.JsonParams$ShareParamI, androidx.fragment.app.FragmentActivity, com.flipboard.bottomsheet.BottomSheetLayout, com.baicizhan.client.business.auth.share.ShareDelegate$b):void");
    }

    @w00.k
    public final void showShareSheet(@k ShareParams params, @k ShareDelegate.b shareCallback, @k Activity activity, @k BottomSheetLayout bottomSheetLayout) {
        g0.p(params, "params");
        g0.p(shareCallback, "shareCallback");
        g0.p(activity, "activity");
        g0.p(bottomSheetLayout, "bottomSheetLayout");
        showShareSheet$default(this, params, shareCallback, activity, bottomSheetLayout, false, 16, null);
    }

    @w00.k
    public final void showShareSheet(@k ShareParams params, @k ShareDelegate.b shareCallback, @k Activity activity, @k BottomSheetLayout bottomSheetLayout, boolean z11) {
        g0.p(params, "params");
        g0.p(shareCallback, "shareCallback");
        g0.p(activity, "activity");
        g0.p(bottomSheetLayout, "bottomSheetLayout");
        SharePickerSheetView sharePickerSheetView = this.mSharePickerSheetView;
        SharePickerSheetView sharePickerSheetView2 = null;
        if (sharePickerSheetView == null) {
            SharePickerSheetView a11 = new SharePickerSheetView.a().d(params).b(shareCallback).c(z11).a(activity);
            g0.o(a11, "build(...)");
            this.mSharePickerSheetView = a11;
        } else {
            if (sharePickerSheetView == null) {
                g0.S("mSharePickerSheetView");
                sharePickerSheetView = null;
            }
            sharePickerSheetView.l(params);
        }
        SharePickerSheetView sharePickerSheetView3 = this.mSharePickerSheetView;
        if (sharePickerSheetView3 == null) {
            g0.S("mSharePickerSheetView");
        } else {
            sharePickerSheetView2 = sharePickerSheetView3;
        }
        BottomSheetUtils.showSheetView(bottomSheetLayout, sharePickerSheetView2);
    }
}
