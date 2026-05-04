package com.baicizhan.client.business.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.flipboard.bottomsheet.commons.IntentPickerSheetView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.ref.WeakReference;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BottomSheetUtils {
    public static final String CHANNEL_XIAOMI = "xiaomi";
    public static final String TAG = "BottomSheetUtils";
    private static final String XIAO_MI = "com.xiaomi.market";
    private static String[] sMarketFilters = {"com.android.vending", "com.sec.android.app.samsungapps"};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnIntentPickedListener {
        void onIntentPicked(String pkg);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PraiseStatsCallback implements OnIntentPickedListener {
        private final WeakReference<Activity> weakActivity;

        public PraiseStatsCallback(Activity activity) {
            this.weakActivity = new WeakReference<>(activity);
        }

        @Override // com.baicizhan.client.business.util.BottomSheetUtils.OnIntentPickedListener
        public void onIntentPicked(String pkg) {
            this.weakActivity.get();
        }
    }

    private BottomSheetUtils() {
    }

    public static /* synthetic */ boolean b(IntentPickerSheetView.b bVar) {
        String packageName = bVar.f29560c.getPackageName();
        for (String str : sMarketFilters) {
            if (TextUtils.equals(packageName, str)) {
                return false;
            }
        }
        return true;
    }

    public static View buildAppStoreBottomSheet(@NonNull final Context context, String packageName, String title, final hj.a<Boolean> onDismiss, final OnIntentPickedListener listener) {
        final Uri parse = Uri.parse("market://details?id=" + packageName);
        IntentPickerSheetView intentPickerSheetView = new IntentPickerSheetView(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse), title, new IntentPickerSheetView.f() { // from class: com.baicizhan.client.business.util.b
            @Override // com.flipboard.bottomsheet.commons.IntentPickerSheetView.f
            public final void onIntentPicked(IntentPickerSheetView.b bVar) {
                BottomSheetUtils.c(hj.a.this, context, parse, listener, bVar);
            }
        });
        intentPickerSheetView.setFilter(new IntentPickerSheetView.d() { // from class: com.baicizhan.client.business.util.c
            @Override // com.flipboard.bottomsheet.commons.IntentPickerSheetView.d
            public final boolean include(IntentPickerSheetView.b bVar) {
                return BottomSheetUtils.b(bVar);
            }
        });
        return intentPickerSheetView;
    }

    public static /* synthetic */ void c(hj.a aVar, Context context, Uri uri, OnIntentPickedListener onIntentPickedListener, IntentPickerSheetView.b bVar) {
        aVar.onResult(Boolean.TRUE);
        goAppStoreDetail(context, bVar.f29560c.getPackageName(), uri, onIntentPickedListener);
    }

    public static int checkAppStoreTargetCount(Context context, Uri uri, Intent market) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(market, 0);
        String channel = ChannelUtils.getChannel(context);
        if (TextUtils.isEmpty(channel)) {
            channel = "beta";
        }
        int i11 = 0;
        String str = null;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String[] strArr = sMarketFilters;
            int length = strArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i11++;
                    str = resolveInfo.activityInfo.packageName;
                    if (channel.equals("xiaomi") && XIAO_MI.equals(str)) {
                        break;
                    }
                } else {
                    if (TextUtils.equals(resolveInfo.activityInfo.packageName, strArr[i12])) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (channel.equals("xiaomi") && XIAO_MI.equals(str)) {
            qb.c.i(TAG, "GO app store detail %s, %s", str, channel);
            goAppStoreDetail(context, str, uri, null);
            return -1;
        }
        if (i11 != 1 || TextUtils.isEmpty(str)) {
            return i11;
        }
        goAppStoreDetail(context, str, uri, null);
        return -1;
    }

    public static /* synthetic */ g2 d(Uri uri, String str, Context context, OnIntentPickedListener onIntentPickedListener) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        intent.setPackage(str);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Exception e11) {
            qb.c.c(TAG, "", e11);
        }
        if (onIntentPickedListener != null) {
            onIntentPickedListener.onIntentPicked(str);
        }
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void goAppStoreDetail(final Context context, final String defaultPkg, final Uri uri, final OnIntentPickedListener listener) {
        kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(context, new x00.a() { // from class: com.baicizhan.client.business.util.d
            @Override // x00.a
            public final Object invoke() {
                return BottomSheetUtils.d(uri, defaultPkg, context, listener);
            }
        }, new x00.a() { // from class: com.baicizhan.client.business.util.e
            @Override // x00.a
            public final Object invoke() {
                g2 g2Var;
                g2Var = g2.f100423a;
                return g2Var;
            }
        });
        if (context instanceof FragmentActivity) {
            mc.a.n((FragmentActivity) context, thirdAppDialog, "show-dialog");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        r5 = r16;
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void showAppStoreBottomSheet(@androidx.annotation.NonNull final android.content.Context r17, @androidx.annotation.NonNull final com.flipboard.bottomsheet.BottomSheetLayout r18, java.lang.String r19, java.lang.String r20, final com.baicizhan.client.business.util.BottomSheetUtils.OnIntentPickedListener r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "market://details?id="
            r3.append(r4)
            r4 = r19
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5, r3)
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            r6 = 0
            java.util.List r5 = r5.queryIntentActivities(r4, r6)
            java.lang.String r7 = com.baicizhan.client.business.util.ChannelUtils.getChannel(r0)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L39
            java.lang.String r7 = "beta"
        L39:
            java.lang.String r8 = "com.xiaomi.market"
            java.lang.String r9 = "xiaomi"
            r10 = 0
            if (r5 == 0) goto L86
            java.util.Iterator r5 = r5.iterator()
            r11 = r6
        L45:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L80
            java.lang.Object r12 = r5.next()
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.lang.String[] r13 = com.baicizhan.client.business.util.BottomSheetUtils.sMarketFilters
            int r14 = r13.length
            r15 = r6
        L55:
            if (r15 >= r14) goto L6c
            r6 = r13[r15]
            r16 = r5
            android.content.pm.ActivityInfo r5 = r12.activityInfo
            java.lang.String r5 = r5.packageName
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L66
            goto L82
        L66:
            int r15 = r15 + 1
            r5 = r16
            r6 = 0
            goto L55
        L6c:
            r16 = r5
            int r11 = r11 + 1
            android.content.pm.ActivityInfo r5 = r12.activityInfo
            java.lang.String r10 = r5.packageName
            boolean r5 = r7.equals(r9)
            if (r5 == 0) goto L82
            boolean r5 = r8.equals(r10)
            if (r5 == 0) goto L82
        L80:
            r6 = r11
            goto L87
        L82:
            r5 = r16
            r6 = 0
            goto L45
        L86:
            r6 = 0
        L87:
            boolean r5 = r7.equals(r9)
            if (r5 == 0) goto La2
            boolean r5 = r8.equals(r10)
            if (r5 == 0) goto La2
            java.lang.String r1 = "GO app store detail %s, %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r10, r7}
            java.lang.String r5 = "BottomSheetUtils"
            qb.c.i(r5, r1, r4)
            goAppStoreDetail(r0, r10, r3, r2)
            return
        La2:
            r5 = 1
            if (r6 != r5) goto Laf
            boolean r5 = android.text.TextUtils.isEmpty(r10)
            if (r5 != 0) goto Laf
            goAppStoreDetail(r0, r10, r3, r2)
            return
        Laf:
            if (r6 <= 0) goto Lb4
            r5 = r20
            goto Lb6
        Lb4:
            java.lang.String r5 = "没有可打开的应用"
        Lb6:
            com.flipboard.bottomsheet.commons.IntentPickerSheetView r6 = new com.flipboard.bottomsheet.commons.IntentPickerSheetView
            com.baicizhan.client.business.util.BottomSheetUtils$1 r7 = new com.baicizhan.client.business.util.BottomSheetUtils$1
            r7.<init>()
            r6.<init>(r0, r4, r5, r7)
            com.baicizhan.client.business.util.BottomSheetUtils$2 r0 = new com.baicizhan.client.business.util.BottomSheetUtils$2
            r0.<init>()
            r6.setFilter(r0)
            showSheetView(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.BottomSheetUtils.showAppStoreBottomSheet(android.content.Context, com.flipboard.bottomsheet.BottomSheetLayout, java.lang.String, java.lang.String, com.baicizhan.client.business.util.BottomSheetUtils$OnIntentPickedListener):void");
    }

    public static void showBaicizhanAppStoreBottomSheet(@NonNull final Context context, @NonNull final BottomSheetLayout bottomSheetLayout, String defTitle, OnIntentPickedListener listener) {
        showAppStoreBottomSheet(context, bottomSheetLayout, context.getPackageName(), defTitle, listener);
    }

    public static void showSheetView(BottomSheetLayout bottomSheetLayout, View sheet) {
        if (bottomSheetLayout == null || sheet == null || bottomSheetLayout.getContext() == null || !(bottomSheetLayout.getContext() instanceof Activity)) {
            return;
        }
        bottomSheetLayout.L(sheet);
    }
}
