package com.mob.commons.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.mob.commons.b.g;
import com.mob.tools.utils.DeviceHelper;
import java.security.MessageDigest;

/* loaded from: classes7.dex */
public class k extends g {

    /* renamed from: c, reason: collision with root package name */
    private String f40212c;

    public k(Context context) {
        super(context);
    }

    @Override // com.mob.commons.b.g
    public Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(com.mob.commons.a.l.a("017)ehfd1mCfmMdj!ejQeEeg,f,fmfdUfj;elefTi"), com.mob.commons.a.l.a("033Aehfd@m)fmUdj2ejDe>eg:fLfmfd1fjWelefDiYfmfhKij6el^eAefgiejfiGj_eiZk*efeh,j")));
        intent.setAction(com.mob.commons.a.l.a("0402egeh1e:effdelfmehfdXmUfm%dj*ej_e,eg f9fmfdSfj<elef)iXfmglhhhdfgeefhgjeefihdhehffhhghd"));
        return intent;
    }

    @Override // com.mob.commons.b.g
    public synchronized boolean h() {
        long longVersionCode;
        boolean z11 = false;
        try {
            PackageInfo packageInfo = DeviceHelper.getInstance(this.f40184a).getPackageInfo(com.mob.commons.a.l.a("017IehfdImMfm2dj:ej5eJeg2fLfmfd$fj.elefLi"), 0);
            if (Build.VERSION.SDK_INT < 28) {
                if (packageInfo != null && packageInfo.versionCode >= 1) {
                    z11 = true;
                }
                return z11;
            }
            if (packageInfo != null) {
                longVersionCode = packageInfo.getLongVersionCode();
                if (longVersionCode >= 1) {
                    z11 = true;
                }
            }
            return z11;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.mob.commons.b.g
    public g.c a(IBinder iBinder) {
        g.c cVar = new g.c();
        cVar.f40199c = a(iBinder, com.mob.commons.a.l.a("004Afkfffhgj"));
        cVar.f40198b = a(iBinder, com.mob.commons.a.l.a("004@glfffhgj"));
        cVar.f40201e = a(iBinder, com.mob.commons.a.l.a("004 gjfffhgj"));
        return cVar;
    }

    private final String a(IBinder iBinder, String str) {
        if (TextUtils.isEmpty(this.f40185b)) {
            this.f40185b = this.f40184a.getPackageName();
        }
        if (TextUtils.isEmpty(this.f40212c)) {
            try {
                Signature[] signatureArr = DeviceHelper.getInstance(this.f40184a).getPackageInfo(this.f40185b, 64).signatures;
                if (signatureArr != null && signatureArr.length > 0) {
                    byte[] byteArray = signatureArr[0].toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance(com.mob.commons.a.l.a("004%fiidfkhl"));
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b11 : digest) {
                            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                        }
                        this.f40212c = sb2.toString();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return a(str, iBinder, com.mob.commons.a.l.a("025AehfdZmTfm0dj.ejDe6eg4f'fmfd1fjOelefNi8fmfhglIfj@elfhgj"), 1, this.f40185b, this.f40212c, str);
    }
}
