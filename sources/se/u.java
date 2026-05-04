package se;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.activity.schedule_v2.module.SelectBookException;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.user_study_api.MergeState;
import com.baicizhan.online.user_study_api.UserSelectedBookInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.google.android.material.timepicker.TimeModel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.apache.thrift.TServiceClient;
import pg.x0;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nScheduleOperateModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleOperateModule.kt\ncom/baicizhan/main/activity/schedule_v2/module/ScheduleOperateModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u f88397a = new u();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f88398b = "ScheduleOperateModule";

    /* renamed from: c, reason: collision with root package name */
    public static final int f88399c = 0;

    public static final Void A(x00.l lVar, Object obj) {
        return (Void) lVar.invoke(obj);
    }

    public static final Integer C(BookRecord bookRecord, Context context, UserStudyApiService.Client client) {
        qb.c.i(f88398b, "reset_done_score_data " + bookRecord.bookId, new Object[0]);
        int reset_done_score_data = client.reset_done_score_data(bookRecord.bookId);
        qb.c.i(f88398b, "reset_done_score_data " + bookRecord.bookId + ", result" + reset_done_score_data, new Object[0]);
        i9.a.d(context, bookRecord.bookId, false);
        x.r().g0();
        LearnRecordManager.A().o();
        Thread.sleep(((long) bookRecord.wordCount) + 1000);
        f88397a.x(bookRecord.bookId);
        return Integer.valueOf(reset_done_score_data);
    }

    public static final Integer D(x00.l lVar, Object obj) {
        return (Integer) lVar.invoke(obj);
    }

    public static /* synthetic */ rx.c F(u uVar, Context context, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            i14 = -1;
        }
        return uVar.E(context, i11, i12, i13, i14);
    }

    public static final rx.c G(Integer num) {
        qb.c.i(f88398b, "upload success %d, start change book", num);
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study");
    }

    public static final rx.c H(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final UserSelectedBookInfo I(int i11, int i12, int i13, int i14, Context context, UserStudyApiService.Client client) {
        String str;
        String str2;
        try {
            ia.a.k(ia.a.f60459j, 0);
            qb.c.i(f88398b, "select book ! [bookId, dailyCount, reviewCount] %d , %d, %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            UserSelectedBookInfo select_book = client.select_book(i11, i12, i13, i14, 0);
            if (i14 != e.f.f19312d.a()) {
                qb.c.i(f88398b, "mode change", new Object[0]);
                ch.m.f8648a.c(com.baicizhan.main.activity.schedule_v2.mutimode.data.e.f19301b.a(i14));
            }
            BookListManager.getInstance().userRejectUpdate(false);
            ma.l.b(ma.t.f73003b, ma.a.f72754h, null);
            BookRecord bookById = BookListManager.getInstance().getBookById(i11);
            BookListManager.getInstance().addSelectedBook(context, i11, select_book);
            ScheduleRecord o11 = x.r().o();
            if (o11 == null) {
                o11 = new ScheduleRecord();
            }
            int i15 = o11.bookId;
            g0.m(select_book);
            int i16 = select_book.book_id;
            if (i15 != i16) {
                String str3 = "";
                if (bookById == null || (str = bookById.descImage) == null) {
                    str = "";
                }
                o11.descImage = str;
                if (bookById != null && (str2 = bookById.desc) != null) {
                    str3 = str2;
                }
                o11.desc = str3;
            }
            if (bookById != null) {
                o11.bookName = bookById.bookName;
            }
            o11.bookId = i16;
            o11.dailyCount = select_book.daily_plan_count;
            o11.reviewCount = select_book.review_plan_count;
            o11.isCurrentSelect = 1;
            o11.localSyncVer = 0L;
            i9.a.q(context, o11);
            if (bookById != null && select_book.getWord_fm_updated_at() != bookById.localRadioResVer) {
                TServiceClient c11 = com.baicizhan.client.business.thrift.c.b().c("/rpc/resource_api");
                g0.n(c11, "null cannot be cast to non-null type com.baicizhan.online.resource_api.ResourceService.Client");
                j9.a.m(context, i11, (ResourceService.Client) c11);
                bookById.localRadioResVer = bookById.remoteRadioResVer;
                i9.a.s(context, bookById, "localRadioResVer");
            }
            f88397a.x(select_book.book_id);
            x0.f80512a.f(select_book.book_id);
            UserRecord p11 = x.r().p();
            if (p11 != null && p11.getGameBeta() == 2) {
                int gameBeta = p11.getGameBeta();
                int i17 = select_book.game_mode;
                if (gameBeta != i17) {
                    p11.setGameBeta(i17);
                    i9.m.f(null, p11);
                }
            }
            return select_book;
        } catch (Throwable th2) {
            qb.c.c(f88398b, "selectBook failed. ", th2);
            throw new SelectBookException(th2);
        }
    }

    public static final UserSelectedBookInfo J(x00.l lVar, Object obj) {
        return (UserSelectedBookInfo) lVar.invoke(obj);
    }

    public static final Integer L(UserSelectedBookInfo userSelectedBookInfo) {
        g0.p(userSelectedBookInfo, "userSelectedBookInfo");
        x.r().f();
        x.r().h();
        x.r().g();
        return Integer.valueOf(userSelectedBookInfo.getNeed_merge_count());
    }

    public static final Integer M(x00.l lVar, Object obj) {
        return (Integer) lVar.invoke(obj);
    }

    public static /* synthetic */ rx.c p(u uVar, Context context, BookRecord bookRecord, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "";
        }
        return uVar.o(context, bookRecord, str);
    }

    public static /* synthetic */ rx.c r(u uVar, Context context, BookRecord bookRecord, int i11, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            i12 = -1;
        }
        return uVar.q(context, bookRecord, i11, i12);
    }

    public static final Integer s(UserSelectedBookInfo userSelectedBookInfo) {
        BookRecord bookById = BookListManager.getInstance().getBookById(userSelectedBookInfo.getBook_id());
        if (bookById != null) {
            if (bookById.bookId == x.r().l()) {
                bookById = null;
            }
            if (bookById != null) {
                x.r().f();
                x.r().h();
                x.r().g();
            }
        }
        return Integer.valueOf(userSelectedBookInfo.getNeed_merge_count());
    }

    public static final Integer t(x00.l lVar, Object obj) {
        return (Integer) lVar.invoke(obj);
    }

    public static final Integer v(BookRecord bookRecord, Context context, UserStudyApiService.Client client) {
        qb.c.i(f88398b, "delete_done_score_data " + bookRecord.bookId, new Object[0]);
        bookRecord.clearSelectedInfo();
        int delete_done_score_data = client.delete_done_score_data(bookRecord.bookId);
        if (delete_done_score_data == 0) {
            i9.a.d(context, bookRecord.bookId, true);
        }
        BookListManager.getInstance().removeSelectedBook(context, bookRecord.bookId);
        return Integer.valueOf(delete_done_score_data);
    }

    public static final Integer w(x00.l lVar, Object obj) {
        return (Integer) lVar.invoke(obj);
    }

    public static final Void z(MergeState mergeState) {
        return null;
    }

    @m80.k
    public final rx.c<Integer> B(@m80.k final Context context, @m80.k final BookRecord bookRecord) {
        g0.p(context, "context");
        g0.p(bookRecord, "bookRecord");
        rx.c b11 = com.baicizhan.client.business.thrift.p.b("/rpc/user_study");
        final x00.l lVar = new x00.l() { // from class: se.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer C;
                C = u.C(BookRecord.this, context, (UserStudyApiService.Client) obj);
                return C;
            }
        };
        rx.c<Integer> w52 = b11.c3(new wb0.p() { // from class: se.l
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer D;
                D = u.D(x00.l.this, obj);
                return D;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final rx.c<UserSelectedBookInfo> E(final Context context, final int i11, final int i12, final int i13, final int i14) {
        qb.c.i(f88398b, "bookId %d , dailyCount %d, reviewCount %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        rx.c<Integer> c02 = LearnRecordManager.A().c0(context);
        final x00.l lVar = new x00.l() { // from class: se.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c G;
                G = u.G((Integer) obj);
                return G;
            }
        };
        rx.c<R> b22 = c02.b2(new wb0.p() { // from class: se.i
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c H;
                H = u.H(x00.l.this, obj);
                return H;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: se.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                UserSelectedBookInfo I;
                I = u.I(i11, i12, i13, i14, context, (UserStudyApiService.Client) obj);
                return I;
            }
        };
        rx.c<UserSelectedBookInfo> w52 = b22.c3(new wb0.p() { // from class: se.k
            @Override // wb0.p
            public final Object call(Object obj) {
                UserSelectedBookInfo J;
                J = u.J(x00.l.this, obj);
                return J;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    @m80.k
    public final rx.c<Integer> K(@m80.l Context context, int i11, int i12, int i13) {
        rx.c F = F(this, context, i11, i12, i13, 0, 16, null);
        final x00.l lVar = new x00.l() { // from class: se.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer L;
                L = u.L((UserSelectedBookInfo) obj);
                return L;
            }
        };
        rx.c<Integer> c32 = F.c3(new wb0.p() { // from class: se.n
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer M;
                M = u.M(x00.l.this, obj);
                return M;
            }
        });
        g0.o(c32, "map(...)");
        return c32;
    }

    @m80.k
    public final rx.c<UserSelectedBookInfo> o(@m80.k Context context, @m80.k BookRecord bookRecord, @m80.k String topAllName) {
        g0.p(context, "context");
        g0.p(bookRecord, "bookRecord");
        g0.p(topAllName, "topAllName");
        return F(this, context, bookRecord.bookId, f.f88374a.g(bookRecord.bookId, topAllName), 0, 0, 16, null);
    }

    @m80.k
    public final rx.c<Integer> q(@m80.k Context context, @m80.k BookRecord bookRecord, int i11, int i12) {
        int i13;
        int i14;
        g0.p(context, "context");
        g0.p(bookRecord, "bookRecord");
        if (bookRecord.bookId == x.r().l() && g0.g(ch.m.f8648a.a(), e.a.f19304d)) {
            i14 = i11;
            i13 = i14;
        } else if (bookRecord.getRemainCountNotIncludeToday() > 0) {
            i14 = i11;
            i13 = 0;
        } else {
            i13 = i11;
            i14 = bookRecord.dailyCount;
        }
        rx.c<UserSelectedBookInfo> E = E(context, bookRecord.bookId, i14, i13, i12);
        final x00.l lVar = new x00.l() { // from class: se.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer s11;
                s11 = u.s((UserSelectedBookInfo) obj);
                return s11;
            }
        };
        rx.c c32 = E.c3(new wb0.p() { // from class: se.r
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer t11;
                t11 = u.t(x00.l.this, obj);
                return t11;
            }
        });
        g0.o(c32, "map(...)");
        return c32;
    }

    @m80.k
    public final rx.c<Integer> u(@m80.k final Context context, @m80.k final BookRecord bookRecord) {
        g0.p(context, "context");
        g0.p(bookRecord, "bookRecord");
        rx.c b11 = com.baicizhan.client.business.thrift.p.b("/rpc/user_study");
        final x00.l lVar = new x00.l() { // from class: se.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer v11;
                v11 = u.v(BookRecord.this, context, (UserStudyApiService.Client) obj);
                return v11;
            }
        };
        rx.c<Integer> w52 = b11.c3(new wb0.p() { // from class: se.p
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer w11;
                w11 = u.w(x00.l.this, obj);
                return w11;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final void x(int i11) {
        qb.c.i(f88398b, TimeModel.f32588i, Integer.valueOf(i11));
        pg.u0.f80487a.m().postValue(Integer.valueOf(i11));
        x.r().a(1);
    }

    @m80.k
    public final rx.c<Void> y(int i11) {
        rx.c<MergeState> mergeLearnRecord = BookListManager.getInstance().mergeLearnRecord(i11);
        final x00.l lVar = new x00.l() { // from class: se.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                Void z11;
                z11 = u.z((MergeState) obj);
                return z11;
            }
        };
        rx.c<Void> I3 = mergeLearnRecord.c3(new wb0.p() { // from class: se.t
            @Override // wb0.p
            public final Object call(Object obj) {
                Void A;
                A = u.A(x00.l.this, obj);
                return A;
            }
        }).H5(1).I3(tb0.a.a());
        g0.o(I3, "observeOn(...)");
        return I3;
    }
}
