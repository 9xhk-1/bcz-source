package com.baicizhan.client.business.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import androidx.core.content.ContextCompat;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebImageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebImageHelper.kt\ncom/baicizhan/client/business/webview/WebImageHelperKt\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,93:1\n35#2:94\n*S KotlinDebug\n*F\n+ 1 WebImageHelper.kt\ncom/baicizhan/client/business/webview/WebImageHelperKt\n*L\n57#1:94\n*E\n"})
/* loaded from: classes4.dex */
public final class WebImageHelperKt {
    @k
    public static final rx.c<Bitmap> convertBase64ToBitmap(@k final String imgStr) {
        g0.p(imgStr, "imgStr");
        rx.c<Bitmap> w52 = rx.c.z2(new Callable() { // from class: com.baicizhan.client.business.webview.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap convertBase64ToBitmap$lambda$0;
                convertBase64ToBitmap$lambda$0 = WebImageHelperKt.convertBase64ToBitmap$lambda$0(imgStr);
                return convertBase64ToBitmap$lambda$0;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap convertBase64ToBitmap$lambda$0(String str) {
        byte[] decode = Base64.decode(getBase64Data(str), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    @k
    public static final String getBase64Data(@k String imgStr) {
        g0.p(imgStr, "imgStr");
        if (!f0.J2(imgStr, "data", false, 2, null)) {
            return imgStr;
        }
        String substring = imgStr.substring(k0.J3(imgStr, ",", 0, false, 6, null) + 1);
        g0.o(substring, "substring(...)");
        return substring;
    }

    public static final void saveImageToLocal(@k final Context context, @l String str) {
        g0.p(context, "context");
        if (str != null) {
            rx.c<Bitmap> I3 = convertBase64ToBitmap(str).I3(bc0.c.e());
            final x00.l lVar = new x00.l() { // from class: com.baicizhan.client.business.webview.g
                @Override // x00.l
                public final Object invoke(Object obj) {
                    Boolean saveImageToLocal$lambda$0$0;
                    saveImageToLocal$lambda$0$0 = WebImageHelperKt.saveImageToLocal$lambda$0$0(context, (Bitmap) obj);
                    return saveImageToLocal$lambda$0$0;
                }
            };
            I3.c3(new p() { // from class: com.baicizhan.client.business.webview.h
                @Override // wb0.p
                public final Object call(Object obj) {
                    Boolean saveImageToLocal$lambda$0$1;
                    saveImageToLocal$lambda$0$1 = WebImageHelperKt.saveImageToLocal$lambda$0$1(x00.l.this, obj);
                    return saveImageToLocal$lambda$0$1;
                }
            }).I3(tb0.a.a()).r5(new qb0.g<Boolean>() { // from class: com.baicizhan.client.business.webview.WebImageHelperKt$saveImageToLocal$1$2
                @Override // qb0.c
                public void onError(Throwable e11) {
                    g0.p(e11, "e");
                    qb.c.c(BczWebFragment.TAG, "download image failed.", e11);
                    va.g.i("下载出错", 0);
                }

                @Override // qb0.c
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    onNext(((Boolean) obj).booleanValue());
                }

                public void onNext(boolean z11) {
                    if (z11) {
                        va.g.i("图片保存成功", 1);
                    } else if (Build.VERSION.SDK_INT > 28 || ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean saveImageToLocal$lambda$0$0(Context context, Bitmap bitmap) {
        return Boolean.valueOf(b9.d.c().e(context, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean saveImageToLocal$lambda$0$1(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }
}
