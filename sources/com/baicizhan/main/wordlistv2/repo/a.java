package com.baicizhan.main.wordlistv2.repo;

import com.baicizhan.main.wordlistv2.c1;
import com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord;
import com.baicizhan.online.user_study_api.WordListItem;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/main/wordlistv2/repo/ConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes5.dex */
public final class a {
    @m80.k
    public static final c1 a(@m80.k WordListResourceRecord record, @m80.k WordListItem state, boolean z11) {
        g0.p(record, "record");
        g0.p(state, "state");
        int topicId = record.getTopicId();
        String word = record.getWord();
        String meanCn = record.getMeanCn();
        String d11 = m9.c.d(record.getAccentUsaAudioUri());
        g0.o(d11, "getResourceUrl(...)");
        int i11 = state.mastered;
        long j11 = state.modify_time;
        boolean z12 = state.cut;
        Integer valueOf = Integer.valueOf(state.next_review_day);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return new c1(topicId, word, meanCn, d11, i11, j11, z12, valueOf != null ? b(String.valueOf(valueOf.intValue())) : 0, z11, state.status, false, false, 3072, null);
    }

    public static final int b(@m80.k String dateString) {
        g0.p(dateString, "dateString");
        try {
            Date parse = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(dateString);
            g0.m(parse);
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.clear(13);
            calendar.clear(14);
            return (int) TimeUnit.DAYS.convert(parse.getTime() - calendar.getTime().getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            qb.c.c("daysBetweenToday", "", e11);
            return 0;
        }
    }
}
