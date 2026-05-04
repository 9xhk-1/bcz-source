package s1;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends b<com.badlogic.gdx.utils.c, a> {

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.c f87100b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<com.badlogic.gdx.utils.c> {

        /* renamed from: b, reason: collision with root package name */
        public final Locale f87101b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87102c;

        public a() {
            this(null, null);
        }

        public a(Locale locale) {
            this(locale, null);
        }

        public a(Locale locale, String str) {
            this.f87101b = locale;
            this.f87102c = str;
        }
    }

    public f(e eVar) {
        super(eVar);
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        return null;
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, a aVar2) {
        Locale locale;
        String str2 = null;
        this.f87100b = null;
        if (aVar2 == null) {
            locale = Locale.getDefault();
        } else {
            Locale locale2 = aVar2.f87101b;
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            locale = locale2;
            str2 = aVar2.f87102c;
        }
        if (str2 == null) {
            this.f87100b = com.badlogic.gdx.utils.c.d(aVar, locale);
        } else {
            this.f87100b = com.badlogic.gdx.utils.c.e(aVar, locale, str2);
        }
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.c d(r1.e eVar, String str, v1.a aVar, a aVar2) {
        com.badlogic.gdx.utils.c cVar = this.f87100b;
        this.f87100b = null;
        return cVar;
    }
}
