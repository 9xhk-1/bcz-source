package com.mob.commons.b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.mob.commons.b.g;

/* loaded from: classes7.dex */
public class i extends g {
    public i(Context context) {
        super(context);
    }

    @Override // com.mob.commons.b.g
    public Intent a() {
        Intent intent = new Intent();
        intent.setClassName(com.mob.commons.i.a("023HfigeAn6gnhnfefggnGjklAfgfi;kTfg)j)hi.k2fjLlEfgfi3k"), com.mob.commons.i.a("039Nfige0n_gnhnfefggnLjkl*fgfi5k:fg'jWhiYk1fj8l)fgfi?kCgnhk6klDfgfi:kUfgEjRgj!k;fjAl-fgfi?k"));
        return intent;
    }

    @Override // com.mob.commons.b.g
    public long d() {
        return 3000L;
    }

    @Override // com.mob.commons.b.g
    public g.c a(IBinder iBinder) {
        String a11 = com.mob.commons.i.a("042LfigeFn0gnhnfefggnSjkl:fgfi kDfgAjQhi@k-fj5lYfgfi1k_gngihk)klYfgfi k$fgAjLgifm]fk8fjhjfhfiMk");
        g.c cVar = new g.c();
        cVar.f40198b = a(com.mob.commons.i.a("004Vgefhfg%j"), iBinder, a11, 1, new String[0]);
        cVar.f40201e = a(com.mob.commons.i.a("004lQfhfgXj"), iBinder, a11, 4, this.f40185b);
        cVar.f40200d = a(com.mob.commons.i.a("0041fe?jNfg)j"), iBinder, a11, 2, new String[0]);
        cVar.f40199c = a(com.mob.commons.i.a("0045fhfhfg4j"), iBinder, a11, 5, this.f40185b);
        cVar.f40197a = a(com.mob.commons.i.a("0097hife>gg=gefj8fkj"), iBinder, a11, 3) != 0;
        return cVar;
    }
}
