package com.baicizhan.main.home.plan.allinone;

import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.main.home.plan.allinone.b;
import com.baicizhan.online.user_study_api.HomeButton;
import com.baicizhan.online.user_study_api.StudyHome;
import com.baicizhan.online.user_study_api.StudyHomeProgress;
import com.baicizhan.online.user_study_api.StudyHomeToday;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b1 {
    @m80.k
    public static final b a(@m80.k StudyHome studyHome, @m80.l th.a aVar, @m80.k BookRecord schedule, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(studyHome, "<this>");
        kotlin.jvm.internal.g0.p(schedule, "schedule");
        String bookName = schedule.bookName;
        kotlin.jvm.internal.g0.o(bookName, "bookName");
        String descImage = schedule.descImage;
        kotlin.jvm.internal.g0.o(descImage, "descImage");
        int i11 = schedule.bookId;
        StudyHomeProgress studyHomeProgress = studyHome.progress;
        p1 p1Var = new p1(bookName, descImage, i11, studyHomeProgress.learned, studyHomeProgress.mastered, studyHomeProgress.total, z12);
        StudyHomeToday studyHomeToday = studyHome.today_progresss;
        if (studyHomeToday.book_finished) {
            return new b.a(p1Var, studyHome.today_progresss.finished);
        }
        if (studyHomeToday.learning_finished_today) {
            if (z11) {
                HomeButton review_button = studyHome.review_button;
                kotlin.jvm.internal.g0.o(review_button, "review_button");
                StudyHomeToday studyHomeToday2 = studyHome.today_progresss;
                return new b.h(p1Var, b(review_button, studyHomeToday2.reviewed, studyHomeToday2.review_plan), aVar, studyHome.today_progresss.finished);
            }
            HomeButton review_button2 = studyHome.review_button;
            kotlin.jvm.internal.g0.o(review_button2, "review_button");
            StudyHomeToday studyHomeToday3 = studyHome.today_progresss;
            return new b.c(p1Var, b(review_button2, studyHomeToday3.reviewed, studyHomeToday3.review_plan), aVar, studyHome.today_progresss.finished);
        }
        if (studyHomeToday.learning_finished) {
            HomeButton review_button3 = studyHome.review_button;
            kotlin.jvm.internal.g0.o(review_button3, "review_button");
            StudyHomeToday studyHomeToday4 = studyHome.today_progresss;
            return new b.h(p1Var, b(review_button3, studyHomeToday4.reviewed, studyHomeToday4.review_plan), aVar, studyHome.today_progresss.finished);
        }
        HomeButton learning_button = studyHome.learning_button;
        kotlin.jvm.internal.g0.o(learning_button, "learning_button");
        StudyHomeToday studyHomeToday5 = studyHome.today_progresss;
        m1 b11 = b(learning_button, studyHomeToday5.learned, studyHomeToday5.learning_plan);
        HomeButton review_button4 = studyHome.review_button;
        kotlin.jvm.internal.g0.o(review_button4, "review_button");
        StudyHomeToday studyHomeToday6 = studyHome.today_progresss;
        return new b.e(p1Var, b11, b(review_button4, studyHomeToday6.reviewed, studyHomeToday6.review_plan), aVar, studyHome.today_progresss.finished);
    }

    @m80.k
    public static final m1 b(@m80.k HomeButton homeButton, int i11, int i12) {
        kotlin.jvm.internal.g0.p(homeButton, "<this>");
        int i13 = homeButton.type;
        String link = homeButton.link;
        kotlin.jvm.internal.g0.o(link, "link");
        return new m1(i11, i12, new a(i13, link, homeButton.msg));
    }
}
