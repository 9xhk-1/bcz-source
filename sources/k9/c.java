package k9;

import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.MergeCursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: k, reason: collision with root package name */
    public static final int f66064k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f66065l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f66066m = 2;

    /* renamed from: a, reason: collision with root package name */
    public String f66067a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f66068b;

    /* renamed from: c, reason: collision with root package name */
    public int f66069c;

    /* renamed from: d, reason: collision with root package name */
    public int f66070d;

    /* renamed from: e, reason: collision with root package name */
    public String f66071e;

    /* renamed from: f, reason: collision with root package name */
    public Collection<?> f66072f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f66073g;

    /* renamed from: h, reason: collision with root package name */
    public String f66074h;

    /* renamed from: i, reason: collision with root package name */
    public Uri f66075i;

    /* renamed from: j, reason: collision with root package name */
    public int f66076j;

    public c() {
        this.f66068b = null;
        this.f66069c = 0;
        this.f66072f = null;
        this.f66073g = null;
        this.f66074h = null;
        this.f66075i = null;
    }

    public static <E> String a(String column, String operator, Collection<E> collection) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(column);
        sb2.append(" ");
        sb2.append(operator);
        sb2.append(" (");
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (next instanceof Number) {
                sb2.append(next.toString());
            } else {
                sb2.append(DatabaseUtils.sqlEscapeString(next.toString()));
            }
            if (it.hasNext()) {
                sb2.append(j2.O);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public static Cursor h(Context context, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return l(context, uri, projection, selection, selectionArgs, sortOrder);
    }

    public static c i(Uri uri) {
        return new c(uri);
    }

    public static c j(String database, String sql, String... bindArgs) {
        c cVar = new c(com.baicizhan.client.business.dataset.provider.a.c(database, sql));
        cVar.m("", bindArgs);
        return cVar;
    }

    @TargetApi(16)
    public static Cursor l(Context context, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient == null) {
            return null;
        }
        try {
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, projection, selection, selectionArgs, sortOrder, null);
                acquireUnstableContentProviderClient.release();
                return query;
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "unstable query failed. ", e11);
                acquireUnstableContentProviderClient.release();
                return null;
            }
        } catch (Throwable th2) {
            acquireUnstableContentProviderClient.release();
            throw th2;
        }
    }

    public c b(int limit) {
        this.f66076j = limit;
        return this;
    }

    public c c(String orderBy) {
        this.f66074h = orderBy;
        return this;
    }

    public Cursor d(Context context) {
        if (this.f66076j > 0) {
            if (this.f66074h != null) {
                this.f66074h += " limit " + this.f66076j;
            } else {
                this.f66074h = " limit " + this.f66076j;
            }
        }
        int i11 = this.f66069c;
        if (i11 == 0) {
            return h(context, this.f66075i, this.f66073g, this.f66067a, this.f66068b, this.f66074h);
        }
        if (i11 == 1) {
            return e(context);
        }
        if (i11 != 2) {
            return null;
        }
        return f(context);
    }

    public final Cursor e(Context context) {
        Context context2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f66070d);
        int size = this.f66072f.size();
        Iterator<?> it = this.f66072f.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            arrayList2.add(it.next());
            i11++;
            if (arrayList2.size() == this.f66070d || i11 == size) {
                if (i12 > 0) {
                    k(this.f66076j - i12);
                }
                context2 = context;
                Cursor h11 = h(context2, this.f66075i, this.f66073g, a(this.f66071e, "IN", arrayList2), null, this.f66074h);
                arrayList.add(h11);
                if (this.f66076j > 0 && h11 != null && (i12 = i12 + h11.getCount()) >= this.f66076j) {
                    break;
                }
            } else {
                context2 = context;
            }
            context = context2;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        Cursor[] cursorArr = new Cursor[arrayList.size()];
        arrayList.toArray(cursorArr);
        return new MergeCursor(cursorArr);
    }

    public final Cursor f(Context context) {
        return h(context, this.f66075i, this.f66073g, a(this.f66071e, "NOT IN", this.f66072f), null, this.f66074h);
    }

    public c g(String... projection) {
        this.f66073g = projection;
        return this;
    }

    public final void k(int limit) {
        String str = this.f66074h;
        if (str == null) {
            this.f66074h = " limit " + limit;
            return;
        }
        int indexOf = str.toLowerCase().indexOf("limit");
        if (indexOf < 0) {
            this.f66074h += " limit " + limit;
            return;
        }
        this.f66074h = this.f66074h.substring(0, indexOf) + "limit " + limit;
    }

    public c m(String selection, String... selectionArgs) {
        if (!TextUtils.isEmpty(selection)) {
            this.f66067a = selection;
        }
        if (selectionArgs != null) {
            this.f66068b = selectionArgs;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> c n(String column, Collection<E> collection, int batch) {
        this.f66071e = column;
        this.f66069c = 1;
        this.f66072f = collection;
        this.f66070d = batch;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> c o(String column, Collection<E> collection) {
        this.f66071e = column;
        this.f66069c = 2;
        this.f66072f = collection;
        return this;
    }

    public c(Uri uri) {
        this.f66068b = null;
        this.f66069c = 0;
        this.f66072f = null;
        this.f66073g = null;
        this.f66074h = null;
        this.f66075i = uri;
    }
}
