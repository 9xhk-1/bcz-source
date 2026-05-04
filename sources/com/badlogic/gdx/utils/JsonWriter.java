package com.badlogic.gdx.utils;

import a3.d0;
import a3.y0;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class JsonWriter extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final Writer f13168a;

    /* renamed from: c, reason: collision with root package name */
    public b f13170c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13171d;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f13169b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: e, reason: collision with root package name */
    public OutputType f13172e = OutputType.json;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13173f = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum OutputType {
        json,
        javascript,
        minimal;

        private static Pattern javascriptPattern = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
        private static Pattern minimalNamePattern = Pattern.compile("^[^\":,}/ ][^:]*$");
        private static Pattern minimalValuePattern = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
        
            if (r1 != 2) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String quoteName(java.lang.String r5) {
            /*
                r4 = this;
                a3.y0 r0 = new a3.y0
                r0.<init>(r5)
                r1 = 92
                java.lang.String r2 = "\\\\"
                a3.y0 r1 = r0.R0(r1, r2)
                r2 = 13
                java.lang.String r3 = "\\r"
                a3.y0 r1 = r1.R0(r2, r3)
                r2 = 10
                java.lang.String r3 = "\\n"
                a3.y0 r1 = r1.R0(r2, r3)
                r2 = 9
                java.lang.String r3 = "\\t"
                r1.R0(r2, r3)
                int[] r1 = com.badlogic.gdx.utils.JsonWriter.a.f13174a
                int r2 = r4.ordinal()
                r1 = r1[r2]
                r2 = 1
                if (r1 == r2) goto L33
                r5 = 2
                if (r1 == r5) goto L54
                goto L65
            L33:
                java.lang.String r1 = "//"
                boolean r1 = r5.contains(r1)
                if (r1 != 0) goto L54
                java.lang.String r1 = "/*"
                boolean r5 = r5.contains(r1)
                if (r5 != 0) goto L54
                java.util.regex.Pattern r5 = com.badlogic.gdx.utils.JsonWriter.OutputType.minimalNamePattern
                java.util.regex.Matcher r5 = r5.matcher(r0)
                boolean r5 = r5.matches()
                if (r5 == 0) goto L54
                java.lang.String r5 = r0.toString()
                return r5
            L54:
                java.util.regex.Pattern r5 = com.badlogic.gdx.utils.JsonWriter.OutputType.javascriptPattern
                java.util.regex.Matcher r5 = r5.matcher(r0)
                boolean r5 = r5.matches()
                if (r5 == 0) goto L65
                java.lang.String r5 = r0.toString()
                return r5
            L65:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r1 = 34
                r5.append(r1)
                java.lang.String r2 = "\\\""
                a3.y0 r0 = r0.R0(r1, r2)
                java.lang.String r0 = r0.toString()
                r5.append(r0)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.JsonWriter.OutputType.quoteName(java.lang.String):java.lang.String");
        }

        public String quoteValue(@d0 Object obj) {
            int length;
            if (obj == null) {
                return "null";
            }
            String obj2 = obj.toString();
            if (obj instanceof Number) {
                return obj2;
            }
            if (obj instanceof Boolean) {
                return obj2;
            }
            y0 y0Var = new y0(obj2);
            y0Var.R0('\\', "\\\\").R0('\r', "\\r").R0('\n', "\\n").R0('\t', "\\t");
            if (this == minimal && !obj2.equals(n6.m.f74525c) && !obj2.equals("false") && !obj2.equals("null") && !obj2.contains(r60.e.f83301a) && !obj2.contains(r60.e.f83304d) && (length = y0Var.length()) > 0 && y0Var.charAt(length - 1) != ' ' && minimalValuePattern.matcher(y0Var).matches()) {
                return y0Var.toString();
            }
            return '\"' + y0Var.R0('\"', "\\\"").toString() + '\"';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13174a;

        static {
            int[] iArr = new int[OutputType.values().length];
            f13174a = iArr;
            try {
                iArr[OutputType.minimal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13174a[OutputType.javascript.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13175a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13176b;

        public b(boolean z11) throws IOException {
            this.f13175a = z11;
            JsonWriter.this.f13168a.write(z11 ? 91 : 123);
        }

        public void a() throws IOException {
            JsonWriter.this.f13168a.write(this.f13175a ? 93 : 125);
        }
    }

    public JsonWriter(Writer writer) {
        this.f13168a = writer;
    }

    public JsonWriter C(String str, Object obj) throws IOException {
        return j(str).I(obj);
    }

    public void E(OutputType outputType) {
        this.f13172e = outputType;
    }

    public void H(boolean z11) {
        this.f13173f = z11;
    }

    public JsonWriter I(@d0 Object obj) throws IOException {
        if (this.f13173f && ((obj instanceof Long) || (obj instanceof Double) || (obj instanceof BigDecimal) || (obj instanceof BigInteger))) {
            obj = obj.toString();
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            long longValue = number.longValue();
            if (number.doubleValue() == longValue) {
                obj = Long.valueOf(longValue);
            }
        }
        w();
        this.f13168a.write(this.f13172e.quoteValue(obj));
        return this;
    }

    public JsonWriter a() throws IOException {
        w();
        com.badlogic.gdx.utils.a<b> aVar = this.f13169b;
        b bVar = new b(true);
        this.f13170c = bVar;
        aVar.a(bVar);
        return this;
    }

    public JsonWriter c(String str) throws IOException {
        return j(str).a();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f13169b.f13179b > 0) {
            r();
        }
        this.f13168a.close();
    }

    public Writer e() {
        return this.f13168a;
    }

    public JsonWriter f(String str) throws IOException {
        w();
        this.f13168a.write(str);
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f13168a.flush();
    }

    public JsonWriter i(String str, String str2) throws IOException {
        return j(str).f(str2);
    }

    public JsonWriter j(String str) throws IOException {
        b bVar = this.f13170c;
        if (bVar == null || bVar.f13175a) {
            throw new IllegalStateException("Current item must be an object.");
        }
        if (bVar.f13176b) {
            this.f13168a.write(44);
        } else {
            bVar.f13176b = true;
        }
        this.f13168a.write(this.f13172e.quoteName(str));
        this.f13168a.write(58);
        this.f13171d = true;
        return this;
    }

    public JsonWriter k() throws IOException {
        w();
        com.badlogic.gdx.utils.a<b> aVar = this.f13169b;
        b bVar = new b(false);
        this.f13170c = bVar;
        aVar.a(bVar);
        return this;
    }

    public JsonWriter q(String str) throws IOException {
        return j(str).k();
    }

    public JsonWriter r() throws IOException {
        if (this.f13171d) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        this.f13169b.pop().a();
        com.badlogic.gdx.utils.a<b> aVar = this.f13169b;
        this.f13170c = aVar.f13179b == 0 ? null : aVar.peek();
        return this;
    }

    public final void w() throws IOException {
        b bVar = this.f13170c;
        if (bVar == null) {
            return;
        }
        if (!bVar.f13175a) {
            if (!this.f13171d) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f13171d = false;
        } else if (bVar.f13176b) {
            this.f13168a.write(44);
        } else {
            bVar.f13176b = true;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) throws IOException {
        this.f13168a.write(cArr, i11, i12);
    }
}
