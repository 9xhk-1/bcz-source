package com.baicizhan.client.business.webview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BczWebView extends WebView {
    private static final int MENU_GROUP_ID_COMMON = 0;
    private static final int MENU_ITEM_ID_SAVE_IMG = 0;
    private static final int MENU_ITEM_ID_VIEW_IMG = 1;
    private static final String TAG = "BczWebView";
    private boolean enableDownload;
    private qb0.h mDownloadSubscription;
    private String mImageUrl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class CallbackWrapper implements ActionMode.Callback {
        private ActionMode.Callback mCallback;

        public CallbackWrapper(ActionMode.Callback callback) {
            this.mCallback = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            try {
                return this.mCallback.onActionItemClicked(mode, item);
            } catch (Exception e11) {
                qb.c.c(BczWebView.TAG, "", e11);
                return false;
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            try {
                return this.mCallback.onCreateActionMode(mode, menu);
            } catch (Exception e11) {
                qb.c.c(BczWebView.TAG, "", e11);
                return false;
            }
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            try {
                this.mCallback.onDestroyActionMode(mode);
            } catch (Exception e11) {
                qb.c.c(BczWebView.TAG, "", e11);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            try {
                return this.mCallback.onPrepareActionMode(mode, menu);
            } catch (Exception e11) {
                qb.c.c(BczWebView.TAG, "", e11);
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DownloadResult {
        String path;
        boolean success;

        private DownloadResult() {
        }
    }

    public BczWebView(Context context) {
        super(context);
        this.enableDownload = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadImage() {
        qb0.h hVar = this.mDownloadSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mDownloadSubscription.unsubscribe();
        }
        final Context context = getContext();
        if (!(context instanceof FragmentActivity)) {
            if (context != null) {
                downloadImageIml(context);
            }
        } else {
            if (Build.VERSION.SDK_INT > 28 || jt.c.c(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                downloadImageIml(context);
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            final sa.h hVar2 = new sa.h(fragmentActivity);
            hVar2.j("android.permission.WRITE_EXTERNAL_STORAGE");
            jt.c.b(fragmentActivity).b("android.permission.WRITE_EXTERNAL_STORAGE").i(new kt.d() { // from class: com.baicizhan.client.business.webview.ui.n2
                @Override // kt.d
                public final void a(boolean z11, List list, List list2) {
                    BczWebView.this.lambda$downloadImage$0(hVar2, context, z11, list, list2);
                }
            });
        }
    }

    private void downloadImageIml(Context context) {
        this.mDownloadSubscription = rxDownloadImage(context, this.mImageUrl).I3(tb0.a.a()).r5(new qb0.g<DownloadResult>() { // from class: com.baicizhan.client.business.webview.ui.BczWebView.2
            @Override // qb0.c
            public void onError(Throwable e11) {
                qb.c.c(BczWebView.TAG, "download image failed.", e11);
                va.g.i("下载出错", 0);
            }

            @Override // qb0.c
            public void onNext(DownloadResult downloadResult) {
                if (downloadResult.success) {
                    va.g.i("图片保存成功", 1);
                } else if (Build.VERSION.SDK_INT > 28 || ContextCompat.checkSelfPermission(BczWebView.this.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    va.g.i("下载出错", 0);
                } else {
                    va.g.i("下载出错, 无存储权限", 0);
                }
            }

            @Override // qb0.c
            public void onCompleted() {
            }

            @Override // qb0.g
            public void onStart() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadImage$0(sa.h hVar, Context context, boolean z11, List list, List list2) {
        hVar.f();
        if (z11) {
            downloadImageIml(context);
        } else {
            va.g.g(R.string.common_toast_no_storage_permission, 0);
        }
    }

    private static rx.c<DownloadResult> rxDownloadImage(final Context context, final String imgUrl) {
        return rx.c.z2(new Callable<DownloadResult>() { // from class: com.baicizhan.client.business.webview.ui.BczWebView.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DownloadResult call() throws Exception {
                DownloadResult downloadResult = new DownloadResult();
                downloadResult.success = b9.d.c().e(context, hc.c.p(imgUrl).get());
                return downloadResult;
            }
        }).w5(bc0.c.e());
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu menu) {
        super.onCreateContextMenu(menu);
        if (this.enableDownload) {
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: com.baicizhan.client.business.webview.ui.BczWebView.1
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem item) {
                    if (TextUtils.isEmpty(BczWebView.this.mImageUrl)) {
                        return false;
                    }
                    if (item.getItemId() != 1) {
                        if (item.getItemId() != 0) {
                            return false;
                        }
                        BczWebView.this.downloadImage();
                        return false;
                    }
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.setType("image/*");
                    intent.setData(Uri.parse(BczWebView.this.mImageUrl));
                    try {
                        BczWebView.this.getContext().startActivity(intent);
                    } catch (Exception e11) {
                        qb.c.c(BczWebView.TAG, "", e11);
                    }
                    return true;
                }
            };
            WebView.HitTestResult hitTestResult = getHitTestResult();
            if (hitTestResult != null) {
                int type = hitTestResult.getType();
                if (type == 5 || type == 8) {
                    String extra = hitTestResult.getExtra();
                    this.mImageUrl = extra;
                    if (extra.endsWith("svg")) {
                        return;
                    }
                    menu.add(0, 1, 0, "查看图片").setOnMenuItemClickListener(onMenuItemClickListener);
                    menu.add(0, 0, 0, "保存图片").setOnMenuItemClickListener(onMenuItemClickListener);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qb0.h hVar = this.mDownloadSubscription;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.mDownloadSubscription.unsubscribe();
    }

    public void setEnableDownload(boolean enableDownload) {
        this.enableDownload = enableDownload;
    }

    @Override // android.view.View
    public ActionMode startActionMode(final ActionMode.Callback callback) {
        return super.startActionMode(new CallbackWrapper(callback));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View originalView, final ActionMode.Callback callback, int type) {
        return super.startActionModeForChild(originalView, new CallbackWrapper(callback), type);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int type) {
        return super.startActionMode(new CallbackWrapper(callback), type);
    }

    public BczWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enableDownload = true;
    }

    public BczWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.enableDownload = true;
    }
}
