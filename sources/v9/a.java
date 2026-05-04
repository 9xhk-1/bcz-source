package v9;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.managers.experience.data.db.EXPDb;
import javax.inject.Singleton;
import kotlin.jvm.internal.g0;
import m80.k;
import nu.h;
import nu.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@pu.e({fv.a.class})
@h
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f93677a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f93678b = 0;

    @i
    @k
    public final w9.a a(@k EXPDb db2) {
        g0.p(db2, "db");
        return db2.g();
    }

    @Singleton
    @i
    @k
    public final EXPDb b(@cv.b @k Context app2) {
        g0.p(app2, "app");
        return EXPDb.f16443a.a(app2);
    }

    @i
    @k
    public final w9.k c(@k EXPDb db2) {
        g0.p(db2, "db");
        return db2.h();
    }

    @i
    @k
    public final wc.a d(@k EXPDb db2) {
        g0.p(db2, "db");
        return db2.i();
    }
}
