package com.baicizhan.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {
    public static final /* synthetic */ <T extends AppCompatActivity> void a(AppCompatActivity appCompatActivity, Bundle bundle, Integer num, Integer num2) {
        g0.p(appCompatActivity, "<this>");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Intent intent = new Intent(appCompatActivity, (Class<?>) AppCompatActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        appCompatActivity.startActivity(intent);
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                appCompatActivity.overridePendingTransition(intValue, num2.intValue());
            }
        }
    }

    public static /* synthetic */ void b(AppCompatActivity appCompatActivity, Bundle bundle, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bundle = null;
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        g0.p(appCompatActivity, "<this>");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Intent intent = new Intent(appCompatActivity, (Class<?>) AppCompatActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        appCompatActivity.startActivity(intent);
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                appCompatActivity.overridePendingTransition(intValue, num2.intValue());
            }
        }
    }

    @k
    public static final String c(int i11, @k Context context) {
        g0.p(context, "context");
        return "android.resource://" + context.getResources().getResourcePackageName(i11) + "/" + context.getResources().getResourceTypeName(i11) + "/" + context.getResources().getResourceEntryName(i11);
    }
}
