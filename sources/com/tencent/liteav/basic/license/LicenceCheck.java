package com.tencent.liteav.basic.license;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.open.SocialOperation;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class LicenceCheck {

    /* renamed from: d, reason: collision with root package name */
    private static LicenceCheck f43365d;

    /* renamed from: a, reason: collision with root package name */
    private Context f43366a;

    /* renamed from: b, reason: collision with root package name */
    private String f43367b = "YTFaceSDK.licence";

    /* renamed from: c, reason: collision with root package name */
    private String f43368c = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB";

    /* renamed from: e, reason: collision with root package name */
    private a f43369e = new a("TXUgcSDK.licence");

    /* renamed from: f, reason: collision with root package name */
    private a f43370f = new a("TXLiveSDK.licence");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f43373a;

        /* renamed from: b, reason: collision with root package name */
        String f43374b;

        /* renamed from: c, reason: collision with root package name */
        String f43375c = "";

        /* renamed from: d, reason: collision with root package name */
        String f43376d = "";

        /* renamed from: e, reason: collision with root package name */
        String f43377e = "";

        /* renamed from: f, reason: collision with root package name */
        boolean f43378f = false;

        /* renamed from: g, reason: collision with root package name */
        boolean f43379g = false;

        /* renamed from: h, reason: collision with root package name */
        int f43380h = -1;

        /* renamed from: i, reason: collision with root package name */
        String f43381i = "";

        public a(String str) {
            this.f43373a = str;
            this.f43374b = str + ".tmp";
        }
    }

    private LicenceCheck() {
    }

    private int c(a aVar) {
        String str;
        String str2 = b() + File.separator + aVar.f43373a;
        if (!com.tencent.liteav.basic.util.c.a(str2)) {
            return -7;
        }
        try {
            str = com.tencent.liteav.basic.util.c.b(str2);
        } catch (Exception e11) {
            TXCLog.e("LicenceCheck", "read licence file error: ", e11);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return a(aVar, str);
        }
        TXCLog.e("LicenceCheck", "checkLocalLicence, licenceStr is empty");
        return -8;
    }

    private int d(a aVar) {
        if (!e(aVar)) {
            return -6;
        }
        String b11 = com.tencent.liteav.basic.util.c.b(this.f43366a, aVar.f43373a);
        if (!TextUtils.isEmpty(b11)) {
            return a(aVar, b11);
        }
        TXCLog.e("LicenceCheck", "checkAssetLicence, licenceAssetStr is empty");
        return -8;
    }

    private boolean e(a aVar) {
        return com.tencent.liteav.basic.util.c.a(this.f43366a, aVar.f43373a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        String str = File.separator;
        sb2.append(str);
        sb2.append(aVar.f43373a);
        File file = new File(sb2.toString());
        if (file.exists()) {
            TXCLog.i("LicenceCheck", "delete dst file:" + file.delete());
        }
        File file2 = new File(aVar.f43375c + str + aVar.f43374b);
        if (file2.exists()) {
            TXCLog.i("LicenceCheck", "rename file:" + file2.renameTo(file));
        }
        aVar.f43379g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g(a aVar) {
        return com.tencent.liteav.basic.util.c.b(new File(aVar.f43375c + File.separator + aVar.f43374b).getAbsolutePath());
    }

    private native byte[] nativeIvParameterSpec(byte[] bArr);

    private native String nativeRSAKey();

    private int e(a aVar, String str) {
        String d11 = d(str);
        if (TextUtils.isEmpty(d11)) {
            TXCLog.e("LicenceCheck", "verifyOldLicence, decryptStr is empty");
            return -3;
        }
        aVar.f43381i = d11;
        try {
            JSONObject jSONObject = new JSONObject(d11);
            if (!jSONObject.getString("packagename").equals(a(this.f43366a))) {
                TXCLog.e("LicenceCheck", "packagename not match!");
                a(-4);
                return -4;
            }
            if (c(jSONObject.getString("enddate"))) {
                return -5;
            }
            aVar.f43380h = 5;
            TXCDRApi.txReportDAU(this.f43366a, com.tencent.liteav.basic.datareport.a.aJ);
            return 0;
        } catch (JSONException e11) {
            e11.printStackTrace();
            TXCLog.e("LicenceCheck", "verifyOldLicence, json format error !");
            a(-1);
            return -1;
        }
    }

    public static LicenceCheck a() {
        if (f43365d == null) {
            f43365d = new LicenceCheck();
        }
        return f43365d;
    }

    private String b(a aVar) {
        Context context = this.f43366a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("LicenceCheck.lastModified", 0).getString(aVar.f43373a + ".lastModified", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar, String str) {
        Context context = this.f43366a;
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("LicenceCheck.lastModified", 0).edit();
        edit.putString(aVar.f43373a + ".lastModified", str);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(a aVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("appId");
            String string = jSONObject.getString("encryptedLicense");
            String string2 = jSONObject.getString(SocialOperation.GAME_SIGNATURE);
            TXCLog.i("LicenceCheck", "appid:" + optInt);
            TXCLog.i("LicenceCheck", "encryptedLicense:" + string);
            TXCLog.i("LicenceCheck", "signature:" + string2);
            return a(aVar, string, string2);
        } catch (JSONException e11) {
            e11.printStackTrace();
            a(-1);
            return -1;
        }
    }

    public void a(Context context, String str, String str2) {
        a(this.f43370f, context, str, str2);
    }

    private void a(a aVar, Context context, String str, String str2) {
        if (context != null) {
            this.f43366a = context.getApplicationContext();
            TXCCommonUtil.setAppContext(context);
        }
        aVar.f43376d = str2;
        aVar.f43377e = str;
        if (this.f43366a != null) {
            aVar.f43375c = b();
            if (!com.tencent.liteav.basic.util.c.a(aVar.f43375c + File.separator + aVar.f43373a)) {
                TXCLog.i("LicenceCheck", "setLicense, file not exist, to download");
                b(aVar, "");
            }
            a(aVar);
        }
    }

    private String c(a aVar, String str) {
        if (TextUtils.isEmpty(aVar.f43376d)) {
            TXCLog.e("LicenceCheck", "decodeLicence, mKey is empty!!!");
            return "";
        }
        byte[] bytes = aVar.f43376d.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nativeIvParameterSpec(bytes));
        byte[] decode = Base64.decode(str, 0);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str2 = new String(cipher.doFinal(decode), "UTF-8");
            TXCLog.i("LicenceCheck", "decodeLicence : " + str2);
            return str2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static long b(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime();
        } catch (Exception e11) {
            TXCLog.e("LicenceCheck", "time str to millsecond failed.", e11);
            return -1L;
        }
    }

    public String b() {
        File file = new File(this.f43366a.getFilesDir() + File.separator + "liteav/licence");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private String d(String str) {
        try {
            return new String(f.b(Base64.decode(str, 0), Base64.decode(nativeRSAKey(), 0)));
        } catch (Exception e11) {
            e11.printStackTrace();
            TXCLog.e("LicenceCheck", "decryptLicenceStr, exception is : " + e11);
            return null;
        }
    }

    public void a(final a aVar) {
        if (TextUtils.isEmpty(aVar.f43377e)) {
            TXCLog.e("LicenceCheck", "downloadLicense, mUrl is empty, ignore!");
            return;
        }
        if (aVar.f43378f) {
            TXCLog.i("LicenceCheck", "downloadLicense, in downloading, ignore");
            return;
        }
        b bVar = new b() { // from class: com.tencent.liteav.basic.license.LicenceCheck.1
            @Override // com.tencent.liteav.basic.license.b
            public void a(File file, String str) {
                if (file == null) {
                    TXCLog.i("LicenceCheck", "downloadLicense, license not modified");
                    return;
                }
                LicenceCheck.this.b(aVar, str);
                TXCLog.i("LicenceCheck", "downloadLicense, onSaveSuccess");
                String g11 = LicenceCheck.this.g(aVar);
                if (TextUtils.isEmpty(g11)) {
                    TXCLog.e("LicenceCheck", "downloadLicense, readDownloadTempLicence is empty!");
                    aVar.f43378f = false;
                } else if (LicenceCheck.this.d(aVar, g11) == 0) {
                    LicenceCheck.this.f(aVar);
                }
            }

            @Override // com.tencent.liteav.basic.license.b
            public void a(File file, Exception exc) {
                TXCLog.i("LicenceCheck", "downloadLicense, onSaveFailed");
            }

            @Override // com.tencent.liteav.basic.license.b
            public void a(int i11) {
                TXCLog.i("LicenceCheck", "downloadLicense, onProgressUpdate");
            }

            @Override // com.tencent.liteav.basic.license.b
            public void a() {
                TXCLog.i("LicenceCheck", "downloadLicense, onProcessEnd");
                aVar.f43378f = false;
            }
        };
        if (this.f43366a == null) {
            TXCLog.e("LicenceCheck", "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)");
            return;
        }
        aVar.f43375c = b();
        new Thread(new c(this.f43366a, aVar.f43377e, aVar.f43375c, aVar.f43374b, bVar, false, b(aVar))).start();
        aVar.f43378f = true;
    }

    private boolean c(String str) {
        long b11 = b(str);
        if (b11 < 0) {
            TXCLog.e("LicenceCheck", "checkEndDate, end date millis < 0!");
            return true;
        }
        if (b11 >= System.currentTimeMillis()) {
            return false;
        }
        TXCLog.e("LicenceCheck", "checkEndDate, end date expire!");
        return true;
    }

    public int a(e eVar, Context context) {
        return a(this.f43370f, eVar, context);
    }

    private int a(a aVar, e eVar, Context context) {
        int a11 = a(aVar, context);
        if (a11 != 0) {
            a(aVar);
        }
        if (eVar != null) {
            eVar.f43393a = aVar.f43381i;
        }
        return a11;
    }

    private int a(a aVar, Context context) {
        if (aVar.f43379g) {
            return 0;
        }
        if (this.f43366a == null) {
            this.f43366a = context;
        }
        if (d(aVar) == 0) {
            aVar.f43379g = true;
            return 0;
        }
        int c11 = c(aVar);
        if (c11 != 0) {
            return c11;
        }
        aVar.f43379g = true;
        return 0;
    }

    public int a(a aVar, String str) {
        try {
            new JSONObject(str);
            return d(aVar, str);
        } catch (JSONException unused) {
            if (aVar == this.f43370f) {
                return -1;
            }
            return e(aVar, str);
        }
    }

    public PublicKey a(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    private int a(a aVar, String str, String str2) {
        boolean z11;
        try {
            z11 = a(Base64.decode(str, 0), Base64.decode(str2, 0), a(this.f43368c));
        } catch (Exception e11) {
            e11.printStackTrace();
            TXCLog.e("LicenceCheck", "verifyLicence, exception is : " + e11);
            z11 = false;
        }
        if (!z11) {
            a(-2);
            TXCLog.e("LicenceCheck", "verifyLicence, signature not pass!");
            return -2;
        }
        String c11 = c(aVar, str);
        if (TextUtils.isEmpty(c11)) {
            a(-3);
            TXCLog.e("LicenceCheck", "verifyLicence, decodeValue is empty!");
            return -3;
        }
        aVar.f43381i = c11;
        try {
            JSONObject jSONObject = new JSONObject(c11);
            String string = jSONObject.getString("pituLicense");
            JSONArray optJSONArray = jSONObject.optJSONArray("appData");
            if (optJSONArray == null) {
                TXCLog.e("LicenceCheck", "verifyLicence, appDataArray is null!");
                a(-1);
                return -1;
            }
            int i11 = 0;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (true) {
                if (i11 >= optJSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                String optString = jSONObject2.optString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME);
                TXCLog.i("LicenceCheck", "verifyLicence, packageName:" + optString);
                if (!optString.equals(this.f43366a.getPackageName())) {
                    TXCLog.e("LicenceCheck", "verifyLicence, packageName not match!");
                } else if (!c(jSONObject2.optString(IntentConstant.END_DATE))) {
                    z14 = a(aVar, jSONObject2, string);
                    if (z14) {
                        z12 = true;
                        z13 = true;
                        z14 = true;
                        break;
                    }
                    z12 = true;
                    z13 = true;
                } else {
                    z12 = true;
                }
                i11++;
            }
            if (!z12) {
                a(-4);
                return -4;
            }
            if (!z13) {
                a(-5);
                return -5;
            }
            if (!z14) {
                a(-11);
                return -11;
            }
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] decode = Base64.decode(string, 0);
                    File file = new File(b() + File.separator + this.f43367b);
                    com.tencent.liteav.basic.util.c.a(file.getAbsolutePath(), decode);
                    TXCCommonUtil.setPituLicencePath(file.getAbsolutePath());
                } catch (Exception e12) {
                    TXCLog.e("LicenceCheck", "decode pitu license error:" + e12);
                }
            }
            TXCDRApi.txReportDAU(this.f43366a, com.tencent.liteav.basic.datareport.a.aJ);
            return 0;
        } catch (JSONException e13) {
            e13.printStackTrace();
            TXCLog.e("LicenceCheck", "verifyLicence, json format error ! exception = " + e13);
            a(-1);
            return -1;
        }
    }

    private boolean a(a aVar, JSONObject jSONObject, String str) {
        int optInt = jSONObject.optInt("feature");
        boolean z11 = true;
        if (aVar == this.f43370f) {
            int i11 = (optInt >> 4) & 15;
            if (i11 >= 1) {
                aVar.f43380h = i11;
            } else {
                z11 = false;
            }
            TXCLog.i("LicenceCheck", "live parseVersionType, mLicenceVersionType = " + aVar.f43380h);
            return z11;
        }
        if (aVar != this.f43369e) {
            return false;
        }
        int i12 = optInt & 15;
        if (i12 > 1) {
            aVar.f43380h = i12;
        } else if (i12 != 1 && optInt != 0) {
            z11 = false;
        } else if (!TextUtils.isEmpty(str)) {
            aVar.f43380h = 5;
        } else {
            aVar.f43380h = 3;
        }
        TXCLog.i("LicenceCheck", "ugc parseVersionType, mLicenceVersionType = " + aVar.f43380h);
        return z11;
    }

    private void a(int i11) {
        TXCDRApi.txReportDAU(this.f43366a, com.tencent.liteav.basic.datareport.a.aK, i11, "");
    }

    private static String a(Context context) {
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature = Signature.getInstance(tr.b.f90859a);
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }
}
