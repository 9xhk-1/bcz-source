package m;

import android.content.Context;
import android.util.LruCache;
import androidx.collection.SieveCacheKt;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.jiongji.andriod.card.R;
import j.j;
import j.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l.c;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidSqliteDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSqliteDriver.kt\napp/cash/sqldelight/driver/android/AndroidSqliteDriver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,352:1\n13805#2:353\n13806#2:361\n13805#2,2:362\n13805#2:364\n13806#2:366\n382#3,7:354\n1#4:365\n1869#5,2:367\n*S KotlinDebug\n*F\n+ 1 AndroidSqliteDriver.kt\napp/cash/sqldelight/driver/android/AndroidSqliteDriver\n*L\n99#1:353\n99#1:361\n107#1:362,2\n116#1:364\n116#1:366\n100#1:354,7\n118#1:367,2\n*E\n"})
/* loaded from: classes3.dex */
public final class n implements l.e {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final SupportSQLiteOpenHelper f71748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71749b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Long f71750c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ThreadLocal<t.b> f71751d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f71752e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c f71753f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final LinkedHashMap<String, Set<j.a>> f71754g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends SupportSQLiteOpenHelper.Callback {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l.g<c.d<g2>> f71755a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final l.a[] f71756b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k l.g<c.d<g2>> schema, @m80.k l.a... callbacks) {
            super((int) schema.getVersion());
            g0.p(schema, "schema");
            g0.p(callbacks, "callbacks");
            if (schema.getVersion() <= SieveCacheKt.NodeLinkMask) {
                this.f71755a = schema;
                this.f71756b = callbacks;
            } else {
                throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + schema.getVersion() + '.').toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            this.f71755a.a(new n((SupportSQLiteOpenHelper) null, db2, 1, (Long) null, 8, (v) null));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@m80.k SupportSQLiteDatabase db2, int i11, int i12) {
            g0.p(db2, "db");
            l.a[] aVarArr = this.f71756b;
            this.f71755a.b(new n((SupportSQLiteOpenHelper) null, db2, 1, (Long) null, 8, (v) null), i11, i12, (l.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends t.b {

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public final t.b f71757i;

        public b(@m80.l t.b bVar) {
            this.f71757i = bVar;
        }

        @Override // j.t.b
        @m80.k
        public l.c<g2> i(boolean z11) {
            if (l() == null) {
                if (z11) {
                    n.this.L().setTransactionSuccessful();
                    n.this.L().endTransaction();
                } else {
                    n.this.L().endTransaction();
                }
            }
            n.this.f71751d.set(l());
            return c.d.b(l.c.f69104a.a());
        }

        @Override // j.t.b
        @m80.l
        public t.b l() {
            return this.f71757i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends LruCache<Integer, p> {
        public c(int i11) {
            super(i11);
        }

        public void a(boolean z11, int i11, p oldValue, p pVar) {
            g0.p(oldValue, "oldValue");
            if (z11) {
                oldValue.close();
            }
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ void entryRemoved(boolean z11, Integer num, p pVar, p pVar2) {
            a(z11, num.intValue(), pVar, pVar2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k SupportSQLiteDatabase database) {
        this(database, 0, (Long) null, 6, (v) null);
        g0.p(database, "database");
    }

    public static final p H(String str, n nVar, int i11) {
        return new h(str, nVar.L(), i11, nVar.f71750c);
    }

    public static final Object I(x00.l lVar, p execute) {
        g0.p(execute, "$this$execute");
        return execute.d(lVar);
    }

    public static final SupportSQLiteDatabase q(n nVar, SupportSQLiteDatabase supportSQLiteDatabase) {
        SupportSQLiteDatabase writableDatabase;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = nVar.f71748a;
        if (supportSQLiteOpenHelper != null && (writableDatabase = supportSQLiteOpenHelper.getWritableDatabase()) != null) {
            return writableDatabase;
        }
        g0.m(supportSQLiteDatabase);
        return supportSQLiteDatabase;
    }

    public static final p r(n nVar, String str) {
        return new m.b(nVar.L().compileStatement(str));
    }

    public static final long w(p execute) {
        g0.p(execute, "$this$execute");
        return execute.execute();
    }

    @Override // l.e
    @m80.l
    public t.b A2() {
        return this.f71751d.get();
    }

    public final <T> Object C(Integer num, x00.a<? extends p> aVar, x00.l<? super l.f, g2> lVar, x00.l<? super p, ? extends T> lVar2) {
        p remove = num != null ? this.f71753f.remove(num) : null;
        if (remove == null) {
            remove = aVar.invoke();
        }
        if (lVar != null) {
            try {
                lVar.invoke(remove);
            } catch (Throwable th2) {
                if (num != null) {
                    p put = this.f71753f.put(num, remove);
                    if (put != null) {
                        put.close();
                    }
                } else {
                    remove.close();
                }
                throw th2;
            }
        }
        Object c11 = c.d.c(lVar2.invoke(remove));
        if (num == null) {
            remove.close();
            return c11;
        }
        p put2 = this.f71753f.put(num, remove);
        if (put2 != null) {
            put2.close();
        }
        return c11;
    }

    @m80.k
    public <R> Object E(@m80.l Integer num, @m80.k final String sql, @m80.k final x00.l<? super l.d, ? extends l.c<R>> mapper, final int i11, @m80.l x00.l<? super l.f, g2> lVar) {
        g0.p(sql, "sql");
        g0.p(mapper, "mapper");
        return C(num, new x00.a() { // from class: m.i
            @Override // x00.a
            public final Object invoke() {
                p H;
                H = n.H(sql, this, i11);
                return H;
            }
        }, lVar, new x00.l() { // from class: m.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object I;
                I = n.I(x00.l.this, (p) obj);
                return I;
            }
        });
    }

    @Override // l.e
    public void F6(@m80.k String[] queryKeys, @m80.k j.a listener) {
        g0.p(queryKeys, "queryKeys");
        g0.p(listener, "listener");
        synchronized (this.f71754g) {
            try {
                for (String str : queryKeys) {
                    Set<j.a> set = this.f71754g.get(str);
                    if (set != null) {
                        set.remove(listener);
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SupportSQLiteDatabase L() {
        return (SupportSQLiteDatabase) this.f71752e.getValue();
    }

    @Override // l.e
    public void Y1(@m80.k String[] queryKeys, @m80.k j.a listener) {
        g0.p(queryKeys, "queryKeys");
        g0.p(listener, "listener");
        synchronized (this.f71754g) {
            try {
                for (String str : queryKeys) {
                    LinkedHashMap<String, Set<j.a>> linkedHashMap = this.f71754g;
                    Set<j.a> set = linkedHashMap.get(str);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        linkedHashMap.put(str, set);
                    }
                    set.add(listener);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l.e
    public /* bridge */ /* synthetic */ l.c c5(Integer num, String str, x00.l lVar, int i11, x00.l lVar2) {
        return c.d.b(E(num, str, lVar, i11, lVar2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f71753f.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f71748a;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
        } else {
            L().close();
        }
    }

    @Override // l.e
    @m80.k
    public l.c<t.b> s6() {
        t.b bVar = this.f71751d.get();
        b bVar2 = new b(bVar);
        this.f71751d.set(bVar2);
        if (bVar == null) {
            L().beginTransactionNonExclusive();
        }
        return c.d.b(c.d.c(bVar2));
    }

    @Override // l.e
    @m80.k
    public l.c<Long> v3(@m80.l Integer num, @m80.k final String sql, int i11, @m80.l x00.l<? super l.f, g2> lVar) {
        g0.p(sql, "sql");
        return c.d.b(C(num, new x00.a() { // from class: m.l
            @Override // x00.a
            public final Object invoke() {
                p r11;
                r11 = n.r(n.this, sql);
                return r11;
            }
        }, lVar, new x00.l() { // from class: m.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                long w11;
                w11 = n.w((p) obj);
                return Long.valueOf(w11);
            }
        }));
    }

    @Override // l.e
    public void x7(@m80.k String... queryKeys) {
        g0.p(queryKeys, "queryKeys");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f71754g) {
            try {
                for (String str : queryKeys) {
                    Set<j.a> set = this.f71754g.get(str);
                    if (set != null) {
                        linkedHashSet.addAll(set);
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((j.a) it.next()).a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k SupportSQLiteDatabase database, int i11) {
        this(database, i11, (Long) null, 4, (v) null);
        g0.p(database, "database");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context) {
        this(schema, context, null, null, null, 0, false, null, R.styleable.Theme_drawable_wiki_sound1, null);
        g0.p(schema, "schema");
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context, @m80.l String str) {
        this(schema, context, str, null, null, 0, false, null, R.styleable.Theme_drawable_walk_sound4, null);
        g0.p(schema, "schema");
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory factory) {
        this(schema, context, str, factory, null, 0, false, null, 240, null);
        g0.p(schema, "schema");
        g0.p(context, "context");
        g0.p(factory, "factory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory factory, @m80.k SupportSQLiteOpenHelper.Callback callback) {
        this(schema, context, str, factory, callback, 0, false, null, 224, null);
        g0.p(schema, "schema");
        g0.p(context, "context");
        g0.p(factory, "factory");
        g0.p(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory factory, @m80.k SupportSQLiteOpenHelper.Callback callback, int i11) {
        this(schema, context, str, factory, callback, i11, false, null, 192, null);
        g0.p(schema, "schema");
        g0.p(context, "context");
        g0.p(factory, "factory");
        g0.p(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory factory, @m80.k SupportSQLiteOpenHelper.Callback callback, int i11, boolean z11) {
        this(schema, context, str, factory, callback, i11, z11, null, 128, null);
        g0.p(schema, "schema");
        g0.p(context, "context");
        g0.p(factory, "factory");
        g0.p(callback, "callback");
    }

    public n(SupportSQLiteOpenHelper supportSQLiteOpenHelper, final SupportSQLiteDatabase supportSQLiteDatabase, int i11, Long l11) {
        this.f71748a = supportSQLiteOpenHelper;
        this.f71749b = i11;
        this.f71750c = l11;
        if ((supportSQLiteOpenHelper != null) ^ (supportSQLiteDatabase != null)) {
            this.f71751d = new ThreadLocal<>();
            this.f71752e = e0.c(new x00.a() { // from class: m.k
                @Override // x00.a
                public final Object invoke() {
                    SupportSQLiteDatabase q11;
                    q11 = n.q(n.this, supportSQLiteDatabase);
                    return q11;
                }
            });
            this.f71753f = new c(i11);
            this.f71754g = new LinkedHashMap<>();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public /* synthetic */ n(SupportSQLiteOpenHelper supportSQLiteOpenHelper, SupportSQLiteDatabase supportSQLiteDatabase, int i11, Long l11, int i12, v vVar) {
        this((i12 & 1) != 0 ? null : supportSQLiteOpenHelper, (i12 & 2) != 0 ? null : supportSQLiteDatabase, i11, (i12 & 8) != 0 ? null : l11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@m80.k SupportSQLiteOpenHelper openHelper) {
        this(openHelper, (SupportSQLiteDatabase) null, 20, (Long) null);
        g0.p(openHelper, "openHelper");
    }

    public /* synthetic */ n(l.g gVar, Context context, String str, SupportSQLiteOpenHelper.Factory factory, SupportSQLiteOpenHelper.Callback callback, int i11, boolean z11, Long l11, int i12, v vVar) {
        this(gVar, context, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? new FrameworkSQLiteOpenHelperFactory() : factory, (i12 & 16) != 0 ? new a(gVar, new l.a[0]) : callback, (i12 & 32) != 0 ? 20 : i11, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? null : l11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k l.g<c.d<g2>> schema, @m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory factory, @m80.k SupportSQLiteOpenHelper.Callback callback, int i11, boolean z11, @m80.l Long l11) {
        this(factory.create(SupportSQLiteOpenHelper.Configuration.Companion.builder(context).callback(callback).name(str).noBackupDirectory(z11).build()), (SupportSQLiteDatabase) null, i11, l11);
        g0.p(schema, "schema");
        g0.p(context, "context");
        g0.p(factory, "factory");
        g0.p(callback, "callback");
    }

    public /* synthetic */ n(SupportSQLiteDatabase supportSQLiteDatabase, int i11, Long l11, int i12, v vVar) {
        this(supportSQLiteDatabase, (i12 & 2) != 0 ? 20 : i11, (i12 & 4) != 0 ? null : l11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public n(@m80.k SupportSQLiteDatabase database, int i11, @m80.l Long l11) {
        this((SupportSQLiteOpenHelper) null, database, i11, l11);
        g0.p(database, "database");
    }
}
