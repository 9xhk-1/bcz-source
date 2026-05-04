package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class cu {

    /* renamed from: a, reason: collision with root package name */
    protected static Context f45364a;

    /* renamed from: a, reason: collision with other field name */
    private static a f219a;

    /* renamed from: a, reason: collision with other field name */
    private static cu f220a;

    /* renamed from: c, reason: collision with root package name */
    private static String f45366c;

    /* renamed from: d, reason: collision with root package name */
    private static String f45367d;

    /* renamed from: a, reason: collision with other field name */
    private long f222a;

    /* renamed from: a, reason: collision with other field name */
    private ct f223a;

    /* renamed from: a, reason: collision with other field name */
    protected b f224a;

    /* renamed from: a, reason: collision with other field name */
    private String f225a;

    /* renamed from: a, reason: collision with other field name */
    protected final Map<String, cr> f226a;

    /* renamed from: b, reason: collision with other field name */
    private final long f227b;

    /* renamed from: b, reason: collision with other field name */
    private String f228b;

    /* renamed from: c, reason: collision with other field name */
    private long f229c;

    /* renamed from: b, reason: collision with root package name */
    protected static final Map<String, cq> f45365b = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    protected static boolean f221a = false;

    public interface a {
        cu a(Context context, ct ctVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    public cu(Context context, ct ctVar, b bVar, String str) {
        this(context, ctVar, bVar, str, null, null);
    }

    private String f() {
        return "host_fallbacks";
    }

    private String g() {
        try {
            PackageInfo packageInfo = f45364a.getPackageManager().getPackageInfo(f45364a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public cq m5805a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return a(new URL(str).getHost(), true);
    }

    public cq b(String str) {
        return a(str, true);
    }

    public cq c(String str) {
        cr crVar;
        cq a11;
        synchronized (this.f226a) {
            m5809a();
            crVar = this.f226a.get(str);
        }
        if (crVar == null || (a11 = crVar.a()) == null) {
            return null;
        }
        return a11;
    }

    public cq d(String str) {
        cq cqVar;
        Map<String, cq> map = f45365b;
        synchronized (map) {
            cqVar = map.get(str);
        }
        return cqVar;
    }

    public cq e(String str) {
        if (System.currentTimeMillis() - this.f229c <= this.f222a * 60000) {
            return null;
        }
        this.f229c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        cq cqVar = a(arrayList).get(0);
        if (cqVar != null) {
            this.f222a = 0L;
            return cqVar;
        }
        long j11 = this.f222a;
        if (j11 >= 15) {
            return null;
        }
        this.f222a = j11 + 1;
        return null;
    }

    public cu(Context context, ct ctVar, b bVar, String str, String str2, String str3) {
        this.f226a = new HashMap();
        this.f225a = "0";
        this.f222a = 0L;
        this.f227b = 15L;
        this.f229c = 0L;
        this.f228b = "isp_prov_city_country_ip";
        this.f224a = bVar;
        this.f223a = ctVar == null ? new cv(this) : ctVar;
        this.f225a = str;
        f45366c = str2 == null ? context.getPackageName() : str2;
        f45367d = str3 == null ? g() : str3;
    }

    public cq a(String str, boolean z11) {
        cq e11;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        if (!this.f223a.a(str)) {
            return null;
        }
        cq c11 = c(str);
        return (c11 == null || !c11.b()) ? (z11 && bi.b(f45364a) && (e11 = e(str)) != null) ? e11 : new cw(this, str, c11) : c11;
    }

    public String b() {
        return "resolver.msg.xiaomi.net";
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f226a) {
            try {
                for (Map.Entry<String, cr> entry : this.f226a.entrySet()) {
                    sb2.append(entry.getKey());
                    sb2.append(":\n");
                    sb2.append(entry.getValue().toString());
                    sb2.append("\n");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb2.toString();
    }

    public String d() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        File file;
        try {
            file = new File(f45364a.getFilesDir(), f());
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
            fileInputStream = null;
        }
        if (!file.isFile()) {
            y.a((Closeable) null);
            y.a((Closeable) null);
            return null;
        }
        fileInputStream = new FileInputStream(file);
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
        try {
            String str = new String(h.a(m5804a(), y.a((InputStream) bufferedInputStream)), StandardCharsets.UTF_8);
            com.xiaomi.channel.commonutils.logger.b.b("load host fallbacks = " + str);
            return str;
        } catch (Throwable th4) {
            th = th4;
            try {
                com.xiaomi.channel.commonutils.logger.b.m5639a("load host exception " + th.getMessage());
                return null;
            } finally {
                y.a((Closeable) bufferedInputStream);
                y.a((Closeable) fileInputStream);
            }
        }
    }

    public String e() {
        if ("com.xiaomi.xmsf".equals(f45366c)) {
            return f45366c;
        }
        return f45366c + ":pushservice";
    }

    public static synchronized cu a() {
        cu cuVar;
        synchronized (cu.class) {
            cuVar = f220a;
            if (cuVar == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return cuVar;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5810b() {
        ArrayList<String> arrayList;
        synchronized (this.f226a) {
            try {
                m5809a();
                arrayList = new ArrayList<>(this.f226a.keySet());
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    cr crVar = this.f226a.get(arrayList.get(size));
                    if (crVar != null && crVar.a() != null) {
                        arrayList.remove(size);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList<cq> a11 = a(arrayList);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (a11.get(i11) != null) {
                a(arrayList.get(i11), a11.get(i11));
            }
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m5812c() {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        Exception e11;
        synchronized (this.f226a) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                String jSONObject = m5806a().toString();
                com.xiaomi.channel.commonutils.logger.b.b("persist host fallbacks = " + jSONObject);
                if (TextUtils.isEmpty(jSONObject)) {
                    fileOutputStream = null;
                } else {
                    fileOutputStream = f45364a.openFileOutput(f(), 0);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        try {
                            try {
                                bufferedOutputStream.write(h.b(m5804a(), jSONObject.getBytes(StandardCharsets.UTF_8)));
                                bufferedOutputStream.flush();
                                bufferedOutputStream2 = bufferedOutputStream;
                            } catch (Exception e12) {
                                e11 = e12;
                                com.xiaomi.channel.commonutils.logger.b.m5639a("persist bucket failure: " + e11.getMessage());
                                y.a(bufferedOutputStream);
                                y.a(fileOutputStream);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            y.a(bufferedOutputStream);
                            y.a(fileOutputStream);
                            throw th2;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        bufferedOutputStream = null;
                        e11 = e;
                        com.xiaomi.channel.commonutils.logger.b.m5639a("persist bucket failure: " + e11.getMessage());
                        y.a(bufferedOutputStream);
                        y.a(fileOutputStream);
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                        th2 = th;
                        y.a(bufferedOutputStream);
                        y.a(fileOutputStream);
                        throw th2;
                    }
                }
                y.a(bufferedOutputStream2);
            } catch (Exception e14) {
                e = e14;
                fileOutputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                bufferedOutputStream = null;
            }
            y.a(fileOutputStream);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m5813d() {
        String e11 = e();
        try {
            File file = new File(f45364a.getFilesDir(), e11);
            if (!file.exists()) {
                com.xiaomi.channel.commonutils.logger.b.b("Old host fallbacks file " + e11 + " does not exist.");
                return;
            }
            boolean delete = file.delete();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete old host fallbacks file ");
            sb2.append(e11);
            sb2.append(delete ? " successful." : " failed.");
            com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
        } catch (Exception e12) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Delete old host fallbacks file " + e11 + " error: " + e12.getMessage());
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    public void m5814e() {
        String next;
        synchronized (this.f226a) {
            try {
                Iterator<cr> it = this.f226a.values().iterator();
                while (it.hasNext()) {
                    it.next().a(true);
                }
                while (true) {
                    Iterator<String> it2 = this.f226a.keySet().iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        if (this.f226a.get(next).m5799a().isEmpty()) {
                            break;
                        }
                    }
                    this.f226a.remove(next);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m5803a() {
        NetworkInfo activeNetworkInfo;
        Context context = f45364a;
        if (context == null) {
            return "unknown";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI-UNKNOWN";
            }
            return activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5811b(String str) {
        synchronized (this.f226a) {
            try {
                this.f226a.clear();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("ver") != 2) {
                    throw new JSONException("Bad version");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        cr a11 = new cr().a(optJSONArray.getJSONObject(i11));
                        this.f226a.put(a11.m5798a(), a11);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                if (optJSONArray2 != null) {
                    for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i12);
                        String optString = jSONObject2.optString("host");
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                cq a12 = new cq(optString).a(jSONObject2);
                                f45365b.put(a12.f216b, a12);
                                com.xiaomi.channel.commonutils.logger.b.m5639a("load local reserved host for " + a12.f216b);
                            } catch (JSONException unused) {
                                com.xiaomi.channel.commonutils.logger.b.m5639a("parse reserved host fail.");
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i11 = 0; i11 < bytes.length; i11++) {
                byte b11 = bytes[i11];
                int i12 = b11 & 240;
                if (i12 != 240) {
                    bytes[i11] = (byte) (((b11 & 15) ^ ((byte) (((b11 >> 4) + length) & 15))) | i12);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public String a(ArrayList<String> arrayList, String str, String str2, boolean z11) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<bh> arrayList3 = new ArrayList();
        arrayList3.add(new bf("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new bf("conpt", a(bi.m5747a(f45364a))));
        }
        if (z11) {
            arrayList3.add(new bf("reserved", "1"));
        }
        arrayList3.add(new bf("uuid", str2));
        arrayList3.add(new bf("list", bo.a(arrayList, ",")));
        arrayList3.add(new bf("countrycode", com.xiaomi.push.service.a.a(f45364a).b()));
        arrayList3.add(new bf("push_sdk_vc", String.valueOf(BuildConfig.VERSION_CODE)));
        String b11 = b();
        cq c11 = c(b11);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", b11);
        if (c11 == null) {
            arrayList2.add(format);
            Map<String, cq> map = f45365b;
            synchronized (map) {
                try {
                    cq cqVar = map.get(b11);
                    if (cqVar != null) {
                        Iterator<String> it = cqVar.a(true).iterator();
                        while (it.hasNext()) {
                            arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                        }
                    }
                } finally {
                }
            }
        } else {
            arrayList2 = c11.a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e11 = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (bh bhVar : arrayList3) {
                buildUpon.appendQueryParameter(bhVar.a(), bhVar.b());
            }
            try {
                b bVar = this.f224a;
                return bVar == null ? bi.a(f45364a, new URL(buildUpon.toString())) : bVar.a(buildUpon.toString());
            } catch (IOException e12) {
                e11 = e12;
            }
        }
        if (e11 == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("network exception: " + e11.getMessage());
        throw e11;
    }

    private ArrayList<cq> a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        m5814e();
        synchronized (this.f226a) {
            try {
                m5809a();
                for (String str : this.f226a.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            } finally {
            }
        }
        Map<String, cq> map = f45365b;
        synchronized (map) {
            try {
                for (Object obj : map.values().toArray()) {
                    cq cqVar = (cq) obj;
                    if (!cqVar.b()) {
                        f45365b.remove(cqVar.f216b);
                    }
                }
            } finally {
            }
        }
        if (!arrayList.contains(b())) {
            arrayList.add(b());
        }
        ArrayList<cq> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(null);
        }
        try {
            String str2 = bi.e(f45364a) ? "wifi" : "wap";
            String a11 = a(arrayList, str2, this.f225a, true);
            if (!TextUtils.isEmpty(a11)) {
                JSONObject jSONObject3 = new JSONObject(a11);
                com.xiaomi.channel.commonutils.logger.b.b(a11);
                if ("OK".equalsIgnoreCase(jSONObject3.getString(ExifInterface.LATITUDE_SOUTH))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    String string5 = jSONObject4.getString(HwPayConstant.KEY_COUNTRY);
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        String str3 = arrayList.get(i12);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str3);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.m5639a("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            cq cqVar2 = new cq(str3);
                            int i13 = 0;
                            while (i13 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i13);
                                if (TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                } else {
                                    jSONObject2 = jSONObject5;
                                    cqVar2.a(new cz(string6, optJSONArray.length() - i13));
                                }
                                i13++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i12, cqVar2);
                            cqVar2.f45358g = string5;
                            cqVar2.f45354c = string;
                            cqVar2.f45356e = string3;
                            cqVar2.f45357f = string4;
                            cqVar2.f45355d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                cqVar2.a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                cqVar2.b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has(RemoteMessageConst.TTL)) {
                                cqVar2.a(jSONObject4.getInt(RemoteMessageConst.TTL) * 1000);
                            }
                            m5808a(cqVar2.a());
                        }
                        i12++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j11 = jSONObject4.has("reserved-ttl") ? jSONObject4.getInt("reserved-ttl") * 1000 : 604800000L;
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.m5639a("no bucket found for " + next);
                            } else {
                                cq cqVar3 = new cq(next);
                                cqVar3.a(j11);
                                for (int i14 = 0; i14 < optJSONArray2.length(); i14++) {
                                    String string7 = optJSONArray2.getString(i14);
                                    if (!TextUtils.isEmpty(string7)) {
                                        cqVar3.a(new cz(string7, optJSONArray2.length() - i14));
                                    }
                                }
                                Map<String, cq> map2 = f45365b;
                                synchronized (map2) {
                                    try {
                                        if (this.f223a.a(next)) {
                                            map2.put(next, cqVar3);
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("failed to get bucket " + e11.getMessage());
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            cq cqVar4 = arrayList2.get(i15);
            if (cqVar4 != null) {
                a(arrayList.get(i15), cqVar4);
            }
        }
        m5812c();
        return arrayList2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public JSONObject m5806a() {
        JSONObject jSONObject;
        synchronized (this.f226a) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("ver", 2);
                JSONArray jSONArray = new JSONArray();
                Iterator<cr> it = this.f226a.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().m5800a());
                }
                jSONObject.put("data", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator<cq> it2 = f45365b.values().iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().m5795a());
                }
                jSONObject.put("reserved", jSONArray2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObject;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5807a() {
        synchronized (this.f226a) {
            this.f226a.clear();
        }
    }

    public static synchronized void a(Context context, ct ctVar, b bVar, String str, String str2, String str3) {
        synchronized (cu.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                f45364a = applicationContext;
                if (applicationContext == null) {
                    f45364a = context;
                }
                if (f220a == null) {
                    a aVar = f219a;
                    if (aVar == null) {
                        f220a = new cu(context, ctVar, bVar, str, str2, str3);
                    } else {
                        f220a = aVar.a(context, ctVar, bVar, str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (cu.class) {
            f219a = aVar;
            f220a = null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5808a(String str) {
        this.f228b = str;
    }

    public void a(String str, cq cqVar) {
        if (TextUtils.isEmpty(str) || cqVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + j2.O + cqVar);
        }
        if (this.f223a.a(str)) {
            synchronized (this.f226a) {
                try {
                    m5809a();
                    if (this.f226a.containsKey(str)) {
                        this.f226a.get(str).a(cqVar);
                    } else {
                        cr crVar = new cr(str);
                        crVar.a(cqVar);
                        this.f226a.put(str, crVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void a(String str, String str2) {
        Map<String, cq> map = f45365b;
        cq cqVar = map.get(str);
        synchronized (map) {
            try {
                if (cqVar == null) {
                    cq cqVar2 = new cq(str);
                    cqVar2.a(604800000L);
                    cqVar2.m5796a(str2);
                    map.put(str, cqVar2);
                } else {
                    cqVar.m5796a(str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5809a() {
        synchronized (this.f226a) {
            try {
                if (!f221a) {
                    f221a = true;
                    this.f226a.clear();
                    try {
                        String d11 = d();
                        if (!TextUtils.isEmpty(d11)) {
                            m5811b(d11);
                            com.xiaomi.channel.commonutils.logger.b.b("loading the new hosts succeed");
                        }
                    } catch (Throwable th2) {
                        com.xiaomi.channel.commonutils.logger.b.m5639a("load bucket failure: " + th2.getMessage());
                    }
                    return false;
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private byte[] m5804a() {
        return bn.m5756a(f45364a.getPackageName() + "_key_salt");
    }
}
