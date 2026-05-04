package dg;

import android.content.Context;
import i9.f;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dg.a$a, reason: collision with other inner class name */
    public class C0568a extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends bp.a<List<Integer>> {
    }

    public static void a(Context context) {
        f.b(context, f.V);
    }

    public static void b(Context context, int bookId) {
        f.a(context, f.h(f.V, Integer.toString(bookId)));
    }

    public static void c(Context context, int bookId, List<Integer> dates) {
        f.n(context, f.h(f.V, Integer.toString(bookId)), new com.google.gson.d().A(dates, new b().getType()), false);
    }

    public static List<Integer> d(Context context, List<Integer> dates) {
        ArrayList arrayList = new ArrayList(dates.size());
        Calendar calendar = Calendar.getInstance(context.getResources().getConfiguration().locale);
        Calendar calendar2 = Calendar.getInstance(context.getResources().getConfiguration().locale);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        for (Integer num : dates) {
            calendar.setTimeInMillis(num.intValue() * 1000);
            if (calendar2.get(1) - calendar.get(1) < 2) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    public static List<Calendar> e(Context context, List<Integer> secondList) {
        ArrayList arrayList = new ArrayList(secondList.size());
        Iterator<Integer> it = secondList.iterator();
        while (it.hasNext()) {
            Calendar calendar = Calendar.getInstance(context.getResources().getConfiguration().locale);
            calendar.setTimeInMillis(it.next().intValue() * 1000);
            arrayList.add(calendar);
        }
        return arrayList;
    }

    public static List<Integer> f(Context context, int bookId, List<Integer> dates) {
        List<Integer> arrayList = dates == null ? new ArrayList<>(0) : d(context, dates);
        c(context, bookId, arrayList);
        return arrayList;
    }

    public static List<Integer> g(Context context, int bookId) {
        return (List) new com.google.gson.d().o(f.g(context, f.h(f.V, Integer.toString(bookId)), false), new C0568a().getType());
    }

    public static List<Integer> h(Context context, int bookId, int date) {
        List g11 = g(context, bookId);
        if (g11 == null) {
            g11 = new ArrayList(1);
            g11.add(Integer.valueOf(date));
        } else {
            Iterator it = g11.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == date) {
                    return g11;
                }
            }
            g11.add(Integer.valueOf(date));
        }
        List<Integer> d11 = d(context, g11);
        c(context, bookId, d11);
        return d11;
    }
}
