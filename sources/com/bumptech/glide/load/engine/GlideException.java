package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import ik.b;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;

    @Nullable
    private Exception exception;
    private b key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    private void addRootCauses(Throwable th2, List<Throwable> list) {
        if (th2 instanceof GlideException) {
            Iterator<Throwable> it = ((GlideException) th2).getCauses().iterator();
            while (it.hasNext()) {
                addRootCauses(it.next(), list);
            }
        } else if (th2 != null) {
            list.add(th2);
        }
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            appendable.append("Cause (").append(String.valueOf(i12)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i11);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th2, appendable);
            }
            i11 = i12;
        }
    }

    private static void appendExceptionMessage(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.detailMessage);
        sb2.append(this.dataClass != null ? j2.O + this.dataClass : "");
        sb2.append(this.dataSource != null ? j2.O + this.dataSource : "");
        sb2.append(this.key != null ? j2.O + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb2.toString();
        }
        if (rootCauses.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(rootCauses.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : rootCauses) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i11 = 0;
        while (i11 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(j.f81007d);
            Log.i(str, sb2.toString(), rootCauses.get(i11));
            i11 = i12;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(b bVar, DataSource dataSource) {
        setLoggingDetails(bVar, dataSource, null);
    }

    public void setOrigin(@Nullable Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    public void setLoggingDetails(b bVar, DataSource dataSource, Class<?> cls) {
        this.key = bVar;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new a(appendable));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Appendable {

        /* renamed from: c, reason: collision with root package name */
        public static final String f28775c = "";

        /* renamed from: d, reason: collision with root package name */
        public static final String f28776d = "  ";

        /* renamed from: a, reason: collision with root package name */
        public final Appendable f28777a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f28778b = true;

        public a(Appendable appendable) {
            this.f28777a = appendable;
        }

        @NonNull
        public final CharSequence a(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c11) throws IOException {
            if (this.f28778b) {
                this.f28778b = false;
                this.f28777a.append(f28776d);
            }
            this.f28778b = c11 == '\n';
            this.f28777a.append(c11);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence a11 = a(charSequence);
            return append(a11, 0, a11.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i11, int i12) throws IOException {
            CharSequence a11 = a(charSequence);
            boolean z11 = false;
            if (this.f28778b) {
                this.f28778b = false;
                this.f28777a.append(f28776d);
            }
            if (a11.length() > 0 && a11.charAt(i12 - 1) == '\n') {
                z11 = true;
            }
            this.f28778b = z11;
            this.f28777a.append(a11, i11, i12);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
