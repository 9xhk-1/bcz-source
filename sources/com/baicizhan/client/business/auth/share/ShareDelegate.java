package com.baicizhan.client.business.auth.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import b9.d;
import b9.j;
import com.baicizhan.client.business.auth.AuthException;
import com.baicizhan.client.business.auth.QQAuthHelper;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.ThirdAppDialogKt;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.jiongji.andriod.card.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e0;
import java.lang.ref.WeakReference;
import kc.u;
import sa.h;
import va.f;
import va.g;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ShareDelegate {

    /* renamed from: h, reason: collision with root package name */
    public static final String f16043h = "ShareDelegate";

    /* renamed from: i, reason: collision with root package name */
    public static final int f16044i = 100;

    /* renamed from: a, reason: collision with root package name */
    public FragmentActivity f16045a;

    /* renamed from: b, reason: collision with root package name */
    public ShareParams f16046b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f16047c;

    /* renamed from: d, reason: collision with root package name */
    public f f16048d;

    /* renamed from: e, reason: collision with root package name */
    public b f16049e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f16050f;

    /* renamed from: g, reason: collision with root package name */
    public h f16051g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ReadableException extends Exception {
        public ReadableException(String detailMessage) {
            super(detailMessage);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        Bitmap a(Bitmap bitmap, Context context, boolean forThumb);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void onShareCancel();

        void onShareError(ShareChannel media, Throwable throwable);

        void onShareSend(ShareChannel media);

        void onShareStart(ShareChannel media);

        void onShareSuccess(ShareChannel media);
    }

    public ShareDelegate(FragmentActivity context) {
        this.f16045a = context;
        f fVar = new f(context);
        this.f16048d = fVar;
        fVar.setCancelable(false);
    }

    public static ShareDelegate i(@NonNull FragmentActivity context) {
        return new ShareDelegate(context);
    }

    public void j() {
        b bVar = this.f16049e;
        if (bVar != null) {
            bVar.onShareCancel();
        }
    }

    public final ShareDelegate k(ShareChannel media) {
        if (b9.a.c(this.f16045a, media)) {
            ShareParams shareParams = this.f16046b;
            if (shareParams == null) {
                b bVar = this.f16049e;
                if (bVar != null) {
                    bVar.onShareError(media, new ReadableException(""));
                    return this;
                }
            } else {
                if (shareParams.f16061e == ShareParams.ShareType.MINI_PROGRAM && media != ShareChannel.WEIXIN && media != ShareChannel.QQ) {
                    qb.c.d(f16043h, "share mini program illegal channel", new Object[0]);
                    return this;
                }
                b bVar2 = this.f16049e;
                if (bVar2 != null) {
                    bVar2.onShareStart(media);
                }
                if (media == ShareChannel.WEIXIN || media == ShareChannel.WEIXIN_CIRCLE) {
                    z(media);
                    return this;
                }
                if (media == ShareChannel.QQ || media == ShareChannel.QZONE) {
                    this.f16045a.getLifecycle().addObserver(QQAuthHelper.h());
                    QQAuthHelper.h().o(this.f16045a, this.f16046b, this.f16049e, media);
                    b bVar3 = this.f16049e;
                    if (bVar3 != null) {
                        bVar3.onShareSend(media);
                    }
                } else {
                    if (ShareChannel.WEIBO == media) {
                        j.h().s(this.f16045a, this.f16046b, this.f16049e);
                        return this;
                    }
                    if (ShareChannel.SAVE_PHOTO == media) {
                        if (Build.VERSION.SDK_INT > 28 || this.f16045a.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                            d.c().l(this.f16045a, this.f16046b, this.f16049e);
                            return this;
                        }
                        this.f16050f = new Runnable() { // from class: d9.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareDelegate.this.m();
                            }
                        };
                        h hVar = new h(this.f16045a);
                        this.f16051g = hVar;
                        hVar.j("android.permission.WRITE_EXTERNAL_STORAGE");
                        this.f16045a.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
                        return this;
                    }
                }
            }
        } else {
            b bVar4 = this.f16049e;
            if (bVar4 != null) {
                bVar4.onShareError(media, new ReadableException("没有安装" + b9.a.b(media)));
                return this;
            }
        }
        return this;
    }

    public ShareParams l() {
        return this.f16046b;
    }

    public final /* synthetic */ void m() {
        d.c().l(this.f16045a, this.f16046b, this.f16049e);
    }

    public final /* synthetic */ g2 n(ShareChannel shareChannel) {
        k(shareChannel);
        return g2.f100423a;
    }

    public final /* synthetic */ g2 o() {
        j();
        return g2.f100423a;
    }

    public final /* synthetic */ g2 p(ShareChannel shareChannel, Bitmap bitmap) {
        if (bitmap == null) {
            b bVar = this.f16049e;
            if (bVar != null) {
                bVar.onShareError(shareChannel, new AuthException(-5));
            }
        } else {
            x(shareChannel, bitmap);
            b bVar2 = this.f16049e;
            if (bVar2 != null) {
                bVar2.onShareSend(shareChannel);
            }
        }
        this.f16048d.dismiss();
        return null;
    }

    public final /* synthetic */ g2 q(ShareChannel shareChannel) {
        b bVar = this.f16049e;
        if (bVar != null) {
            bVar.onShareError(shareChannel, new AuthException(-5));
        }
        this.f16048d.dismiss();
        return null;
    }

    public void r(Activity activity, int requestCode, int resultCode, Intent data) {
        QQAuthHelper.h().l(requestCode, resultCode, data);
        j.h().l(activity, requestCode, resultCode, data);
    }

    public void s() {
        WeixinAuthHelper.A().F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [kc.d, kc.h] */
    public void t(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        h hVar = this.f16051g;
        if (hVar != null) {
            hVar.f();
        }
        if (requestCode == 100 && permissions.length > 0 && permissions[0].equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (grantResults.length > 0 && grantResults[0] == 0) {
                Runnable runnable = this.f16050f;
                if (runnable != null) {
                    runnable.run();
                    this.f16050f = null;
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT > 28) {
                qb.c.q(f16043h, "no valid", new Object[0]);
            } else if (!this.f16045a.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                g.g(R.string.common_toast_no_storage_permission, 0);
            } else {
                FragmentActivity fragmentActivity = this.f16045a;
                mc.a.n(fragmentActivity, ((u.a) new u.a(fragmentActivity).L(R.string.common_dialog_permission_title).U(R.string.common_dialog_msg_storage_permission_needed).C(R.string.ok)).b0(ButtonType.SINGLE_POSITIVE).d(), "permissions");
            }
        }
    }

    public ShareDelegate u(b listener) {
        this.f16049e = listener;
        return this;
    }

    public ShareDelegate v(ShareParams params) {
        this.f16046b = params;
        return this;
    }

    public ShareDelegate w(final ShareChannel media) {
        if (media == ShareChannel.SAVE_PHOTO) {
            k(media);
            return this;
        }
        mc.a.n(this.f16045a, ThirdAppDialogKt.thirdAppDialog(this.f16045a, new x00.a() { // from class: d9.d
            @Override // x00.a
            public final Object invoke() {
                g2 n11;
                n11 = ShareDelegate.this.n(media);
                return n11;
            }
        }, new x00.a() { // from class: d9.e
            @Override // x00.a
            public final Object invoke() {
                g2 o11;
                o11 = ShareDelegate.this.o();
                return o11;
            }
        }), "show-dialog");
        return this;
    }

    public final void x(ShareChannel media, Bitmap bitmap) {
        if (media == ShareChannel.WEIXIN) {
            WeixinAuthHelper.A().H(this.f16045a, 0, this.f16046b, bitmap, bitmap, this.f16049e, media);
        } else if (media == ShareChannel.WEIXIN_CIRCLE) {
            WeixinAuthHelper.A().H(this.f16045a, 1, this.f16046b, bitmap, bitmap, this.f16049e, media);
        }
    }

    public final void y(ShareChannel media) {
        if (media == ShareChannel.WEIXIN) {
            WeixinAuthHelper.A().L(this.f16045a, 0, this.f16046b, this.f16049e, media);
        } else if (media == ShareChannel.WEIXIN_CIRCLE) {
            WeixinAuthHelper.A().L(this.f16045a, 1, this.f16046b, this.f16049e, media);
        }
    }

    public final void z(final ShareChannel media) {
        if (this.f16046b.f16061e.equals(ShareParams.ShareType.TEXT)) {
            y(media);
            return;
        }
        this.f16048d.show();
        l<? super Bitmap, g2> lVar = new l() { // from class: d9.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 p11;
                p11 = ShareDelegate.this.p(media, (Bitmap) obj);
                return p11;
            }
        };
        x00.a<g2> aVar = new x00.a() { // from class: d9.c
            @Override // x00.a
            public final Object invoke() {
                g2 q11;
                q11 = ShareDelegate.this.q(media);
                return q11;
            }
        };
        ShareParams.ShareType shareType = ShareParams.ShareType.MINI_PROGRAM;
        ShareParams shareParams = this.f16046b;
        if (shareType == shareParams.f16061e) {
            if (TextUtils.isEmpty(shareParams.f16067k)) {
                hc.c.m(this.f16046b.f16062f).m(3000).l(lVar, aVar);
                return;
            } else {
                hc.c.p(this.f16046b.f16067k).h().m(3000).l(lVar, aVar);
                return;
            }
        }
        if (TextUtils.isEmpty(shareParams.f16060d)) {
            hc.c.m(this.f16046b.f16062f).m(3000).l(lVar, aVar);
        } else {
            hc.c.p(this.f16046b.f16060d).h().m(3000).l(lVar, aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ShareDelegate> f16052a;

        /* renamed from: b, reason: collision with root package name */
        public final ShareChannel f16053b;

        public c(ShareDelegate holder, ShareChannel media) {
            this.f16052a = new WeakReference<>(holder);
            this.f16053b = media;
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapFailed(Exception e11, Drawable errorDrawable) {
            ShareDelegate shareDelegate = this.f16052a.get();
            if (shareDelegate == null) {
                return;
            }
            if (shareDelegate.f16049e != null) {
                shareDelegate.f16049e.onShareError(this.f16053b, new AuthException(-5));
            }
            shareDelegate.f16048d.dismiss();
            qb.c.h(NotificationCompat.CATEGORY_ERROR, "", e11);
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            ShareDelegate shareDelegate = this.f16052a.get();
            if (shareDelegate == null) {
                return;
            }
            if (bitmap != null) {
                shareDelegate.x(this.f16053b, bitmap);
                if (shareDelegate.f16049e != null) {
                    shareDelegate.f16049e.onShareSend(this.f16053b);
                }
            } else if (shareDelegate.f16049e != null) {
                shareDelegate.f16049e.onShareError(this.f16053b, new AuthException(-5));
            }
            shareDelegate.f16048d.dismiss();
        }

        @Override // com.squareup.picasso.e0
        public void onPrepareLoad(Drawable drawable) {
        }
    }
}
