package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1#2:179\n1855#3,2:180\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n143#1:180,2\n*E\n"})
/* loaded from: classes.dex */
public final class FullyDrawnReporter {

    @m80.k
    private final Executor executor;

    @m80.k
    private final Object lock;

    @GuardedBy(vb.a.f93813p)
    @m80.k
    private final List<x00.a<g2>> onReportCallbacks;

    @m80.k
    private final x00.a<g2> reportFullyDrawn;

    @GuardedBy(vb.a.f93813p)
    private boolean reportPosted;

    @m80.k
    private final Runnable reportRunnable;

    @GuardedBy(vb.a.f93813p)
    private boolean reportedFullyDrawn;

    @GuardedBy(vb.a.f93813p)
    private int reporterCount;

    public FullyDrawnReporter(@m80.k Executor executor, @m80.k x00.a<g2> reportFullyDrawn) {
        g0.p(executor, "executor");
        g0.p(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.q
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(FullyDrawnReporter.this);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        synchronized (fullyDrawnReporter.lock) {
            try {
                fullyDrawnReporter.reportPosted = false;
                if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                    fullyDrawnReporter.reportFullyDrawn.invoke();
                    fullyDrawnReporter.fullyDrawnReported();
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void addOnReportDrawnListener(@m80.k x00.a<g2> callback) {
        boolean z11;
        g0.p(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z11 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z11 = false;
            }
        }
        if (z11) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((x00.a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z11;
        synchronized (this.lock) {
            z11 = this.reportedFullyDrawn;
        }
        return z11;
    }

    public final void removeOnReportDrawnListener(@m80.k x00.a<g2> callback) {
        g0.p(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            g2 g2Var = g2.f100423a;
        }
    }

    public final void removeReporter() {
        int i11;
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i11 = this.reporterCount) > 0) {
                    this.reporterCount = i11 - 1;
                    postWhenReportersAreDone();
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
