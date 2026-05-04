package e9;

import com.baicizhan.client.business.dataset.models.ScheduleRecord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {
    public static a a() {
        try {
            ScheduleRecord h11 = i9.a.h(pb.a.a());
            if (h11 == null) {
                return null;
            }
            a aVar = new a();
            aVar.b(h11.bookId);
            return aVar;
        } catch (Exception e11) {
            qb.c.p("", "get book from db error", e11);
            return null;
        }
    }
}
