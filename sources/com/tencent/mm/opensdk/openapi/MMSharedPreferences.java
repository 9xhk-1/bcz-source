package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.baicizhan.client.business.dataset.provider.a;
import com.tencent.mm.opensdk.utils.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";

    /* renamed from: cr, reason: collision with root package name */
    private final ContentResolver f44374cr;
    private final String[] columns = {"_id", a.d.C0245a.f16161a, "type", "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    public MMSharedPreferences(Context context) {
        this.f44374cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor query = this.f44374cr.query(com.tencent.mm.opensdk.utils.a.f44377a, this.columns, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            Object a11 = query.moveToFirst() ? com.tencent.mm.opensdk.channel.a.a.a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a11;
        } catch (Exception e11) {
            Log.e(TAG, "getValue exception:" + e11.getMessage());
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.f44374cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor query = this.f44374cr.query(com.tencent.mm.opensdk.utils.a.f44377a, this.columns, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex(a.d.C0245a.f16161a);
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), com.tencent.mm.opensdk.channel.a.a.a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (Exception e11) {
            Log.e(TAG, "getAll exception:" + e11.getMessage());
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z11 : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f11 : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i11 : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j11) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j11 : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class REditor implements SharedPreferences.Editor {

        /* renamed from: cr, reason: collision with root package name */
        private ContentResolver f44375cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.f44375cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean commit() {
            /*
                r9 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r9.clear
                r2 = 0
                if (r1 == 0) goto L14
                android.content.ContentResolver r1 = r9.f44375cr
                android.net.Uri r3 = com.tencent.mm.opensdk.utils.a.f44377a
                r4 = 0
                r1.delete(r3, r4, r4)
                r9.clear = r2
            L14:
                java.util.Set<java.lang.String> r1 = r9.remove
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                if (r3 == 0) goto L34
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r5 = r9.f44375cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.f44377a
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.delete(r6, r4, r3)
                goto L1a
            L34:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L3e:
                boolean r3 = r1.hasNext()
                r5 = 1
                if (r3 == 0) goto Lbe
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r6 = r3.getValue()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r6 != 0) goto L5a
                java.lang.String r5 = "unresolve failed, null value"
            L55:
                com.tencent.mm.opensdk.utils.Log.e(r7, r5)
                r5 = r2
                goto L97
            L5a:
                boolean r8 = r6 instanceof java.lang.Integer
                if (r8 == 0) goto L5f
                goto L97
            L5f:
                boolean r5 = r6 instanceof java.lang.Long
                if (r5 == 0) goto L65
                r5 = 2
                goto L97
            L65:
                boolean r5 = r6 instanceof java.lang.String
                if (r5 == 0) goto L6b
                r5 = 3
                goto L97
            L6b:
                boolean r5 = r6 instanceof java.lang.Boolean
                if (r5 == 0) goto L71
                r5 = 4
                goto L97
            L71:
                boolean r5 = r6 instanceof java.lang.Float
                if (r5 == 0) goto L77
                r5 = 5
                goto L97
            L77:
                boolean r5 = r6 instanceof java.lang.Double
                if (r5 == 0) goto L7d
                r5 = 6
                goto L97
            L7d:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "unresolve failed, unknown type="
                r5.append(r8)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.toString()
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                goto L55
            L97:
                if (r5 != 0) goto L9a
                goto L3e
            L9a:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r7 = "type"
                r0.put(r7, r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "value"
                r0.put(r6, r5)
                android.content.ContentResolver r5 = r9.f44375cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.f44377a
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.update(r6, r0, r4, r3)
                goto L3e
            Lbe:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z11) {
            this.values.put(str, Boolean.valueOf(z11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f11) {
            this.values.put(str, Float.valueOf(f11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i11) {
            this.values.put(str, Integer.valueOf(i11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j11) {
            this.values.put(str, Long.valueOf(j11));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
