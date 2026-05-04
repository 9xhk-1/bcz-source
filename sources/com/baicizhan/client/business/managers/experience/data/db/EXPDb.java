package com.baicizhan.client.business.managers.experience.data.db;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import w9.g;
import w9.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@TypeConverters({g.class})
@Database(autoMigrations = {@AutoMigration(from = 1, to = 2)}, entities = {StudyBehaviour.class, AssembleBehaviourRecord.class, TaskRecord.class}, exportSchema = true, version = 2)
/* loaded from: classes4.dex */
public abstract class EXPDb extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f16443a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f16444b = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final EXPDb a(@k Context app2) {
            g0.p(app2, "app");
            Context applicationContext = app2.getApplicationContext();
            g0.o(applicationContext, "getApplicationContext(...)");
            return (EXPDb) Room.databaseBuilder(applicationContext, EXPDb.class, i.f96007a).build();
        }

        public a() {
        }
    }

    @k
    public abstract w9.a g();

    @k
    public abstract w9.k h();

    @k
    public abstract wc.a i();
}
