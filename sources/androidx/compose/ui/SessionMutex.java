package androidx.compose.ui;

import androidx.annotation.RestrictTo;
import c40.l2;
import c40.r0;
import c40.s0;
import j00.c;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.h;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@InternalComposeUiApi
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class SessionMutex<T> {

    @k
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Session<T> {

        @k
        private final l2 job;
        private final T value;

        public Session(@k l2 l2Var, T t11) {
            this.job = l2Var;
            this.value = t11;
        }

        @k
        public final l2 getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m2087boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m2089constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2090equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && g0.g(atomicReference, ((SessionMutex) obj).m2096unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2091equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return g0.g(atomicReference, atomicReference2);
    }

    @l
    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m2092getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2093hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2094toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    @l
    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m2095withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, @k x00.l<? super r0, ? extends T> lVar, @k p<? super T, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
        return s0.g(new SessionMutex$withSessionCancellingPrevious$2(lVar, atomicReference, pVar, null), cVar);
    }

    public boolean equals(Object obj) {
        return m2090equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m2093hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m2094toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m2096unboximpl() {
        return this.currentSessionHolder;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m2088constructorimpl() {
        return m2089constructorimpl(new AtomicReference(null));
    }
}
