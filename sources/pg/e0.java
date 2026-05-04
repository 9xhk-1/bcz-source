package pg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class e0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f80461a = 0;

    @Override // pg.g0
    @m80.k
    public String b() {
        String str;
        ScheduleRecord o11 = q9.x.r().o();
        return (o11 == null || (str = o11.descImage) == null) ? "" : str;
    }

    @Override // pg.g0
    public int j() {
        return q9.x.r().A();
    }

    @Override // pg.g0
    @m80.k
    public String l() {
        String str;
        ScheduleRecord o11 = q9.x.r().o();
        return (o11 == null || (str = o11.descImage) == null) ? "" : str;
    }

    @Override // pg.g0
    @m80.k
    public String o() {
        String str;
        ScheduleRecord o11 = q9.x.r().o();
        return (o11 == null || (str = o11.bookName) == null) ? "" : str;
    }
}
