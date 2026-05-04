package androidx.room;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Room {

    @m80.k
    public static final Room INSTANCE = new Room();

    @m80.k
    public static final String LOG_TAG = "ROOM";

    @m80.k
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    @w00.o
    @m80.k
    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(@m80.k Context context, @m80.k Class<T> klass, @m80.l String str) {
        g0.p(context, "context");
        g0.p(klass, "klass");
        if (str == null || k0.O3(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (g0.g(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.Builder<>(context, klass, str);
    }

    public static /* synthetic */ RoomDatabase.Builder databaseBuilder$default(Room room, Context context, String name, x00.a factory, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            g0.w();
            factory = Room$databaseBuilder$3.INSTANCE;
        }
        g0.p(context, "context");
        g0.p(name, "name");
        g0.p(factory, "factory");
        if (k0.O3(name)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        if (g0.g(name, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder(o0.d(RoomDatabase.class), name, factory, context);
    }

    @w00.o
    @m80.k
    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(@m80.k Context context, @m80.k Class<T> klass) {
        g0.p(context, "context");
        g0.p(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }

    public static /* synthetic */ RoomDatabase.Builder inMemoryDatabaseBuilder$default(Room room, Context context, x00.a factory, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            g0.w();
            factory = Room$inMemoryDatabaseBuilder$1.INSTANCE;
        }
        g0.p(context, "context");
        g0.p(factory, "factory");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder(o0.d(RoomDatabase.class), null, factory, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, x00.a<? extends T> factory) {
        g0.p(context, "context");
        g0.p(factory, "factory");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder<>(o0.d(RoomDatabase.class), null, factory, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, String name, x00.a<? extends T> factory) {
        g0.p(context, "context");
        g0.p(name, "name");
        g0.p(factory, "factory");
        if (!k0.O3(name)) {
            if (!g0.g(name, ":memory:")) {
                g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
                return new RoomDatabase.Builder<>(o0.d(RoomDatabase.class), name, factory, context);
            }
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
    }
}
