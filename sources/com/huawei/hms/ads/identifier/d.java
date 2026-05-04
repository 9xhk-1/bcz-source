package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f35342a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f35343b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private static SoftReference<byte[]> f35344c;

    /* renamed from: com.huawei.hms.ads.identifier.d$1, reason: invalid class name */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f35345a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35346b;

        public AnonymousClass1(a aVar, String str) {
            this.f35345a = aVar;
            this.f35346b = str;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Long f35347a = Long.valueOf(com.igexin.push.config.c.f37553l);

        /* renamed from: h, reason: collision with root package name */
        private static final byte[] f35348h = new byte[0];

        /* renamed from: i, reason: collision with root package name */
        private static volatile a f35349i;

        /* renamed from: b, reason: collision with root package name */
        private SharedPreferences f35350b;

        /* renamed from: c, reason: collision with root package name */
        private SharedPreferences f35351c;

        /* renamed from: d, reason: collision with root package name */
        private SharedPreferences f35352d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f35353e = new byte[0];

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f35354f = new byte[0];

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f35355g = new byte[0];

        /* renamed from: j, reason: collision with root package name */
        private Context f35356j;

        private a(Context context) {
            this.f35350b = null;
            this.f35351c = null;
            this.f35352d = null;
            try {
                this.f35356j = context.getApplicationContext();
                Context a11 = e.a(context);
                this.f35350b = a11.getSharedPreferences("identifier_sp_story_book_file", 4);
                this.f35351c = a11.getSharedPreferences("identifier_hiad_sp_bed_rock_file", 4);
                this.f35352d = a11.getSharedPreferences("identifier_hiad_sp_red_stone_file", 4);
            } catch (Throwable th2) {
                Log.w("Aes128", "get SharedPreference error: " + th2.getClass().getSimpleName());
            }
        }

        public static a a(Context context) {
            a aVar;
            if (f35349i != null) {
                return f35349i;
            }
            synchronized (f35348h) {
                try {
                    if (f35349i == null) {
                        f35349i = new a(context);
                    }
                    aVar = f35349i;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return aVar;
        }

        public void b() {
            synchronized (this.f35355g) {
                try {
                    SharedPreferences sharedPreferences = this.f35350b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putLong("read_first_chapter_time", System.currentTimeMillis()).apply();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c(String str) {
            synchronized (this.f35355g) {
                try {
                    SharedPreferences sharedPreferences = this.f35350b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("catch_a_cat", str).commit();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void d() {
            synchronized (this.f35355g) {
                try {
                    SharedPreferences sharedPreferences = this.f35350b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putBoolean("has_read_first_chapter", true).apply();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean e() {
            synchronized (this.f35355g) {
                try {
                    SharedPreferences sharedPreferences = this.f35350b;
                    if (sharedPreferences == null) {
                        return false;
                    }
                    return sharedPreferences.getBoolean("has_read_first_chapter", false);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public String f() {
            synchronized (this.f35353e) {
                try {
                    SharedPreferences sharedPreferences = this.f35351c;
                    if (sharedPreferences == null) {
                        return null;
                    }
                    return sharedPreferences.getString("get_a_book", null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public String g() {
            synchronized (this.f35355g) {
                try {
                    SharedPreferences sharedPreferences = this.f35350b;
                    if (sharedPreferences == null) {
                        return null;
                    }
                    String string = sharedPreferences.getString("catch_a_cat", null);
                    if (string == null) {
                        string = d.a(d.a());
                        c(string);
                    }
                    return string;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public String h() {
            String string;
            synchronized (this.f35355g) {
                string = this.f35350b.getString("read_second_chapter", "");
            }
            return string;
        }

        public String a() {
            String string;
            synchronized (this.f35354f) {
                try {
                    SharedPreferences sharedPreferences = this.f35352d;
                    if (sharedPreferences == null) {
                        string = "";
                    } else {
                        string = sharedPreferences.getString("read_first_chapter", "");
                        if (!TextUtils.isEmpty(string)) {
                            string = d.a(string, d.a(this.f35356j));
                        }
                    }
                } finally {
                }
            }
            return string;
        }

        public void b(String str) {
            synchronized (this.f35353e) {
                try {
                    SharedPreferences sharedPreferences = this.f35351c;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("get_a_book", str).commit();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean c() {
            boolean z11;
            synchronized (this.f35355g) {
                try {
                    SharedPreferences sharedPreferences = this.f35350b;
                    z11 = false;
                    if (sharedPreferences != null) {
                        long j11 = sharedPreferences.getLong("read_first_chapter_time", -1L);
                        if (j11 >= 0 && j11 + f35347a.longValue() > System.currentTimeMillis()) {
                            z11 = true;
                        }
                    }
                } finally {
                }
            }
            return z11;
        }

        public void d(String str) {
            synchronized (this.f35355g) {
                this.f35350b.edit().putString("read_second_chapter", str).apply();
            }
        }

        public void a(String str) {
            synchronized (this.f35354f) {
                try {
                    if (this.f35352d != null) {
                        byte[] a11 = d.a(this.f35356j);
                        this.f35352d.edit().putString("read_first_chapter", d.b(str, a11)).apply();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static native String a(Context context, a aVar);

    public static native String a(String str, String str2);

    public static native String a(String str, byte[] bArr);

    public static native String a(byte[] bArr);

    public static native byte[] a();

    public static native byte[] a(int i11);

    public static native byte[] a(Context context);

    private static native byte[] a(Context context, String str);

    public static native byte[] a(String str);

    private static native byte[] a(String str, String str2, String str3);

    private static native byte[] a(String str, byte[] bArr, byte[] bArr2);

    private static native byte[] a(byte[] bArr, byte[] bArr2);

    public static native byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] a(char[] cArr, byte[] bArr);

    private static native String b(int i11);

    private static native String b(Context context);

    public static native String b(String str, byte[] bArr);

    private static native boolean b(byte[] bArr);

    public static native byte[] b();

    public static native byte[] b(String str);

    private static native String c(String str);

    private static native String c(String str, byte[] bArr);

    private static native SecureRandom c();

    private static native boolean c(byte[] bArr);

    private static native byte[] c(Context context);

    private static native String d(String str);

    private static native String d(String str, byte[] bArr);

    private static native AlgorithmParameterSpec d(byte[] bArr);

    private static native boolean d();

    private static native byte[] d(Context context);

    private static native byte[] e(Context context);

    private static native String f(Context context);
}
