package ij;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.baicizhan.main.word_book.data.db.WordBookDatabase;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class l implements yz.c0<WordBookDatabase> {

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public static volatile WordBookDatabase f60656e;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f60658a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f60659b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f60654c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f60655d = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final Object f60657f = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public l(@m80.k Context context) {
        g0.p(context, "context");
        this.f60658a = context;
        this.f60659b = context.getApplicationContext();
    }

    public static final g2 b(l lVar) {
        Context applicationContext = lVar.f60658a.getApplicationContext();
        g0.o(applicationContext, "getApplicationContext(...)");
        new com.baicizhan.main.word_book.data.impl.d(applicationContext).c(0L);
        return g2.f100423a;
    }

    @Override // yz.c0
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public WordBookDatabase getValue() {
        WordBookDatabase wordBookDatabase;
        WordBookDatabase wordBookDatabase2 = f60656e;
        if (wordBookDatabase2 != null) {
            return wordBookDatabase2;
        }
        synchronized (f60657f) {
            wordBookDatabase = f60656e;
            if (wordBookDatabase == null) {
                Context appContext = this.f60659b;
                g0.o(appContext, "appContext");
                RoomDatabase build = Room.databaseBuilder(appContext, WordBookDatabase.class, "word_book").addMigrations(WordBookDatabase.f26169a.a(new x00.a() { // from class: ij.k
                    @Override // x00.a
                    public final Object invoke() {
                        g2 b11;
                        b11 = l.b(l.this);
                        return b11;
                    }
                })).build();
                f60656e = (WordBookDatabase) build;
                wordBookDatabase = (WordBookDatabase) build;
            }
        }
        return wordBookDatabase;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return f60656e != null;
    }
}
