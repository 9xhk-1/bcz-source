package com.mob.commons.b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.mob.commons.b.g;

/* loaded from: classes7.dex */
public class f extends g {
    public f(Context context) {
        super(context);
    }

    @Override // com.mob.commons.b.g
    public Intent a() {
        Intent intent = new Intent(com.mob.commons.j.a("036;beca*jLcjbacaFfObcdecjcaAcg6biVfgh;bcbePgOcjdieeeacdcedgcfbbcfeaebecceedea"));
        intent.setPackage(com.mob.commons.j.a("015Rbeca0j>cj.aPbabddbZg$bccj8aZdbbc)f"));
        return intent;
    }

    @Override // com.mob.commons.b.g
    public synchronized String b() {
        return i();
    }

    @Override // com.mob.commons.b.g
    public g.c a(IBinder iBinder) {
        String a11 = com.mob.commons.j.a("053Hbeca6j=cjbacaVf]bcdecjca0cgWbiXfghEbcbeAg!cjbdbcWfEcbcjdi+cg[bidgEghVbcbeHg9ce'fg:bi;b%bcdfbcXgYbfcf3gGbf[h,bcbeRg");
        g.c cVar = new g.c();
        cVar.f40198b = a(com.mob.commons.j.a("004>cabdbcFf"), iBinder, a11, 1, new String[0]);
        a(com.mob.commons.j.a("024Jbcdecibc^j;bcMb-ch@f4cgbfbdbebhbcbiddeabibddacbKgf"), iBinder, a11, 2);
        cVar.f40197a = !TextUtils.isEmpty(cVar.f40198b);
        return cVar;
    }
}
