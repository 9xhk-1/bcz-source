package com.baicizhan.client.business.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.baicizhan.client.business.store.NewMallActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.ShoppingAd;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class StoreEntryJumper {
    public static final String TAG = "StoreEntryJumper";
    public static final String TAOBAO_STORE_DEFAULT = "taobao://s.click.taobao.com/t?e=m%3D2%26s%3DiP5EbKFvgVIcQipKwQzePDAVflQIoZepK7Vc7tFgwiFRAdhuF14FMf4MH0cJKYnAMMgx22UI05ZvKL0PayVzPhqNTpAphArj4T137koBZBq9X4odbCRTqs%2BhZKkvqbd0NlVdsiUKPvSiZ%2BQMlGz6FQ%3D%3D";
    private static volatile StoreEntryJumper sInstance;
    private ShoppingAd mShoppingAd = null;
    private qb0.h mSubscription;

    private StoreEntryJumper() {
    }

    public static StoreEntryJumper getInstance() {
        if (sInstance == null) {
            synchronized (StoreEntryJumper.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new StoreEntryJumper();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public static boolean hasNewItem(Context context, ShoppingAd shoppingAd) {
        return ((long) shoppingAd.getTimestamp()) != i9.f.f(context, i9.f.T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jump(final Context context, final ShoppingAd shoppingAd, String trace) {
        jump(context, shoppingAd.getAd_url(), shoppingAd.timestamp, trace);
    }

    public static void jumpToNative(Context context, String url) {
        NewMallActivity.O0(context, q9.x.r().p(), url);
    }

    public static void jumpToNativeMall(Context context, String trace) {
        BczWebExecutorKt.startNormalWeb(context, NewMallActivity.M0(trace));
    }

    public static boolean jumpToTaoBao(Context context, String url) {
        return jumpToTaobao(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(url)));
    }

    private static boolean jumpToTaobao(Context context, Intent intent) {
        try {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
                if (resolveInfo.activityInfo.packageName.startsWith("com.taobao")) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    qb.c.b(TAG, "jump to taobao", new Object[0]);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return true;
                }
            }
        } catch (Exception e11) {
            qb.c.c(TAG, "", e11);
        }
        return false;
    }

    public static boolean shouldJumpToTaobao(Context context, ShoppingAd shoppingAd) {
        return shouldJumpToTaobao(context, shoppingAd.getAd_url(), shoppingAd.is_new_mall);
    }

    public void clear() {
        this.mShoppingAd = null;
    }

    public void destroy() {
        com.baicizhan.client.business.thrift.c.b().b(TAG);
        qb0.h hVar = this.mSubscription;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.mSubscription.unsubscribe();
    }

    public rx.c<ShoppingAd> getShoppingAd() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/advertise").w5(bc0.c.e()).c3(new wb0.p<AdvertiseApiService.Client, ShoppingAd>() { // from class: com.baicizhan.client.business.util.StoreEntryJumper.1
            @Override // wb0.p
            public ShoppingAd call(AdvertiseApiService.Client client) {
                try {
                    if (StoreEntryJumper.this.mShoppingAd == null) {
                        StoreEntryJumper.this.mShoppingAd = client.get_shopping_ad();
                    }
                    return StoreEntryJumper.this.mShoppingAd;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        }).I3(tb0.a.a());
    }

    public void recordJumpTime(Context context) {
        if (this.mShoppingAd != null) {
            i9.f.m(context, i9.f.T, r0.getTimestamp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jump(final Context context, final String url, int timestamp, String trace) {
        i9.f.m(context, i9.f.T, timestamp);
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(url));
        if (!shouldJumpToTaobao(context, url, 0)) {
            jumpToNativeMall(context, trace);
        } else {
            if (jumpToTaobao(context, intent)) {
                return;
            }
            jumpToNativeMall(context, trace);
        }
    }

    public static boolean shouldJumpToTaobao(Context context, String url, int newMall) {
        if (newMall != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(url)), 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.packageName.startsWith("com.taobao")) {
                return true;
            }
        }
        return false;
    }

    public void jump(final Context context, final String trace) {
        ShoppingAd shoppingAd = this.mShoppingAd;
        if (shoppingAd != null) {
            jump(context, shoppingAd, trace);
            return;
        }
        qb0.h hVar = this.mSubscription;
        if (hVar == null || hVar.isUnsubscribed()) {
            va.g.i(context.getString(R.string.main_store_loading), 0);
            this.mSubscription = getShoppingAd().r5(new qb0.g<ShoppingAd>() { // from class: com.baicizhan.client.business.util.StoreEntryJumper.2
                @Override // qb0.c
                public void onError(Throwable e11) {
                    StoreEntryJumper.jump(context, StoreEntryJumper.TAOBAO_STORE_DEFAULT, 0, trace);
                }

                @Override // qb0.c
                public void onNext(ShoppingAd bbShoppingAd) {
                    StoreEntryJumper.jump(context, bbShoppingAd, trace);
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }
    }
}
