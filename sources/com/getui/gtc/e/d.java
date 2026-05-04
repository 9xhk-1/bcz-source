package com.getui.gtc.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.crypt.SecureCryptTools;
import com.getui.gtc.base.db.AbstractTable;
import en.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class d extends AbstractTable {

    /* renamed from: a, reason: collision with root package name */
    public String f30028a;

    /* renamed from: b, reason: collision with root package name */
    public String f30029b;

    /* renamed from: c, reason: collision with root package name */
    public long f30030c;

    /* renamed from: d, reason: collision with root package name */
    public String f30031d;

    /* renamed from: e, reason: collision with root package name */
    public String f30032e;

    /* renamed from: f, reason: collision with root package name */
    public String f30033f;

    /* renamed from: g, reason: collision with root package name */
    public String f30034g;

    /* renamed from: h, reason: collision with root package name */
    public String f30035h;

    /* renamed from: i, reason: collision with root package name */
    public String f30036i;

    /* renamed from: j, reason: collision with root package name */
    public long f30037j;

    /* renamed from: k, reason: collision with root package name */
    public long f30038k;

    /* renamed from: l, reason: collision with root package name */
    public long f30039l;

    /* renamed from: m, reason: collision with root package name */
    public long f30040m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<String> f30041n = new HashSet();

    private String a(int i11) {
        Cursor cursor = null;
        try {
            cursor = getReadableDatabase().query(r.f50027a, new String[]{"a", yr.e.f100279a}, "a=?", new String[]{String.valueOf(i11)}, null, null, null);
        } catch (Throwable th2) {
            try {
                com.getui.gtc.i.c.a.b(th2);
                if (cursor == null) {
                    return "";
                }
            } finally {
            }
        }
        if (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(1);
            cursor.close();
            return string;
        }
        if (cursor == null) {
            return "";
        }
        cursor.close();
        return "";
    }

    public final JSONObject b() {
        try {
            String a11 = a(17);
            if (!TextUtils.isEmpty(a11)) {
                return new JSONObject(new String(SecureCryptTools.getInstance().decrypt(Base64.decode(a11, 0))));
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
        return new JSONObject();
    }

    public final void c(String str) {
        try {
            if (a(12, Base64.encodeToString(SecureCryptTools.getInstance().encrypt(str.getBytes()), 0))) {
                this.f30035h = str;
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public String createSql() {
        return "CREATE TABLE IF NOT EXISTS r (a TEXT PRIMARY KEY, b TEXT)";
    }

    public final void d(String str) {
        if (a(7, str)) {
            this.f30028a = str;
        }
    }

    public final void e(String str) {
        if (a(20, str)) {
            this.f30029b = str;
        }
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str) || !this.f30041n.contains(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f30041n);
        arrayList.remove(str);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append((String) arrayList.get(i11));
            if (i11 < size - 1) {
                sb2.append(",");
            }
        }
        if (a(8, sb2.toString())) {
            this.f30041n.remove(str);
        }
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public String getTableName() {
        return r.f50027a;
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public void initCache() {
        Cursor cursor = null;
        try {
            try {
                cursor = getReadableDatabase().query(r.f50027a, new String[]{"a", yr.e.f100279a}, null, null, null, null, null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        switch (cursor.getInt(0)) {
                            case 4:
                                this.f30031d = cursor.getString(1);
                                continue;
                            case 5:
                            case 17:
                            case 18:
                            default:
                                continue;
                            case 6:
                                this.f30030c = cursor.getLong(1);
                                continue;
                            case 7:
                                this.f30028a = cursor.getString(1);
                                continue;
                            case 8:
                                String string = cursor.getString(1);
                                if (!TextUtils.isEmpty(string)) {
                                    this.f30041n.addAll(Arrays.asList(string.split(",")));
                                    break;
                                } else {
                                    continue;
                                }
                            case 9:
                                this.f30032e = cursor.getString(1);
                                continue;
                            case 10:
                                this.f30033f = cursor.getString(1);
                                continue;
                            case 11:
                                String string2 = cursor.getString(1);
                                if (!TextUtils.isEmpty(string2)) {
                                    this.f30034g = new String(SecureCryptTools.getInstance().decrypt(Base64.decode(string2, 0)));
                                    break;
                                } else {
                                    continue;
                                }
                            case 12:
                                String string3 = cursor.getString(1);
                                if (!TextUtils.isEmpty(string3)) {
                                    this.f30035h = new String(SecureCryptTools.getInstance().decrypt(Base64.decode(string3, 0)));
                                    break;
                                } else {
                                    continue;
                                }
                            case 13:
                                try {
                                    String string4 = cursor.getString(1);
                                    if (!TextUtils.isEmpty(string4)) {
                                        this.f30036i = new String(SecureCryptTools.getInstance().decrypt(Base64.decode(string4, 0)));
                                        break;
                                    } else {
                                        continue;
                                    }
                                } catch (Throwable th2) {
                                    com.getui.gtc.i.c.a.c(th2);
                                    break;
                                }
                            case 14:
                                this.f30037j = cursor.getLong(1);
                                continue;
                            case 15:
                                this.f30038k = cursor.getLong(1);
                                continue;
                            case 16:
                                break;
                            case 19:
                                this.f30040m = cursor.getLong(1);
                                break;
                            case 20:
                                this.f30029b = cursor.getString(1);
                                continue;
                        }
                        this.f30039l = cursor.getLong(1);
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e11) {
                com.getui.gtc.i.c.a.b(e11);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final JSONObject a() {
        try {
            String a11 = a(18);
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            return new JSONObject(new String(SecureCryptTools.getInstance().decrypt(Base64.decode(a11, 0))));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return null;
        }
    }

    public final void b(String str) {
        try {
            if (a(11, Base64.encodeToString(SecureCryptTools.getInstance().encrypt(str.getBytes()), 0))) {
                this.f30034g = str;
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    public final void a(String str) {
        if (a(10, str)) {
            this.f30033f = str;
        }
    }

    public final void b(JSONObject jSONObject) {
        try {
            a(17, Base64.encodeToString(SecureCryptTools.getInstance().encrypt(jSONObject.toString().getBytes()), 0));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    public final void a(Collection<String> collection) {
        if (collection.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f30041n);
        arrayList.addAll(collection);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append((String) arrayList.get(i11));
            if (i11 < size - 1) {
                sb2.append(",");
            }
        }
        if (a(8, sb2.toString())) {
            this.f30041n.addAll(collection);
        }
    }

    public final void a(JSONObject jSONObject) {
        String encodeToString;
        if (jSONObject != null) {
            try {
                if (jSONObject.length() != 0) {
                    encodeToString = Base64.encodeToString(SecureCryptTools.getInstance().encrypt(jSONObject.toString().getBytes()), 0);
                    a(18, encodeToString);
                }
            } catch (Throwable th2) {
                com.getui.gtc.i.c.a.c(th2);
                return;
            }
        }
        encodeToString = "";
        a(18, encodeToString);
    }

    public final boolean a(int i11, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("a", Integer.valueOf(i11));
        contentValues.put(yr.e.f100279a, Long.valueOf(j11));
        return replace(null, contentValues) != -1;
    }

    public final boolean a(int i11, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("a", Integer.valueOf(i11));
        contentValues.put(yr.e.f100279a, str);
        return replace(null, contentValues) != -1;
    }
}
