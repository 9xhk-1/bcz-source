package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18988e = -1;

    /* renamed from: a, reason: collision with root package name */
    public String f18989a;

    /* renamed from: b, reason: collision with root package name */
    public String f18990b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<Integer> f18991c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<Integer> f18992d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.schedule_v2.adjustschedule.a$a, reason: collision with other inner class name */
    public class C0293a implements e.b<Integer, String> {
        public C0293a() {
        }

        @Override // xb.e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String map(Integer t11) {
            return TextUtils.isEmpty(a.this.f18989a) ? "" : String.format(Locale.CHINA, a.this.f18989a, t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements e.b<Integer, String> {
        public b() {
        }

        @Override // xb.e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String map(Integer t11) {
            return TextUtils.isEmpty(a.this.f18990b) ? "" : String.format(Locale.CHINA, a.this.f18990b, t11);
        }
    }

    public a(String wordFormat) {
        this(null, wordFormat);
    }

    public abstract void a();

    public int b(int idx) {
        return this.f18992d.get(idx).intValue();
    }

    public List<String> c() {
        return xb.e.j(this.f18992d, new C0293a());
    }

    public int d(int wordIdx) {
        return -1;
    }

    public int e(int dayIdx) {
        return -1;
    }

    public abstract int f();

    public abstract int g(int currentCount);

    public int h(int idx) {
        return this.f18991c.get(idx).intValue();
    }

    public List<String> i() {
        return xb.e.j(this.f18991c, new b());
    }

    public int j(int wordCount) {
        return this.f18991c.indexOf(Integer.valueOf(wordCount));
    }

    public abstract void l(int totalWordCount);

    public void m() {
        this.f18991c.clear();
        this.f18992d.clear();
        a();
    }

    public a(String dayFormat, String wordFormat) {
        this.f18991c = new ArrayList<>();
        this.f18992d = new ArrayList<>();
        this.f18989a = dayFormat;
        this.f18990b = wordFormat;
    }

    public void k(int dayCount, int wordCount) {
    }
}
