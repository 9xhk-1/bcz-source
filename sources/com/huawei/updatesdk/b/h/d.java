package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Typeface f36925a;

    public static int a(long j11, long j12) {
        if (j12 <= 0) {
            return 0;
        }
        return Math.min((int) Math.round((j11 / j12) * 100.0d), 100);
    }

    public static String a(int i11) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        return percentInstance.format(i11 / 100.0d);
    }

    public static String a(Context context, long j11) {
        if (j11 == 0) {
            return context.getString(c.c(context, "upsdk_storage_utils"), "0");
        }
        DecimalFormat decimalFormat = j11 > 104857 ? new DecimalFormat("###.#") : j11 > 10485 ? new DecimalFormat("###.##") : null;
        return decimalFormat != null ? context.getString(c.c(context, "upsdk_storage_utils"), decimalFormat.format(j11 / 1048576.0d)) : context.getString(c.c(context, "upsdk_storage_utils"), "0.01");
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception e11) {
                com.huawei.updatesdk.a.a.a.a(pq.b.f81108a, "close cursor error: " + e11.getMessage());
            }
        }
    }

    public static void a(TextView textView) {
        try {
            if (a.f().b() > 0) {
                if (f36925a == null) {
                    f36925a = Typeface.create("HnChinese-medium", 0);
                }
                Typeface typeface = f36925a;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
            }
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b(pq.b.f81108a, "setSubTextType TextView Exception" + e11.getMessage());
        }
    }

    public static boolean a(Context context, Uri uri, String str) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(uri.getAuthority(), 0);
            if (resolveContentProvider != null) {
                ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                if (applicationInfo == null || !TextUtils.equals(str, applicationInfo.packageName)) {
                    return false;
                }
                com.huawei.updatesdk.a.a.a.b(pq.b.f81108a, "valid provider: " + uri);
                return true;
            }
            com.huawei.updatesdk.a.a.a.a(pq.b.f81108a, "invalid provider: " + uri);
        }
        return false;
    }

    public static boolean a(List list) {
        return list == null || list.size() <= 0;
    }
}
