package se;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookCategory;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.home.plan.allinone.c1;
import com.baicizhan.main.home.plan.allinone.e1;
import com.baicizhan.online.user_study_api.StudyHome;
import com.baicizhan.online.user_study_api.StudyHomeProgress;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import pg.l0;
import q9.x;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nScheduleInfoModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleInfoModule.kt\ncom/baicizhan/main/activity/schedule_v2/module/ScheduleInfoModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f88374a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final int f88375b = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f88376e = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f88377a;

        /* renamed from: b, reason: collision with root package name */
        public final int f88378b;

        /* renamed from: c, reason: collision with root package name */
        public final int f88379c;

        /* renamed from: d, reason: collision with root package name */
        public final int f88380d;

        public a(long j11, int i11, int i12, int i13) {
            this.f88377a = j11;
            this.f88378b = i11;
            this.f88379c = i12;
            this.f88380d = i13;
        }

        public static /* synthetic */ a f(a aVar, long j11, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j11 = aVar.f88377a;
            }
            long j12 = j11;
            if ((i14 & 2) != 0) {
                i11 = aVar.f88378b;
            }
            int i15 = i11;
            if ((i14 & 4) != 0) {
                i12 = aVar.f88379c;
            }
            int i16 = i12;
            if ((i14 & 8) != 0) {
                i13 = aVar.f88380d;
            }
            return aVar.e(j12, i15, i16, i13);
        }

        public final long a() {
            return this.f88377a;
        }

        public final int b() {
            return this.f88378b;
        }

        public final int c() {
            return this.f88379c;
        }

        public final int d() {
            return this.f88380d;
        }

        @m80.k
        public final a e(long j11, int i11, int i12, int i13) {
            return new a(j11, i11, i12, i13);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f88377a == aVar.f88377a && this.f88378b == aVar.f88378b && this.f88379c == aVar.f88379c && this.f88380d == aVar.f88380d;
        }

        public final int g() {
            return this.f88378b;
        }

        public final long h() {
            return this.f88377a;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f88377a) * 31) + Integer.hashCode(this.f88378b)) * 31) + Integer.hashCode(this.f88379c)) * 31) + Integer.hashCode(this.f88380d);
        }

        public final int i() {
            return this.f88379c;
        }

        public final int j() {
            return this.f88380d;
        }

        @m80.k
        public String toString() {
            return "BookInfo(finishDate=" + this.f88377a + ", everydayCost=" + this.f88378b + ", planCount=" + this.f88379c + ", remainDay=" + this.f88380d + pn.j.f81007d;
        }
    }

    public static final List k(BookListManager bookListManager, Integer num) {
        Object obj;
        List<BookRecord> selectedBooks = bookListManager.getSelectedBooks();
        g0.m(selectedBooks);
        Iterator<T> it = selectedBooks.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((BookRecord) obj).bookId == x.r().l()) {
                break;
            }
        }
        BookRecord bookRecord = (BookRecord) obj;
        if (bookRecord != null) {
            selectedBooks.remove(bookRecord);
            selectedBooks.add(0, bookRecord);
        }
        return selectedBooks;
    }

    public static final List l(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public final a c(StudyHomeProgress studyHomeProgress, int i11) {
        int computeDaysByWords = BookRecord.computeDaysByWords(studyHomeProgress.total - studyHomeProgress.learned, i11);
        return new a(e(computeDaysByWords), h(i11, true), i11, computeDaysByWords);
    }

    @m80.k
    public final a d(int i11, int i12, @m80.k e1 homeRepo, @m80.k com.baicizhan.main.home.experiment.repo.s gameHomeRepo) {
        StudyHome d11;
        g0.p(homeRepo, "homeRepo");
        g0.p(gameHomeRepo, "gameHomeRepo");
        ScheduleRecord o11 = x.r().o();
        if (o11 == null || i11 != o11.bookId) {
            return m(i11, i12);
        }
        StudyHomeProgress studyHomeProgress = null;
        if ((ch.m.f8648a.a() instanceof e.a ? this : null) != null) {
            c1 value = homeRepo.c().getValue();
            c1.a aVar = value instanceof c1.a ? (c1.a) value : null;
            if (aVar != null && (d11 = aVar.d()) != null) {
                studyHomeProgress = d11.progress;
            }
        }
        com.baicizhan.main.home.experiment.repo.m value2 = gameHomeRepo.q().getValue();
        return (!q0.f21394a.b() || value2 == null) ? studyHomeProgress != null ? c(studyHomeProgress, i12) : f(i12) : i(value2.h(), value2.f(), i12);
    }

    public final long e(int i11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        if (i11 > 0) {
            calendar.add(6, i11 - 1);
        }
        return calendar.getTimeInMillis();
    }

    public final a f(int i11) {
        int c11;
        BookRecord k11;
        BookRecord k12 = x.r().k();
        if (k12.isFinished()) {
            pg.g0 d11 = new l0().d();
            c11 = d11.c() - d11.p();
        } else {
            c11 = k12.getRemainCount();
        }
        int computeDaysByWords = BookRecord.computeDaysByWords(c11, i11);
        f fVar = f88374a;
        long e11 = fVar.e(computeDaysByWords);
        x r11 = x.r();
        return new a(e11, fVar.h(i11, !((r11 == null || (k11 = r11.k()) == null) ? false : k11.isFinished())), i11, computeDaysByWords);
    }

    public final int g(int i11, @m80.k String topCategoryName) {
        g0.p(topCategoryName, "topCategoryName");
        BookCategory categoryByBookId = BookListManager.getInstance().getCategoryByBookId(i11);
        String categoryTagName = categoryByBookId == null ? "" : categoryByBookId.getCategoryTagName();
        return ((categoryTagName == null || !k0.n3(categoryTagName, "小学", false, 2, null)) && !k0.n3(topCategoryName, "小学", false, 2, null)) ? 10 : 5;
    }

    public final int h(int i11, boolean z11) {
        return (int) (((i11 * (z11 ? 25.0d : 3.2d)) + 59) / 60);
    }

    public final a i(int i11, int i12, int i13) {
        int computeDaysByWords = BookRecord.computeDaysByWords(i11 - i12, i13);
        return new a(e(computeDaysByWords), h(i13, true), i13, computeDaysByWords);
    }

    @m80.k
    public final rx.c<List<BookRecord>> j(@m80.k Context context) {
        rx.c<Integer> load;
        g0.p(context, "context");
        final BookListManager bookListManager = BookListManager.getInstance();
        if (bookListManager.isReady()) {
            List<BookRecord> selectedBooks = bookListManager.getSelectedBooks();
            g0.o(selectedBooks, "getSelectedBooks(...)");
            if (!selectedBooks.isEmpty()) {
                load = bookListManager.loadSelectBook();
                final x00.l lVar = new x00.l() { // from class: se.d
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        List k11;
                        k11 = f.k(BookListManager.this, (Integer) obj);
                        return k11;
                    }
                };
                rx.c c32 = load.c3(new wb0.p() { // from class: se.e
                    @Override // wb0.p
                    public final Object call(Object obj) {
                        List l11;
                        l11 = f.l(x00.l.this, obj);
                        return l11;
                    }
                });
                g0.o(c32, "let(...)");
                return c32;
            }
        }
        load = bookListManager.load(context);
        final x00.l lVar2 = new x00.l() { // from class: se.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                List k11;
                k11 = f.k(BookListManager.this, (Integer) obj);
                return k11;
            }
        };
        rx.c c322 = load.c3(new wb0.p() { // from class: se.e
            @Override // wb0.p
            public final Object call(Object obj) {
                List l11;
                l11 = f.l(x00.l.this, obj);
                return l11;
            }
        });
        g0.o(c322, "let(...)");
        return c322;
    }

    public final a m(int i11, int i12) {
        int computeDaysByWords = BookRecord.computeDaysByWords(BookListManager.getInstance().getBookById(i11).wordCount, i12);
        f fVar = f88374a;
        return new a(fVar.e(computeDaysByWords), fVar.h(i12, true), i12, computeDaysByWords);
    }
}
