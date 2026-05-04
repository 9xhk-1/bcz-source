package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(Boolean bool);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final a f36978a;

        /* renamed from: b, reason: collision with root package name */
        String f36979b;

        public b(a aVar) {
            this.f36978a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            String str = "AutoUpdateUtil";
            Cursor cursor = null;
            boolean z11 = false;
            try {
                try {
                    cursor = com.huawei.updatesdk.a.b.a.a.c().a().getContentResolver().query(Uri.parse(this.f36979b), null, null, null, null);
                    if (cursor == null || !cursor.moveToFirst()) {
                        com.huawei.updatesdk.a.a.a.a("AutoUpdateUtil", "cursor = null");
                        str = str;
                    } else {
                        boolean parseBoolean = Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex("isagree")));
                        boolean parseBoolean2 = Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex("isopenautoupdate")));
                        boolean parseBoolean3 = Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex("isneverreminder")));
                        str = parseBoolean3;
                        str = parseBoolean3;
                        str = parseBoolean3;
                        if (parseBoolean && !parseBoolean2 && parseBoolean3 == 0) {
                            z11 = true;
                            str = parseBoolean3;
                        }
                    }
                } catch (Exception e11) {
                    com.huawei.updatesdk.a.a.a.a(str, "query cursor error: " + e11.getMessage());
                }
                com.huawei.updatesdk.b.h.d.a(cursor);
                return Boolean.valueOf(z11);
            } catch (Throwable th2) {
                com.huawei.updatesdk.b.h.d.a(cursor);
                throw th2;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            a aVar = this.f36978a;
            if (aVar != null) {
                aVar.a(bool);
            }
        }

        public void a(String str) {
            this.f36979b = str;
        }
    }

    public void a(Context context, String str, a aVar, boolean z11) {
        if (com.huawei.updatesdk.b.e.e.a(z11).c(context) && f.e().d()) {
            String format = String.format(Locale.ROOT, "content://%s.commondata/item/4", str);
            if (com.huawei.updatesdk.b.h.d.a(context, Uri.parse(format), str)) {
                b bVar = new b(aVar);
                try {
                    bVar.a(format);
                    bVar.executeOnExecutor(com.huawei.updatesdk.b.g.c.f36910a, new Void[0]);
                    bVar.get(500L, TimeUnit.MILLISECONDS);
                    return;
                } catch (Exception e11) {
                    bVar.cancel(true);
                    com.huawei.updatesdk.a.a.a.a("AutoUpdateUtil", "init AutoUpdateInfo error: " + e11.getMessage());
                }
            }
        }
        aVar.a(Boolean.FALSE);
    }
}
