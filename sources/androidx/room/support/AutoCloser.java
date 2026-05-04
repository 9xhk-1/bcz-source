package androidx.room.support;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import c40.l2;
import c40.r0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAutoCloser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.android.kt\nandroidx/room/support/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes3.dex */
public final class AutoCloser {

    @m80.k
    public static final String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.l
    private l2 autoCloseJob;
    private final long autoCloseTimeoutInMs;
    private r0 coroutineScope;

    @m80.l
    @GuardedBy(vb.a.f93813p)
    private SupportSQLiteDatabase delegateDatabase;
    private SupportSQLiteOpenHelper delegateOpenHelper;

    @m80.k
    private AtomicLong lastDecrementRefCountTimeStamp;

    @m80.k
    private final Object lock;
    private boolean manuallyClosed;

    @m80.l
    private x00.a<g2> onAutoCloseCallback;

    @m80.k
    private final AtomicInteger referenceCount;

    @m80.k
    private final Watch watch;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Watch {
        long getMillis();
    }

    public AutoCloser(long j11, @m80.k TimeUnit timeUnit, @m80.k Watch watch) {
        g0.p(timeUnit, "timeUnit");
        g0.p(watch, "watch");
        this.watch = watch;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j11);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(watch.getMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoCloseDatabase() {
        synchronized (this.lock) {
            try {
                if (this.watch.getMillis() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                    return;
                }
                if (this.referenceCount.get() != 0) {
                    return;
                }
                x00.a<g2> aVar = this.onAutoCloseCallback;
                if (aVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                aVar.invoke();
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    supportSQLiteDatabase.close();
                }
                this.delegateDatabase = null;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                l2 l2Var = this.autoCloseJob;
                if (l2Var != null) {
                    l2.a.b(l2Var, null, 1, null);
                }
                this.autoCloseJob = null;
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null) {
                    supportSQLiteDatabase.close();
                }
                this.delegateDatabase = null;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        r0 r0Var;
        l2 f11;
        int decrementAndGet = this.referenceCount.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.getMillis());
        if (decrementAndGet == 0) {
            r0 r0Var2 = this.coroutineScope;
            if (r0Var2 == null) {
                g0.S("coroutineScope");
                r0Var = null;
            } else {
                r0Var = r0Var2;
            }
            f11 = c40.k.f(r0Var, null, null, new AutoCloser$decrementCountAndScheduleClose$2(this, null), 3, null);
            this.autoCloseJob = f11;
        }
    }

    public final <V> V executeRefCountingFunction(@m80.k x00.l<? super SupportSQLiteDatabase, ? extends V> block) {
        g0.p(block, "block");
        try {
            return block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @m80.l
    public final x00.a<g2> getAutoCloseCallbackForTest$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    @m80.l
    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    public final int getRefCountForTest$room_runtime_release() {
        return this.referenceCount.get();
    }

    @m80.k
    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        l2 l2Var = this.autoCloseJob;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = null;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.lock) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return supportSQLiteDatabase;
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelper2 = this.delegateOpenHelper;
            if (supportSQLiteOpenHelper2 == null) {
                g0.S("delegateOpenHelper");
            } else {
                supportSQLiteOpenHelper = supportSQLiteOpenHelper2;
            }
            SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper.getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void initCoroutineScope(@m80.k r0 coroutineScope) {
        g0.p(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    public final void initOpenHelper(@m80.k SupportSQLiteOpenHelper delegateOpenHelper) {
        g0.p(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof AutoClosingRoomOpenHelper) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.delegateOpenHelper = delegateOpenHelper;
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(@m80.k x00.a<g2> onAutoClose) {
        g0.p(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(@m80.l SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public /* synthetic */ AutoCloser(long j11, TimeUnit timeUnit, Watch watch, int i11, v vVar) {
        this(j11, timeUnit, (i11 & 4) != 0 ? new Watch() { // from class: androidx.room.support.a
            @Override // androidx.room.support.AutoCloser.Watch
            public final long getMillis() {
                long uptimeMillis;
                uptimeMillis = SystemClock.uptimeMillis();
                return uptimeMillis;
            }
        } : watch);
    }
}
