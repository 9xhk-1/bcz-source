package e9;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49603a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49604b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49605c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49606d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49607e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f49608f = 6;

    public static int a(int bookid) {
        if (bookid == 2) {
            return 3;
        }
        if (bookid == 4 || bookid == 9) {
            return 6;
        }
        if (bookid == 11) {
            return 5;
        }
        if (bookid != 13) {
            if (bookid == 16) {
                return 1;
            }
            if (bookid != 21) {
                switch (bookid) {
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        return 1;
                    default:
                        switch (bookid) {
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                                return 1;
                            default:
                                return 2;
                        }
                }
            }
        }
        return 4;
    }

    public static String b(int bookid) {
        if (bookid == 1) {
            return "四级";
        }
        if (bookid == 2) {
            return "六级";
        }
        if (bookid == 4) {
            return "托福";
        }
        if (bookid == 5) {
            return "四级";
        }
        if (bookid == 9) {
            return "托福";
        }
        if (bookid == 11) {
            return "雅思";
        }
        if (bookid == 13) {
            return "考研";
        }
        if (bookid == 16) {
            return "高考";
        }
        if (bookid == 21) {
            return "考研";
        }
        switch (bookid) {
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                return "高考";
            default:
                switch (bookid) {
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                        return "高考";
                    default:
                        return null;
                }
        }
    }
}
