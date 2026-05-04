package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    public static final byte A = 10;
    public static final byte B = Byte.MAX_VALUE;
    public static final int C = 126;
    public static final int D = 117;
    public static final int E = 32;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f69919a = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f69920b = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f69921c = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f69922d = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f69923e = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f69924f = "null";

    /* renamed from: g, reason: collision with root package name */
    public static final char f69925g = ',';

    /* renamed from: h, reason: collision with root package name */
    public static final char f69926h = ':';

    /* renamed from: i, reason: collision with root package name */
    public static final char f69927i = '{';

    /* renamed from: j, reason: collision with root package name */
    public static final char f69928j = '}';

    /* renamed from: k, reason: collision with root package name */
    public static final char f69929k = '[';

    /* renamed from: l, reason: collision with root package name */
    public static final char f69930l = ']';

    /* renamed from: m, reason: collision with root package name */
    public static final char f69931m = '\"';

    /* renamed from: n, reason: collision with root package name */
    public static final char f69932n = '\\';

    /* renamed from: o, reason: collision with root package name */
    public static final char f69933o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final char f69934p = 'u';

    /* renamed from: q, reason: collision with root package name */
    public static final byte f69935q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f69936r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f69937s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f69938t = 3;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f69939u = 4;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f69940v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f69941w = 6;

    /* renamed from: x, reason: collision with root package name */
    public static final byte f69942x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final byte f69943y = 8;

    /* renamed from: z, reason: collision with root package name */
    public static final byte f69944z = 9;

    public static final byte a(char c11) {
        if (c11 < '~') {
            return q.f70050c[c11];
        }
        return (byte) 0;
    }

    public static final char b(int i11) {
        if (i11 < 117) {
            return q.f70049b[i11];
        }
        return (char) 0;
    }

    @m80.k
    public static final String c(byte b11) {
        return b11 == 1 ? "quotation mark '\"'" : b11 == 2 ? "string escape sequence '\\'" : b11 == 4 ? "comma ','" : b11 == 5 ? "colon ':'" : b11 == 6 ? "start of the object '{'" : b11 == 7 ? "end of the object '}'" : b11 == 8 ? "start of the array '['" : b11 == 9 ? "end of the array ']'" : b11 == 10 ? "end of the input" : b11 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
