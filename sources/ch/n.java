package ch;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f8653a = "pic_sentence_pic";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f8654b = "pic_word_pic";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f8655c = "pic_word_chinese";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f8656d = "pic_extra_listening";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f8657e = "pic_extra_spell_cloze";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f8658f = "pic_extra_spell_chunk";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f8659g = "pic_extra_chinese_word";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f8660h = "train-en-cn";

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f8661i = "train-word-chinese";

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String f8662j = "train-full-spell";

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final String f8663k = "train-listening-mean";

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final String f8664l = "train-cloze";

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final String f8665m = "train-chunk";

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f8666n = "train-read-word";

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final String f8667o = "user-book-en-cn";

    @m80.k
    public static final String a(int i11) {
        if (i11 == 1) {
            return f8653a;
        }
        if (i11 == 2) {
            return f8654b;
        }
        if (i11 == 3) {
            return f8655c;
        }
        switch (i11) {
            case 21:
                return f8657e;
            case 22:
                return f8658f;
            case 23:
                return f8656d;
            case 24:
                return f8659g;
            default:
                return "unknown" + i11;
        }
    }

    @m80.k
    public static final String b(int i11) {
        if (i11 == 3) {
            return f8660h;
        }
        if (i11 == 4) {
            return f8662j;
        }
        if (i11 == 5) {
            return f8666n;
        }
        switch (i11) {
            case 21:
                return f8665m;
            case 22:
                return f8664l;
            case 23:
                return f8663k;
            case 24:
                return f8661i;
            default:
                return "unknown" + i11;
        }
    }
}
