package n20;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f74295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74296b;

    public f(@m80.k String str, boolean z11) {
        if (str == null) {
            a(0);
        }
        this.f74295a = str;
        this.f74296b = z11;
    }

    public static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i11 == 1) {
            objArr[1] = "asString";
        } else if (i11 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @m80.k
    public static f e(@m80.k String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith("<") ? k(str) : f(str);
    }

    @m80.k
    public static f f(@m80.k String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean i(@m80.k String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static f k(@m80.k String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    @m80.k
    public String b() {
        String str = this.f74295a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f74295a.compareTo(fVar.f74295a);
    }

    @m80.k
    public String d() {
        if (this.f74296b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String b11 = b();
        if (b11 == null) {
            a(2);
        }
        return b11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f74296b == fVar.f74296b && this.f74295a.equals(fVar.f74295a);
    }

    public boolean g() {
        return this.f74296b;
    }

    public int hashCode() {
        return (this.f74295a.hashCode() * 31) + (this.f74296b ? 1 : 0);
    }

    public String toString() {
        return this.f74295a;
    }
}
