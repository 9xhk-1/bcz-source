package pg;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.managers.booklist.BookUpdateInfos;
import com.baicizhan.main.home.plan.module.UpgradeType;
import com.baicizhan.online.user_study_api.MergeState;
import java.util.ArrayList;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nUpgradeBookModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeBookModule.kt\ncom/baicizhan/main/home/plan/module/UpgradeBookModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f80463b = "LearnInfoTAG.UpgradeBookModule";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e1 f80462a = new e1();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f80464c = yz.e0.c(new x00.a() { // from class: pg.z0
        @Override // x00.a
        public final Object invoke() {
            Application f11;
            f11 = e1.f();
            return f11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final int f80465d = 8;

    public static final Application f() {
        return pb.a.a();
    }

    public static final rx.c h(BookUpdateInfos.BookUpdateInfo bookUpdateInfo, BookRecord bookRecord, Integer num) {
        BookListManager bookListManager = BookListManager.getInstance();
        int i11 = bookUpdateInfo.newBookId;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(bookRecord.bookId));
        g2 g2Var = g2.f100423a;
        return bookListManager.mergeLearnRecord(i11, arrayList);
    }

    public static final rx.c i(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final Integer j(MergeState mergeState) {
        return Integer.valueOf(mergeState.percentage);
    }

    public static final Integer k(x00.l lVar, Object obj) {
        return (Integer) lVar.invoke(obj);
    }

    @m80.k
    public final rx.c<Integer> g() {
        rx.c<Integer> cVar;
        final BookRecord k11 = q9.x.r().k();
        if (k11 != null) {
            final BookUpdateInfos.BookUpdateInfo bookUpdateInfo = BookListManager.getInstance().getBookUpdateInfo(k11.bookId);
            if (bookUpdateInfo != null) {
                rx.c<Integer> K = se.u.f88397a.K(f80462a.l(), bookUpdateInfo.newBookId, k11.dailyCount, k11.reviewCount);
                final x00.l lVar = new x00.l() { // from class: pg.a1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        rx.c h11;
                        h11 = e1.h(BookUpdateInfos.BookUpdateInfo.this, k11, (Integer) obj);
                        return h11;
                    }
                };
                rx.c<R> b22 = K.b2(new wb0.p() { // from class: pg.b1
                    @Override // wb0.p
                    public final Object call(Object obj) {
                        rx.c i11;
                        i11 = e1.i(x00.l.this, obj);
                        return i11;
                    }
                });
                final x00.l lVar2 = new x00.l() { // from class: pg.c1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        Integer j11;
                        j11 = e1.j((MergeState) obj);
                        return j11;
                    }
                };
                cVar = b22.c3(new wb0.p() { // from class: pg.d1
                    @Override // wb0.p
                    public final Object call(Object obj) {
                        Integer k12;
                        k12 = e1.k(x00.l.this, obj);
                        return k12;
                    }
                });
            } else {
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        rx.c<Integer> T1 = rx.c.T1(new RuntimeException("null"));
        kotlin.jvm.internal.g0.o(T1, "error(...)");
        return T1;
    }

    public final Application l() {
        return (Application) f80464c.getValue();
    }

    @m80.k
    public final BookUpdateInfos.BookUpdateInfo m() {
        BookUpdateInfos.BookUpdateInfo bookUpdateInfo = BookListManager.getInstance().getBookUpdateInfo(q9.x.r().l());
        kotlin.jvm.internal.g0.o(bookUpdateInfo, "getBookUpdateInfo(...)");
        return bookUpdateInfo;
    }

    @m80.k
    public final UpgradeType n() {
        BookListManager bookListManager = BookListManager.getInstance();
        BookUpdateInfos.BookUpdateInfo bookUpdateInfo = bookListManager.getBookUpdateInfo(q9.x.r().l());
        if (bookUpdateInfo != null) {
            qb.c.i(f80463b, "%s", bookUpdateInfo.toString());
            UpgradeType upgradeType = bookUpdateInfo.isForceUpdate ? UpgradeType.FORCE_UPGRADE : bookListManager.hasReject() ? UpgradeType.NORMAL_UPGRADE_USER_REJECT : UpgradeType.NORMAL_UPGRADE;
            if (upgradeType != null) {
                return upgradeType;
            }
        }
        return UpgradeType.NO_NEED;
    }

    public final void o() {
        BookListManager.getInstance().userRejectUpdate(true);
    }
}
