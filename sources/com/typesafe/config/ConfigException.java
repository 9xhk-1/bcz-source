package com.typesafe.config;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import ju.m;
import ku.q;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class ConfigException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient m origin;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BadBean extends BugOrBroken {
        private static final long serialVersionUID = 1;

        public BadBean(String str, Throwable th2) {
            super(str, th2);
        }

        public BadBean(String str) {
            this(str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BadPath extends ConfigException {
        private static final long serialVersionUID = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BadPath(ju.m r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
            /*
                r2 = this;
                if (r4 == 0) goto L1b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid path '"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "': "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
            L1b:
                r2.<init>(r3, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.typesafe.config.ConfigException.BadPath.<init>(ju.m, java.lang.String, java.lang.String, java.lang.Throwable):void");
        }

        public BadPath(m mVar, String str, String str2) {
            this(mVar, str, str2, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BadPath(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            /*
                r2 = this;
                if (r3 == 0) goto L1b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid path '"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "': "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
            L1b:
                r2.<init>(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.typesafe.config.ConfigException.BadPath.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void");
        }

        public BadPath(String str, String str2) {
            this(str, str2, (Throwable) null);
        }

        public BadPath(m mVar, String str) {
            this(mVar, (String) null, str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BadValue extends ConfigException {
        private static final long serialVersionUID = 1;

        public BadValue(m mVar, String str, String str2, Throwable th2) {
            super(mVar, "Invalid value at '" + str + "': " + str2, th2);
        }

        public BadValue(m mVar, String str, String str2) {
            this(mVar, str, str2, null);
        }

        public BadValue(String str, String str2, Throwable th2) {
            super("Invalid value at '" + str + "': " + str2, th2);
        }

        public BadValue(String str, String str2) {
            this(str, str2, (Throwable) null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BugOrBroken extends ConfigException {
        private static final long serialVersionUID = 1;

        public BugOrBroken(String str, Throwable th2) {
            super(str, th2);
        }

        public BugOrBroken(String str) {
            this(str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Generic extends ConfigException {
        private static final long serialVersionUID = 1;

        public Generic(String str, Throwable th2) {
            super(str, th2);
        }

        public Generic(String str) {
            this(str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IO extends ConfigException {
        private static final long serialVersionUID = 1;

        public IO(m mVar, String str, Throwable th2) {
            super(mVar, str, th2);
        }

        public IO(m mVar, String str) {
            this(mVar, str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Missing extends ConfigException {
        private static final long serialVersionUID = 1;

        public Missing(String str, Throwable th2) {
            super("No configuration setting found for key '" + str + "'", th2);
        }

        public Missing(m mVar, String str) {
            this(mVar, "No configuration setting found for key '" + str + "'", null);
        }

        public Missing(String str) {
            this(str, (Throwable) null);
        }

        public Missing(m mVar, String str, Throwable th2) {
            super(mVar, str, th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotResolved extends BugOrBroken {
        private static final long serialVersionUID = 1;

        public NotResolved(String str, Throwable th2) {
            super(str, th2);
        }

        public NotResolved(String str) {
            this(str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Null extends Missing {
        private static final long serialVersionUID = 1;

        public Null(m mVar, String str, String str2, Throwable th2) {
            super(mVar, makeMessage(str, str2), th2);
        }

        private static String makeMessage(String str, String str2) {
            if (str2 == null) {
                return "Configuration key '" + str + "' is null";
            }
            return "Configuration key '" + str + "' is set to null but expected " + str2;
        }

        public Null(m mVar, String str, String str2) {
            this(mVar, str, str2, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Parse extends ConfigException {
        private static final long serialVersionUID = 1;

        public Parse(m mVar, String str, Throwable th2) {
            super(mVar, str, th2);
        }

        public Parse(m mVar, String str) {
            this(mVar, str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ValidationFailed extends ConfigException {
        private static final long serialVersionUID = 1;
        private final Iterable<ValidationProblem> problems;

        public ValidationFailed(Iterable<ValidationProblem> iterable) {
            super(makeMessage(iterable), (Throwable) null);
            this.problems = iterable;
        }

        private static String makeMessage(Iterable<ValidationProblem> iterable) {
            StringBuilder sb2 = new StringBuilder();
            for (ValidationProblem validationProblem : iterable) {
                sb2.append(validationProblem.origin().description());
                sb2.append(": ");
                sb2.append(validationProblem.path());
                sb2.append(": ");
                sb2.append(validationProblem.problem());
                sb2.append(j2.O);
            }
            if (sb2.length() == 0) {
                throw new BugOrBroken("ValidationFailed must have a non-empty list of problems");
            }
            sb2.setLength(sb2.length() - 2);
            return sb2.toString();
        }

        public Iterable<ValidationProblem> problems() {
            return this.problems;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ValidationProblem implements Serializable {
        private final transient m origin;
        private final String path;
        private final String problem;

        public ValidationProblem(String str, m mVar, String str2) {
            this.path = str;
            this.origin = mVar;
            this.problem = str2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            ConfigException.setOriginField(this, ValidationProblem.class, q.h(objectInputStream));
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            q.q(objectOutputStream, this.origin);
        }

        public m origin() {
            return this.origin;
        }

        public String path() {
            return this.path;
        }

        public String problem() {
            return this.problem;
        }

        public String toString() {
            return "ValidationProblem(" + this.path + "," + this.origin + "," + this.problem + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WrongType extends ConfigException {
        private static final long serialVersionUID = 1;

        public WrongType(m mVar, String str, String str2, String str3, Throwable th2) {
            super(mVar, str + " has type " + str3 + " rather than " + str2, th2);
        }

        public WrongType(m mVar, String str, String str2, String str3) {
            this(mVar, str, str2, str3, null);
        }

        public WrongType(m mVar, String str, Throwable th2) {
            super(mVar, str, th2);
        }

        public WrongType(m mVar, String str) {
            super(mVar, str, null);
        }
    }

    public ConfigException(m mVar, String str, Throwable th2) {
        super(mVar.description() + ": " + str, th2);
        this.origin = mVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        setOriginField(this, ConfigException.class, q.h(objectInputStream));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void setOriginField(T t11, Class<T> cls, m mVar) throws IOException {
        try {
            Field declaredField = cls.getDeclaredField("origin");
            declaredField.setAccessible(true);
            try {
                declaredField.set(t11, mVar);
            } catch (IllegalAccessException e11) {
                throw new IOException("unable to set origin field", e11);
            } catch (IllegalArgumentException e12) {
                throw new IOException("unable to set origin field", e12);
            }
        } catch (NoSuchFieldException e13) {
            throw new IOException(cls.getSimpleName() + " has no origin field?", e13);
        } catch (SecurityException e14) {
            throw new IOException("unable to fill out origin field in " + cls.getSimpleName(), e14);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        q.q(objectOutputStream, this.origin);
    }

    public m origin() {
        return this.origin;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnresolvedSubstitution extends Parse {
        private static final long serialVersionUID = 1;
        private final String detail;

        public UnresolvedSubstitution(m mVar, String str, Throwable th2) {
            super(mVar, "Could not resolve substitution to a value: " + str, th2);
            this.detail = str;
        }

        public UnresolvedSubstitution addExtraDetail(String str) {
            return new UnresolvedSubstitution(this, origin(), String.format(str, this.detail));
        }

        public UnresolvedSubstitution(m mVar, String str) {
            this(mVar, str, (Throwable) null);
        }

        private UnresolvedSubstitution(UnresolvedSubstitution unresolvedSubstitution, m mVar, String str) {
            super(mVar, str, unresolvedSubstitution);
            this.detail = unresolvedSubstitution.detail;
        }
    }

    public ConfigException(m mVar, String str) {
        this(mVar.description() + ": " + str, (Throwable) null);
    }

    public ConfigException(String str, Throwable th2) {
        super(str, th2);
        this.origin = null;
    }

    public ConfigException(String str) {
        this(str, (Throwable) null);
    }
}
