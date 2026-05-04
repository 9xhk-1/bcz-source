package i9;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.OfflineStateRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.UpdateZpkMd5;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.PathUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: i9.a$a, reason: collision with other inner class name */
    public class C0697a extends bp.a<Map<Integer, UpdateZpkMd5>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends bp.a<Map<Integer, UpdateZpkMd5>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends bp.a<Set<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends bp.a<Set<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends bp.a<List<Integer>> {
    }

    public static void a(Context context, int bookId) {
        Type type = new f().getType();
        List list = (List) i9.f.e(context, i9.f.f60380k, type, false);
        if (list == null) {
            list = Collections.singletonList(Integer.valueOf(bookId));
            i9.f.l(context, i9.f.f60380k, list, type, false);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() == bookId) {
                return;
            }
        }
        list.add(Integer.valueOf(bookId));
        i9.f.l(context, i9.f.f60380k, list, type, false);
    }

    public static void b(Context context) {
        i9.f.b(context, "user");
        m.a(context);
        context.getContentResolver().delete(a.y.f16334b, null, null);
        j.k("current_book_id", 0);
        context.getContentResolver().delete(a.z.f16349b, null, null);
        xb.j.t(PathUtil.getBaicizhanFile("roadmap"), false);
        List<String> m11 = k9.a.m(k9.c.j(a.c.f16130e, "SELECT name FROM sqlite_master WHERE type=?", "table").d(context), String.class);
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>(m11.size());
        for (String str : m11) {
            if (!str.equals("android_metadata")) {
                arrayList.add(ContentProviderOperation.newDelete(com.baicizhan.client.business.dataset.provider.a.d(a.c.f16130e, str)).build());
            }
        }
        try {
            context.getContentResolver().applyBatch(com.baicizhan.client.business.dataset.provider.a.f16088b, arrayList);
        } catch (OperationApplicationException | RemoteException e11) {
            qb.c.c("baicizhandb", "", e11);
        }
        context.getContentResolver().delete(a.l.f16234b, null, null);
        ia.a.k(ia.a.f60457h, 0);
        context.getContentResolver().delete(a.b.f16104b, null, null);
        i9.f.a(context, i9.f.f60364c);
        i9.f.a(context, i9.f.f60366d);
    }

    public static void c(Context context, int bookId) {
        context.getContentResolver().delete(a.l.f16234b, "book_id = " + bookId, null);
    }

    public static void d(Context context, int bookId, boolean includeSchedule) {
        if (includeSchedule) {
            context.getContentResolver().delete(a.y.f16334b, "book_id = " + bookId, null);
            j.k("current_book_id", 0);
        }
        context.getContentResolver().delete(a.j.a(bookId), null, null);
        context.getContentResolver().delete(a.k.a(bookId), null, null);
        c(context, bookId);
    }

    public static List<BookRecord> e(Context context) {
        List<BookRecord> n11 = k9.a.n(k9.c.i(a.z.f16349b).d(context), BookRecord.class, BookRecord.COLUMN_MAP);
        Iterator<BookRecord> it = n11.iterator();
        while (it.hasNext()) {
            it.next().dailyCountFix();
        }
        return n11;
    }

    public static List<Integer> f(Context context) {
        return (List) i9.f.e(context, i9.f.f60380k, new e().getType(), false);
    }

    public static BookRecord g(Context context, int bookId) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = a.z.f16349b;
        contentResolver.delete(uri, "book_id=?", new String[]{"0"});
        BookRecord bookRecord = (BookRecord) k9.a.q(k9.c.i(uri).m("book_id = " + bookId, new String[0]).d(context), BookRecord.class, BookRecord.COLUMN_MAP);
        if (bookRecord != null) {
            bookRecord.dailyCountFix();
        }
        return bookRecord;
    }

    public static ScheduleRecord h(Context context) {
        return (ScheduleRecord) k9.a.q(k9.c.i(a.y.f16334b).m("is_current_select_book=?", "1").d(context), ScheduleRecord.class, ScheduleRecord.COLUMN_MAP);
    }

    public static Set<Integer> i(Context context, int bookId) {
        try {
            Type type = new c().getType();
            return (Set) new com.google.gson.d().o(i9.f.g(context, i9.f.h(i9.f.K, Integer.toString(bookId)), false), type);
        } catch (Exception unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static OfflineStateRecord j(Context context, int id2) {
        return (OfflineStateRecord) k9.a.q(k9.c.i(a.l.f16234b).m("book_id = " + id2, new String[0]).d(context), OfflineStateRecord.class, OfflineStateRecord.COLUMN_MAP);
    }

    public static ScheduleRecord k(Context context, int bookId) {
        return (ScheduleRecord) k9.a.q(k9.c.i(a.y.f16334b).m("book_id=" + bookId, new String[0]).d(context), ScheduleRecord.class, ScheduleRecord.COLUMN_MAP);
    }

    public static Map<Integer, UpdateZpkMd5> l(Context context, int bookId) {
        try {
            Type type = new C0697a().getType();
            Map<Integer, UpdateZpkMd5> map = (Map) new com.google.gson.d().o(i9.f.g(context, i9.f.h(i9.f.J, Integer.toString(bookId)), false), type);
            if (map != null) {
                for (Integer num : map.keySet()) {
                    if (num == null || map.get(num) == null || TextUtils.isEmpty(map.get(num).updateFlagMD5)) {
                        map.remove(num);
                    }
                }
            }
            return map;
        } catch (Exception unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static void m(Context context, Collection<BookRecord> bookList) {
        try {
            context.getContentResolver().bulkInsert(a.z.f16349b, k9.a.b(bookList, BookRecord.class, BookRecord.COLUMN_MAP, null));
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static void n(Context context, BookRecord bookRecord) {
        if (bookRecord == null || bookRecord.bookId > 0) {
            try {
                context.getContentResolver().insert(a.z.f16349b, k9.a.f(bookRecord, BookRecord.class, BookRecord.COLUMN_MAP, null));
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
            }
        }
    }

    public static void o(Context context, int bookId, Set<Integer> topics) {
        try {
            i9.f.n(context, i9.f.h(i9.f.K, Integer.toString(bookId)), new com.google.gson.d().A(topics, new d().getType()), false);
        } catch (Exception e11) {
            qb.c.c("error", "", e11);
        }
    }

    public static void p(Context context, OfflineStateRecord offlineStateRecord) {
        try {
            context.getContentResolver().insert(a.l.f16234b, k9.a.f(offlineStateRecord, OfflineStateRecord.class, OfflineStateRecord.COLUMN_MAP, null));
        } catch (Exception e11) {
            qb.c.c("leijie", "", e11);
        }
    }

    public static void q(Context context, ScheduleRecord schedule) {
        try {
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>(3);
            Uri uri = a.y.f16334b;
            arrayList.add(ContentProviderOperation.newUpdate(uri).withValue(a.y.C0266a.f16337c, 0).build());
            arrayList.add(ContentProviderOperation.newDelete(uri).withSelection("book_id = " + schedule.bookId, null).build());
            schedule.isCurrentSelect = 1;
            arrayList.add(ContentProviderOperation.newInsert(uri).withValues(k9.a.f(schedule, ScheduleRecord.class, ScheduleRecord.COLUMN_MAP, null)).build());
            context.getContentResolver().applyBatch(com.baicizhan.client.business.dataset.provider.a.f16088b, arrayList);
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static void r(Context context, int bookId, Map<Integer, UpdateZpkMd5> updateFlags) {
        try {
            i9.f.n(context, i9.f.h(i9.f.J, Integer.toString(bookId)), new com.google.gson.d().A(updateFlags, new b().getType()), false);
        } catch (Exception e11) {
            qb.c.c("leijie", "", e11);
        }
    }

    public static void s(Context context, BookRecord bookRecord, String... fields) {
        try {
            ContentValues f11 = k9.a.f(bookRecord, BookRecord.class, BookRecord.COLUMN_MAP, fields);
            context.getContentResolver().update(a.z.f16349b, f11, "book_id = " + bookRecord.bookId, null);
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static void t(Context context, ScheduleRecord schedule, String... fields) {
        try {
            ContentValues f11 = k9.a.f(schedule, ScheduleRecord.class, ScheduleRecord.COLUMN_MAP, fields);
            context.getContentResolver().update(a.y.f16334b, f11, "book_id=" + schedule.bookId, null);
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }
}
