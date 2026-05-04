package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, i> f44591a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    private static String f44592b = null;

    /* renamed from: c, reason: collision with root package name */
    private Context f44593c;

    /* renamed from: d, reason: collision with root package name */
    private String f44594d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f44595e = null;

    /* renamed from: f, reason: collision with root package name */
    private long f44596f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f44597g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44598h = true;

    private i(Context context, String str) {
        this.f44593c = null;
        this.f44594d = null;
        this.f44593c = context.getApplicationContext();
        this.f44594d = str;
        a();
        b();
    }

    private void b() {
        if (this.f44597g != 0) {
            d("update thread is running, return");
            return;
        }
        this.f44597g = 1;
        final HashMap hashMap = new HashMap();
        hashMap.put("appid", this.f44594d);
        hashMap.put("status_os", Build.VERSION.RELEASE);
        hashMap.put("status_machine", f.a().c(g.a()));
        hashMap.put("status_version", Build.VERSION.SDK);
        hashMap.put("sdkv", Constants.SDK_VERSION);
        hashMap.put("sdkp", "a");
        l.a(new Runnable() { // from class: com.tencent.open.utils.i.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.open.a.g a11 = com.tencent.open.a.f.a().a("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", hashMap);
                    String a12 = a11.a();
                    SLog.i("openSDK_LOG.OpenConfig", "update: get config statusCode " + a11.d());
                    i.this.a(m.d(a12));
                } catch (Exception e11) {
                    SLog.e("openSDK_LOG.OpenConfig", "get config error ", e11);
                }
                i.this.f44597g = 0;
            }
        });
    }

    private String c(String str) {
        InputStream open;
        String str2;
        String str3 = "";
        try {
            try {
                if (this.f44594d != null) {
                    str2 = str + "." + this.f44594d;
                } else {
                    str2 = str;
                }
                open = this.f44593c.openFileInput(str2);
            } catch (IOException e11) {
                e11.printStackTrace();
                return "";
            }
        } catch (FileNotFoundException unused) {
            open = this.f44593c.getAssets().open(str);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charset.forName("UTF-8")));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        open.close();
                    }
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    open.close();
                    bufferedReader.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                throw th2;
            }
        }
        str3 = stringBuffer.toString();
        open.close();
        bufferedReader.close();
        return str3;
    }

    private void d(String str) {
        if (this.f44598h) {
            SLog.v("openSDK_LOG.OpenConfig", str + "; appid: " + this.f44594d);
        }
    }

    public static i a(Context context, String str) {
        i iVar;
        synchronized (f44591a) {
            try {
                SLog.v("openSDK_LOG.OpenConfig", "getInstance begin");
                if (str != null) {
                    f44592b = str;
                }
                if (str == null && (str = f44592b) == null) {
                    str = "0";
                }
                iVar = f44591a.get(str);
                if (iVar == null) {
                    iVar = new i(context, str);
                    f44591a.put(str, iVar);
                }
                SLog.v("openSDK_LOG.OpenConfig", "getInstance end");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public boolean b(String str) {
        d("get " + str);
        c();
        Object opt = this.f44595e.opt(str);
        if (opt == null) {
            return false;
        }
        if (opt instanceof Integer) {
            return !opt.equals(0);
        }
        if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        }
        return false;
    }

    private void a() {
        try {
            this.f44595e = new JSONObject(c("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f44595e = new JSONObject();
        }
    }

    private void a(String str, String str2) {
        try {
            if (this.f44594d != null) {
                str = str + "." + this.f44594d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f44593c.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    private void c() {
        int optInt = this.f44595e.optInt("Common_frequency");
        if (optInt == 0) {
            optInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f44596f >= optInt * 3600000) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        d("cgi back, do update");
        this.f44595e = jSONObject;
        a("com.tencent.open.config.json", jSONObject.toString());
        this.f44596f = SystemClock.elapsedRealtime();
    }

    public int a(String str) {
        d("get " + str);
        c();
        return this.f44595e.optInt(str);
    }
}
