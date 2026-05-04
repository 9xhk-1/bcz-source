package com.mob.commons.b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.mob.commons.b.g;
import com.mob.tools.utils.DeviceHelper;

/* loaded from: classes7.dex */
public class o extends g {
    public o(Context context) {
        super(context);
    }

    private void j() {
        try {
            Intent intent = new Intent();
            intent.setClassName(com.mob.commons.n.a("012%cfdbKk7dk)kg)cd_gLdkQk,efce"), com.mob.commons.n.a("033,cfdb:k7dkVkg7cd'gCdk%k[efcedkefShEcg*iZcdcf9h$dkfgefcegidcdg!hJcgCiUcdcfGh"));
            intent.setAction(com.mob.commons.n.a("032Fcfdb>k0dkebcbcjdkCkJefcedkcecfQcVcddbcjdkefMc4cecg4cBdkef+h2cgEi)cdcfNh"));
            intent.putExtra(com.mob.commons.n.a("025Vcfdb4kGdkebcbcjdkDkWefcedk6d.cecgceDkSdkLdIcieecjce@kh"), this.f40185b);
            intent.putExtra(com.mob.commons.n.a("0267cfdb%kSdkebcbcjdkOk%efcedk.dNcecgce!k+dkcgcbcjcdcjef=hc"), true);
            this.f40184a.startService(intent);
        } catch (Throwable th2) {
            c.a().a(th2);
        }
    }

    private boolean k() {
        try {
            DeviceHelper.getInstance(this.f40184a).getPackageInfo(com.mob.commons.n.a("012=cfdbFk7dkSkg;cd.g2dk0kUefce"), 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.mob.commons.b.g
    public Intent a() {
        j();
        Intent intent = new Intent();
        intent.setClassName(com.mob.commons.n.a("012=cfdbGk.dkJkgHcd+g*dkJk*efce"), com.mob.commons.n.a("033Bcfdb%k.dkTkgMcdRgEdk@kWefcedkefLh'cg.iIcdcfDhNdkfgefcedf4gRdg'h=cg?iIcdcf?h"));
        intent.setAction(com.mob.commons.n.a("033_cfdb.k9dkebcbcjdk>kBefcedkcecf2cRcddbcjdkebcdcj6gc4dbdkefDhTcg:iEcdcf!h"));
        intent.putExtra(com.mob.commons.n.a("025YcfdbZkAdkebcbcjdk9k@efcedk+d?cecgceQkEdk)d%cieecjceQkh"), this.f40185b);
        return intent;
    }

    @Override // com.mob.commons.b.g
    public g.c a(IBinder iBinder) {
        g.c cVar = new g.c();
        cVar.f40198b = a(com.mob.commons.n.a("004;dbcecd)g"), iBinder, com.mob.commons.n.a("026Dcfdb*kXdkebcbcjdkdccdebdkfgefcedf+g6dfcj:ch_cgegcecf%h"), 3, new String[0]);
        cVar.f40197a = k();
        return cVar;
    }
}
