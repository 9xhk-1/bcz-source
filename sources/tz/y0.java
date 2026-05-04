package tz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class y0 {

    /* renamed from: n, reason: collision with root package name */
    public static y0 f91412n;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f91413o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f91414a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f91415b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91416c;

    /* renamed from: d, reason: collision with root package name */
    public final String f91417d = Build.VERSION.RELEASE;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f91418e;

    /* renamed from: f, reason: collision with root package name */
    public final String f91419f;

    /* renamed from: g, reason: collision with root package name */
    public final String f91420g;

    /* renamed from: h, reason: collision with root package name */
    public final String f91421h;

    /* renamed from: i, reason: collision with root package name */
    public final String f91422i;

    /* renamed from: j, reason: collision with root package name */
    public final String f91423j;

    /* renamed from: k, reason: collision with root package name */
    public String f91424k;

    /* renamed from: l, reason: collision with root package name */
    public String f91425l;

    /* renamed from: m, reason: collision with root package name */
    public String f91426m;

    @SuppressLint({"HardwareIds"})
    public y0(Context context, v0 v0Var) {
        Integer num;
        this.f91414a = context;
        this.f91415b = v0Var;
        this.f91416c = context.getPackageName();
        String str = null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            num = Integer.valueOf(packageInfo.versionCode);
            try {
                str = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            num = null;
        }
        this.f91418e = num;
        this.f91419f = str;
        this.f91420g = Build.MODEL;
        this.f91421h = Build.ID;
        this.f91422i = Build.DISPLAY;
        this.f91423j = Build.BRAND;
    }

    public static y0 b(Context context, v0 v0Var) {
        synchronized (f91413o) {
            try {
                if (f91412n == null) {
                    f91412n = new y0(context.getApplicationContext(), v0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f91412n;
    }

    @SuppressLint({"HardwareIds"})
    public String a() {
        String str = this.f91424k;
        if (str != null) {
            return str;
        }
        String a11 = this.f91415b.a("FM_android_id");
        if (TextUtils.isEmpty(a11)) {
            try {
                a11 = Settings.Secure.getString(this.f91414a.getContentResolver(), "android_id");
            } catch (Exception unused) {
            }
        }
        if (e(a11)) {
            this.f91415b.d("FM_android_id", i0.f91302m);
            a11 = null;
        } else {
            this.f91415b.d("FM_android_id", a11);
        }
        this.f91424k = a11;
        return this.f91424k;
    }

    public final boolean c(String str) {
        return TextUtils.isEmpty(str) || str.equalsIgnoreCase(i0.f91302m);
    }

    @SuppressLint({"HardwareIds"})
    public String d() {
        String str = this.f91425l;
        if (str != null) {
            return str;
        }
        String a11 = this.f91415b.a("FM_serial_number");
        if (TextUtils.isEmpty(a11)) {
            if (Build.VERSION.SDK_INT < 26) {
                a11 = Build.SERIAL;
            } else {
                try {
                    a11 = Build.getSerial();
                } catch (SecurityException | Exception unused) {
                }
            }
        }
        if (c(a11)) {
            this.f91415b.d("FM_serial_number", i0.f91302m);
            a11 = null;
        } else {
            this.f91415b.d("FM_serial_number", a11);
        }
        this.f91425l = a11;
        return this.f91425l;
    }

    public final boolean e(String str) {
        return TextUtils.isEmpty(str) || str.equalsIgnoreCase(i0.f91298i) || str.equalsIgnoreCase(i0.f91302m);
    }

    public String f() {
        String str = this.f91426m;
        if (str != null) {
            return str;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(this.f91414a.getPackageManager().getPackageInfo(this.f91414a.getPackageName(), 64).signatures[0].toByteArray());
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                String upperCase = Integer.toHexString(b11 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase);
                sb2.append(":");
            }
            String sb3 = sb2.toString();
            this.f91426m = sb3.substring(0, sb3.length() - 1);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | Exception unused) {
        }
        return this.f91426m;
    }

    public String g() {
        return this.f91416c;
    }

    public String h() {
        return this.f91417d;
    }

    public Integer i() {
        return this.f91418e;
    }

    public String j() {
        return this.f91420g;
    }

    public String k() {
        return this.f91421h;
    }

    public String l() {
        return this.f91422i;
    }

    public String m() {
        return this.f91423j;
    }

    public String n() {
        Throwable th2;
        FileChannel fileChannel;
        try {
            fileChannel = new RandomAccessFile(this.f91414a.getApplicationInfo().sourceDir, en.r.f50027a).getChannel();
            try {
                q c11 = r.c(fileChannel);
                if (c11 == null) {
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                    }
                    return "";
                }
                byte[] d11 = c11.d();
                if (d11 == null) {
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return "";
                }
                String str = new String(Base64.encode(d11, 10), "UTF-8");
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                return str;
            } catch (FileNotFoundException unused4) {
                if (fileChannel == null) {
                    return null;
                }
                try {
                    fileChannel.close();
                    return null;
                } catch (IOException unused5) {
                    return null;
                }
            } catch (IOException unused6) {
                if (fileChannel == null) {
                    return null;
                }
                fileChannel.close();
                return null;
            } catch (Exception unused7) {
                if (fileChannel == null) {
                    return null;
                }
                fileChannel.close();
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused8) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused9) {
            fileChannel = null;
        } catch (IOException unused10) {
            fileChannel = null;
        } catch (Exception unused11) {
            fileChannel = null;
        } catch (Throwable th4) {
            th2 = th4;
            fileChannel = null;
        }
    }

    public List o() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (!nextElement.isLoopback() && nextElement.isUp()) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            arrayList.add(inetAddresses.nextElement().getHostAddress());
                        }
                    }
                }
            }
        } catch (SocketException | Exception unused) {
        }
        return arrayList;
    }
}
