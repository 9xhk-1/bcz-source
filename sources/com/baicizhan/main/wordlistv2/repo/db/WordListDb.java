package com.baicizhan.main.wordlistv2.repo.db;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import wj.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@Database(entities = {WordListResourceRecord.class}, exportSchema = true, version = 1)
/* loaded from: classes5.dex */
public abstract class WordListDb extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f27962a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f27963b = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final WordListDb a(@k Context app2) {
            g0.p(app2, "app");
            Context applicationContext = app2.getApplicationContext();
            g0.o(applicationContext, "getApplicationContext(...)");
            return (WordListDb) Room.databaseBuilder(applicationContext, WordListDb.class, "wordlist").build();
        }

        public a() {
        }
    }

    @k
    public abstract b g();
}
