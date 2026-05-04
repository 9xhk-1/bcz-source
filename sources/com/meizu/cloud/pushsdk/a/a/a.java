package com.meizu.cloud.pushsdk.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f39319a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f39320b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f39321c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f39322d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f39323e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f39324f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f39325g;

    /* renamed from: h, reason: collision with root package name */
    private PublicKey f39326h;

    /* renamed from: i, reason: collision with root package name */
    private final SharedPreferences f39327i;

    /* renamed from: j, reason: collision with root package name */
    private final SharedPreferences f39328j;

    /* renamed from: k, reason: collision with root package name */
    private long f39329k = 0;

    private a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.x.y.1", 0);
        this.f39327i = sharedPreferences;
        this.f39328j = context.getSharedPreferences("com.x.y.2", 0);
        Integer.parseInt(sharedPreferences.getString("keyTimeout", "0"));
        sharedPreferences.getLong("createDate", 0L);
        e();
        byte[] bArr = this.f39321c;
        if (bArr != null && bArr.length != 0) {
            byte[] bArr2 = this.f39322d;
            if (bArr2 == null || bArr2.length == 0) {
                PublicKey b11 = b(context);
                this.f39326h = b11;
                if (b11 != null) {
                    h();
                    return;
                }
                return;
            }
            return;
        }
        PublicKey b12 = b(context);
        this.f39326h = b12;
        if (b12 != null) {
            f();
            return;
        }
        sharedPreferences.edit().clear().apply();
        try {
            d();
            PublicKey b13 = b(context);
            this.f39326h = b13;
            if (b13 != null) {
                f();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static a a() {
        a aVar = f39319a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KeyMgr is not initialised - invoke at least once with parameterised init/get");
    }

    private PublicKey b(Context context) {
        b("load publicKey from preference");
        String string = this.f39328j.getString("publicKey", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private void c(String str) {
        DebugLogger.e("HttpKeyMgr", str);
    }

    private void d() throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(PushConstants.URL_DOWNLOAD_PUBLIC_KEY).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            try {
                httpURLConnection.setRequestMethod("GET");
            } catch (ProtocolException e11) {
                e11.printStackTrace();
            }
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            InputStream inputStream = null;
            try {
                b("code = " + httpURLConnection.getResponseCode());
                inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    String a11 = a(inputStream);
                    b("body = " + a11);
                    if (!TextUtils.isEmpty(a11)) {
                        try {
                            JSONObject jSONObject = new JSONObject(a11);
                            if (jSONObject.getInt("code") == 200) {
                                String string = jSONObject.getString("value");
                                SharedPreferences.Editor edit = this.f39328j.edit();
                                edit.putString("publicKey", string);
                                edit.apply();
                            }
                        } catch (Exception e12) {
                            c("downloadPublicKey message error " + e12.getMessage());
                        }
                    }
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException unused2) {
        }
    }

    private void e() {
        b("loadKeys");
        String string = this.f39327i.getString("sKey64", "");
        b("saved sKey64: " + string);
        if (!TextUtils.isEmpty(string)) {
            this.f39325g = string.getBytes();
        }
        String string2 = this.f39327i.getString("aKey64", "");
        b("saved aKey64: " + string2);
        if (!TextUtils.isEmpty(string2)) {
            byte[] bytes = string2.getBytes();
            this.f39324f = bytes;
            this.f39322d = Base64.decode(bytes, 2);
        }
        String string3 = this.f39327i.getString("rKey64", "");
        b("saved rKey64: " + string3);
        if (TextUtils.isEmpty(string3)) {
            return;
        }
        byte[] bytes2 = string3.getBytes();
        this.f39323e = bytes2;
        this.f39321c = Base64.decode(bytes2, 2);
        b("saved rKey: " + new String(this.f39321c));
    }

    private void f() {
        g();
        h();
    }

    private void g() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            byte[] encoded = keyGenerator.generateKey().getEncoded();
            this.f39321c = encoded;
            this.f39323e = Base64.encode(encoded, 2);
            b("***** rKey64: " + new String(this.f39323e));
            SharedPreferences.Editor edit = this.f39327i.edit();
            edit.putString("rKey64", new String(this.f39323e));
            edit.apply();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void h() {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, this.f39326h);
            byte[] doFinal = cipher.doFinal(this.f39321c);
            this.f39322d = doFinal;
            this.f39324f = Base64.encode(doFinal, 2);
            b("***** aKey64: " + new String(this.f39324f));
            SharedPreferences.Editor edit = this.f39327i.edit();
            edit.putString("aKey64", new String(this.f39324f));
            edit.apply();
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e11) {
            e11.printStackTrace();
        }
    }

    private String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                try {
                    int read = inputStream.read();
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        try {
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream2;
                        } catch (IOException unused) {
                            return byteArrayOutputStream2;
                        }
                    }
                    byteArrayOutputStream.write(read);
                } catch (IOException unused2) {
                    return null;
                }
            } catch (IOException unused3) {
                byteArrayOutputStream.close();
                return null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                throw th2;
            }
        }
    }

    private void b(String str) {
        DebugLogger.d("HttpKeyMgr", str);
    }

    public byte[] c() {
        return this.f39325g;
    }

    public static void a(Context context) {
        if (f39319a == null) {
            synchronized (f39320b) {
                try {
                    if (f39319a == null) {
                        f39319a = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public byte[] b() {
        return this.f39324f;
    }

    public void a(String str) {
        this.f39325g = str.getBytes();
        SharedPreferences.Editor edit = this.f39327i.edit();
        edit.putString("sKey64", new String(this.f39325g));
        edit.apply();
    }

    public byte[] a(byte[] bArr) {
        String str;
        byte[] bArr2 = this.f39321c;
        if (bArr2 == null || bArr2.length == 0) {
            str = "rKey null!";
        } else {
            if (bArr != null && bArr.length != 0) {
                b(">>>>>>>>>> encrypt input >>>>>>>>>>\n" + new String(Base64.encode(bArr, 2)));
                b("<<<<<<<<<< encrypt input <<<<<<<<<<");
                try {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(1, new SecretKeySpec(this.f39321c, "AES"), new IvParameterSpec(this.f39321c));
                    byte[] doFinal = cipher.doFinal(bArr);
                    b(">>>>>>>>>> encrypt output >>>>>>>>>>\n" + new String(Base64.encode(doFinal, 2)));
                    b("<<<<<<<<<< encrypt output <<<<<<<<<<");
                    return doFinal;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e11) {
                    e11.printStackTrace();
                    return null;
                }
            }
            str = "input null!";
        }
        c(str);
        return null;
    }
}
