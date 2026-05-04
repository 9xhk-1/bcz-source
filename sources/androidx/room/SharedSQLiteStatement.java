package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class SharedSQLiteStatement {

    @m80.k
    private final RoomDatabase database;

    @m80.k
    private final AtomicBoolean lock;

    @m80.k
    private final yz.c0 stmt$delegate;

    public SharedSQLiteStatement(@m80.k RoomDatabase database) {
        g0.p(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = e0.c(new x00.a() { // from class: androidx.room.u
            @Override // x00.a
            public final Object invoke() {
                SupportSQLiteStatement createNewStatement;
                createNewStatement = SharedSQLiteStatement.this.createNewStatement();
                return createNewStatement;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final SupportSQLiteStatement getStmt() {
        return (SupportSQLiteStatement) this.stmt$delegate.getValue();
    }

    @m80.k
    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @m80.k
    public abstract String createQuery();

    public void release(@m80.k SupportSQLiteStatement statement) {
        g0.p(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final SupportSQLiteStatement getStmt(boolean z11) {
        return z11 ? getStmt() : createNewStatement();
    }
}
