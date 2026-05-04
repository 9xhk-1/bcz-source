package org.slf4j.helpers;

import org.slf4j.event.LoggingEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NormalizedParameters {
    final Object[] arguments;
    final String message;
    final Throwable throwable;

    public NormalizedParameters(String str, Object[] objArr, Throwable th2) {
        this.message = str;
        this.arguments = objArr;
        this.throwable = th2;
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    public static NormalizedParameters normalize(String str, Object[] objArr, Throwable th2) {
        if (th2 != null) {
            return new NormalizedParameters(str, objArr, th2);
        }
        if (objArr == null || objArr.length == 0) {
            return new NormalizedParameters(str, objArr, th2);
        }
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        return throwableCandidate != null ? new NormalizedParameters(str, MessageFormatter.trimmedCopy(objArr), throwableCandidate) : new NormalizedParameters(str, objArr);
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public Object[] getArguments() {
        return this.arguments;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public NormalizedParameters(String str, Object[] objArr) {
        this(str, objArr, null);
    }

    public static NormalizedParameters normalize(LoggingEvent loggingEvent) {
        return normalize(loggingEvent.getMessage(), loggingEvent.getArgumentArray(), loggingEvent.getThrowable());
    }
}
