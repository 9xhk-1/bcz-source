package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35731a = "c";

    public static String a(String str, Context context) {
        Logger.d(f35731a, "Io getConfigContent, fileName: " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStream = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            byteArrayOutputStream.flush();
                            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStream);
                            return byteArrayOutputStream2;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            } catch (IOException unused) {
                Logger.w(f35731a, "local config file is not exist.filename is {%s}", str);
            }
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream);
            return "";
        } catch (Throwable th2) {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream);
            throw th2;
        }
    }
}
