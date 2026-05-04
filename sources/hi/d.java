package hi;

import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f59342a = "FinishReporter";

    public static /* synthetic */ Object a(int i11, UserStudyApiService.Client client) {
        try {
            client.report_finish_book(i11);
            qb.c.i(f59342a, "report_finish_book %d", Integer.valueOf(i11));
            return null;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public static void d(final int bookId) {
        p.a(new l("/rpc/user_study").c(4).b(3000).d(5000)).w5(bc0.c.e()).c3(new wb0.p() { // from class: hi.a
            @Override // wb0.p
            public final Object call(Object obj) {
                return d.a(bookId, (UserStudyApiService.Client) obj);
            }
        }).u5(new wb0.b() { // from class: hi.b
            @Override // wb0.b
            public final void call(Object obj) {
                d.c(obj);
            }
        }, new wb0.b() { // from class: hi.c
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(d.f59342a, "", (Throwable) obj);
            }
        });
    }

    public static void e() {
        x r11 = x.r();
        BookRecord k11 = r11.k();
        if (k11 == null) {
            qb.c.d(f59342a, "book == null", new Object[0]);
            return;
        }
        if (e.d() && r11.A() <= LearnRecordManager.A().y() && LearnRecordManager.A().G() <= 0) {
            d(k11.bookId);
            qb.c.i(f59342a, "report for cake", new Object[0]);
            return;
        }
        ad.a s11 = r11.s();
        if (s11 == null) {
            qb.c.d(f59342a, "lm == null", new Object[0]);
            return;
        }
        ad.c u11 = s11.u();
        if (u11 == null) {
            qb.c.d(f59342a, "sequenceStrategy = null", new Object[0]);
            return;
        }
        int E = LearnRecordManager.A().E();
        int k12 = u11.k();
        u11.o();
        int a11 = u11.a();
        if (E > 0 || k12 > 0 || a11 > 0) {
            return;
        }
        d(k11.bookId);
        qb.c.i(f59342a, "report for normal user", new Object[0]);
    }

    public static /* synthetic */ void c(Object obj) {
    }
}
