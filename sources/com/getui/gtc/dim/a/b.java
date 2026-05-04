package com.getui.gtc.dim.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.crypt.CryptTools;
import com.getui.gtc.base.crypt.SecureCryptTools;
import com.getui.gtc.base.db.AbstractTable;
import com.getui.gtc.dim.b.h;
import com.getui.gtc.dim.e.c;
import java.io.File;
import yr.e;

/* loaded from: classes6.dex */
public class b extends AbstractTable {
    public final h a(String str) {
        Throwable th2;
        h hVar;
        Cursor cursor = null;
        r2 = null;
        h hVar2 = null;
        try {
            Cursor query = getReadableDatabase().query("d", new String[]{"t", e.f100279a}, "a=?", new String[]{String.valueOf(str)}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndex(e.f100279a));
                        hVar = new h(null, query.getLong(query.getColumnIndex("t")));
                        try {
                            if (!TextUtils.isEmpty(string)) {
                                if (string.equals("-1")) {
                                    File file = new File(GtcProvider.context().getCacheDir(), CryptTools.digestToHexString("MD5", (str + v3.a.f92897b).getBytes()));
                                    if (file.exists()) {
                                        string = new String(c.a(file));
                                    }
                                }
                                hVar.f29919a = c.a(SecureCryptTools.getInstance().decrypt(Base64.decode(string, 0)));
                            }
                            hVar2 = hVar;
                        } catch (Throwable th3) {
                            th2 = th3;
                            cursor = query;
                            try {
                                com.getui.gtc.dim.e.b.a(th2);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return hVar;
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    hVar = null;
                }
            }
            if (query != null) {
                query.close();
            }
            return hVar2;
        } catch (Throwable th5) {
            th2 = th5;
            hVar = null;
        }
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public String createSql() {
        return "CREATE TABLE IF NOT EXISTS d (a TEXT PRIMARY KEY, t TEXT, b TEXT)";
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public String getTableName() {
        return "d";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #2 {all -> 0x0059, blocks: (B:47:0x003d, B:49:0x0043, B:6:0x005e, B:13:0x006a, B:16:0x008d, B:18:0x0093, B:20:0x0098, B:23:0x009b, B:26:0x00d8), top: B:46:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.a.b.a():void");
    }

    public final boolean a(String str, Object obj) {
        String str2;
        try {
            try {
                str2 = Base64.encodeToString(SecureCryptTools.getInstance().encrypt(c.b(obj)), 0);
                if (str2.length() > 5120) {
                    c.a(str2.getBytes(), new File(GtcProvider.context().getCacheDir(), CryptTools.digestToHexString("MD5", (str + v3.a.f92897b).getBytes())));
                    str2 = "-1";
                }
            } catch (Throwable unused) {
                str2 = "";
                com.getui.gtc.dim.e.b.b("dim storage save failed: ".concat(String.valueOf(obj)));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("a", str);
            contentValues.put("t", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(e.f100279a, str2);
            com.getui.gtc.dim.e.b.a(str + " update dim storage cache = " + str2);
            return replace(null, contentValues) != -1;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return false;
        }
    }
}
