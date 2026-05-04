package io;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f60722d = Logger.getLogger(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final String f60723e = "com.google.common.base.FinalizableReference";

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    public static final Constructor<Thread> f60724f;

    /* renamed from: g, reason: collision with root package name */
    @CheckForNull
    public static final Field f60725g;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Class<?>> f60726a;

    /* renamed from: b, reason: collision with root package name */
    public final PhantomReference<Object> f60727b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<Object> f60728c;

    static {
        Constructor<Thread> c11 = c();
        f60724f = c11;
        f60725g = c11 == null ? e() : null;
    }

    public a(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        this.f60728c = queue;
        this.f60726a = new WeakReference<>(finalizableReferenceClass);
        this.f60727b = frqReference;
    }

    @CheckForNull
    public static Constructor<Thread> c() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    public static Field e() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f60722d.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        io.a.f60722d.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:12:0x0045, B:14:0x0049), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.lang.Class<?> r4, java.lang.ref.ReferenceQueue<java.lang.Object> r5, java.lang.ref.PhantomReference<java.lang.Object> r6) {
        /*
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "ho.n"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5b
            io.a r0 = new io.a
            r0.<init>(r4, r5, r6)
            java.lang.Class<io.a> r4 = io.a.class
            java.lang.String r4 = r4.getName()
            java.lang.reflect.Constructor<java.lang.Thread> r5 = io.a.f60724f
            r6 = 0
            if (r5 == 0) goto L39
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r0, r4, r1, r2}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Thread r5 = (java.lang.Thread) r5     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r5 = move-exception
            java.util.logging.Logger r1 = io.a.f60722d
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            java.lang.String r3 = "Failed to create a thread without inherited thread-local values"
            r1.log(r2, r3, r5)
        L39:
            r5 = r6
        L3a:
            if (r5 != 0) goto L41
            java.lang.Thread r5 = new java.lang.Thread
            r5.<init>(r6, r0, r4)
        L41:
            r4 = 1
            r5.setDaemon(r4)
            java.lang.reflect.Field r4 = io.a.f60725g     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L57
            r4.set(r5, r6)     // Catch: java.lang.Throwable -> L4d
            goto L57
        L4d:
            r4 = move-exception
            java.util.logging.Logger r6 = io.a.f60722d
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            java.lang.String r1 = "Failed to clear thread local values inherited by reference finalizer thread."
            r6.log(r0, r1, r4)
        L57:
            r5.start()
            return
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Expected com.google.common.base.FinalizableReference."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.a.f(java.lang.Class, java.lang.ref.ReferenceQueue, java.lang.ref.PhantomReference):void");
    }

    public final boolean a(Reference<?> firstReference) {
        Reference<? extends Object> poll;
        Method d11 = d();
        if (d11 == null || !b(firstReference, d11)) {
            return false;
        }
        do {
            poll = this.f60728c.poll();
            if (poll == null) {
                return true;
            }
        } while (b(poll, d11));
        return false;
    }

    public final boolean b(Reference<?> reference, Method finalizeReferentMethod) {
        reference.clear();
        if (reference == this.f60727b) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference, null);
            return true;
        } catch (Throwable th2) {
            f60722d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            return true;
        }
    }

    @CheckForNull
    public final Method d() {
        Class<?> cls = this.f60726a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.f60728c.remove())) {
        }
    }
}
