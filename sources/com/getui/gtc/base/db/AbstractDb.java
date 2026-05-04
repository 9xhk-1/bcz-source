package com.getui.gtc.base.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public abstract class AbstractDb {
    private SQLiteOpenHelper helper;
    private final Map<Class<? extends AbstractTable>, AbstractTable> tables = new HashMap();
    private final AtomicBoolean inited = new AtomicBoolean(false);

    public interface TableConsumer {
        void accept(AbstractTable abstractTable);
    }

    private void initCache() {
        Iterator<Class<? extends AbstractTable>> it = this.tables.keySet().iterator();
        while (it.hasNext()) {
            try {
                this.tables.get(it.next()).initCache();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void addTable(Class<? extends AbstractTable> cls) throws IllegalAccessException, InstantiationException {
        AbstractTable abstractTable = this.tables.get(cls);
        if (abstractTable == null) {
            abstractTable = cls.newInstance();
            this.tables.put(cls, abstractTable);
        }
        abstractTable.setDb(this);
    }

    public final void addTables(List<Class<? extends AbstractTable>> list) throws InstantiationException, IllegalAccessException {
        Iterator<Class<? extends AbstractTable>> it = list.iterator();
        while (it.hasNext()) {
            addTable(it.next());
        }
    }

    public abstract String getDbName();

    public final SQLiteOpenHelper getHelper() {
        SQLiteOpenHelper sQLiteOpenHelper = this.helper;
        if (sQLiteOpenHelper != null) {
            return sQLiteOpenHelper;
        }
        throw new RuntimeException("db " + getDbName() + " has not been initialized");
    }

    public final <T extends AbstractTable> T getTable(Class<T> cls) {
        T t11 = (T) this.tables.get(cls);
        if (t11 != null) {
            return t11;
        }
        throw new RuntimeException("table " + cls.getSimpleName() + " has not been added to db " + getDbName());
    }

    public final Collection<AbstractTable> getTables() {
        Collection<AbstractTable> values = this.tables.values();
        if (values.size() > 0) {
            return values;
        }
        throw new RuntimeException("no table has been added to db " + getDbName());
    }

    public abstract int getVersion();

    public void init(Context context) {
        if (this.inited.getAndSet(true)) {
            return;
        }
        this.helper = new SQLiteOpenHelper(context, getDbName(), null, getVersion()) { // from class: com.getui.gtc.base.db.AbstractDb.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        Iterator it = AbstractDb.this.tables.keySet().iterator();
                        while (it.hasNext()) {
                            sQLiteDatabase.execSQL(((AbstractTable) AbstractDb.this.tables.get((Class) it.next())).createSql());
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                        sQLiteDatabase.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        Iterator it = AbstractDb.this.tables.keySet().iterator();
                        while (it.hasNext()) {
                            ((AbstractTable) AbstractDb.this.tables.get((Class) it.next())).onDowngradle(sQLiteDatabase, i11, i12);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                        sQLiteDatabase.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        Iterator it = AbstractDb.this.tables.keySet().iterator();
                        while (it.hasNext()) {
                            ((AbstractTable) AbstractDb.this.tables.get((Class) it.next())).onUpgrade(sQLiteDatabase, i11, i12);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                        sQLiteDatabase.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        };
        initCache();
    }
}
