package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import org.apiguardian.api.API;
import y90.e;
import y90.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class FilePosition implements Serializable {
    private static final e logger = g.c(FilePosition.class);
    private static final long serialVersionUID = 1;
    private final Integer column;
    private final int line;

    private FilePosition(int line) {
        c2.e(line > 0, "line number must be greater than zero");
        this.line = line;
        this.column = null;
    }

    public static /* synthetic */ String a(String str) {
        return "Failed to parse 'line' and/or 'column' from query string: " + str;
    }

    public static FilePosition from(int line) {
        return new FilePosition(line);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Optional<org.junit.platform.engine.support.descriptor.FilePosition> fromQuery(final java.lang.String r11) {
        /*
            boolean r0 = ba0.e4.h(r11)
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.String r0 = "&"
            java.lang.String[] r0 = r11.split(r0)     // Catch: java.lang.IllegalArgumentException -> L4e
            int r2 = r0.length     // Catch: java.lang.IllegalArgumentException -> L4e
            r3 = 0
            r5 = r1
            r6 = r5
            r4 = r3
        L12:
            if (r4 >= r2) goto L5b
            r7 = r0[r4]     // Catch: java.lang.IllegalArgumentException -> L34
            java.lang.String r8 = "="
            java.lang.String[] r7 = r7.split(r8)     // Catch: java.lang.IllegalArgumentException -> L34
            int r8 = r7.length     // Catch: java.lang.IllegalArgumentException -> L34
            r9 = 2
            if (r8 != r9) goto L46
            r8 = r7[r3]     // Catch: java.lang.IllegalArgumentException -> L34
            r9 = 1
            if (r5 != 0) goto L36
            java.lang.String r10 = "line"
            boolean r10 = r10.equals(r8)     // Catch: java.lang.IllegalArgumentException -> L34
            if (r10 == 0) goto L36
            r7 = r7[r9]     // Catch: java.lang.IllegalArgumentException -> L34
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L34
            goto L46
        L34:
            r0 = move-exception
            goto L51
        L36:
            if (r6 != 0) goto L46
            java.lang.String r10 = "column"
            boolean r8 = r10.equals(r8)     // Catch: java.lang.IllegalArgumentException -> L34
            if (r8 == 0) goto L46
            r7 = r7[r9]     // Catch: java.lang.IllegalArgumentException -> L34
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L34
        L46:
            if (r5 == 0) goto L4b
            if (r6 == 0) goto L4b
            goto L5b
        L4b:
            int r4 = r4 + 1
            goto L12
        L4e:
            r0 = move-exception
            r5 = r1
            r6 = r5
        L51:
            y90.e r2 = org.junit.platform.engine.support.descriptor.FilePosition.logger
            ga0.i r3 = new ga0.i
            r3.<init>()
            r2.a(r0, r3)
        L5b:
            if (r5 == 0) goto L72
            org.junit.platform.engine.support.descriptor.FilePosition r11 = new org.junit.platform.engine.support.descriptor.FilePosition
            int r0 = r5.intValue()
            if (r6 != 0) goto L6a
            r11.<init>(r0)
        L68:
            r1 = r11
            goto L72
        L6a:
            int r1 = r6.intValue()
            r11.<init>(r0, r1)
            goto L68
        L72:
            java.util.Optional r11 = java.util.Optional.ofNullable(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.platform.engine.support.descriptor.FilePosition.fromQuery(java.lang.String):java.util.Optional");
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            FilePosition filePosition = (FilePosition) o11;
            if (this.line == filePosition.line && Objects.equals(this.column, filePosition.column)) {
                return true;
            }
        }
        return false;
    }

    public Optional<Integer> getColumn() {
        return Optional.ofNullable(this.column);
    }

    public int getLine() {
        return this.line;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.line), this.column);
    }

    public String toString() {
        return new g4(this).a("line", Integer.valueOf(this.line)).a("column", getColumn().orElse(-1)).toString();
    }

    public static FilePosition from(int line, int column) {
        return new FilePosition(line, column);
    }

    private FilePosition(int line, int column) {
        c2.e(line > 0, "line number must be greater than zero");
        c2.e(column > 0, "column number must be greater than zero");
        this.line = line;
        this.column = Integer.valueOf(column);
    }
}
