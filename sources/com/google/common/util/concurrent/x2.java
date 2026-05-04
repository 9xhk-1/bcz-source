package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class x2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: b, reason: collision with root package name */
        public static final o1 f34910b = new o1(a.class);

        /* renamed from: a, reason: collision with root package name */
        public final Runtime f34911a;

        public a(Runtime runtime) {
            this.f34911a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread t11, Throwable e11) {
            try {
                f34910b.a().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", t11), e11);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}
