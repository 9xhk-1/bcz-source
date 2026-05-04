package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public String f34852a = null;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public Boolean f34853b = null;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    public Integer f34854c = null;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    public Thread.UncaughtExceptionHandler f34855d = null;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    public ThreadFactory f34856e = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f34857a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f34858b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f34859c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f34860d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f34861e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f34862f;

        public a(final ThreadFactory val$backingThreadFactory, final String val$nameFormat, final AtomicLong val$count, final Boolean val$daemon, final Integer val$priority, final Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler) {
            this.f34857a = val$backingThreadFactory;
            this.f34858b = val$nameFormat;
            this.f34859c = val$count;
            this.f34860d = val$daemon;
            this.f34861e = val$priority;
            this.f34862f = val$uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f34857a.newThread(runnable);
            Objects.requireNonNull(newThread);
            String str = this.f34858b;
            if (str != null) {
                AtomicLong atomicLong = this.f34859c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(t2.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f34860d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f34861e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f34862f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    public static ThreadFactory c(t2 builder) {
        String str = builder.f34852a;
        Boolean bool = builder.f34853b;
        Integer num = builder.f34854c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = builder.f34855d;
        ThreadFactory threadFactory = builder.f34856e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    public ThreadFactory b() {
        return c(this);
    }

    @uo.a
    public t2 e(boolean daemon) {
        this.f34853b = Boolean.valueOf(daemon);
        return this;
    }

    @uo.a
    public t2 f(String nameFormat) {
        d(nameFormat, 0);
        this.f34852a = nameFormat;
        return this;
    }

    @uo.a
    public t2 g(int priority) {
        Preconditions.checkArgument(priority >= 1, "Thread priority (%s) must be >= %s", priority, 1);
        Preconditions.checkArgument(priority <= 10, "Thread priority (%s) must be <= %s", priority, 10);
        this.f34854c = Integer.valueOf(priority);
        return this;
    }

    @uo.a
    public t2 h(ThreadFactory backingThreadFactory) {
        this.f34856e = (ThreadFactory) Preconditions.checkNotNull(backingThreadFactory);
        return this;
    }

    @uo.a
    public t2 i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f34855d = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
