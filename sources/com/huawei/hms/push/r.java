package com.huawei.hms.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class r {
    public static int a(Context context, String str, String str2) {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            sb2.append(".R$");
            sb2.append(str);
            Field field = Class.forName(sb2.toString()).getField(str2);
            int parseInt = Integer.parseInt(field.get(field.getName()).toString());
            if (parseInt != 0) {
                return parseInt;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error-resourceType=");
            sb3.append(str);
            sb3.append("--resourceName=");
            sb3.append(str2);
            sb3.append("--resourceId =");
            sb3.append(parseInt);
            HMSLog.i(pk.t.f80753c, sb3.toString());
            return parseInt;
        } catch (ClassNotFoundException e11) {
            HMSLog.e(pk.t.f80753c, "!!!! ResourceLoader: ClassNotFoundException-resourceType=" + str + "--resourceName=" + str2, e11);
            return 0;
        } catch (IllegalAccessException e12) {
            HMSLog.e(pk.t.f80753c, "!!!! ResourceLoader: IllegalAccessException-resourceType=" + str + "--resourceName=" + str2, e12);
            return 0;
        } catch (NoSuchFieldException e13) {
            HMSLog.e(pk.t.f80753c, "!!!! ResourceLoader: NoSuchFieldException-resourceType=" + str + "--resourceName=" + str2, e13);
            return 0;
        } catch (NumberFormatException e14) {
            HMSLog.e(pk.t.f80753c, "!!!! ResourceLoader: NumberFormatException-resourceType=" + str + "--resourceName=" + str2, e14);
            return 0;
        } catch (IllegalArgumentException e15) {
            HMSLog.e(pk.t.f80753c, "!!!! ResourceLoader: IllegalArgumentException-resourceType=" + str + "--resourceName=" + str2, e15);
            return 0;
        }
    }

    public static int a(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt(str);
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.w(pk.t.f80753c, "load meta data resource failed.");
            return 0;
        }
    }
}
