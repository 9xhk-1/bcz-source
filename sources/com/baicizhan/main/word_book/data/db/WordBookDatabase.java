package com.baicizhan.main.word_book.data.db;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kj.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import lj.c;
import lj.d;
import lj.e;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@TypeConverters({e.class, d.class, c.class, lj.a.class})
@Database(entities = {kj.a.class, b.class}, version = 2)
/* loaded from: classes5.dex */
public abstract class WordBookDatabase extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f26169a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f26170b = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.word_book.data.db.WordBookDatabase$a$a, reason: collision with other inner class name */
        public static final class C0329a extends Migration {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.a<g2> f26171a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0329a(x00.a<g2> aVar) {
                super(1, 2);
                this.f26171a = aVar;
            }

            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase db2) {
                g0.p(db2, "db");
                db2.execSQL("ALTER TABLE word_books ADD COLUMN tags TEXT NOT NULL DEFAULT '[]'");
                x00.a<g2> aVar = this.f26171a;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Migration b(a aVar, x00.a aVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar2 = null;
            }
            return aVar.a(aVar2);
        }

        @k
        public final Migration a(@l x00.a<g2> aVar) {
            return new C0329a(aVar);
        }

        public a() {
        }
    }

    @k
    public abstract jj.a g();

    @k
    public abstract jj.k h();
}
