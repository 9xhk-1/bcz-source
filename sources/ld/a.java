package ld;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.baicizhan.online.user_study_api.CalendarDailyWord;
import java.util.Calendar;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    @BindingAdapter({"activeCalender"})
    public static void a(CalendarView calendarView, Calendar data) {
        calendarView.e(data);
    }

    @BindingAdapter({"caclenderData"})
    public static void b(CalendarView calendarView, b data) {
        Calendar calendar;
        List<Calendar> list;
        List<Calendar> list2;
        if (data == null || (calendar = data.f71091c) == null || (list = data.f71089a) == null || (list2 = data.f71090b) == null) {
            return;
        }
        calendarView.m(list, list2, calendar, null);
    }

    @BindingAdapter({"dailyWordList"})
    public static void c(RecyclerView recyclerView, List<CalendarDailyWord> data) {
        ((com.baicizhan.main.activity.calendar.a) recyclerView.getAdapter()).i(data);
    }
}
