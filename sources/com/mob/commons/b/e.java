package com.mob.commons.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static g f40162a;

    /* renamed from: com.mob.commons.b.e$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40163a;

        static {
            int[] iArr = new int[a.values().length];
            f40163a = iArr;
            try {
                iArr[a.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40163a[a.BLACKSHARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40163a[a.VIVO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40163a[a.HUA_WEI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40163a[a.OPPO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40163a[a.ONEPLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40163a[a.MOTO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40163a[a.LENOVO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40163a[a.ASUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40163a[a.SAMSUNG.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40163a[a.MEIZU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40163a[a.ALPS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40163a[a.NUBIA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40163a[a.ZTE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40163a[a.FERRMEOS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40163a[a.SSUI.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public enum a {
        UNSUPPORT(-1, com.mob.commons.i.a("009,fefmhife,ggEgefj:f")),
        HUA_WEI(0, com.mob.commons.i.a("006;jegggliniegi")),
        XIAOMI(1, com.mob.commons.i.a("006$jifgfhgeNnQfg")),
        VIVO(2, com.mob.commons.i.a("004l^fgClSge")),
        OPPO(3, com.mob.commons.i.a("004:geVgg!ge")),
        MOTO(4, com.mob.commons.i.a("008n.geLf=gefjgegffh")),
        LENOVO(5, com.mob.commons.i.a("006[gf^k:fmgeHlQge")),
        ASUS(6, com.mob.commons.i.a("004Jfhhifehi")),
        SAMSUNG(7, com.mob.commons.i.a("007Ohifh=n3hifefmhh")),
        MEIZU(8, com.mob.commons.i.a("005nk!fghnfe")),
        ALPS(9, com.mob.commons.i.a("004[fhgf]g@hi")),
        NUBIA(10, com.mob.commons.i.a("005Cfmfehefgfh")),
        ONEPLUS(11, com.mob.commons.i.a("007Jgefm5kgOgffehi")),
        BLACKSHARK(12, com.mob.commons.i.a("010Fhegffhfiflhi5e_fhfjfl")),
        ZTE(13, com.mob.commons.i.a("003!hnIfk")),
        FERRMEOS(14, com.mob.commons.i.a("008Ihjfj$kknk:gehi")),
        SSUI(15, com.mob.commons.i.a("0046hihifefg"));


        /* renamed from: r, reason: collision with root package name */
        private int f40182r;

        /* renamed from: s, reason: collision with root package name */
        private String f40183s;

        a(int i11, String str) {
            this.f40182r = i11;
            this.f40183s = str;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (e.class) {
            if (f40162a != null) {
                return;
            }
            String str = Build.MANUFACTURER;
            a a11 = a(str);
            if (a11 == a.UNSUPPORT) {
                c.a().a(str + " not support");
                return;
            }
            switch (AnonymousClass1.f40163a[a11.ordinal()]) {
                case 1:
                case 2:
                    f40162a = new n(context);
                    break;
                case 3:
                    f40162a = new m(context);
                    break;
                case 4:
                    f40162a = new f(context);
                    break;
                case 5:
                case 6:
                    f40162a = new k(context);
                    break;
                case 7:
                case 8:
                    f40162a = new i(context);
                    break;
                case 9:
                    f40162a = new com.mob.commons.b.a(context);
                    break;
                case 10:
                    f40162a = new l(context);
                    break;
                case 11:
                case 12:
                    f40162a = new h(context);
                    break;
                case 13:
                    f40162a = new j(context);
                    break;
                case 14:
                case 15:
                case 16:
                    f40162a = new o(context);
                    break;
            }
        }
    }

    public static boolean b(Context context) {
        a(context);
        g gVar = f40162a;
        if (gVar != null) {
            return gVar.h();
        }
        return false;
    }

    public static String c(Context context) {
        a(context);
        g gVar = f40162a;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public static String d(Context context) {
        a(context);
        g gVar = f40162a;
        if (gVar == null) {
            return null;
        }
        String e11 = gVar.e();
        if (TextUtils.isEmpty(e11)) {
            return null;
        }
        try {
            return Base64.encodeToString(Data.AES128Encode(Data.MD5(DeviceHelper.getInstance(MobSDK.getContext()).getManufacturer()), e11), 2);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return e11;
        }
    }

    public static String e(Context context) {
        a(context);
        g gVar = f40162a;
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    public static String f(Context context) {
        a(context);
        g gVar = f40162a;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public static String g(Context context) {
        a(context);
        g gVar = f40162a;
        if (gVar != null) {
            return gVar.g();
        }
        return null;
    }

    private static boolean b() {
        try {
            String b11 = b(com.mob.commons.i.a("015VfjgegnhihifefggnXg fjgeAjGfefiMf"));
            if (TextUtils.isEmpty(b11)) {
                return false;
            }
            return !b11.equalsIgnoreCase(com.mob.commons.i.a("007Cfefmflfmgehffm"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        try {
            Method declaredMethod = Class.forName(com.mob.commons.i.a("027(fhfmTjOfjgefgIjTgngehigngjfkhiKfknKiifjge,gk5fjKf>fg+k@hi")).getDeclaredMethod(com.mob.commons.i.a("003@hh^kf"), String.class);
            declaredMethod.setAccessible(true);
            return String.valueOf(declaredMethod.invoke(null, str));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static a a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (a aVar : a.values()) {
                if (aVar.f40183s.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
        }
        if (!a() && !b()) {
            return a.UNSUPPORT;
        }
        return a.ZTE;
    }

    private static boolean a() {
        try {
            String b11 = b(com.mob.commons.i.a("021DfjgegnhefefggfZjMgnhjfjRkknk@gngffhhe+k:gf"));
            if (TextUtils.isEmpty(b11)) {
                return false;
            }
            return b11.equalsIgnoreCase(com.mob.commons.i.a("008Jjfifieieijiehmgj"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
