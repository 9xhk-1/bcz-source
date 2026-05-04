package com.mob.commons.b;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.mob.commons.b.g;

/* loaded from: classes7.dex */
public class j extends g {
    public j(Context context) {
        super(context);
    }

    private String a(String str, String str2) {
        Bundle b11 = b(str, str2);
        if (a(b11)) {
            return b11.getString(com.mob.commons.o.a("002Ade-h"));
        }
        if (b11 != null) {
            return b11.getString(com.mob.commons.o.a("007li[fgfgdfff5i"));
        }
        return null;
    }

    private Bundle b(String str, String str2) {
        Bundle bundle = null;
        try {
            ContentProviderClient acquireUnstableContentProviderClient = this.f40184a.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(com.mob.commons.o.a("036DdgecdkHdiLdkKdfggUdgdkeldkdcfcdedfelde8hi5dk?dBde*dDdiVg=de1hi;dk'd[deTd$di")));
            bundle = acquireUnstableContentProviderClient.call(str, str2, null);
            acquireUnstableContentProviderClient.close();
            return bundle;
        } catch (Throwable th2) {
            c.a().a(th2);
            return bundle;
        }
    }

    private boolean j() {
        Bundle b11 = b(com.mob.commons.o.a("0093defgehdcGeeXecdhSd"), null);
        if (a(b11)) {
            return b11.getBoolean(com.mob.commons.o.a("009!defgfgdcUeeWecdh=d"), true);
        }
        return false;
    }

    @Override // com.mob.commons.b.g
    public g.c c() {
        g.c cVar = new g.c();
        cVar.f40197a = j();
        cVar.f40199c = a(com.mob.commons.o.a("007Uff(id!ejejegfi"), this.f40185b);
        cVar.f40198b = a(com.mob.commons.o.a("007)ff_id7fkejegfi"), (String) null);
        cVar.f40201e = a(com.mob.commons.o.a("007Vff;idMgeejegfi"), this.f40185b);
        return cVar;
    }

    private boolean a(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.getInt(com.mob.commons.o.a("0049dgecLhi"), -1) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
