package com.mob.secverify.pure.core;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.mob.MobSDK;
import com.mob.secverify.common.exception.VerifyErr;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.e.g;
import com.mob.tools.utils.Data;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static SparseArray<b> a() {
        b a11;
        b a12;
        b a13;
        if (!new File(MobSDK.getContext().getFilesDir(), ".preverfy_xhs").exists()) {
            return null;
        }
        SparseArray<b> sparseArray = new SparseArray<>();
        b a14 = a(1);
        if (a14 == null || (a11 = a(2)) == null || (a12 = a(3)) == null || (a13 = a(4)) == null) {
            return null;
        }
        sparseArray.append(1, a14);
        sparseArray.append(2, a11);
        sparseArray.append(3, a12);
        sparseArray.append(4, a13);
        return sparseArray;
    }

    public static void a(SparseArray<b> sparseArray) {
        HashMap a11 = g.a();
        if (a11 == null) {
            a11 = new HashMap();
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            b valueAt = sparseArray.valueAt(i11);
            a11.put("appId_" + valueAt.f40776a, valueAt.f40777b);
            a11.put("secret_" + valueAt.f40776a, valueAt.f40778c);
        }
        g.a(a11);
    }

    private static b a(int i11) {
        HashMap a11 = g.a();
        if (a11 == null) {
            return null;
        }
        String str = (String) a11.get("appId_" + i11);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = (String) a11.get("secret_" + i11);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return new b(i11, str, str2, false);
    }

    public static SparseArray<b> a(Context context) throws VerifyException {
        if (context == null) {
            return null;
        }
        try {
            Bundle bundle = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("ISP-Config");
            if (!TextUtils.isEmpty(string)) {
                String appkey = MobSDK.getAppkey();
                if (!TextUtils.isEmpty(appkey)) {
                    int length = appkey.length();
                    String substring = appkey.substring(0, 4);
                    String substring2 = appkey.substring(length - 4, length);
                    String str = new String(Data.AES128Decode((substring + substring2.toUpperCase() + substring.toUpperCase() + substring2).getBytes(), Base64.decode(string, 3)));
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    SparseArray<b> sparseArray = new SparseArray<>();
                    String[] split = str.split("&");
                    if (split.length >= 2) {
                        sparseArray.append(1, new b(1, split[0], split[1], false));
                    }
                    if (split.length >= 4) {
                        sparseArray.append(2, new b(2, split[2], split[3], false));
                    }
                    if (split.length >= 6) {
                        sparseArray.append(4, new b(4, split[4], split[5], false));
                    }
                    if (split.length >= 8) {
                        sparseArray.append(3, new b(3, split[6], split[7], true));
                    }
                    return sparseArray;
                }
                throw new VerifyException(VerifyErr.C_DECODE_ERROR);
            }
            throw new VerifyException(VerifyErr.C_CONFIG_ERROR);
        } catch (Throwable th2) {
            if (th2 instanceof VerifyException) {
                throw th2;
            }
            throw new VerifyException(VerifyErr.C_DECODE_ERROR, th2);
        }
    }
}
