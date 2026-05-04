package po;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f81093a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public boolean f81094b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f81094b
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r6.c(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L53
            char r4 = r7[r0]
            if (r4 == r2) goto L46
            r5 = 13
            if (r4 == r5) goto L28
            goto L51
        L28:
            java.lang.StringBuilder r4 = r6.f81093a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f81094b = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L43
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = r3
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r4 = r6.c(r4)
            if (r4 == 0) goto L43
            r0 = r9
        L43:
            int r9 = r0 + 1
            goto L51
        L46:
            java.lang.StringBuilder r4 = r6.f81093a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.c(r3)
            goto L43
        L51:
            int r0 = r0 + r3
            goto L1d
        L53:
            java.lang.StringBuilder r0 = r6.f81093a
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: po.w.a(char[], int, int):void");
    }

    public void b() throws IOException {
        if (this.f81094b || this.f81093a.length() > 0) {
            c(false);
        }
    }

    @uo.a
    public final boolean c(boolean sawNewline) throws IOException {
        d(this.f81093a.toString(), this.f81094b ? sawNewline ? "\r\n" : c1.g.f7467d : sawNewline ? "\n" : "");
        this.f81093a = new StringBuilder();
        this.f81094b = false;
        return sawNewline;
    }

    public abstract void d(String line, String end) throws IOException;
}
