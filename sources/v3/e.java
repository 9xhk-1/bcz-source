package v3;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import c4.j;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l.c;
import l.g;
import m.n;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nISqlDriverFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ISqlDriverFactory.android.kt\ncom/baicizhan/app/biz/base/database/ISqlDriverFactoryImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,41:1\n41#2,6:42\n48#2:49\n142#3:48\n127#4:50\n*S KotlinDebug\n*F\n+ 1 ISqlDriverFactory.android.kt\ncom/baicizhan/app/biz/base/database/ISqlDriverFactoryImpl\n*L\n18#1:42,6\n18#1:49\n18#1:48\n18#1:50\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements d, j {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.d
    @l
    public Object a(@k g<c.a<g2>> gVar, @k String str, @k j00.c<? super l.e> cVar) {
        z6.b.j(z6.b.f101032b, "ISqlDriverFactoryImpl", "createSqlDriver " + str + ' ' + Thread.currentThread().getId() + ' ' + Looper.getMainLooper().getThread().getId(), null, 4, null);
        return new n(new f(gVar), (Context) (this instanceof pa0.c ? ((pa0.c) this).getScope() : r().P().h()).i(o0.d(Application.class), null, null), str, null, null, 0, false, null, R.styleable.Theme_drawable_walk_sound4, null);
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
