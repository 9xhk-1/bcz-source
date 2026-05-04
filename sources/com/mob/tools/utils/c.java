package com.mob.tools.utils;

import android.os.Build;
import android.text.TextUtils;
import com.mob.commons.o;
import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f41460a;

    /* renamed from: b, reason: collision with root package name */
    private String f41461b;

    /* renamed from: com.mob.tools.utils.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41462a;

        static {
            int[] iArr = new int[a.values().length];
            f41462a = iArr;
            try {
                iArr[a.MIUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41462a[a.EMUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41462a[a.AMIGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41462a[a.FLYME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41462a[a.LENOVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41462a[a.ONEUI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41462a[a.COLOR_OS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41462a[a.FUNTOUCH_OS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41462a[a.EUI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41462a[a.SENSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41462a[a.GOOGLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41462a[a.SMARTISAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41462a[a.ONEPLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41462a[a.YUNOS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41462a[a.QIHOO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41462a[a.NUBIA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41462a[a.LGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public enum a {
        MIUI(o.a("006Qdldedfec[l=de")),
        EMUI(o.a("006cYdcdffdSi de")),
        FLYME(o.a("005li+defldc")),
        ONEUI(o.a("007[fgdfNl!fgdcdkff")),
        COLOR_OS(o.a("004Jec;ee<ec")),
        FUNTOUCH_OS(o.a("004jAde[jPec")),
        EUI(o.a("0041ed8idj")),
        SENSE(o.a("003cdLdg")),
        GOOGLE(o.a("006Affececffed^i")),
        LENOVO(o.a("006^edYi>dkecNjAec")),
        SMARTISAN(o.a("006HdgNc1dcdeflde")),
        ONEPLUS(o.a("007PecdkQie<eddcfg")),
        YUNOS(o.a("005Qdidcdkecfg")),
        QIHOO(o.a("005k:de.c^ecec")),
        NUBIA(o.a("005?dkdcfcdedf")),
        LGE(o.a("002Gedff")),
        AMIGO(o.a("005[hfdedkedde")),
        OTHER("");


        /* renamed from: s, reason: collision with root package name */
        private String f41482s;

        a(String str) {
            this.f41482s = str;
        }

        public String a() {
            return this.f41482s;
        }
    }

    private c() {
    }

    public static c a() {
        if (f41460a == null) {
            synchronized (c.class) {
                try {
                    if (f41460a == null) {
                        f41460a = new c();
                    }
                } finally {
                }
            }
        }
        return f41460a;
    }

    private a c() {
        if (!TextUtils.isEmpty(a("ro.miui.ui.version.code")) || !TextUtils.isEmpty(a(o.a("023Rdhecel_lIdedcdeeldcdeel]ji<dhfgdeecdkeldkdf_li"))) || !TextUtils.isEmpty(a("ro.miui.internal.storage"))) {
            return a.MIUI;
        }
        if (!TextUtils.isEmpty(a(o.a("021*dhecelfcdcdeed$hQel[ji1dhfgdeecdkel.ilFdcde"))) || !TextUtils.isEmpty(a("ro.build.hw_emui_api_level")) || !TextUtils.isEmpty(a("ro.confg.hw_systemversion"))) {
            return a.EMUI;
        }
        if (!TextUtils.isEmpty(a(o.a("026eiUdhfgdefg9dXelfgdifgeldcfgKi>elfheddi*li?eldedgecdk"))) || !TextUtils.isEmpty(a(o.a("0261dhecel;li7defldcelfgOid>dcLe>fddefldfdhXh4elfheddiAli"))) || !TextUtils.isEmpty(a(o.a("018'dhecelfheddi3liJelEe<dcfceddefgYcih")))) {
            return a.FLYME;
        }
        if (!TextUtils.isEmpty(a(o.a("024'dgecVlEelfgdfSl+fgdcdkffelfg,ei)ffel!hKdefgdffcedEi"))) || !TextUtils.isEmpty(a("init.svc.health-hal-2-1-samsung"))) {
            return a.ONEUI;
        }
        if (!TextUtils.isEmpty(a(o.a("024'dhecelfcdcdeed+h^elOjiDdhfgdeecdkelec9ee.ecdhec=l")))) {
            return a.COLOR_OS;
        }
        if (!TextUtils.isEmpty(a(o.a("027Tdhecel)j1de[j_ecelecfgelfcdcdeed6h7el>hKdefgHe;eddfdielde?h"))) || !TextUtils.isEmpty(a(o.a("018$dhecelLjQde_jBecelecfgel;ji4dhfgdeecdk")))) {
            return a.FUNTOUCH_OS;
        }
        if (!TextUtils.isEmpty(a(o.a("023@dheceled-idj@eldh6iVed]iAdffg$i8el6ji5dhfgdeecdk")))) {
            return a.EUI;
        }
        if (!TextUtils.isEmpty(a(o.a("022Sdhecelfcdcdeed=h)elfgIiWdkfgSi$el<ji[dhfgdeecdk")))) {
            return a.SENSE;
        }
        if (o.a("014Jdfdk8hUdhecdeUh)hiffececffedJi").equals(a(o.a("026Cdheceldgec@l1elffececffedZi:eldgeddeViZdkJdDde1h-fcdffg;i")))) {
            return a.GOOGLE;
        }
        if (!TextUtils.isEmpty(a(o.a("020*dhecelfgPl9dfdh5dTdefgdfdkel'jiIdhfgdeecdk")))) {
            return a.SMARTISAN;
        }
        if (!TextUtils.isEmpty(a(o.a("014Pdheceldhec1l>el;jiZdhfgdeecdk")))) {
            return a.ONEPLUS;
        }
        if (!TextUtils.isEmpty(a(o.a("020Fdheceldg'd@dfeldidcdkecfgelBjiIdhfgdeecdk")))) {
            return a.YUNOS;
        }
        if (!TextUtils.isEmpty(a(o.a("0186dhecelfcdcdeedGhBeldcde$ji5dhfgdeecdk")))) {
            return a.QIHOO;
        }
        if (!TextUtils.isEmpty(a(o.a("023>dhecelfcdcdeed5h?eldkdcfcdedfeldhec*lFeldgecGhi"))) || !TextUtils.isEmpty(a(o.a("015Jdhecelfcdcdeed.h9eldhec$l5elde%h")))) {
            return a.NUBIA;
        }
        if (!TextUtils.isEmpty(a(o.a("0217fgdifgeledff7iJeledff>lhl%dd8jiNdhfgdeecdk")))) {
            return a.LGE;
        }
        if (!TextUtils.isEmpty(a(o.a("019,dhecelfcdcdeed@h0elQhZdefg;eNeddfdieldeNh"))) && a(o.a("019Adhecelfcdcdeed!h7elJhWdefg>e6eddfdieldeHh")).matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return a.AMIGO;
        }
        for (a aVar : a.values()) {
            if (aVar.a().equalsIgnoreCase(d())) {
                return aVar;
            }
        }
        return a.OTHER;
    }

    private String d() {
        if (TextUtils.isEmpty(this.f41461b)) {
            this.f41461b = Build.MANUFACTURER;
        }
        return this.f41461b;
    }

    public String b() {
        try {
            return a(c());
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return null;
        }
    }

    private String a(a aVar) {
        String a11;
        switch (AnonymousClass1.f41462a[aVar.ordinal()]) {
            case 1:
                a11 = a(o.a("023Rdhecel]lCdedcdeeldcdeel-jiPdhfgdeecdkeldkdfVli"));
                break;
            case 2:
                a11 = a(o.a("021OdhecelfcdcdeedRh@elEjiGdhfgdeecdkel-ilKdcde"));
                break;
            case 3:
            case 4:
                a11 = a(o.a("019GdhecelfcdcdeedDhVelNh;defg]eEeddfdielde.h"));
                break;
            case 5:
            case 6:
                a11 = a(o.a("028Ddhecelfcdcdeed9h.el0ji!dhfgdeecdkeldedkdgdh0iliBdk$d dfed"));
                break;
            case 7:
                a11 = a(o.a("024_dhecelfcdcdeed(h.el2jiSdhfgdeecdkelec*eeUecdhec1l"));
                break;
            case 8:
                a11 = a(o.a("027Mdhecel$j<de3jBecelecfgelfcdcdeedMhJelJhXdefg_e7eddfdielde)h"));
                if (TextUtils.isEmpty(a11)) {
                    a11 = a(o.a("018Rdhecel3jAde1jYecelecfgelTji<dhfgdeecdk"));
                    break;
                }
                break;
            case 9:
                a11 = a(o.a("023^dheceled.idjKeldh<i]ed8i=dffgNiTelRji$dhfgdeecdk"));
                break;
            case 10:
                a11 = a(o.a("022Zdhecelfcdcdeed,h%elfgEi8dkfgEi@elVjiDdhfgdeecdk"));
                break;
            case 11:
                a11 = a(o.a("024GdhecelfcdcdeedYhBel1ji-dhfgdeecdkeldh%i>edTi;dffgIi"));
                break;
            case 12:
                a11 = a(o.a("020;dhecelfg^l6dfdhRdJdefgdfdkel8jiDdhfgdeecdk"));
                break;
            case 13:
                a11 = a(o.a("014Kdheceldhec*lZel@jiDdhfgdeecdk"));
                break;
            case 14:
                a11 = a(o.a("020ZdheceldgAd+dfeldidcdkecfgel[ji.dhfgdeecdk"));
                break;
            case 15:
                a11 = a(o.a("018YdhecelfcdcdeedVh+eldcde.ji[dhfgdeecdk"));
                break;
            case 16:
                a11 = a(o.a("023YdhecelfcdcdeedFhIeldkdcfcdedfeldhec^l0eldgec!hi"));
                if (TextUtils.isEmpty(a11)) {
                    a11 = a(o.a("015[dhecelfcdcdeed=hReldhecTlRelde3h"));
                    break;
                }
                break;
            case 17:
                a11 = a(o.a("021Dfgdifgeledff<i.eledff:lhlGdd;jiFdhfgdeecdk"));
                break;
            default:
                a11 = a(o.a("019Odhecelfcdcdeed7hPel[h[defgNe1eddfdieldeGh"));
                break;
        }
        return TextUtils.isEmpty(a11) ? a(o.a("019Cdhecelfcdcdeed%hWel+h9defg*e]eddfdieldeOh")) : a11;
    }

    private String a(String str) {
        try {
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(o.a("027QdfdkZh?dhecdePh^elecfgelehdifgVdil4ggdhec4ei0dhWd8deUiEfg")), o.a("003 ff,id"), str);
            if (invokeStaticMethod != null) {
                return String.valueOf(invokeStaticMethod);
            }
            return "";
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }
}
